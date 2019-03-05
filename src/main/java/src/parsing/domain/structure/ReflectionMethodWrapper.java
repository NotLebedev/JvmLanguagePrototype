package src.parsing.domain.structure;

import src.parsing.domain.structure.interfaces.AbstractClass;
import src.parsing.domain.utils.Utils;

import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author NotLebedev
 */
public class ReflectionMethodWrapper extends ReflectionExecutable {

    private final Method containedMethod;

    ReflectionMethodWrapper(Method method) {
        containedMethod = method;
    }

    @Override
    protected Executable getExecutable() {
        return containedMethod;
    }

    @Override
    public String getName() {
        return containedMethod.getName();
    }

    public ReflectionClassWrapper getReturnType() {
        return ClassFactory.getInstance().forClass(containedMethod.getReturnType());
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public boolean isBridge() {
        return containedMethod.isBridge();
    }

    public String getDescriptor() {

        StringBuilder sb = new StringBuilder();
        sb.append("(");

        for (Class<?> param : containedMethod.getParameterTypes()) {
            sb.append(Utils.getClassName(param));
        }

        sb.append(")");
        sb.append(Utils.getClassName(containedMethod.getReturnType()));

        return sb.toString();

    }

    public int getModifiers() {
        return containedMethod.getModifiers();
    }

    public AbstractClass[] getParameters() {

        var classFactory = ClassFactory.getInstance();

        return Arrays.stream(containedMethod.getParameterTypes())
                .map(classFactory::forClass).toArray(AbstractClass[]::new);

    }

}
