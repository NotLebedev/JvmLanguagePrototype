package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.interfaces.Value;
import src.parsing.domain.literals.FloatLiteral;
import src.parsing.domain.literals.IntLiteral;
import src.parsing.domain.literals.LongLiteral;
import src.parsing.domain.literals.StringLiteral;

/**
 * Class responsible for visiting and parsing capture groups of literals
 *
 * @author NotLebedev
 */
public class LiteralCGVisitor extends RootBaseVisitor<Value> {

    private LiteralCGVisitor(){}

    private static class SingletonHolder {
        private static LiteralCGVisitor HOLDER_INSTANCE = new LiteralCGVisitor();
    }

    public static LiteralCGVisitor getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

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

            var numberStr = ctx.FLOATCG().getText();

            if(!Character.isDigit(numberStr.charAt(numberStr.length()-1))) {

                numberStr = numberStr.substring(0, numberStr.length() - 1);

            }

            return Float.valueOf(numberStr);

        }

    }

    private class LongCGVisitor extends RootBaseVisitor<Long> {

        @Override
        public Long visitLongCG(RootParser.LongCGContext ctx) {

            var numberStr = ctx.LONGCG().getText();
            numberStr = numberStr.substring(0, numberStr.length() - 1);

            return Long.valueOf(numberStr);
        }
    }

}
