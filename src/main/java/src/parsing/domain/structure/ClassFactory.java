package src.parsing.domain.structure;

import src.parsing.Utils;

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

    public ReflectionClassWrapper forName(String name) throws ClassNotFoundException {

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
