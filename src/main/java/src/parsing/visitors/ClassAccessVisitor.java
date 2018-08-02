package src.parsing.visitors;

import src.parsing.Utils;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.MethodInvocation;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.ObjectField;
import src.parsing.domain.Variable;
import src.parsing.domain.VariableNotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ClassAccessVisitor extends RootBaseVisitor<MethodInvocation> {

    private Scope scope;

    public ClassAccessVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public MethodInvocation visitClassAccess(RootParser.ClassAccessContext ctx) {

        if(ctx.path() != null) { // Non-local method invocation

            var tokens = new ArrayList<>(Arrays.asList(ctx.path().getText().split("\\.")));

            if(scope.hasVariable(tokens.get(0))) {

                Value val = null;

                try {
                    val = scope.getVariableByName(tokens.get(0));
                } catch (VariableNotFoundException e) {
                    e.printStackTrace();
                }

                tokens.remove(0);

                while (!tokens.isEmpty()) {

                    String next = tokens.get(0);

                    if(Utils.hasField(Objects.requireNonNull(val).getType(), next)) {

                        var objectField = new ObjectField();

                        try {
                            objectField.setNames(val, next);
                        } catch (ClassNotFoundException | NoSuchFieldException e) {
                            e.printStackTrace();
                        }

                        val = objectField;

                    }else if(Utils.hasStaticField(val.getType(), next)){



                    }else if(Utils.hasStaticClass(val.getType(), next)) {



                    }

                    tokens.remove(0);

                }

            }

        }

        return null;

    }

}
