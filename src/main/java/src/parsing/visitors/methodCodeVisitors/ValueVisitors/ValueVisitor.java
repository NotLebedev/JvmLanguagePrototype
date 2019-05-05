package src.parsing.visitors.methodCodeVisitors.ValueVisitors;

import src.compilation.domain.TypeCast;
import src.compilation.domain.access.ArrayAccess;
import src.compilation.domain.exceptions.ArrayExpectedException;
import src.compilation.domain.exceptions.IncompatibleTypesException;
import src.compilation.domain.exceptions.VariableNotFoundException;
import src.compilation.domain.exceptions.WrongCastException;
import src.compilation.domain.interfaces.Scope;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.structure.ClassFactory;
import src.compilation.domain.structure.PackageO;
import src.compilation.domain.structure.interfaces.AbstractClass;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.ArrayExpectedError;
import src.parsing.visitors.errorHandling.errors.CanNotResolveSymbolError;
import src.parsing.visitors.errorHandling.errors.IncompatibleTypesError;
import src.parsing.visitors.errorHandling.errors.WrongCastError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancellationException;
import src.parsing.visitors.utils.InvalidKeyTypesException;
import src.parsing.visitors.utils.MultiKeyHashMap;

/**
 * Class responsible for routing all value rule options to
 * corresponding visitors
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
    @Deprecated//Intended to move to separate class
    private Value visitId(RootParser.ID_LABELContext ctx) {

        try {
            return scope.getVariableByName(ctx.id().getText());
        } catch (VariableNotFoundException ignored) {
        }

        var packagePart = new PackageO();

        if(packagePart.updatePath(ctx.id().getText()))
            return packagePart;

        errorCollector.reportError(
                new CanNotResolveSymbolError(ctx.id()));
        throw new ExpressionParseCancellationException();

    }
    @Deprecated//Intended to move to separate class
    private Value visitArray(RootParser.ARRAY_ACCESSContext ctx) {

        Value val = ctx.value().accept(ValueVisitor.getInstance(scope, errorCollector));
        Value index = ctx.arrayIndex().value().accept(ValueVisitor.getInstance(scope, errorCollector));

        try {
            return new ArrayAccess(val, index);
        } catch (ArrayExpectedException e) {
            errorCollector.reportError(
                    new ArrayExpectedError(ctx.value().start.getLine(), ctx.value().start.getCharPositionInLine(), ctx.value().getText(),
                            val.getType().getName()));
            throw new ExpressionParseCancellationException();
        } catch (IncompatibleTypesException e) {
            errorCollector.reportError(
                    new IncompatibleTypesError(ctx.arrayIndex().value().start.getLine(),
                            ctx.arrayIndex().value().start.getCharPositionInLine(),
                            ctx.arrayIndex().value().getText(),
                            e.getTypeExpected(),
                            e.getTypeFound()));
            throw new ExpressionParseCancellationException();
        }

    }
    @Deprecated//Intended to move to separate class
    private Value visitCast(RootParser.CAST_LABELContext ctx) {

        var value = ctx.cast().value().accept(ValueVisitor.getInstance(scope, errorCollector));
        AbstractClass type = null;

        try {
            type = ClassFactory.getInstance().forName(ctx.cast().declarationType().getText());

            return new TypeCast(type, value);

        } catch (ClassNotFoundException e) {
            errorCollector.reportError(
                    new CanNotResolveSymbolError(ctx.cast().declarationType().start.getLine(), ctx.cast().declarationType().start.getCharPositionInLine(),
                            ctx.cast().declarationType().getText()));
            throw new ExpressionParseCancellationException();
        } catch (WrongCastException e) {

            errorCollector.reportError(
                    new WrongCastError(ctx.cast().declarationType().start.getLine(), ctx.cast().declarationType().start.getCharPositionInLine(),
                            ctx.cast().declarationType().getText(),
                            type.getName(), value.getType().getName())
            );

            throw new ExpressionParseCancellationException();
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
    public Value visitID_LABEL(RootParser.ID_LABELContext ctx) {
        return visitId(ctx);
    }

    @Override
    public Value visitOBJECT_INSTANTIATION(RootParser.OBJECT_INSTANTIATIONContext ctx) {
        return ctx.objectInstantiation().accept(ObjectInstantiationVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitCAST_LABEL(RootParser.CAST_LABELContext ctx) {
        return visitCast(ctx);
    }

    @Override
    public Value visitPARENTHESIS(RootParser.PARENTHESISContext ctx) {
        return ctx.value().accept(ValueVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitACCESS(RootParser.ACCESSContext ctx) {
        return ctx.accept(AccessVisitor.getInstance(scope, errorCollector));
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
        return ctx.accept(BinaryMathOperatorVisitor.getInstance(scope, errorCollector));
    }

    @Override
    public Value visitADDITIVE_OP(RootParser.ADDITIVE_OPContext ctx) {
        return ctx.accept(BinaryMathOperatorVisitor.getInstance(scope, errorCollector));
    }
}
