package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Interfaces.Scope;

public class ExpressionVisitor extends RootBaseVisitor<Expression> {

    private Scope scope;

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

        /*if(ctx.methodInvocation() != null) {

            var methodInvocationVisitor = new MethodInvocationVisitor(scope);

            return ctx.methodInvocation().accept(methodInvocationVisitor);

        }*/

        return null;

    }

}
