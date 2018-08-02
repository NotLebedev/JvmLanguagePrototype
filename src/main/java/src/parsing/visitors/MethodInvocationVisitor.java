package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Interfaces.MethodInvocation;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.ObjectField;
import src.parsing.domain.Variable;
import src.parsing.domain.VariableNotFoundException;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodInvocationVisitor extends RootBaseVisitor<MethodInvocation> {

   /* private Scope scope;

    public MethodInvocationVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public MethodInvocation visitMethodInvocation(RootParser.MethodInvocationContext ctx) {

        if(ctx.path() == null) {
            // Todo: insert local method invocation
            return null;
        }



        var split = new ArrayList<>(Arrays.asList(ctx.path().getText().split("\\.")));

        if(isVariable(split.get(0))) { //No access to static via object reference

            Value v = null;

            try {
                v = scope.getVariableByName(split.get(0));
            } catch (VariableNotFoundException e) {
                e.printStackTrace();
            }

            split.remove(0);

            while (!split.isEmpty()) {

                String next = split.get(0);

                if(hasField(next, v)) {

                    var objectField = new ObjectField();

                    try {
                        objectField.setNames(v, next);
                    } catch (ClassNotFoundException | NoSuchFieldException e) {
                        e.printStackTrace();
                    }

                    v = objectField;

                }else {

                    System.err.println("No such field");

                }

                split.remove(0);

            }



        }

        return null;

    }

    private boolean isVariable(String name) {

        try{

            scope.getVariableByName(name);
            return true;

        } catch (VariableNotFoundException e) {
            return false;
        }

    }

    private boolean hasField(String field, Value v) {

        try {

            v.getClass().getField(field);
            return true;

        } catch (NoSuchFieldException e) {
            return false;
        }

    }*/

}
