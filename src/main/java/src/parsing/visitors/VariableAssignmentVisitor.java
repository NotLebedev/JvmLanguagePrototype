package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.*;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.exceptions.IncompatibleTypesException;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.IncompatibleTypesError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancelationException;

/**
 * Class responsible for visiting assignments (e.g. {@code str1 = str2})
 *
 * @author NotLebedev
 */
public class VariableAssignmentVisitor extends RootBaseVisitor<Expression> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    public VariableAssignmentVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    @Override
    public Expression visitVariableAssignment(RootParser.VariableAssignmentContext ctx) {

        Value val = ctx.value().accept(new ValueVisitor(scope, errorCollector));
        var value = ctx.assignment().accept(new ValueVisitor(scope, errorCollector));

        if(val instanceof Variable) {

            var variableAssignment = new VariableAssignment();

            var variable = ((Variable) val);

            var valueVisitor = new ValueVisitor(scope, errorCollector);

            try {
                variableAssignment.setParams(variable, value);
            } catch (IncompatibleTypesException e) {
                errorCollector.reportFatalError(
                        new IncompatibleTypesError(ctx.value().start.getLine(), ctx.assignment().value().start.getCharPositionInLine(), ctx.assignment().value().getText(),
                                e.getTypeExpected(), e.getTypeFound()),
                        new ExpressionParseCancelationException()
                );
            }

            return variableAssignment;

        }

        if(val instanceof ArrayAccess) {

            var arrayAccess = ((ArrayAccess) val);

            try {
                return new ArrayAssignment(arrayAccess.getArray(), arrayAccess.getIndex(), value);
            } catch (IncompatibleTypesException e) {
                errorCollector.reportFatalError(
                        new IncompatibleTypesError(ctx.value().start.getLine(), ctx.assignment().value().start.getCharPositionInLine(), ctx.assignment().value().getText(),
                                e.getTypeExpected(), e.getTypeFound()),
                        new ExpressionParseCancelationException()
                );
            }

        }

        if(val instanceof StaticClassField) {

            var staticField = ((StaticClassField) val);

            try {
                return new StaticClassFieldAssignment(staticField, value);
            } catch (IncompatibleTypesException e) {
                errorCollector.reportFatalError(
                        new IncompatibleTypesError(ctx.value().start.getLine(), ctx.assignment().value().start.getCharPositionInLine(), ctx.assignment().value().getText(),
                                e.getTypeExpected(), e.getTypeFound()),
                        new ExpressionParseCancelationException()
                );
            }

        }

        if(val instanceof ObjectField) {

            var objectField = ((ObjectField) val);

            try {
                return new ObjectFieldAssignment(objectField, value);
            } catch (IncompatibleTypesException e) {
                errorCollector.reportFatalError(
                        new IncompatibleTypesError(ctx.value().start.getLine(), ctx.assignment().value().start.getCharPositionInLine(), ctx.assignment().value().getText(),
                                e.getTypeExpected(), e.getTypeFound()),
                        new ExpressionParseCancelationException()
                );
            }

        }

        throw new IllegalStateException("I forgot to implement all cases in VariableAssignment"); //TODO : implement other cases

    }
}
