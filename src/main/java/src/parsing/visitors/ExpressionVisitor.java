package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.interfaces.Expression;
import src.parsing.domain.interfaces.Scope;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.utils.InvalidKeyTypesException;
import src.parsing.visitors.utils.MultiKeyHashMap;

/**
 * Class responsible for visiting single expressions in code
 *
 * @author NotLebedev
 */
public class ExpressionVisitor extends RootBaseVisitor<Expression> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    private static final MultiKeyHashMap<ExpressionVisitor> expressionVisitorMap = new MultiKeyHashMap<>(Scope.class, ErrorCollector.class);

    private ExpressionVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static ExpressionVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            ExpressionVisitor result = expressionVisitorMap.get(scope, errorCollector);

            if(result != null)
                return result;
            else {

                ExpressionVisitor visitor = new ExpressionVisitor(scope, errorCollector);
                expressionVisitorMap.put(visitor, scope, errorCollector);
                return visitor;

            }

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

            return ctx.value().accept(valueVisitor);

        }

        throw new IllegalStateException("Some expression type is not implemented");

    }

}
