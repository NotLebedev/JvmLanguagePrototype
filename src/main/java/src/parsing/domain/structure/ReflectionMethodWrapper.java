package src.parsing.domain.structure;

import src.parsing.domain.utils.TypeMatcher;
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

    /**
     * Tests if this method has exact same name and parameters as provided
     * @param methodName name to compare with
     * @param params parameters to compare with
     * @return true if matches, false otherwise
     */
    public boolean strictMatches(String methodName, ReflectionClassWrapper[] params) {

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

    /**
     * Tests if this method has exact same name and matching (according to {@link TypeMatcher}) parameters
     * @param methodName name to compare with
     * @param params parameters to compare with
     * @return true if matches, false otherwise
     */
    public boolean unstrictMatches(String methodName, ReflectionClassWrapper[] params) {

        if(!getName().equals(methodName))
            return false;

        var paramTypes = containedMethod.getParameterTypes();

        if(!(paramTypes.length == params.length))
            return false;

        var typeMatcher = TypeMatcher.getInstance();
        var classFactory = ClassFactory.getInstance();
        for (int i = 0; i < params.length; i++) {

            if(!typeMatcher.matches(classFactory.forClass(paramTypes[i]), params[i]))
                return false;

        }

        return true;

    }

}
