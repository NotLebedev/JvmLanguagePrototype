package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.constantValues.IntLiteral;
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

        return null;

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

}
