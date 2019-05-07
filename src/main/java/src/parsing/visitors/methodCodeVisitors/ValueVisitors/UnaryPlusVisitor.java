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
import src.parsing.visitors.errorHandling.errors.OperatorCanNotBeAppliedError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancellationException;
import src.parsing.visitors.utils.FlyweightContainer;
import src.parsing.visitors.utils.InvalidKeyTypesException;

/**
 * @author NotLebedev
 */
public class UnaryPlusVisitor extends RootBaseVisitor<Value> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    private static final AbstractClass intType = ClassFactory.getInstance().forCorrectName("int");

    private static final FlyweightContainer<UnaryPlusVisitor> flyweightContainer =
            new FlyweightContainer<>(Scope.class, ErrorCollector.class);

    private UnaryPlusVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static UnaryPlusVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            return flyweightContainer.getFlyweight(
                    () -> new UnaryPlusVisitor(scope, errorCollector),
                    scope, errorCollector);

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }

    @Override
    public Value visitUnaryPlus(RootParser.UnaryPlusContext ctx) {

        Value value = ctx.value().accept(ValueVisitor.getInstance(scope, errorCollector));
        //Unary "+" casts everything to int if possible
        try {
            return new TypeCast(intType, value);
        } catch (WrongCastException e) {
            errorCollector.reportError(new OperatorCanNotBeAppliedError(ctx.start.getLine(), ctx.start.getCharPositionInLine(),
                    ctx.value().getText(),
                    "Operator '+' can not be applied to " + value.getType().getName()));
            throw new ExpressionParseCancellationException();
        }

    }
}
