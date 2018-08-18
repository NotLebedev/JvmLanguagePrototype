package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Interfaces.Scope;

/**
 * Class responsible for visiting single expressions in code
 *
 * @author NotLebedev
 */
public class ExpressionVisitor extends RootBaseVisitor<Expression> {

    private final Scope scope;

    public ExpressionVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Expression visitExpression(RootParser.ExpressionContext ctx) {

        if(ctx.variableDeclaration() != null) {

            var variableDeclarationVisitor = new VariableDeclarationVisitor(scope);

            return ctx.variableDeclaration().accept(variableDeclarationVisitor);

        }

        if(ctx.variableAssignment() != null) {

            var variableAssignmentVisitor = new VariableAssignmentVisitor(scope);

            return ctx.variableAssignment().accept(variableAssignmentVisitor);

        }

        if(ctx.value() != null) {

            var valueVisitor = new ValueVisitor(scope);

            return ctx.value().accept(valueVisitor);

        }

        return null;

    }

}
