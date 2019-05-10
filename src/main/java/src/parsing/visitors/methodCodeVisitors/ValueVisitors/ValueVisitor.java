package src.parsing.visitors.methodCodeVisitors.ValueVisitors;

import src.compilation.domain.interfaces.Scope;
import src.compilation.domain.interfaces.Value;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.utils.FlyweightContainer;
import src.parsing.visitors.utils.InvalidKeyTypesException;

/**
 * Class responsible for routing all value rule options to
 * corresponding visitors
 * @author NotLebedev
 */
public class ValueVisitor extends RootBaseVisitor<Value> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    private static final FlyweightContainer<ValueVisitor> flyweightContainer =
            new FlyweightContainer<>(Scope.class, ErrorCollector.class);

    private ValueVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static ValueVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            return flyweightContainer.getFlyweight(
                    () -> new ValueVisitor(scope, errorCollector),
                    scope, errorCollector);

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }

    @Override
    public Value visitLITERAL(RootParser.LITERALContext ctx) {
        return ctx.literalCG().accept(LiteralCGVisitor.getInstance());
    }

    @Override
    public Value visitMETHOD_INV(RootParser.METHOD_INVContext ctx) {
        throw new IllegalStateException("Not implemented yet");
    }

    @Override
    public Value visitID_LABEL(RootParser.ID_LABELContext ctx) {
        return ctx.accept(IdVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitOBJECT_INSTANTIATION(RootParser.OBJECT_INSTANTIATIONContext ctx) {
        return ctx.objectInstantiation().accept(ObjectInstantiationVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitCAST_LABEL(RootParser.CAST_LABELContext ctx) {
        return ctx.accept(CastVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitPARENTHESIS(RootParser.PARENTHESISContext ctx) {
        return ctx.value().accept(ValueVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitACCESS(RootParser.ACCESSContext ctx) {
        return ctx.accept(AccessVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitARRAY_ACCESS(RootParser.ARRAY_ACCESSContext ctx) {
        return ctx.accept(ArrayVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitPOST_INCREMENT(RootParser.POST_INCREMENTContext ctx) {
        return ctx.accept(CrementVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitPOST_DECREMENT(RootParser.POST_DECREMENTContext ctx) {
        return ctx.accept(CrementVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitPRE_INCREMENT(RootParser.PRE_INCREMENTContext ctx) {
        return ctx.accept(CrementVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitPRE_DECREMENT(RootParser.PRE_DECREMENTContext ctx) {
        return ctx.accept(CrementVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitUNARY_PLUS(RootParser.UNARY_PLUSContext ctx) {
        return ctx.unaryPlus().accept(UnaryPlusVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitUNARY_MINUS(RootParser.UNARY_MINUSContext ctx) {
        return ctx.unaryMinus().accept(UnaryMinusVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitMULTIPLICATIVE_OP(RootParser.MULTIPLICATIVE_OPContext ctx) {
        return ctx.accept(BinaryMathOperatorVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitADDITIVE_OP(RootParser.ADDITIVE_OPContext ctx) {
        return ctx.accept(BinaryMathOperatorVisitor.getInstance(scope, errorCollector));
    }
}
