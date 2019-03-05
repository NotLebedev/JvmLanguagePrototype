package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.visitors.errorHandling.ErrorCollector;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Class responsible for visiting single expressions in code
 *
 * @author NotLebedev
 */
public class ExpressionVisitor extends RootBaseVisitor<Expression> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    private static List<ExpressionVisitor> expressionVisitorList = new ArrayList<>();

    private ExpressionVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static ExpressionVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        Optional<ExpressionVisitor> result = expressionVisitorList.stream().filter(expressionVisitor -> expressionVisitor.matches(scope, errorCollector)).findFirst();

        if(result.isPresent())
            return result.get();
        else {

            ExpressionVisitor visitor = new ExpressionVisitor(scope, errorCollector);
            expressionVisitorList.add(visitor);
            return visitor;

        }

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

            var valueVisitor = ValueVisitor.getInstance(scope, errorCollector);

            return ctx.value().accept(valueVisitor);

        }

        throw new IllegalStateException("Some expression type is not implemented");

    }

    private boolean matches(Scope scope, ErrorCollector errorCollector) {
        return this.scope == scope && this.errorCollector == errorCollector;
    }

}
