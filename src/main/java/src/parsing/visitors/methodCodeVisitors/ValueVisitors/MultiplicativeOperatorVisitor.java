package src.parsing.visitors.methodCodeVisitors.ValueVisitors;

import src.compilation.domain.interfaces.Scope;
import src.compilation.domain.interfaces.Value;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.utils.InvalidKeyTypesException;
import src.parsing.visitors.utils.MultiKeyHashMap;

public class MultiplicativeOperatorVisitor extends RootBaseVisitor<Value> {

    private final Scope scope;
    private final ErrorCollector errorCollector;


    //region Flyweight container
    private static final MultiKeyHashMap<MultiplicativeOperatorVisitor> containerMap = new MultiKeyHashMap<>(Scope.class, ErrorCollector.class);

    private MultiplicativeOperatorVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static MultiplicativeOperatorVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            MultiplicativeOperatorVisitor  result = containerMap.get(scope, errorCollector);

            if(result != null)
                return result;
            else {

                MultiplicativeOperatorVisitor  visitor = new MultiplicativeOperatorVisitor (scope, errorCollector);
                containerMap.put(visitor, scope, errorCollector);
                return visitor;

            }

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }
    //endregion


    @Override
    public Value visitMULTIPLICATIVE_OP(RootParser.MULTIPLICATIVE_OPContext ctx) {
        return super.visitMULTIPLICATIVE_OP(ctx);
    }
}
