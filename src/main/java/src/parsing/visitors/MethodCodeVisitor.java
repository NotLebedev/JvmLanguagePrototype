package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Method;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancelationException;

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

        ctx.expression().forEach(expressionContext -> {

            try {

                var expression = expressionContext.accept(new ExpressionVisitor(method, errorCollector));

                if(expression != null)
                    method.addExpression(expression);

            } catch (ExpressionParseCancelationException ignored) {
            }

        });

        return method;

    }
}
