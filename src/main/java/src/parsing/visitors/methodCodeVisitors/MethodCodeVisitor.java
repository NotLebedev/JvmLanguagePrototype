package src.parsing.visitors.methodCodeVisitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.compilation.domain.Method;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancellationException;
import src.parsing.visitors.utils.InvalidKeyTypesException;
import src.parsing.visitors.utils.MultiKeyHashMap;

/**
 * Class responsible for visiting of method body content
 *
 * @author NotLebedev
 */
public class MethodCodeVisitor extends RootBaseVisitor<Method> {

    private final Method method;
    private final ErrorCollector errorCollector;

    private static final MultiKeyHashMap<MethodCodeVisitor> methodCodeVisitorMap = new MultiKeyHashMap<>(Method.class, ErrorCollector.class);

    private MethodCodeVisitor(Method method, ErrorCollector errorCollector) {

        this.method = method;
        this.errorCollector = errorCollector;

    }

    public static MethodCodeVisitor getInstance(Method method, ErrorCollector errorCollector) {

        try {

            MethodCodeVisitor result = methodCodeVisitorMap.get(method, errorCollector);

            if(result != null)
                return result;
            else {

                MethodCodeVisitor visitor = new MethodCodeVisitor(method, errorCollector);
                methodCodeVisitorMap.put(visitor, method, errorCollector);
                return visitor;

            }

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
