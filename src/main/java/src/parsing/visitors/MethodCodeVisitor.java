package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Method;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Class responsible for visiting of method body content
 *
 * @author NotLebedev
 */
public class MethodCodeVisitor extends RootBaseVisitor<Method> {

    private final Method method;

    public MethodCodeVisitor(Method method) {
        this.method = method;
    }

    @Override
    public Method visitMethodCode(RootParser.MethodCodeContext ctx) {

        ExpressionVisitor expressionVisitor = new ExpressionVisitor(method);

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
