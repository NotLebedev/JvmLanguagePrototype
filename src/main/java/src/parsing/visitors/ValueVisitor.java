package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.VariableNotFoundException;

public class ValueVisitor extends RootBaseVisitor<Value> {

    private final Scope scope;

    public ValueVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Value visitValue(RootParser.ValueContext ctx) {

        if(ctx.literalCG() != null) {

            return ctx.literalCG().accept(new LiteralCGVisitor());

        }

        if(ctx.id() != null) {

            try {
                return scope.getVariableByName(ctx.id().getText());
            } catch (VariableNotFoundException e) {
                e.printStackTrace();
            }

        }

        if(ctx.classAccess() != null) {

            return ctx.classAccess().accept(new ClassAccessVisitor(scope));

        }

        return null;

    }

}
