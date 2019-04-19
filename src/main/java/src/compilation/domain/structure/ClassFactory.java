package src.compilation.domain.structure;

import src.compilation.domain.structure.interfaces.AbstractClass;
import src.compilation.domain.utils.Utils;

import java.util.HashMap;

public class ClassFactory {

    private final HashMap<Class<?>, ReflectionClassWrapper> reflectionClassMap = new HashMap<>();

    private static class SingletonHolder {
        private static final ClassFactory HOLDER_INSTANCE = new ClassFactory();
    }

    public static ClassFactory getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

    private ClassFactory() {
    }

    /**
     * Constructs a multi-dimensional array from given basic type
     *
     * @param arrayDimension number of dimensions to be added
     * @param basicType      class to be turned into array
     * @return the AbstractClass inheritor for specified array type
     */
    public AbstractClass toArray(int arrayDimension, AbstractClass basicType) {

        var sb = new StringBuilder();

        sb.append(basicType.getName());

        for (int i = 0; i < arrayDimension; i++) {
            sb.append("[]");
        }

        try {
            return forName(sb.toString());
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("This should never happen, because new array class" +
                    "is created from valid one", e);
        }

    }

    /**
     * Returns the AbstractClass inheritor associated with the class or interface with the given string name
     *
     * @param name the fully qualified name of the desired class
     * @return the AbstractClass inheritor for specified name
     * @throws ClassNotFoundException if the class cannot be located
     */
    public AbstractClass forName(String name) throws ClassNotFoundException {

        Class<?> cls = Utils.classForName(name);

        return forClass(cls);

    }

    /**
     * Returns the AbstractClass inheritor associated with the class or interface with the given string name
     * Use this method to load literal classes (e.g. types of literals, array index type)
     *
     * @param name the fully qualified name of the desired class
     * @return the AbstractClass inheritor for specified name
     */
    public AbstractClass forCorrectName(String name) {

        Class<?> cls;
        try {
            cls = Utils.classForName(name);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Name expected to be correct", e);
        }

        return forClass(cls);

    }

    ReflectionClassWrapper forClass(Class<?> cls) {

        if(reflectionClassMap.containsKey(cls))
            return reflectionClassMap.get(cls);

        var newClass = new ReflectionClassWrapper(cls);
        reflectionClassMap.put(cls, newClass);

        return newClass;

    }

}
