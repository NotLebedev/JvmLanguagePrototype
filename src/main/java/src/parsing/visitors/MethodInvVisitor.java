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
 * @author NotLebedev
 */
public class MethodInvVisitor extends RootBaseVisitor<Value> {

    private final Value val;
    private final Boolean requireStatic;
    private final Scope scope;
    private final ErrorCollector errorCollector;

    public MethodInvVisitor(Value val, Boolean requireStatic, Scope scope, ErrorCollector errorCollector) {

        this.val = val;
        this.requireStatic = requireStatic;
        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    @Override
    public Value visitMethodInv(RootParser.MethodInvContext ctx) {

        var valueVisitor = ValueVisitor.getInstance(scope, errorCollector);

        List<Value> params = ctx.value().stream()
                .map(valueContext -> valueContext.accept(valueVisitor))
                .collect(Collectors.toList());

        var paramTypes = new AbstractClass[params.size()];

        paramTypes = params.stream()
                .map(Value::getType).toArray(AbstractClass[]::new);

        AbstractMethod method;

        try {
            method = val.getType().getMethod(ctx.id().getText(),
                    paramTypes);
        } catch (NoSuchMethodException e) {
            errorCollector.reportError(
                    new NoSuchMethodError(ctx.id().start.getLine(), ctx.id().start.getCharPositionInLine(),
                            ctx.id().getText(),
                            paramTypes));
            throw new ExpressionParseCancelationException();
        }

        boolean isStatic = (Objects.requireNonNull(method).getModifiers() & Modifier.STATIC) != 0;

        if(requireStatic && !isStatic) {

            errorCollector.reportError(
                    new WrongContextError(ctx.id().start.getLine(), ctx.id().start.getCharPositionInLine(),
                            ctx.id().getText()));
            throw new ExpressionParseCancelationException();

        }

        if(isStatic) {

            var smi = new StaticMethodInvocation();
            smi.setNames(val.getType(), method);

            smi.setParamValues(params.toArray(new Value[0]));

            return smi;

        } else {

            var omi = new ObjectMethodInvocation();
            omi.setNames(val, method);

            omi.setParamValues(params.toArray(new Value[0]));

            return omi;

        }

    }

}
