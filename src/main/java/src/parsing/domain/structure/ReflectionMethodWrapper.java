package src.parsing.domain.structure;

import src.parsing.domain.utils.Utils;

import java.lang.reflect.Method;

/**
 * @author NotLebedev
 */
public class ReflectionMethodWrapper {

    private final Method containedMethod;

    ReflectionMethodWrapper(Method method) {
        containedMethod = method;
    }

    public String getName() {
        return containedMethod.getName();
    }

    public ReflectionClassWrapper getReturnType() {
        return ClassFactory.getInstance().forClass(containedMethod.getReturnType());
    }

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

    public boolean matches(String methodName, ReflectionClassWrapper[] params) {

        if(!getName().equals(methodName))
            return false;

        var paramTypes = containedMethod.getParameterTypes();

        if(!(paramTypes.length == params.length))
            return false;

        for (int i = 0; i < params.length; i++) {

            if(!params[i].getName().equals(paramTypes[i].getName()))
                return false;

        }

        return true;

    }

}
