package src.parsing.visitors;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.Variable;
import src.parsing.domain.VariableAssignment;
import src.parsing.domain.exceptions.IncompatibleTypesException;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.CanNotResolveSymbolError;
import src.parsing.visitors.errorHandling.errors.ClassNotFoundError;
import src.parsing.visitors.errorHandling.errors.IncompatibleTypesError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancelationException;

/**
 * Class responsible for visiting variable assignments (e.g. {@code String str})
 *
 * @author NotLebedev
 */
public class VariableDeclarationVisitor extends RootBaseVisitor<Expression> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    public VariableDeclarationVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    @Override
    public Expression visitVariableDeclaration(RootParser.VariableDeclarationContext ctx) {

        var type = ctx.declarationType().getText();
        var name = ctx.id().getText();

        Variable variable = null;

        try {
             variable = new Variable(type, name, 0);
        } catch (ClassNotFoundException e) {
            errorCollector.reportFatalError(
                    new ClassNotFoundError(ctx.declarationType().start.getLine(), ctx.declarationType().start.getCharPositionInLine(),
                            ctx.declarationType().getText()),
                    new ParseCancellationException()
            );
        }

        scope.addVariable(variable);

        if(ctx.assignment() != null) {

            var variableAssignment = new VariableAssignment();

            var valueVisitor = new ValueVisitor(scope, errorCollector);

            Value value = ctx.assignment().accept(valueVisitor);

            try {
                variableAssignment.setParams(variable, value);
            } catch (IncompatibleTypesException e) {
                errorCollector.reportFatalError(
                        new IncompatibleTypesError(ctx.assignment().value().start.getLine(), ctx.assignment().value().start.getCharPositionInLine(), ctx.assignment().value().getText(),
                                variable.getType().getName(), value.getType().getName()), //variable can not be null (because of reportFatalError)
                        new ExpressionParseCancelationException()
                );
            }

            return variableAssignment;

        }

        return null; //Returning null is expected here, as variable
                     // declaration may not produce any bytecode
    }
}
