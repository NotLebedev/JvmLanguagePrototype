package src.parsing;

public class Utils {

    public static Class classForName(String name) throws ClassNotFoundException {

        name = name.replace(" ", "");

        if(name.matches(".*\\[].*")) { //Check if is array

            String temp = name.replace("[", "");//Calculate degree
            int occNum = (name.length() - temp.length());          //of array

            StringBuilder sb = new StringBuilder();
            sb.append(new String(new char[occNum]).replace("\0", "[")); //Add occNum of
                                                                                        // "[" to start of string
            name = name.replace("[", "").replace("]", "");

            sb.append(getClassName(Utils.classForName(name)).replace('/', '.'));

            return Class.forName(sb.toString());

        }

        switch (name) {

            case "boolean":
            case "Z":
                return boolean.class;
            case "byte":
            case "B" :
                return byte.class;
            case "char":
            case "C" :
                return char.class;
            case "long":
            case "J" :
                return long.class;
            case "short":
            case "S":
                return short.class;
            case "int":
            case "I":
                return int.class;
            case "float":
            case "F":
                return float.class;
            case "double":
            case "D":
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
