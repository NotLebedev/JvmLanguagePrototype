package src.parsing;

import org.objectweb.asm.Opcodes;

import java.lang.reflect.Modifier;

public class Utils {

    public static Class classForName(String name) throws ClassNotFoundException {

        switch (name) {

            case "boolean":
                return boolean.class;
            case "byte":
                return byte.class;
            case "char":
                return char.class;
            case "long":
                return long.class;
            case "short":
                return short.class;
            case "int":
                return int.class;
            case "float":
                return float.class;
            case "double":
                return double.class;
            default:
                return Class.forName(name);

        }

    }

    public static String getJvmClassName(Class<?> cls) {

        return cls.getName().replace('.', '/');

    }

    public static String getClassName(Class<?> cls) {

        switch (cls.getName()) {

            case "boolean":
                return "Z";
            case "byte":
                return "B";
            case "char":
                return "C";
            case "long":
                return "J";
            case "short":
                return "S";
            case "int":
                return "I";
            case "float":
                return "F";
            case "double":
                return "D";
            case "void":
                return "V";
            default:

        }

        String name = cls.getName();
        name = name.replace('.', '/');

        if(name.charAt(0) != '[') {

            name = "L" + name + ";";

        }

        return name;

    }

    /**
     * Checks if class has static field with this name
     * @param cls owner class
     * @param name name to be found
     * @return result of check
     */
    public static boolean hasNonStaticField(Class<?> cls, String name) {

        try {
            if((cls.getField(name).getModifiers() & Modifier.STATIC) != 0)
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
    public static boolean hasStaticField(Class<?> cls, String name) {

        try {
            if((cls.getField(name).getModifiers() & Modifier.STATIC) == 0)
                return true;
        } catch (NoSuchFieldException ignored) {
        }

        return false;

    }

    /**
     * Checks if class has inner class with this name
     * @param cls owner class
     * @param name name to be found
     * @return result of check
     */
    public static boolean hasNestedClass(Class<?> cls, String name) {

        for (Class<?> declaredClass : cls.getDeclaredClasses()) {

            if(declaredClass.getSimpleName().equals(name))
                return true;

        }

        return false;

    }

    /**
     * Finds inner class with this name
     * @param cls owner class
     * @param name nested class name
     * @return found class
     */
    public static Class<?> getNestedClass(Class<?> cls, String name) throws ClassNotFoundException {

        for (Class<?> declaredClass : cls.getDeclaredClasses()) {

            if(declaredClass.getSimpleName().equals(name))
                return declaredClass;

        }

        throw new ClassNotFoundException();

    }

}
