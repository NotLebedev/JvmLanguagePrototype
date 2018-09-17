package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.*;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.exceptions.ArrayExpectedException;
import src.parsing.domain.exceptions.IncompatibleTypesException;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.PackageO;
import src.parsing.domain.structure.ReflectionMethodWrapper;
import src.parsing.domain.structure.interfaces.AbstractClass;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.ArrayExpectedError;
import src.parsing.visitors.errorHandling.errors.CanNotResolveSymbolError;
import src.parsing.visitors.errorHandling.errors.IncompatibleTypesError;
import src.parsing.visitors.errorHandling.errors.NoSuchMethodError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancelationException;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Objects;
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
    private final ErrorCollector errorCollector;

    public ValueVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    @Override
    public Value visitValue(RootParser.ValueContext ctx) {

        //region literal
        if (ctx.literalCG() != null) {
            return ctx.literalCG().accept(new LiteralCGVisitor());
        }
        //endregion

        //region plain id
        else if (ctx.id() != null) {

            try {
                return scope.getVariableByName(ctx.id().getText());
            } catch (VariableNotFoundException ignored) {
            }

            var packagePart = new PackageO();

            if (packagePart.updatePath(ctx.id().getText()))
                return packagePart;

            errorCollector.reportFatalError(
                    new CanNotResolveSymbolError(ctx.id().start.getLine(), ctx.id().start.getCharPositionInLine(),
                            ctx.id().getText()),
                    new ExpressionParseCancelationException()
            );

        }
        //endregion

        //region object instantioation
        else if (ctx.objectInstantiation() != null) {
            return ctx.objectInstantiation().accept(new ObjectInstantiationVisitor(scope, errorCollector));
        }
        //endregion

        //region parenthesis
        else if (ctx.bracketOpenS() != null) {
            //Just simple parenthesis
            return ctx.value(0).accept(new ValueVisitor(scope, errorCollector));
        }
        //endregion

        //region dotS
        else if (ctx.dotS() != null) {

            var val = ctx.value(0).accept(new ValueVisitor(scope, errorCollector));

            if (val instanceof PackageO && ctx.value(1).id() != null) {  // Package part may expect
                // only id to go next
                var packageO = (PackageO) val;

                String id = ctx.value(1).id().getText();

                //region Subpackage
                if (packageO.updatePath(id))
                    return packageO;
                //endregion

                //region Class
                try {
                    return ClassFactory.getInstance().forName(packageO.getPath() + "." + id);
                } catch (ClassNotFoundException ignored) {
                    errorCollector.reportFatalError(
                            new CanNotResolveSymbolError(ctx.value(1).id().start.getLine(), ctx.value(1).id().start.getCharPositionInLine(),
                                    ctx.value(1).id().getText()),
                            new ExpressionParseCancelationException()
                    );
                }
                //endregion

            } else if (val instanceof AbstractClass) {

                var classO = (AbstractClass) val;

                if (ctx.value(1).id() != null) {

                    String id = ctx.value(1).id().getText();

                    //region Nested class
                    try {
                        return ClassFactory.getInstance().forName(classO.getName() + "$" + id);
                    } catch (ClassNotFoundException ignored) {
                    }
                    //endregion

                    //region Static field
                    try {

                        var staticClassField = new StaticClassField();
                        staticClassField.setNames(classO, id);
                        return staticClassField;

                    } catch (NoSuchFieldException e) {
                        errorCollector.reportFatalError(
                                new CanNotResolveSymbolError(ctx.value(1).id().start.getLine(), ctx.value(1).id().start.getCharPositionInLine(),
                                        ctx.value(1).id().getText()),
                                new ExpressionParseCancelationException()
                        );
                    }
                    //endregion

                }

                if (ctx.value(1).methodInv() != null) {

                    //Is static method invocation
                    return ctx.value(1).methodInv().accept(new MethodInvVisitor(val, true, scope));
                    //Is static method invocation

                }

            } else { // Last case is for any object value

                if (ctx.value(1).id() != null) {

                    //Is object field
                    try {

                        var objectField = new ObjectField();
                        objectField.setNames(val, ctx.value(1).id().getText());
                        return objectField;

                    } catch (NoSuchFieldException e) {
                        errorCollector.reportFatalError(
                                new CanNotResolveSymbolError(ctx.value(1).id().start.getLine(), ctx.value(1).id().start.getCharPositionInLine(),
                                        ctx.value(1).id().getText()),
                                new ExpressionParseCancelationException()
                        );
                    }
                    //Is object field

                }

                if (ctx.value(1).methodInv() != null) {

                    //Is object method invocation
                    return ctx.value(1).methodInv().accept(new MethodInvVisitor(val, false, scope));
                    //Is object method invocation

                }

            }

        }
        //endregion

        //region array
        else if (ctx.arrayIndex() != null) {

            Value val = ctx.value(0).accept(new ValueVisitor(scope, errorCollector));
            Value index = ctx.arrayIndex().value().accept(new ValueVisitor(scope, errorCollector));

            try {
                return new ArrayAccess(val, index);
            } catch (ArrayExpectedException e) {
                errorCollector.reportFatalError(
                        new ArrayExpectedError(ctx.value(0).start.getLine(), ctx.value(0).start.getCharPositionInLine(), ctx.value(0).getText(),
                                val.getType().getName()),
                        new ExpressionParseCancelationException()
                );
            } catch (IncompatibleTypesException e) {
                errorCollector.reportFatalError(
                        new IncompatibleTypesError(ctx.arrayIndex().value().start.getLine(),
                                ctx.arrayIndex().value().start.getCharPositionInLine(),
                                ctx.arrayIndex().value().getText(),
                                "int",
                                index.getType().getName()),
                        new ExpressionParseCancelationException()
                );
            }

        } //endregion

        throw new IllegalStateException("visitValue execution should not reach this point, if " +
                "it does, than one of cases is not implemented");

    }

    private class MethodInvVisitor extends RootBaseVisitor<Value> {

        private final Value val;
        private final Boolean requireStatic;
        private final Scope scope;

        private MethodInvVisitor(Value val, Boolean requireStatic, Scope scope) {

            this.val = val;
            this.requireStatic = requireStatic;
            this.scope = scope;

        }

        @Override
        public Value visitMethodInv(RootParser.MethodInvContext ctx) {

            List<Value> params;

            var valueVisitor = new ValueVisitor(scope, errorCollector);

            params = ctx.value().stream()
                    .map(valueContext -> valueContext.accept(valueVisitor))
                    .collect(Collectors.toList());

            var paramTypes = new AbstractClass[params.size()];

            paramTypes = params.stream()
                    .map(Value::getType)
                    .collect(Collectors.toList()).toArray(new AbstractClass[0]);

            ReflectionMethodWrapper method = null;

            try {
                method = val.getType().getMethod(ctx.id().getText(),
                        paramTypes);
            } catch (NoSuchMethodException e) {
                errorCollector.reportFatalError(
                        new NoSuchMethodError(ctx.id().start.getLine(), ctx.id().start.getCharPositionInLine(),
                                ctx.id().getText(),
                                paramTypes),
                        new ExpressionParseCancelationException()

                );
            }

            boolean isStatic = (Objects.requireNonNull(method).getModifiers() & Modifier.STATIC) != 0;

            if (requireStatic && !isStatic) {

                System.err.println("Incorrect modifier");
                return null;

            }

            if (isStatic) {

                var smi = new StaticMethodInvocation();
                smi.setNames(val.getType(), method);

                smi.setParamValues(params.toArray(new Value[0]));

                return smi;

            } else {

                var omi = new ObjectMethodInvocation();
                omi.setNames(val, method);

                omi.setParamValues(params.toArray(new Value[0]));

                return omi;

            }

        }

    }

}
