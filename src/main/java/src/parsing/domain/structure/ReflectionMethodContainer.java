package src.parsing.domain.structure;

import src.parsing.Utils;

import java.lang.reflect.Method;

/**
 * @author NotLebedev
 */
public class ReflectionMethodContainer {

    private Method containedMethod;

    public ReflectionMethodContainer(Class<?> cls, String methodName, Class<?>[] params) throws NoSuchMethodException {
        containedMethod = cls.getMethod(methodName, params);

    }

    public String getName() {
        return containedMethod.getName();
    }

    public ClassO getReturnType() {
        return new ClassO(containedMethod.getReturnType()); //TODO : inspect this place
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
