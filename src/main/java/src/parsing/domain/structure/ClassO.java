package src.parsing.domain.structure;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;
import src.parsing.Utils;
import src.parsing.domain.Interfaces.Value;
import src.parsing.packageManagement.ClassManagement;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Object containing class, no value-like access expected
 * This object always contains valid class
 */
public class ClassO extends Value {

    //region CONSTANTS
    public static final ClassO BOOLEAN = new ClassO(boolean.class);
    public static final ClassO BYTE = new ClassO(byte.class);
    public static final ClassO CHAR = new ClassO(char.class);
    public static final ClassO LONG = new ClassO(long.class);
    public static final ClassO SHORT = new ClassO(short.class);
    public static final ClassO INT = new ClassO(int.class);
    public static final ClassO FLOAT = new ClassO(float.class);
    public static final ClassO DOUBLE = new ClassO(double.class);
    public static final ClassO STRING = new ClassO(String.class);
    //endregion

    private final Class<?> containedClass;

    /**
     * This method is marked as deprecated to remind  to remove it from public use
     *
     * @param cls
     */
    @Deprecated
    public ClassO(Class<?> cls) {
        containedClass = cls;
    }

    public ClassO(String name) throws ClassNotFoundException {
        containedClass = ClassManagement.forName(name); //TODO: make class not instantiated every time
    }

    /**
     * Construct an array from given ClassO
     *
     * @param arrayDimension dimension of new array
     * @param basicType non-array type
     * @throws ClassNotFoundException
     */
    public ClassO(int arrayDimension, ClassO basicType) throws ClassNotFoundException {

        StringBuilder sb = new StringBuilder();

        sb.append(basicType.getName());

        for (int i = 0; i < arrayDimension; i++) {
            sb.append("[]");
        }

        containedClass = ClassManagement.forName(sb.toString());

    }

    /**
     * Get full source code style name e.g. java.lang.String
     *
     * @return full source code style name
     */
    public String getName() {
        return containedClass.getName();
    }

    /**
     * Get full slash style name e.g. java/lang/String
     *
     * @return full slash style name
     */
    public String getSlashName() {
        return Utils.getJvmClassName(containedClass);
    }

    /**
     * Get full jvm style name e.g. Ljava/lang/String;
     *
     * @return full jvm style name
     */
    public String getJvmName() {
        return Utils.getClassName(containedClass);
    }

    //TODO: replace with domain Field, when ready
    public Field getField(String fieldName) throws NoSuchFieldException {
        return containedClass.getField(fieldName);
    }

    //TODO: replace with
    public ReflectionMethodContainer getMethod(String methodName, ClassO[] params) throws NoSuchMethodException {
        return new ReflectionMethodContainer(containedClass, methodName,
                Arrays.stream(params).map(ClassO::getContainedClass).toArray(Class[]::new));
    }

    /**
     * Returns a JVM instruction opcode adapted to this ClassO.
     * This method must not be used for method types
     * @param sample opcode - a JVM instruction opcode for int (e.g. IASTORE)
     * @return opcode that is similar to the given opcode, but adapted to this ClassO
     */
    public int getOpcode(int sample) {
        return Type.getType(containedClass).getOpcode(sample);
    }

    /**
     * Determines if the specified ClassO object represents an interface type
     * @return true if is interface false otherwise
     */
    public boolean isInterface() {
        return containedClass.isInterface();
    }

    /**
     * Determines if the specified ClassO object is primitive type
     * @return true if primitive, false if reference
     */
    public boolean isPrimitive() {
        return containedClass.isPrimitive();
    }

    /**
     * Determines if the specified ClassO object is array
     *
     * @return true if is array, else otherwise
     */
    public boolean isArray() {
        return containedClass.isArray();
    }

    /**
     * Get class contained in array in the specified ClassO
     * e.g. for String[][] it will be String[]
     *
     * @return class contained in array if specified ClassO is array, null otherwise
     */
    public ClassO getArrayElementType() {

        if(!isArray())
            return null;

        try {
            return new ClassO(containedClass.getName().substring(1));
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof ClassO))
            return false;

        ClassO comp = ((ClassO) obj);

        return comp.getContainedClass().equals(containedClass);

    }

    private Class getContainedClass() {
        return containedClass;
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

    }

    @Override
    public String getTypeString() {
        return getJvmName();
    }

    @Override
    @Deprecated
    public ClassO getType() {
        return this;
    }

}
