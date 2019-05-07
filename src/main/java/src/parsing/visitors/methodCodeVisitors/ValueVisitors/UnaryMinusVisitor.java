package src.parsing.visitors.methodCodeVisitors.ValueVisitors;

import src.compilation.domain.exceptions.OperatorCanNotBeAppliedException;
import src.compilation.domain.interfaces.Scope;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.math.MathNegate;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.OperatorCanNotBeAppliedError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancellationException;
import src.parsing.visitors.utils.FlyweightContainer;
import src.parsing.visitors.utils.InvalidKeyTypesException;

/**
 * Class for visiting unary minus operator (e.g. {@code -i})
 * @author NotLebedev
 */
public class UnaryMinusVisitor extends RootBaseVisitor<Value> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    private static final FlyweightContainer<UnaryMinusVisitor> flyweightContainer =
            new FlyweightContainer<>(Scope.class, ErrorCollector.class);

    private UnaryMinusVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static UnaryMinusVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            return flyweightContainer.getFlyweight(
                    () -> new UnaryMinusVisitor(scope, errorCollector),
                    scope, errorCollector);

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }

    @Override
    public Value visitUnaryMinus(RootParser.UnaryMinusContext ctx) {

        Value value = ctx.value().accept(ValueVisitor.getInstance(scope, errorCollector));

        try {
            return new MathNegate(value);
        } catch (OperatorCanNotBeAppliedException e) {
            errorCollector.reportError(new OperatorCanNotBeAppliedError(ctx.start.getLine(), ctx.value().start.getCharPositionInLine(),
                    ctx.value().getText(),
                    e.getMessage()));
            throw new ExpressionParseCancellationException();
        }

    }
}
