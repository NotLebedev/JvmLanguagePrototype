package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.compilation.domain.interfaces.Expression;
import src.compilation.domain.interfaces.Scope;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.access.*;
import src.compilation.domain.exceptions.IncompatibleTypesException;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.IncompatibleTypesError;
import src.parsing.visitors.errorHandling.errors.VariableExpectedError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancellationException;
import src.parsing.visitors.utils.InvalidKeyTypesException;
import src.parsing.visitors.utils.MultiKeyHashMap;

/**
 * Class responsible for visiting assignments (e.g. {@code str1 = str2})
 *
 * @author NotLebedev
 */
public class VariableAssignmentVisitor extends RootBaseVisitor<Expression> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    private static final MultiKeyHashMap<VariableAssignmentVisitor> variableAssignmentVisitorMap = new MultiKeyHashMap<>(Scope.class, ErrorCollector.class);

    private VariableAssignmentVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static VariableAssignmentVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            VariableAssignmentVisitor result = variableAssignmentVisitorMap.get(scope, errorCollector);

            if(result != null)
                return result;
            else {

                VariableAssignmentVisitor visitor = new VariableAssignmentVisitor(scope, errorCollector);
                variableAssignmentVisitorMap.put(visitor, scope, errorCollector);
                return visitor;

            }

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }

    @Override
    public Expression visitVariableAssignment(RootParser.VariableAssignmentContext ctx) {

        Value val = ctx.value().accept(ValueVisitor.getInstance(scope, errorCollector));
        var value = ctx.assignment().accept(ValueVisitor.getInstance(scope, errorCollector));

        if(val instanceof Variable) {

            var variableAssignment = new VariableAssignment();

            var variable = ((Variable) val);

            try {
                variableAssignment.setParams(variable, value);
            } catch (IncompatibleTypesException e) {

                errorCollector.reportError(
                        new IncompatibleTypesError(ctx.assignment().value(),
                                e.getTypeExpected(), e.getTypeFound()));

                throw new ExpressionParseCancellationException();

            }

            return variableAssignment;

        }

        if(val instanceof ArrayAccess) {

            var arrayAccess = ((ArrayAccess) val);

            try {
                return new ArrayAssignment(arrayAccess.getArray(), arrayAccess.getIndex(), value);
            } catch (IncompatibleTypesException e) {

                errorCollector.reportError(
                        new IncompatibleTypesError(ctx.assignment().value(),
                                e.getTypeExpected(), e.getTypeFound()));

                throw new ExpressionParseCancellationException();

            }

        }

        if(val instanceof StaticClassField) {

            var staticField = ((StaticClassField) val);

            try {
                return new StaticClassFieldAssignment(staticField, value);
            } catch (IncompatibleTypesException e) {

                errorCollector.reportError(
                        new IncompatibleTypesError(ctx.assignment().value(),
                                e.getTypeExpected(), e.getTypeFound()));

                throw new ExpressionParseCancellationException();

            }

        }

        if(val instanceof ObjectField) {

            var objectField = ((ObjectField) val);

            try {
                return new ObjectFieldAssignment(objectField, value);
            } catch (IncompatibleTypesException e) {

                errorCollector.reportError(
                        new IncompatibleTypesError(ctx.assignment().value(),
                                e.getTypeExpected(), e.getTypeFound()));

                throw new ExpressionParseCancellationException();

            }

        }

        errorCollector.reportError(
                new VariableExpectedError(ctx.value().start.getLine(), ctx.value().start.getCharPositionInLine(), ctx.value().getText()));

        throw new ExpressionParseCancellationException();

    }
}
