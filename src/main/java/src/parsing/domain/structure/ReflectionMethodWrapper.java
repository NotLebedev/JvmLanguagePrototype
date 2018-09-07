package src.parsing.domain.structure;

import src.parsing.Utils;

import java.lang.reflect.Method;

/**
 * @author NotLebedev
 */
public class ReflectionMethodWrapper {

    private Method containedMethod;

    public ReflectionMethodWrapper(Class<?> cls, String methodName, Class<?>[] params) throws NoSuchMethodException {
        containedMethod = cls.getMethod(methodName, params);

    }

    public String getName() {
        return containedMethod.getName();
    }

    public ReflectionClassWrapper getReturnType() {
        return new ReflectionClassWrapper(containedMethod.getReturnType()); //TODO : inspect this place
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

}
