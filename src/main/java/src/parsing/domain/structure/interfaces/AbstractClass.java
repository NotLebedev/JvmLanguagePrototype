package src.parsing.domain.structure.interfaces;

import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ReflectionFieldWrapper;
import src.parsing.domain.structure.ReflectionMethodWrapper;

/**
 * @author NotLebedev
 */
public interface AbstractClass extends Value {

    /**
     * Get full source code style name e.g. java.lang.String
     *
     * @return full source code style name
     */
    String getName();

    /**
     * Get full slash style name e.g. java/lang/String
     *
     * @return full slash style name
     */
    String getSlashName();

    /**
     * Get full jvm style name e.g. Ljava/lang/String;
     *
     * @return full jvm style name
     */
    String getJvmName();

    ReflectionFieldWrapper getField(String fieldName) throws NoSuchFieldException;

    ReflectionMethodWrapper getMethod(String methodName, AbstractClass[] params) throws NoSuchMethodException;

    /**
     * Returns a JVM instruction opcode adapted to this class.
     * This method must not be used for method types
     * @param sample opcode - a JVM instruction opcode for int (e.g. IASTORE)
     * @return opcode that is similar to the given opcode, but adapted to this class
     */
    int getOpcode(int sample);

    /**
     * Determines if the specified class object represents an interface type
     * @return true if is interface false otherwise
     */
    boolean isInterface();

    /**
     * Determines if the specified class object is primitive type
     * @return true if primitive, false if reference
     */
    boolean isPrimitive();

}
