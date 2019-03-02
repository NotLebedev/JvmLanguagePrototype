package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.*;
import src.parsing.domain.Interfaces.Accessible;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.Math.MathUnaryOperator;
import src.parsing.domain.exceptions.ArrayExpectedException;
import src.parsing.domain.exceptions.IncompatibleTypesException;
import src.parsing.domain.exceptions.VariableNotFoundException;
import src.parsing.domain.exceptions.WrongCastException;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.PackageO;
import src.parsing.domain.structure.ReflectionMethodWrapper;
import src.parsing.domain.structure.interfaces.AbstractClass;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.*;
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

    @Deprecated
    public ValueVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public ValueVisitor getInstance(Scope scope, ErrorCollector errorCollector) {
        return new ValueVisitor(scope, errorCollector);
    }

    @Override
    public Value visitValue(RootParser.ValueContext ctx) {

        if(ctx.dotS() != null) { ///////////////////////Dot

            return visitDotS(ctx);

        } else if(ctx.id() != null) { //////////////////ID

            return visitId(ctx);

        } else if(ctx.bracketOpenS() != null) {/////////Parenthesis

            return ctx.value(0).accept(new ValueVisitor(scope, errorCollector));

        } else if(ctx.objectInstantiation() != null) {//Object instantiation

            return ctx.objectInstantiation().accept(new ObjectInstantiationVisitor(scope, errorCollector));

        } else if(ctx.arrayIndex() != null) {///////////Array

            return visitArray(ctx);

        } else if(ctx.cast() != null) {/////////////////Cast

            return visitCast(ctx);

        } else if(ctx.literalCG() != null) {////////////LiteralCG

            return visitLiteral(ctx);

        } else if(ctx.incrementS() != null) {///////////Post increment

            return visitMathUnaryOperator(ctx, MathUnaryOperator.Type.POST_INCREMENT);

        } else if(ctx.decrementS() != null) {///////////Post decrement

            return visitMathUnaryOperator(ctx, MathUnaryOperator.Type.POST_DECREMENT);

        } else if(ctx.preIncrement() != null) {

            return visitMathUnaryOperator(ctx, MathUnaryOperator.Type.PRE_INCREMENT);

        } else if(ctx.preDecrement() != null) {

            return visitMathUnaryOperator(ctx, MathUnaryOperator.Type.PRE_DECREMENT);

        }

        throw new IllegalStateException("visitValue execution should not reach this point, if " +
                "it does, than one of cases is not implemented");

    }

    private Value visitLiteral(RootParser.ValueContext ctx) {

        return ctx.literalCG().accept(LiteralCGVisitor.getInstance());

    }

    private Value visitId(RootParser.ValueContext ctx) {

        try {
            return scope.getVariableByName(ctx.id().getText());
        } catch (VariableNotFoundException ignored) {
        }

        var packagePart = new PackageO();

        if(packagePart.updatePath(ctx.id().getText()))
            return packagePart;

        errorCollector.reportError(
                new CanNotResolveSymbolError(ctx.id()));
        throw new ExpressionParseCancelationException();

    }

    private Value visitDotS(RootParser.ValueContext ctx) {

        var val = ctx.value(0).accept(new ValueVisitor(scope, errorCollector));

        if(val instanceof PackageO && ctx.value(1).id() != null) {  // Package part may expect
            // only id to go next
            var packageO = (PackageO) val;

            String id = ctx.value(1).id().getText();

            //region Subpackage
            if(packageO.updatePath(id))
                return packageO;
            //endregion

            //region Class
            try {
                return ClassFactory.getInstance().forName(packageO.getPath() + "." + id);
            } catch (ClassNotFoundException ignored) {
                errorCollector.reportError(
                        new CanNotResolveSymbolError(ctx.value(1).id()));
                throw new ExpressionParseCancelationException();
            }
            //endregion

        } else if(val instanceof AbstractClass) {

            var classO = (AbstractClass) val;

            if(ctx.value(1).id() != null) {

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
                    errorCollector.reportError(
                            new CanNotResolveSymbolError(ctx.value(1).id()));
                    throw new ExpressionParseCancelationException();
                }
                //endregion

            }

            if(ctx.value(1).methodInv() != null) {

                //Is static method invocation
                return ctx.value(1).methodInv().accept(new MethodInvVisitor(val, true, scope));
                //Is static method invocation

            }

        } else { // Last case is for any object value

            if(ctx.value(1).id() != null) {


                //region Is static field
                try {

                    var staticField = new StaticClassField();
                    staticField.setNames(val.getType(), ctx.value(1).id().getText());
                    return staticField;

                } catch (NoSuchFieldException ignored) {
                } //This exception will be thrown if no such static field exists
                //In this case search for object fields will happen
                //endregion

                //Is object field
                try {

                    var objectField = new ObjectField();
                    objectField.setNames(val, ctx.value(1).id().getText());
                    return objectField;

                } catch (NoSuchFieldException e) {
                    errorCollector.reportError(
                            new CanNotResolveSymbolError(ctx.value(1).id()));
                    throw new ExpressionParseCancelationException();
                }
                //Is object field

            }

            if(ctx.value(1).methodInv() != null) {

                //Is object method invocation
                return ctx.value(1).methodInv().accept(new MethodInvVisitor(val, false, scope));
                //Is object method invocation

            }

        }

        throw new IllegalStateException("errorCollector must throw exception");

    }

    private Value visitArray(RootParser.ValueContext ctx) {

        Value val = ctx.value(0).accept(new ValueVisitor(scope, errorCollector));
        Value index = ctx.arrayIndex().value().accept(new ValueVisitor(scope, errorCollector));

        try {
            return new ArrayAccess(val, index);
        } catch (ArrayExpectedException e) {
            errorCollector.reportError(
                    new ArrayExpectedError(ctx.value(0).start.getLine(), ctx.value(0).start.getCharPositionInLine(), ctx.value(0).getText(),
                            val.getType().getName()));
            throw new ExpressionParseCancelationException();
        } catch (IncompatibleTypesException e) {
            errorCollector.reportError(
                    new IncompatibleTypesError(ctx.arrayIndex().value().start.getLine(),
                            ctx.arrayIndex().value().start.getCharPositionInLine(),
                            ctx.arrayIndex().value().getText(),
                            e.getTypeExpected(),
                            e.getTypeFound()));
            throw new ExpressionParseCancelationException();
        }

    }

    private Value visitCast(RootParser.ValueContext ctx) {

        var value = ctx.cast().value().accept(new ValueVisitor(scope, errorCollector));
        AbstractClass type = null;

        try {
            type = ClassFactory.getInstance().forName(ctx.cast().declarationType().getText());

            return new TypeCast(type, value);

        } catch (ClassNotFoundException e) {
            errorCollector.reportError(
                    new CanNotResolveSymbolError(ctx.cast().declarationType().start.getLine(), ctx.cast().declarationType().start.getCharPositionInLine(),
                            ctx.cast().declarationType().getText()));
            throw new ExpressionParseCancelationException();
        } catch (WrongCastException e) {

            errorCollector.reportError(
                    new WrongCastError(ctx.cast().declarationType().start.getLine(), ctx.cast().declarationType().start.getCharPositionInLine(),
                            ctx.cast().declarationType().getText(),
                            type.getName(), value.getType().getName())
            );

            throw new ExpressionParseCancelationException();
        }

    }

    private Value visitMathUnaryOperator(RootParser.ValueContext ctx, MathUnaryOperator.Type type) {

        var value = ctx.value(0).accept(new ValueVisitor(scope, errorCollector));

        if(!(value instanceof Accessible))
            throw new IllegalStateException("Not implemented yet");

        return new MathUnaryOperator(type, ((Accessible) value));

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

            var valueVisitor = new ValueVisitor(scope, errorCollector);

            List<Value> params = ctx.value().stream()
                    .map(valueContext -> valueContext.accept(valueVisitor))
                    .collect(Collectors.toList());

            var paramTypes = new AbstractClass[params.size()];

            paramTypes = params.stream()
                    .map(Value::getType).toArray(AbstractClass[]::new);

            ReflectionMethodWrapper method;

            try {
                method = val.getType().getMethod(ctx.id().getText(),
                        paramTypes);
            } catch (NoSuchMethodException e) {
                errorCollector.reportError(
                        new NoSuchMethodError(ctx.id().start.getLine(), ctx.id().start.getCharPositionInLine(),
                                ctx.id().getText(),
                                paramTypes));
                throw new ExpressionParseCancelationException();
            }

            boolean isStatic = (Objects.requireNonNull(method).getModifiers() & Modifier.STATIC) != 0;

            if(requireStatic && !isStatic) {

                errorCollector.reportError(
                        new WrongContextError(ctx.id().start.getLine(), ctx.id().start.getCharPositionInLine(),
                                ctx.id().getText()));
                throw new ExpressionParseCancelationException();

            }

            if(isStatic) {

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
