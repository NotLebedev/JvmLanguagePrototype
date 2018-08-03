package src.parsing.visitors;

import src.parsing.Utils;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.ObjectField;
import src.parsing.domain.StaticClassField;
import src.parsing.domain.Variable;
import src.parsing.domain.VariableNotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ClassAccessVisitor extends RootBaseVisitor<Value> {

    private Scope scope;

    private Boolean requireStatic;

    public ClassAccessVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Value visitClassAccess(RootParser.ClassAccessContext ctx) {

        if(ctx.path() != null || ctx.pathNoEndDot() != null) { // Non-local method invocation

            String str = ctx.path() != null ? ctx.path().getText() : ctx.pathNoEndDot().getText() ;

            var tokens = new ArrayList<>(Arrays.asList(str.split("\\.")));

            Value val = null;

            if(scope.hasVariable(tokens.get(0))) { // Local variable

                try {
                    val = scope.getVariableByName(tokens.get(0));
                } catch (VariableNotFoundException e) {
                    e.printStackTrace();
                }

                tokens.remove(0);

                requireStatic = Boolean.FALSE;

                try {
                    val = parsePath(val, tokens);
                } catch (SymbolNotFoundException e) {
                    e.printStackTrace();
                }

                System.out.println();

            }else {

                Class<?> cls = null;
                var className = new StringBuilder();

                var next = tokens.get(0);

                className.append(next);
                tokens.remove(0);

                while (!tokens.isEmpty()) { // Getting class name

                    next = tokens.get(0);

                    try {

                        cls = Class.forName(className.toString());
                        break;

                    } catch (ClassNotFoundException e) {
                        className.append(".").append(next);
                        tokens.remove(0);
                    }

                }

                if(cls == null) {
                    System.err.println("Class not found");
                    return null;
                }

                requireStatic = Boolean.TRUE; // Only static fields allowed

                try {
                    val = parsePath(new Variable(Objects.requireNonNull(cls).getTypeName(), "fictive", -1), tokens);
                } catch (SymbolNotFoundException | ClassNotFoundException e) {
                    e.printStackTrace();
                }

                System.out.println();

            }

        }

        return null;

    }

    private Value parsePath(Value startValue, ArrayList<String> tokens) throws SymbolNotFoundException {

        Value val = startValue;

        while (!tokens.isEmpty()) {

            String next = tokens.get(0);

            if(Utils.hasNonStaticField(Objects.requireNonNull(val).getType(), next) && (!requireStatic)) { // Simple case of object field

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
                    staticClassField.setNames(val.getType().getName(), next);   // As you can see no  exact value
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

                    val = new Variable(Utils.getNestedClass(val.getType(), next).getTypeName(), "fictive", -1);
                    requireStatic = Boolean.TRUE;   // By setting this field to true, we insure,
                    // that no non-static fields and methods will be accessed
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }else {
                throw new SymbolNotFoundException("Can not find symbol  " + next + " in class " + val.getType().getName());
            }

            tokens.remove(0);

        }

        return val;

    }

}
