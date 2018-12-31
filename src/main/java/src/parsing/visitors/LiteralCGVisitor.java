package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.constantValues.FloatLiteral;
import src.parsing.domain.constantValues.IntLiteral;
import src.parsing.domain.constantValues.LongLiteral;
import src.parsing.domain.constantValues.StringLiteral;

/**
 * Class responsible for visiting and parsing capture groups of literals
 *
 * @author NotLebedev
 */
public class LiteralCGVisitor extends RootBaseVisitor<Value> {

    @Override
    public Value visitLiteralCG(RootParser.LiteralCGContext ctx) {

        if(ctx.stringCG() != null) {
            return new StringLiteral(ctx.accept(new StringCGVisitor()));
        }

        if(ctx.integerCG() != null) {
            return new IntLiteral(ctx.accept(new IntCGVisitor()));
        }

        if(ctx.floatCG() != null) {
            return new FloatLiteral(ctx.accept(new FloatCGVisitor()));
        }

        if(ctx.longCG() != null) {
            return new LongLiteral(ctx.accept(new LongCGVisitor()));
        }

        throw new IllegalStateException("Some of visitLiteralCG cases is not implemented");

    }

    private class StringCGVisitor extends RootBaseVisitor<String> {

        @Override
        public String visitStringCG(RootParser.StringCGContext ctx) {
            return ctx.STRINGCG().getText().substring(1, ctx.STRINGCG().getText().length() - 1);
        }

    }

    private class IntCGVisitor extends RootBaseVisitor<Integer> {

        @Override
        public Integer visitIntegerCG(RootParser.IntegerCGContext ctx) {
            return Integer.valueOf(ctx.INTEGERCG().getText());
        }

    }

    private class FloatCGVisitor extends RootBaseVisitor<Float> {

        @Override
        public Float visitFloatCG(RootParser.FloatCGContext ctx) {
            return Float.valueOf(ctx.FLOATCG().getText());
        }

    }

    private class LongCGVisitor extends RootBaseVisitor<Long> {

        @Override
        public Long visitLongCG(RootParser.LongCGContext ctx) {

            var numberStr = ctx.LONGCG().getText();
            numberStr = numberStr.substring(0, numberStr.length() - 2);

            return Long.valueOf(numberStr);
        }
    }

}
