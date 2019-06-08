package src.parsing.visitors.methodCodeVisitors.ValueVisitors;

import src.compilation.domain.interfaces.Scope;
import src.compilation.domain.interfaces.Value;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
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


}
