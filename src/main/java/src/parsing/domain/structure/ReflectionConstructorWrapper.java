package src.parsing.domain.structure;

import java.lang.reflect.Constructor;

/**
 * @author NotLebedev
 */
public class ReflectionConstructorWrapper {

    private final Constructor containedConstructor;
    private final ReflectionClassWrapper ownerClass;

    public ReflectionConstructorWrapper(Constructor containedConstructor, ReflectionClassWrapper ownerClass) {

        this.containedConstructor = containedConstructor;
        this.ownerClass = ownerClass;

    }

    public ReflectionClassWrapper getOwnerClass() {
        return ownerClass;
    }

}
