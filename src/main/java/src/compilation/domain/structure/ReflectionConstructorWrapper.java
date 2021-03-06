package src.compilation.domain.structure;

import src.compilation.domain.structure.interfaces.AbstractClass;
import src.compilation.domain.structure.interfaces.AbstractConstructor;
import src.compilation.domain.utils.Utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.util.Arrays;

/**
 * @author NotLebedev
 */
public class ReflectionConstructorWrapper extends ReflectionExecutable implements AbstractConstructor {

    private final Constructor containedConstructor;
    private final ReflectionClassWrapper ownerClass;

    ReflectionConstructorWrapper(Constructor containedConstructor, ReflectionClassWrapper ownerClass) {

        this.containedConstructor = containedConstructor;
        this.ownerClass = ownerClass;

    }

    public ReflectionClassWrapper getOwnerClass() {
        return ownerClass;
    }

    public AbstractClass[] getParameters() {

        var classFactory = ClassFactory.getInstance();

        return Arrays.stream(containedConstructor.getParameterTypes())
                .map(classFactory::forClass).toArray(AbstractClass[]::new);

    }

    public String getDescriptor() {

        StringBuilder sb = new StringBuilder();
        sb.append("(");

        for (Class<?> param : containedConstructor.getParameterTypes()) {
            sb.append(Utils.getClassName(param));
        }

        sb.append(")");

        sb.append("V");

        return sb.toString();

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
