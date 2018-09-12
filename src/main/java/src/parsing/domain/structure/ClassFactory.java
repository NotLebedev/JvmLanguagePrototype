package src.parsing.domain.structure;

import src.parsing.Utils;
import src.parsing.domain.structure.interfaces.AbstractClass;

import java.util.HashMap;

public class ClassFactory {

    private static ClassFactory ourInstance;

    private HashMap<Class<?>, ReflectionClassWrapper> reflectionClassMap = new HashMap<>();

    public static ClassFactory getInstance() {

        if(ourInstance == null)
            ourInstance = new ClassFactory();

        return ourInstance;

    }

    private ClassFactory() {
    }

    /**
     * Constructs a multi-dimensional array from given basic type
     * @param arrayDimension number of dimensions to be added
     * @param basicType class to be turned into array
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
     * @param name the fully qualified name of the desired class
     * @return the AbstractClass inheritor for specified name
     * @throws ClassNotFoundException if the class cannot be located
     */
    public AbstractClass forName(String name) throws ClassNotFoundException {

        Class<?> cls = Utils.classForName(name);

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
