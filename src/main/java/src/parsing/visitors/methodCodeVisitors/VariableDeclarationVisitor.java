package src.parsing.visitors.methodCodeVisitors;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import src.compilation.domain.EmptyExpression;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.compilation.domain.interfaces.Expression;
import src.compilation.domain.interfaces.Scope;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.access.Variable;
import src.compilation.domain.access.VariableAssignment;
import src.compilation.domain.exceptions.IncompatibleTypesException;
import src.compilation.domain.exceptions.VariableAlreadyDefinedException;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.ClassNotFoundError;
import src.parsing.visitors.errorHandling.errors.IncompatibleTypesError;
import src.parsing.visitors.errorHandling.errors.VariableAlreadyDefinedError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancellationException;
import src.parsing.visitors.methodCodeVisitors.ValueVisitors.ValueVisitor;
import src.parsing.visitors.utils.FlyweightContainer;
import src.parsing.visitors.utils.InvalidKeyTypesException;

import javax.annotation.Nonnull;

/**
 * Class responsible for visiting variable declarations (e.g. {@code String str;})
 *
 * @author NotLebedev
 */
public class VariableDeclarationVisitor extends RootBaseVisitor<Expression> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    private static final FlyweightContainer<VariableDeclarationVisitor> flyweightContainer = new FlyweightContainer<>(Scope.class, ErrorCollector.class);

    private VariableDeclarationVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static VariableDeclarationVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            return flyweightContainer.getFlyweight(() -> new VariableDeclarationVisitor(scope, errorCollector), scope, errorCollector);

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }

    @Override
    @Nonnull
    public Expression visitVariableDeclaration(RootParser.VariableDeclarationContext ctx) {

        var type = ctx.declarationType().getText();
        var name = ctx.id().getText();

        Variable variable;

        try { //Try creating a variable with given type
            variable = new Variable(type, name, 0);
        } catch (ClassNotFoundException e) {

            errorCollector.reportError(
                    new ClassNotFoundError(ctx.declarationType().start.getLine(), ctx.declarationType().start.getCharPositionInLine(),
                            ctx.declarationType().getText()));

            throw new ParseCancellationException();

        }

        try { //Than try adding it to scope
            scope.addVariable(variable);
        } catch (VariableAlreadyDefinedException e) {

            errorCollector.reportError(
                    new VariableAlreadyDefinedError(ctx.id().start.getLine(), ctx.id().start.getCharPositionInLine(),
                            ctx.id().start.getText())
            );

            throw new ParseCancellationException();

        }

        if(ctx.assignment() != null) { //If assignment is present

            var variableAssignment = new VariableAssignment();

            var valueVisitor = ValueVisitor.getInstance(scope, errorCollector);

            Value value = ctx.assignment().accept(valueVisitor);

            try { //Try assigning value to variable
                variableAssignment.setParams(variable, value);
            } catch (IncompatibleTypesException e) {

                errorCollector.reportError(
                        new IncompatibleTypesError(ctx.assignment().value().start.getLine(), ctx.assignment().value().start.getCharPositionInLine(), ctx.assignment().value().getText(),
                                e.getTypeExpected(), e.getTypeFound())); //variable can not be null (because of reportFatalError)
                throw new ExpressionParseCancellationException();

            }

            return variableAssignment;

        }

        return new EmptyExpression(); //If no assignment occurs no bytecode is generated
    }
}
