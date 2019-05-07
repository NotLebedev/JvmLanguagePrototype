package src.parsing.visitors.methodCodeVisitors;

import src.compilation.domain.Method;
import src.compilation.domain.ValueAsExpressionHolder;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.compilation.domain.interfaces.Expression;
import src.compilation.domain.interfaces.Scope;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.methodCodeVisitors.ValueVisitors.ValueVisitor;
import src.parsing.visitors.utils.FlyweightContainer;
import src.parsing.visitors.utils.InvalidKeyTypesException;

/**
 * Class responsible for visiting single expressions in code
 *
 * @author NotLebedev
 */
public class ExpressionVisitor extends RootBaseVisitor<Expression> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    private static final FlyweightContainer<ExpressionVisitor> flyweightContainer = new FlyweightContainer<>(Scope.class, ErrorCollector.class);

    private ExpressionVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static ExpressionVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            return flyweightContainer.getFlyweight(() -> new ExpressionVisitor(scope, errorCollector),
                    scope, errorCollector);

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }

    @Override
    public Expression visitExpression(RootParser.ExpressionContext ctx) {

        if(ctx.variableDeclaration() != null) {

            var variableDeclarationVisitor = VariableDeclarationVisitor.getInstance(scope, errorCollector);

            return ctx.variableDeclaration().accept(variableDeclarationVisitor);

        }

        if(ctx.variableAssignment() != null) {

            var variableAssignmentVisitor = VariableAssignmentVisitor.getInstance(scope, errorCollector);

            return ctx.variableAssignment().accept(variableAssignmentVisitor);

        }

        if(ctx.value() != null) {

            var valueVisitor = ValueVisitor.getInstance(scope, errorCollector);

            //Wrapping to eliminate unwanted value on stack
            return new ValueAsExpressionHolder(ctx.value().accept(valueVisitor));

        }

        throw new IllegalStateException("Some expression type is not implemented");

    }

}
