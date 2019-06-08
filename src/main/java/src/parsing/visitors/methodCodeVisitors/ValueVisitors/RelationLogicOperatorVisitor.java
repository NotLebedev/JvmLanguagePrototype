package src.parsing.visitors.methodCodeVisitors.ValueVisitors;

import src.compilation.domain.interfaces.Scope;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.logic.LogicRelationOperator;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.errorHandling.ErrorCollector;
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

    @Override
    public Value visitRELATIONAL_OP(RootParser.RELATIONAL_OPContext ctx) {
        throw new IllegalStateException("Not implemented yet");
    }

    @Override
    public Value visitEQUALITY_OP(RootParser.EQUALITY_OPContext ctx) {
        throw new IllegalStateException("Not implemented yet");
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
