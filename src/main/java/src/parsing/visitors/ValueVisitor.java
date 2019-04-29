package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.compilation.domain.*;
import src.compilation.domain.interfaces.Scope;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.math.MathUnaryOperator;
import src.compilation.domain.access.*;
import src.compilation.domain.exceptions.*;
import src.compilation.domain.structure.ClassFactory;
import src.compilation.domain.structure.PackageO;
import src.compilation.domain.structure.interfaces.AbstractClass;
import src.compilation.domain.structure.interfaces.AbstractMethod;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.*;
import src.parsing.visitors.errorHandling.errors.NoSuchMethodError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancelationException;
import src.parsing.visitors.utils.InvalidKeyTypesException;
import src.parsing.visitors.utils.MultiKeyHashMap;

import java.lang.reflect.Modifier;
import java.util.*;
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

    private static final MultiKeyHashMap<ValueVisitor> valueVisitorMap = new MultiKeyHashMap<>(Scope.class, ErrorCollector.class);

    private ValueVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static ValueVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            ValueVisitor result = valueVisitorMap.get(scope, errorCollector);

            if(result != null)
                return result;
            else {

                ValueVisitor visitor = new ValueVisitor(scope, errorCollector);
                valueVisitorMap.put(visitor, scope, errorCollector);
                return visitor;

            }

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }

    private Value visitId(RootParser.IDContext ctx) {

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

    private Value visitDotS(RootParser.ACCESSContext ctx) {

        /*var val = ctx.value(0).accept(ValueVisitor.getInstance(scope, errorCollector));

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

        }*/

        throw new IllegalStateException("errorCollector must throw exception");

    }

    private Value visitArray(RootParser.ARRAY_ACCESSContext ctx) {

        Value val = ctx.value().accept(ValueVisitor.getInstance(scope, errorCollector));
        Value index = ctx.arrayIndex().value().accept(ValueVisitor.getInstance(scope, errorCollector));

        try {
            return new ArrayAccess(val, index);
        } catch (ArrayExpectedException e) {
            errorCollector.reportError(
                    new ArrayExpectedError(ctx.value().start.getLine(), ctx.value().start.getCharPositionInLine(), ctx.value().getText(),
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

    private Value visitCast(RootParser.CASTContext ctx) {

        var value = ctx.cast().value().accept(ValueVisitor.getInstance(scope, errorCollector));
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

            var valueVisitor = ValueVisitor.getInstance(scope, errorCollector);

            List<Value> params = ctx.value().stream()
                    .map(valueContext -> valueContext.accept(valueVisitor))
                    .collect(Collectors.toList());

            var paramTypes = new AbstractClass[params.size()];

            paramTypes = params.stream()
                    .map(Value::getType).toArray(AbstractClass[]::new);

            AbstractMethod method;

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

    @Override
    public Value visitLITERAL(RootParser.LITERALContext ctx) {

        return ctx.literalCG().accept(LiteralCGVisitor.getInstance());

    }

    @Override
    public Value visitMETHOD_INV(RootParser.METHOD_INVContext ctx) {
        throw new IllegalStateException("Not implemented yet");
    }

    @Override
    public Value visitID(RootParser.IDContext ctx) {
        return visitId(ctx);
    }

    @Override
    public Value visitOBJECT_INSTANTIATION(RootParser.OBJECT_INSTANTIATIONContext ctx) {
        return ctx.objectInstantiation().accept(ObjectInstantiationVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitCAST(RootParser.CASTContext ctx) {
        return visitCast(ctx);
    }

    @Override
    public Value visitPARENTHESIS(RootParser.PARENTHESISContext ctx) {
        return ctx.value().accept(ValueVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitACCESS(RootParser.ACCESSContext ctx) {
        return visitDotS(ctx);
    }

    @Override
    public Value visitARRAY_ACCESS(RootParser.ARRAY_ACCESSContext ctx) {
        return visitArray(ctx);
    }

    @Override
    public Value visitPOST_INCREMENT(RootParser.POST_INCREMENTContext ctx) {
        return ctx.accept(CrementVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitPOST_DECREMENT(RootParser.POST_DECREMENTContext ctx) {
        return ctx.accept(CrementVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitPRE_INCREMENT(RootParser.PRE_INCREMENTContext ctx) {
        return ctx.accept(CrementVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitPRE_DECREMENT(RootParser.PRE_DECREMENTContext ctx) {
        return ctx.accept(CrementVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitUNARY_PLUS(RootParser.UNARY_PLUSContext ctx) {
        return ctx.unaryPlus().accept(UnaryPlusVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitUNARY_MINUS(RootParser.UNARY_MINUSContext ctx) {
        return ctx.unaryMinus().accept(UnaryMinusVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitMULTIPLICATIVE_OP(RootParser.MULTIPLICATIVE_OPContext ctx) {
        throw new IllegalStateException("Not implemented yet");
    }

}
