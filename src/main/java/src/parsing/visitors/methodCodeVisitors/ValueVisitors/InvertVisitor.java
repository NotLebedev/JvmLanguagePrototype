package src.parsing.visitors.methodCodeVisitors.ValueVisitors;

import src.compilation.domain.exceptions.OperatorCanNotBeAppliedException;
import src.compilation.domain.interfaces.Scope;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.math.MathInvert;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.OperatorCanNotBeAppliedError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancellationException;
import src.parsing.visitors.utils.FlyweightContainer;
import src.parsing.visitors.utils.InvalidKeyTypesException;

/**
 * @author NotLebedev
 */
public class InvertVisitor extends RootBaseVisitor<Value> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    private static final FlyweightContainer<InvertVisitor> flyweightContainer =
            new FlyweightContainer<>(Scope.class, ErrorCollector.class);

    private InvertVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static InvertVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            return flyweightContainer.getFlyweight(
                    () -> new InvertVisitor(scope, errorCollector),
                    scope, errorCollector);

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }

    @Override
    public Value visitINVERT(RootParser.INVERTContext ctx) {

        Value value = ctx.value().accept(ValueVisitor.getInstance(scope, errorCollector));

        try {
            return new MathInvert(value);
        } catch (OperatorCanNotBeAppliedException e) {
            errorCollector.reportError(new OperatorCanNotBeAppliedError(ctx.start.getLine(), ctx.value().start.getCharPositionInLine(),
                    ctx.value().getText(),
                    e.getMessage()));
            throw new ExpressionParseCancellationException();
        }

    }
}
