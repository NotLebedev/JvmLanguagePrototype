package src.parsing.visitors.methodCodeVisitors.ValueVisitors;

import src.compilation.domain.exceptions.IncompatibleTypesException;
import src.compilation.domain.exceptions.OperatorCanNotBeAppliedException;
import src.compilation.domain.interfaces.Scope;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.logic.LogicRelationOperator;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.IncompatibleTypesError;
import src.parsing.visitors.errorHandling.errors.OperatorCanNotBeAppliedError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancellationException;
import src.parsing.visitors.utils.FlyweightContainer;
import src.parsing.visitors.utils.InvalidKeyTypesException;

public class RelationLogicOperatorVisitor extends RootBaseVisitor<Value> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    private static final FlyweightContainer<RelationLogicOperatorVisitor> flyweightContainer =
            new FlyweightContainer<>(Scope.class, ErrorCollector.class);

    private RelationLogicOperatorVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static RelationLogicOperatorVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            return flyweightContainer.getFlyweight(
                    () -> new RelationLogicOperatorVisitor(scope, errorCollector),
                    scope, errorCollector);

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }

    @SuppressWarnings("Duplicates")
    @Override
    public Value visitRELATIONAL_OP(RootParser.RELATIONAL_OPContext ctx) {

        //Acquire both values
        var valueVisitor = ValueVisitor.getInstance(scope, errorCollector);

        Value val1 = ctx.value(0).accept(valueVisitor);
        Value val2 = ctx.value(1).accept(valueVisitor);

        return buildValue(val1, val2, getOperationType(ctx),
                ctx.start.getLine(), ctx.value(0).start.getCharPositionInLine(),
                ctx.value(0).getText());

    }

    @SuppressWarnings("Duplicates")
    @Override
    public Value visitEQUALITY_OP(RootParser.EQUALITY_OPContext ctx) {

        //Acquire both values
        var valueVisitor = ValueVisitor.getInstance(scope, errorCollector);

        Value val1 = ctx.value(0).accept(valueVisitor);
        Value val2 = ctx.value(1).accept(valueVisitor);

        return buildValue(val1, val2, getOperationType(ctx),
                ctx.start.getLine(), ctx.value(0).start.getCharPositionInLine(),
                ctx.value(0).getText());

    }

    private Value buildValue(Value val1, Value val2, LogicRelationOperator.Type operationType,
                             int line, int charPosition, String offendingSymbol) {

        try { //Try creating operator
            return new LogicRelationOperator(operationType, val1, val2);
        } catch (OperatorCanNotBeAppliedException e) { //Operator can not be applied to one of the types
            errorCollector.reportError(new OperatorCanNotBeAppliedError(
                    line, charPosition,
                    offendingSymbol,
                    "Operator '" + operationType.name + "' can not be applied to types " +
                            val1.getType().getName() + " and " + val2.getType().getName()
            ));
            throw new ExpressionParseCancellationException();
        } catch (IncompatibleTypesException e) { //Two types cant be used together
            errorCollector.reportError(new IncompatibleTypesError(
                    line, charPosition,
                    offendingSymbol,
                    val1.getType().getName(), val2.getType().getName()
            ));
            throw new ExpressionParseCancellationException();
        }

    }


    private LogicRelationOperator.Type getOperationType(RootParser.RELATIONAL_OPContext ctx) {

        if(ctx.less() != null)
            return LogicRelationOperator.Type.LESS;
        else if(ctx.lessEqual() != null)
            return LogicRelationOperator.Type.LESS_EQUAL;
        else if(ctx.more() != null)
            return LogicRelationOperator.Type.GREATER;
        else if(ctx.moreEqual() != null)
            return LogicRelationOperator.Type.GREATER_EQUAL;

        throw new IllegalStateException("Unexpected relational operator");

    }

    private LogicRelationOperator.Type getOperationType(RootParser.EQUALITY_OPContext ctx) {

        if(ctx.equal() != null)
            return LogicRelationOperator.Type.EQUAL;
        else if(ctx.notEqual() != null)
            return LogicRelationOperator.Type.NOT_EQUAL;

        throw new IllegalStateException("Unexpected relational operator");

    }

}
