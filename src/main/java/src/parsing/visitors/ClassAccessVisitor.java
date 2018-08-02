package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.MethodInvocation;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.Variable;
import src.parsing.domain.VariableNotFoundException;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassAccessVisitor extends RootBaseVisitor<MethodInvocation> {

    private Scope scope;

    public ClassAccessVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public MethodInvocation visitClassAccess(RootParser.ClassAccessContext ctx) {

        if(ctx.path() != null) {

            ArrayList<String> tokens = new ArrayList<>(Arrays.asList(ctx.path().getText().split("\\.")));

            if(scope.hasVariable(tokens.get(0))) {

                Variable variable = null;

                try {
                    variable = scope.getVariableByName(tokens.get(0));
                } catch (VariableNotFoundException e) {
                    e.printStackTrace();
                }

                tokens.remove(0);

                while (!tokens.isEmpty()) {



                }

            }

        }

        return null;

    }

}
