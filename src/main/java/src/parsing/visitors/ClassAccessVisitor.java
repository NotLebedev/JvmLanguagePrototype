package src.parsing.visitors;

import src.parsing.Utils;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.MethodInvocation;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.ObjectField;
import src.parsing.domain.StaticClassField;
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

                Boolean requireStatic = Boolean.FALSE;

                while (!tokens.isEmpty()) {

                    String next = tokens.get(0);

                    if(Utils.hasField(Objects.requireNonNull(val).getType(), next) && (!requireStatic)) { // Simple case of object field

                        var objectField = new ObjectField();

                        try {
                            objectField.setNames(val, next);
                        } catch (ClassNotFoundException | NoSuchFieldException e) {
                            e.printStackTrace();
                        }

                        val = objectField;
                        requireStatic = Boolean.FALSE;

                    }else if(Utils.hasStaticField(val.getType(), next)){ // Static field case

                        var staticClassField = new StaticClassField();

                        try {
                            staticClassField.setNames(val.getTypeString(), next);   // As you can see no  exact value
                                                                                    // was used here
                        } catch (ClassNotFoundException | NoSuchFieldException e) { //
                            e.printStackTrace();                                    // Note, that this case leaves
                        }                                                           // behind all sequence of values
                                                                                    // so after compilation just
                        val = staticClassField;                                     // getStatic will be called
                        requireStatic = Boolean.FALSE;

                    }else if(Utils.hasNestedClass(val.getType(), next)) {

                        // Fictive variable here is used just to indicate class type, it wont be used in code as
                        // classes can only have static methods and fields accessed, which do not require exact value
                        // to operate (see case above), so this fictive variable will be thrown out

                        try {

                            val = new Variable(val.getTypeString(), "fictive", -1);
                            requireStatic = Boolean.TRUE;   // By setting this field to true, we insure,
                                                    // that no non-static fields and methods will be accessed
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }

                    }

                    tokens.remove(0);

                }

            }

        }

        return null;

    }

}
