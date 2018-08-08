package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.ObjectInstantiation;

import java.util.List;
import java.util.stream.Collectors;

public class ObjectInstantiationVisitor extends RootBaseVisitor<Value> {

    private final Scope scope;

    public ObjectInstantiationVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Value visitObjectInstantiation(RootParser.ObjectInstantiationContext ctx) {

        var objectInstantiation = new ObjectInstantiation();

        List<Value> params;

        var valueVisitor = new ValueVisitor(scope);

        params = ctx.value().stream()
                .map(valueContext -> valueContext.accept(valueVisitor))
                .collect(Collectors.toList());

        try {
            objectInstantiation.setNames(ctx.type().getText(), params.stream()
                    .map(value -> value.getType().getTypeName())
                    .toArray(String[]::new));
        } catch (NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        objectInstantiation.setParamValues(params.toArray(new Value[0]));

        return objectInstantiation;

    }
}
