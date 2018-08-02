package src.parsing;

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



}
