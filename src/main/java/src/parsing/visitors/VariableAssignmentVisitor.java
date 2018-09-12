package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.*;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.exceptions.ArrayExpectedException;
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

        if(val instanceof Variable) {

            var variableAssignment = new VariableAssignment();

            var variable = ((Variable) val);

            var valueVisitor = new ValueVisitor(scope, errorCollector);

            var value = ctx.assignment().accept(valueVisitor);

            try {
                variableAssignment.setParams(variable, value);
            }catch (IncompatibleTypesException e) {
                errorCollector.reportFatalError(
                        new IncompatibleTypesError(ctx.value().start.getLine(), ctx.assignment().value().start.getCharPositionInLine(), ctx.assignment().value().getText(),
                                variable.getType().getName(), value.getType().getName()),
                        new ExpressionParseCancelationException()
                );
            }

            return variableAssignment;

        }

        if(val instanceof ArrayAccess) {

            var arrayAccess = ((ArrayAccess) val);

            var value = ctx.assignment().accept(new ValueVisitor(scope, errorCollector));

            try {
                return new ArrayAssignment(arrayAccess.getArray(), arrayAccess.getIndex(), value);
            } catch (ArrayExpectedException e) {
                e.printStackTrace();
            } catch (IncompatibleTypesException e) {
                errorCollector.reportFatalError(
                        new IncompatibleTypesError(ctx.value().start.getLine(), ctx.assignment().value().start.getCharPositionInLine(), ctx.assignment().value().getText(),
                                arrayAccess.getType().getName(), value.getType().getName()),
                        new ExpressionParseCancelationException()
                );
            }

        }

        return null; //TODO : implement other cases

    }
}
