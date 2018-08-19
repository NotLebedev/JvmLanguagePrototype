package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.*;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Class responsible for recursive visiting of values, this is visitor of
 * main grammar rule responsible for parsing of all access (e.g. {@code System.out.println()})
 * arithmetical (e.g. {@code (i + 32) / j}) boolean (e.g. {@code !(b & a)}) and combined expressions
 *
 * @author NotLebedev
 */
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
            } catch (VariableNotFoundException ignored) {
            }

            var packagePart = new PackageO();

            if(packagePart.updatePath(ctx.id().getText()))
                return packagePart;

        }

        if(ctx.objectInstantiation() != null) {
            return ctx.objectInstantiation().accept(new ObjectInstantiationVisitor(scope));
        }

        if(ctx.bracketOpenS() != null) {
            //Just simple parenthesis
            return ctx.value(0).accept(new ValueVisitor(scope));
        }

        //region dotS
        if(ctx.dotS() != null) {

            var val = ctx.value(0).accept(new ValueVisitor(scope));

            if(val instanceof PackageO && ctx.value(1).id() != null) {  // Package part may expect
                                                                        // only id to go next
                var packageO = (PackageO)val;

                String id = ctx.value(1).id().getText();

                //region Subpackage
                if(packageO.updatePath(id))
                    return packageO;
                //endregion

                //region Class
                try {
                    return new ClassO(packageO.getPath() + "." + id);
                } catch (ClassNotFoundException ignored) {
                }
                //endregion

                return null;

            }

            if(val instanceof ClassO) {

                var classO = (ClassO)val;

                if(ctx.value(1).id() != null) {

                    String id = ctx.value(1).id().getText();

                    //region Nested class
                    try {
                        return new ClassO(classO.getName() + "$" + id);
                    } catch (ClassNotFoundException ignored) {
                    }
                    //endregion

                    //region Static field
                    try {

                        var staticClassField = new StaticClassField();
                        staticClassField.setNames(classO, id);
                        return staticClassField;

                    } catch (NoSuchFieldException ignored) {
                    }
                    //endregion

                }

                if(ctx.value(1).methodInv() != null) {

                    //Is static method invocation
                    return ctx.value(1).methodInv().accept(new MethodInvVisitor(val, true, scope));
                    //Is static method invocation

                }

                return null;

            }

            if(ctx.value(1).id() != null) {

                //Is object field
                try {

                    var objectField = new ObjectField();
                    objectField.setNames(val, ctx.value(1).id().getText());
                    return objectField;

                } catch (NoSuchFieldException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
                //Is object field

            }

            if(ctx.value(1).methodInv() != null) {

                //Is object method invocation
                return ctx.value(1).methodInv().accept(new MethodInvVisitor(val, false, scope));
                //Is object method invocation

            }

        }
        //endregion

        if(ctx.arrayIndex() != null) {

            Value val = ctx.value(0).accept(new ValueVisitor(scope));
            Value index = ctx.arrayIndex().value().accept(new ValueVisitor(scope));

            try {
                return new ArrayAccess(val, index);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

        return null;

    }

    private class MethodInvVisitor extends RootBaseVisitor<Value> {

        private final Value val;
        private final Boolean requireStatic;
        private final Scope scope;

        public MethodInvVisitor(Value val, Boolean requireStatic, Scope scope) {

            this.val = val;
            this.requireStatic = requireStatic;
            this.scope = scope;

        }

        @Override
        public Value visitMethodInv(RootParser.MethodInvContext ctx) {

            List<Value> params;

            var valueVisitor = new ValueVisitor(scope);

            params = ctx.value().stream()
                    .map(valueContext -> valueContext.accept(valueVisitor))
                    .collect(Collectors.toList());

            var paramTypes = new Class<?>[params.size()];

            paramTypes = params.stream()
                    .map((Function<Value, Object>) Value::getType)
                    .collect(Collectors.toList()).toArray(new Class[0]);

            java.lang.reflect.Method method = null;

            try {
                method = val.getType().getMethod(ctx.id().getText(),
                        paramTypes);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

            boolean isStatic = (Objects.requireNonNull(method).getModifiers() & Modifier.STATIC) != 0;

            if(requireStatic && !isStatic) {

                System.err.println("Incorrect modifier");
                return null;

            }

            if(isStatic) {

                var smi = new StaticMethodInvocation();
                try {
                    smi.setNames((ClassO) val,
                            ctx.id().getText(),
                            params.stream()
                                    .map(value -> value.getType().getTypeName())
                                    .toArray(String[]::new));
                } catch (ClassNotFoundException | NoSuchMethodException e) {
                    e.printStackTrace();
                }

                smi.setParamValues(params.toArray(new Value[0]));

                return smi;

            }else {

                var omi = new ObjectMethodInvocation();
                try {
                    omi.setNames(val,
                            ctx.id().getText(),
                            params.stream()
                                    .map(value -> value.getType().getTypeName())
                                    .toArray(String[]::new));
                } catch (NoSuchMethodException | ClassNotFoundException e) {
                    e.printStackTrace();
                }

                omi.setParamValues(params.toArray(new Value[0]));

                return omi;

            }

        }

    }

}
