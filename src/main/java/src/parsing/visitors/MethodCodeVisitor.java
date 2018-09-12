package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Method;
import src.parsing.visitors.errorHandling.ErrorCollector;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Class responsible for visiting of method body content
 *
 * @author NotLebedev
 */
public class MethodCodeVisitor extends RootBaseVisitor<Method> {

    private final Method method;
    private final ErrorCollector errorCollector;

    public MethodCodeVisitor(Method method, ErrorCollector errorCollector) {

        this.method = method;
        this.errorCollector = errorCollector;

    }

    @Override
    public Method visitMethodCode(RootParser.MethodCodeContext ctx) {

        ExpressionVisitor expressionVisitor = new ExpressionVisitor(method, errorCollector);

        List<Expression> expressions = ctx.expression()
                .stream()
                .map(expressionContext -> expressionContext.accept(expressionVisitor))
                .collect(Collectors.toList());

        expressions.forEach(expression -> {
            if(expression != null)
            method.addExpression(expression);
        });

        return method;

    }
}
