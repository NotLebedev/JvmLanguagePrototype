package src.parsing.visitors.methodCodeVisitors.ValueVisitors;

import src.compilation.domain.exceptions.IncompatibleTypesException;
import src.compilation.domain.exceptions.OperatorCanNotBeAppliedException;
import src.compilation.domain.interfaces.Scope;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.math.MathBinaryOperator;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.IncompatibleTypesError;
import src.parsing.visitors.errorHandling.errors.OperatorCanNotBeAppliedError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancellationException;
import src.parsing.visitors.utils.InvalidKeyTypesException;
import src.parsing.visitors.utils.MultiKeyHashMap;

public class MultiplicativeOperatorVisitor extends RootBaseVisitor<Value> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    //region Flyweight container
    private static final MultiKeyHashMap<MultiplicativeOperatorVisitor> containerMap = new MultiKeyHashMap<>(Scope.class, ErrorCollector.class);

    private MultiplicativeOperatorVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static MultiplicativeOperatorVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            MultiplicativeOperatorVisitor  result = containerMap.get(scope, errorCollector);

            if(result != null)
                return result;
            else {

                MultiplicativeOperatorVisitor  visitor = new MultiplicativeOperatorVisitor (scope, errorCollector);
                containerMap.put(visitor, scope, errorCollector);
                return visitor;

            }

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }
    //endregion

    @Override
    public Value visitMULTIPLICATIVE_OP(RootParser.MULTIPLICATIVE_OPContext ctx) {
        //Acquire both values
        var valueVisitor = ValueVisitor.getInstance(scope, errorCollector);

        Value val1 = ctx.value(0).accept(valueVisitor);
        Value val2 = ctx.value(1).accept(valueVisitor);

        try { //Try creating operator
            return new MathBinaryOperator(getOperationType(ctx), val1, val2);
        } catch (OperatorCanNotBeAppliedException e) { //Operator can not be applied to one of the types
            errorCollector.reportError(new OperatorCanNotBeAppliedError(
                    ctx.start.getLine(), ctx.value(0).start.getCharPositionInLine(),
                    ctx.value(1).getText(),
                    "Operator '" + getOperationType(ctx).name + "' can not be applied to types " +
                     val1.getType().getName() + " and " + val2.getType().getName()
            ));
            throw new ExpressionParseCancellationException();
        } catch (IncompatibleTypesException e) { //Two types cant be used together
            errorCollector.reportError(new IncompatibleTypesError(
                    ctx.start.getLine(), ctx.value(0).start.getCharPositionInLine(),
                    ctx.value(1).getText(),
                    val1.getType().getName(), val2.getType().getName()
            ));
            throw new ExpressionParseCancellationException();
        }

    }

    private MathBinaryOperator.Type getOperationType(RootParser.MULTIPLICATIVE_OPContext ctx) {
        //Select which operator was used TODO: redo with custom labels somehow
        if(ctx.asteriskS() != null)
            return MathBinaryOperator.Type.MULTIPLY;
        else if(ctx.slashS() != null)
            return MathBinaryOperator.Type.DIVIDE;
        else if(ctx.percentS() != null)
            return MathBinaryOperator.Type.REMAINDER;

        throw new IllegalStateException("Unexpected multiplicative operator");

    }

}
