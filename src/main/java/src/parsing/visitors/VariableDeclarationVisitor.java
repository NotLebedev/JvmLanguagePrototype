package src.parsing.visitors;

import org.antlr.v4.runtime.misc.ParseCancellationException;
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
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancelationException;
import src.parsing.visitors.utils.InvalidKeyTypesException;
import src.parsing.visitors.utils.MultiKeyHashMap;

import javax.annotation.Nullable;

/**
 * Class responsible for visiting variable assignments (e.g. {@code String str})
 *
 * @author NotLebedev
 */
public class VariableDeclarationVisitor extends RootBaseVisitor<Expression> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    private static final MultiKeyHashMap<VariableDeclarationVisitor> variableDeclarationVisitorMap = new MultiKeyHashMap<>(Scope.class, ErrorCollector.class);

    private VariableDeclarationVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static VariableDeclarationVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            VariableDeclarationVisitor result = variableDeclarationVisitorMap.get(scope, errorCollector);

            if(result != null)
                return result;
            else {

                VariableDeclarationVisitor visitor = new VariableDeclarationVisitor(scope, errorCollector);
                variableDeclarationVisitorMap.put(visitor, scope, errorCollector);
                return visitor;

            }

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }

    @Override
    @Nullable
    public Expression visitVariableDeclaration(RootParser.VariableDeclarationContext ctx) {

        var type = ctx.declarationType().getText();
        var name = ctx.id().getText();

        Variable variable;

        try {
            variable = new Variable(type, name, 0);
        } catch (ClassNotFoundException e) {

            errorCollector.reportError(
                    new ClassNotFoundError(ctx.declarationType().start.getLine(), ctx.declarationType().start.getCharPositionInLine(),
                            ctx.declarationType().getText()));

            throw new ParseCancellationException();

        }

        try {
            scope.addVariable(variable);
        } catch (VariableAlreadyDefinedException e) {

            errorCollector.reportError(
                    new VariableAlreadyDefinedError(ctx.id().start.getLine(), ctx.id().start.getCharPositionInLine(),
                            ctx.id().start.getText())
            );

            throw new ParseCancellationException();

        }

        if(ctx.assignment() != null) {

            var variableAssignment = new VariableAssignment();

            var valueVisitor = ValueVisitor.getInstance(scope, errorCollector);

            Value value = ctx.assignment().accept(valueVisitor);

            try {
                variableAssignment.setParams(variable, value);
            } catch (IncompatibleTypesException e) {

                errorCollector.reportError(
                        new IncompatibleTypesError(ctx.assignment().value().start.getLine(), ctx.assignment().value().start.getCharPositionInLine(), ctx.assignment().value().getText(),
                                e.getTypeExpected(), e.getTypeFound())); //variable can not be null (because of reportFatalError)
                throw new ExpressionParseCancelationException();

            }

            return variableAssignment;

        }

        return null; //Returning null is expected here, as variable
        // declaration may not produce any bytecode
    }
}
