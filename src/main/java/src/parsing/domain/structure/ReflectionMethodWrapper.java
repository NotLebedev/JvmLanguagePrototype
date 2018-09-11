package src.parsing.domain.structure;

import src.parsing.Utils;

import java.lang.reflect.Method;

/**
 * @author NotLebedev
 */
public class ReflectionMethodWrapper {

    private final Method containedMethod;

    public ReflectionMethodWrapper(Class<?> cls, String methodName, Class<?>[] params) throws NoSuchMethodException {
        containedMethod = cls.getMethod(methodName, params);

    }

    public String getName() {
        return containedMethod.getName();
    }

    public ReflectionClassWrapper getReturnType() {
        return ClassFactory.getInstance().forClass(containedMethod.getReturnType()); //TODO : inspect this place
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

    public boolean matches(String methodName, ReflectionClassWrapper[] params) {

        if(!getName().equals(methodName))
            return false;

        var paramTypes = containedMethod.getParameterTypes();

        for (int i = 0; i < params.length; i++) {

            if(!params[i].getName().equals(paramTypes[i].getName()))
                return false;

        }

        return true;

    }

}
