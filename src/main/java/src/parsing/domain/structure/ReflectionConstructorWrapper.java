package src.parsing.domain.structure;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;

/**
 * @author NotLebedev
 */
public class ReflectionConstructorWrapper extends ReflectionExecutable {

    private final Constructor containedConstructor;
    private final ReflectionClassWrapper ownerClass;

    ReflectionConstructorWrapper(Constructor containedConstructor, ReflectionClassWrapper ownerClass) {

        this.containedConstructor = containedConstructor;
        this.ownerClass = ownerClass;

    }

    public ReflectionClassWrapper getOwnerClass() {
        return ownerClass;
    }

    @Override
    protected Executable getExecutable() {
        return containedConstructor;
    }

    @Override
    public String getName() {
        return containedConstructor.getName();
    }


}
