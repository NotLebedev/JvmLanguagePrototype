package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.interfaces.Scope;
import src.parsing.domain.interfaces.Value;
import src.parsing.domain.structure.interfaces.AbstractClass;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.utils.InvalidKeyTypesException;
import src.parsing.visitors.utils.MultiKeyHashMap;

/**
 * @author NotLebedev
 */
public class UnaryPlusVisitor extends RootBaseVisitor<Value> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    private static final MultiKeyHashMap<UnaryPlusVisitor> valueVisitorMap = new MultiKeyHashMap<>(Scope.class, ErrorCollector.class);

    private UnaryPlusVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static UnaryPlusVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            UnaryPlusVisitor result = valueVisitorMap.get(scope, errorCollector);

            if(result != null)
                return result;
            else {

                UnaryPlusVisitor visitor = new UnaryPlusVisitor(scope, errorCollector);
                valueVisitorMap.put(visitor, scope, errorCollector);
                return visitor;

            }

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }

    @Override
    public Value visitUnaryPlus(RootParser.UnaryPlusContext ctx) {
        return super.visitUnaryPlus(ctx);
    }
}
