package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.visitors.errorHandling.ErrorCollector;

/**
 * Class responsible for visiting single expressions in code
 *
 * @author NotLebedev
 */
public class ExpressionVisitor extends RootBaseVisitor<Expression> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    public ExpressionVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    @Override
    public Expression visitExpression(RootParser.ExpressionContext ctx) {

        if(ctx.variableDeclaration() != null) {

            var variableDeclarationVisitor = new VariableDeclarationVisitor(scope, errorCollector);

            return ctx.variableDeclaration().accept(variableDeclarationVisitor);

        }

        if(ctx.variableAssignment() != null) {

            var variableAssignmentVisitor = new VariableAssignmentVisitor(scope, errorCollector);

            return ctx.variableAssignment().accept(variableAssignmentVisitor);

        }

        if(ctx.value() != null) {

            var valueVisitor = new ValueVisitor(scope, errorCollector);

            return ctx.value().accept(valueVisitor);

        }

        return null;

    }

}
