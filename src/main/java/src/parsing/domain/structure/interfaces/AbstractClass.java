package src.parsing.domain.structure.interfaces;

import src.parsing.domain.interfaces.Value;
import src.parsing.domain.exceptions.NoSuchConstructorException;
import src.parsing.domain.structure.ReflectionConstructorWrapper;
import src.parsing.domain.structure.ReflectionFieldWrapper;
import src.parsing.domain.structure.ReflectionMethodWrapper;

/**
 * Interface for all class containers
 *
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

    /**
     * Returns a {@link ReflectionFieldWrapper} object that reflects the specified field of the class or interface represented by this object
     *
     * @param fieldName field name
     * @return {@link ReflectionFieldWrapper} for specified name
     * @throws NoSuchFieldException field with given name does not exist
     */
    ReflectionFieldWrapper getField(String fieldName) throws NoSuchFieldException;

    /**
     * Returns a {@link ReflectionMethodWrapper} object that reflects the specified field of the class or interface represented by this object
     *
     * @param methodName method name
     * @param params     parameter types
     * @return {@link ReflectionMethodWrapper} for specified name
     * @throws NoSuchMethodException method with given names and parameters does not exist
     */
    ReflectionMethodWrapper getMethod(String methodName, AbstractClass[] params) throws NoSuchMethodException;

    ReflectionConstructorWrapper getConstructor(AbstractClass[] params) throws NoSuchConstructorException;

    /**
     * Returns a JVM instruction opcode adapted to this class.
     * This method must not be used for method types
     *
     * @param sample opcode - a JVM instruction opcode for int (e.g. IASTORE)
     * @return opcode that is similar to the given opcode, but adapted to this class
     */
    int getOpcode(int sample);

    /**
     * Determines if the specified class object represents an interface type
     *
     * @return true if is interface false otherwise
     */
    boolean isInterface();

    /**
     * Determines if the specified class object is primitive type
     *
     * @return true if primitive, false if reference
     */
    boolean isPrimitive();

    /**
     * Determines if the specified ReflectionClassWrapper object is array
     *
     * @return true if array, false if reference
     */
    boolean isArray();

    /**
     * Check if specified superclass is superclass of this class
     * @param superclass expected superclass
     * @return true if it is, false if not
     */
    boolean hasSuperclass(AbstractClass superclass);

}
