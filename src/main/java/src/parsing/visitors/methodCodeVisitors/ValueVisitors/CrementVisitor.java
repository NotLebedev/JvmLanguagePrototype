package src.parsing.visitors.methodCodeVisitors.ValueVisitors;

import src.compilation.domain.exceptions.OperatorCanNotBeAppliedException;
import src.compilation.domain.interfaces.Accessible;
import src.compilation.domain.interfaces.Scope;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.math.MathUnaryOperator;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.OperatorCanNotBeAppliedError;
import src.parsing.visitors.errorHandling.errors.VariableExpectedError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancellationException;
import src.parsing.visitors.utils.FlyweightContainer;
import src.parsing.visitors.utils.InvalidKeyTypesException;

/**
 * Class for visiting pre/post increment/decrement
 * @author NotLebedev
 */
public class CrementVisitor extends RootBaseVisitor<Value> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    //region Flyweight container
    private static final FlyweightContainer<CrementVisitor> flyweightContainer =
            new FlyweightContainer<>(Scope.class, ErrorCollector.class);

    private CrementVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static CrementVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            return flyweightContainer.getFlyweight(
                    () -> new CrementVisitor(scope, errorCollector),
                    scope, errorCollector);

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }
    //endregion

    @Override
    public Value visitPRE_INCREMENT(RootParser.PRE_INCREMENTContext ctx) {

        var value = ctx.preIncrement().value().accept(ValueVisitor.getInstance(scope, errorCollector));

        return buildMathUnaryOperator(value, MathUnaryOperator.Type.PRE_INCREMENT,
                ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.getText());

    }

    @Override
    public Value visitPRE_DECREMENT(RootParser.PRE_DECREMENTContext ctx) {

        var value = ctx.preDecrement().value().accept(ValueVisitor.getInstance(scope, errorCollector));

        return buildMathUnaryOperator(value, MathUnaryOperator.Type.PRE_DECREMENT,
                ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.getText());

    }
    @Override
    public Value visitPOST_INCREMENT(RootParser.POST_INCREMENTContext ctx) {

        var value = ctx.value().accept(ValueVisitor.getInstance(scope, errorCollector));

        return buildMathUnaryOperator(value, MathUnaryOperator.Type.POST_INCREMENT,
                ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.getText());

    }

    @Override
    public Value visitPOST_DECREMENT(RootParser.POST_DECREMENTContext ctx) {

        var value = ctx.value().accept(ValueVisitor.getInstance(scope, errorCollector));

        return buildMathUnaryOperator(value, MathUnaryOperator.Type.POST_DECREMENT,
                ctx.start.getLine(), ctx.start.getCharPositionInLine(), ctx.getText());

    }

    /**
     * Construct one of the "crement" operations
     * @param value value to be used as operand
     * @param type operation type
     * @param line code line (for error)
     * @param symbol symbol num in line (for error)
     * @param offendingSymbol value text (for error)
     * @return constructed operation
     */
    private Value buildMathUnaryOperator(Value value, MathUnaryOperator.Type type, int line, int symbol, String offendingSymbol) {
        //Value should be variable/field
        if(!(value instanceof Accessible)) {
            errorCollector.reportError(new VariableExpectedError(line, symbol,
                    offendingSymbol));
            throw new ExpressionParseCancellationException();
        }
        //Try constructing operation
        try {
            return new MathUnaryOperator(type, ((Accessible) value));
        } catch (OperatorCanNotBeAppliedException e) {
            errorCollector.reportError(new OperatorCanNotBeAppliedError(line, symbol,
                    offendingSymbol,
                    e.getMessage()));
            throw new ExpressionParseCancellationException();
        }

    }

}
