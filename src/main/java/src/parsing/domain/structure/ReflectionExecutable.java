package src.parsing.domain.structure;

import src.parsing.domain.utils.TypeMatcher;

import javax.annotation.Nullable;
import java.lang.reflect.Executable;

/**
 * Class describing common {@link Executable} wrapper (e.g. {@link ReflectionMethodWrapper}
 * {@link ReflectionConstructorWrapper}) functionality
 *
 * @author NotLebedev
 */
abstract class ReflectionExecutable {

    /**
     * Returns contained executable of any subclass
     *
     * @return contained executable
     */
    protected abstract Executable getExecutable();

    /**
     * Returns name of any executable of subclass
     *
     * @return contained executable name
     */
    public abstract String getName();

    /**
     * Tests if this executable has exact same name and parameters as provided
     *
     * @param name   name to compare with, null if should not be compared
     * @param params parameters to compare with
     * @return true if softMatches, false otherwise
     */
    public boolean strictMatches(@Nullable String name, ReflectionClassWrapper[] params) {

        if(name != null)
            if(!getName().equals(name))
                return false;

        var paramTypes = getExecutable().getParameterTypes();

        if(!(paramTypes.length == params.length))
            return false;

        for (int i = 0; i < params.length; i++) {

            if(!params[i].getName().equals(paramTypes[i].getName()))
                return false;

        }

        return true;

    }

    /**
     * Tests if this executable has exact same name and matching (according to {@link TypeMatcher}) parameters
     *
     * @param name   name to compare with
     * @param params parameters to compare with
     * @return true if softMatches, false otherwise
     */
    public boolean unstrictMatches(String name, ReflectionClassWrapper[] params) {

        if(name != null)
            if(!getName().equals(name))
                return false;

        var paramTypes = getExecutable().getParameterTypes();

        if(!(paramTypes.length == params.length))
            return false;

        var typeMatcher = TypeMatcher.getInstance();
        var classFactory = ClassFactory.getInstance();
        for (int i = 0; i < params.length; i++) {

            if(!typeMatcher.hardMatches(classFactory.forClass(paramTypes[i]), params[i]))
                return false;

        }

        return true;

    }

}
