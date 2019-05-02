package src.parsing.visitors;

import src.compilation.domain.access.ObjectMethodInvocation;
import src.compilation.domain.access.StaticMethodInvocation;
import src.compilation.domain.interfaces.Scope;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.structure.interfaces.AbstractClass;
import src.compilation.domain.structure.interfaces.AbstractMethod;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.NoSuchMethodError;
import src.parsing.visitors.errorHandling.errors.WrongContextError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancelationException;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Class for visiting method invocations
 * @author NotLebedev
 */
public class MethodInvVisitor extends RootBaseVisitor<Value> {

    private final Value context;
    private final Boolean requireStatic;
    private final Scope scope;
    private final ErrorCollector errorCollector;

    /**
     * @param context object/class which method is called
     * @param requireStatic is method called expected be static
     * @param scope scope to be used
     * @param errorCollector error collector to be used
     */
    public MethodInvVisitor(Value context, Boolean requireStatic, Scope scope, ErrorCollector errorCollector) {

        this.context = context;
        this.requireStatic = requireStatic;
        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    @Override
    public Value visitMethodInv(RootParser.MethodInvContext ctx) {

        var valueVisitor = ValueVisitor.getInstance(scope, errorCollector);

        //Fetch all method parameters
        List<Value> params = ctx.value().stream()
                .map(valueContext -> valueContext.accept(valueVisitor))
                .collect(Collectors.toList());

        //Resolve parameter types
        var paramTypes = new AbstractClass[params.size()];
        paramTypes = params.stream()
                .map(Value::getType).toArray(AbstractClass[]::new);

        //Try getting method with given names and parameters
        AbstractMethod method;
        try {
            method = context.getType().getMethod(ctx.id().getText(),
                    paramTypes);
        } catch (NoSuchMethodException e) {
            errorCollector.reportError(
                    new NoSuchMethodError(ctx.id().start.getLine(), ctx.id().start.getCharPositionInLine(),
                            ctx.id().getText(),
                            paramTypes));
            throw new ExpressionParseCancelationException();
        }

        //Verify if method is static in case it should be
        boolean isStatic = (Objects.requireNonNull(method).getModifiers() & Modifier.STATIC) != 0;

        if(requireStatic && !isStatic) {

            errorCollector.reportError(
                    new WrongContextError(ctx.id().start.getLine(), ctx.id().start.getCharPositionInLine(),
                            ctx.id().getText()));
            throw new ExpressionParseCancelationException();

        }

        //Create dynamic or static invocation based on method acquired
        if(isStatic) {

            var smi = new StaticMethodInvocation();
            smi.setNames(context.getType(), method);

            smi.setParamValues(params.toArray(new Value[0]));

            return smi;

        } else {

            var omi = new ObjectMethodInvocation();
            omi.setNames(context, method);

            omi.setParamValues(params.toArray(new Value[0]));

            return omi;

        }

    }

}
