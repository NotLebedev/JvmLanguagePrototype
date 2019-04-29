package src.parsing.visitors;

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
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancelationException;
import src.parsing.visitors.utils.InvalidKeyTypesException;
import src.parsing.visitors.utils.MultiKeyHashMap;

/**
 * @author NotLebedev
 */
public class CrementVisitor extends RootBaseVisitor<Value> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    private static final MultiKeyHashMap<CrementVisitor> containerMap = new MultiKeyHashMap<>(Scope.class, ErrorCollector.class);

    private CrementVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static CrementVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            CrementVisitor result = containerMap.get(scope, errorCollector);

            if(result != null)
                return result;
            else {

                CrementVisitor visitor = new CrementVisitor(scope, errorCollector);
                containerMap.put(visitor, scope, errorCollector);
                return visitor;

            }

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }

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

    private Value buildMathUnaryOperator(Value value, MathUnaryOperator.Type type, int line, int symbol, String offendingSymbol) {

        if(!(value instanceof Accessible)) {
            errorCollector.reportError(new VariableExpectedError(line, symbol,
                    offendingSymbol));
            throw new ExpressionParseCancelationException();
        }

        try {
            return new MathUnaryOperator(type, ((Accessible) value));
        } catch (OperatorCanNotBeAppliedException e) {
            errorCollector.reportError(new OperatorCanNotBeAppliedError(line, symbol,
                    offendingSymbol,
                    e.getMessage()));
            throw new ExpressionParseCancelationException();
        }

    }

}
