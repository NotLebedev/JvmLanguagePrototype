package src.parsing.visitors.methodCodeVisitors.ValueVisitors;

import src.compilation.domain.TypeCast;
import src.compilation.domain.exceptions.WrongCastException;
import src.compilation.domain.interfaces.Scope;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.structure.ClassFactory;
import src.compilation.domain.structure.interfaces.AbstractClass;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.CanNotResolveSymbolError;
import src.parsing.visitors.errorHandling.errors.WrongCastError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancellationException;
import src.parsing.visitors.utils.FlyweightContainer;
import src.parsing.visitors.utils.InvalidKeyTypesException;

public class CastVisitor extends RootBaseVisitor<Value> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    private static final FlyweightContainer<CastVisitor> flyweightContainer =
            new FlyweightContainer<>(Scope.class, ErrorCollector.class);

    private CastVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static CastVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            return flyweightContainer.getFlyweight(
                    () -> new CastVisitor(scope, errorCollector),
                    scope, errorCollector);

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }

    @Override
    public Value visitCAST_LABEL(RootParser.CAST_LABELContext ctx) {

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

}
