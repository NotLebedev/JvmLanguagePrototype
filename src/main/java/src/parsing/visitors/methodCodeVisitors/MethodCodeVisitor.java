package src.parsing.visitors.methodCodeVisitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.compilation.domain.Method;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancellationException;
import src.parsing.visitors.utils.FlyweightContainer;
import src.parsing.visitors.utils.InvalidKeyTypesException;

/**
 * Class responsible for visiting of method body content
 *
 * @author NotLebedev
 */
public class MethodCodeVisitor extends RootBaseVisitor<Method> {

    private final Method method;
    private final ErrorCollector errorCollector;

    private static final FlyweightContainer<MethodCodeVisitor> flyweightContainer = new FlyweightContainer<>(Method.class, ErrorCollector.class);

    private MethodCodeVisitor(Method method, ErrorCollector errorCollector) {

        this.method = method;
        this.errorCollector = errorCollector;

    }

    public static MethodCodeVisitor getInstance(Method method, ErrorCollector errorCollector) {

        try {

            return flyweightContainer.getFlyweight(() -> new MethodCodeVisitor(method, errorCollector),
                    method, errorCollector);

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }

    @Override
    public Method visitMethodCode(RootParser.MethodCodeContext ctx) {

        ctx.expression().forEach(expressionContext -> {

            try {

                var expression = expressionContext.accept(ExpressionVisitor.getInstance(method, errorCollector));

                method.addExpression(expression);

            } catch (ExpressionParseCancellationException ignored) {
            }

        });

        return method;

    }
}
