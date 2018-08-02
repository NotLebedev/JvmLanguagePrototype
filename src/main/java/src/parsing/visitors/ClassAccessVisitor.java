package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.MethodInvocation;
import src.parsing.domain.Interfaces.Scope;

public class ClassAccessVisitor extends RootBaseVisitor<MethodInvocation> {

    private Scope scope;

    public ClassAccessVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public MethodInvocation visitClassAccess(RootParser.ClassAccessContext ctx) {

        if(ctx.path() != null) {

            String[] tokens = ctx.path().getText().split("\\.");

        }

        return null;

    }

}
