package src.parsing.packageManagement;

import src.parsing.domain.ClassO;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ClassManagement {

    /**
     * Gets class for given name
     * @param name name of class (currently only full path)
     * @return {@link Class<>} object for given name
     * @throws ClassNotFoundException class cannot be located
     */
    public static Class forName(String name) throws ClassNotFoundException {
        return Class.forName(name);
    }

    /**
     * Checks if class has static field with this name
     * @param cls owner class
     * @param name name to be found
     * @return result of check
     */
    public static boolean hasNonStaticField(ClassO cls, String name) {

        try {
            if((cls.getContainedClass().getField(name).getModifiers() & Modifier.STATIC) == 0)
                return true;
        } catch (NoSuchFieldException ignored) {
        }
        return false;

    }

    /**
     * Checks if class has static field with this name
     * @param cls owner class
     * @param name name to be found
     * @return result of check
     */
    public static boolean hasStaticField(ClassO cls, String name) {

        try {
            if((cls.getContainedClass().getField(name).getModifiers() & Modifier.STATIC) != 0)
                return true;
        } catch (NoSuchFieldException ignored) {
        }

        return false;

    }

}