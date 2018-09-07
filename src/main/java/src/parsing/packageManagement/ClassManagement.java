package src.parsing.packageManagement;

import src.parsing.Utils;

public class ClassManagement {

    /**
     * Gets class for given name
     * @param name name of class (currently only full path)
     * @return {@link Class<>} object for given name
     * @throws ClassNotFoundException class cannot be located
     */
    public static Class forName(String name) throws ClassNotFoundException {
        return Utils.classForName(name);
    }

}
