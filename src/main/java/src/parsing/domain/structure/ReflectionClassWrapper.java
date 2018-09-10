package src.parsing.domain.structure;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;
import src.parsing.Utils;
import src.parsing.domain.Interfaces.Value;
import src.parsing.packageManagement.ClassManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Object containing class, no value-like access expected
 * This object always contains valid class
 */
public class ReflectionClassWrapper extends Value {

    //region CONSTANTS
    public static final ReflectionClassWrapper BOOLEAN = new ReflectionClassWrapper(boolean.class);
    public static final ReflectionClassWrapper BYTE = new ReflectionClassWrapper(byte.class);
    public static final ReflectionClassWrapper CHAR = new ReflectionClassWrapper(char.class);
    public static final ReflectionClassWrapper LONG = new ReflectionClassWrapper(long.class);
    public static final ReflectionClassWrapper SHORT = new ReflectionClassWrapper(short.class);
    public static final ReflectionClassWrapper INT = new ReflectionClassWrapper(int.class);
    public static final ReflectionClassWrapper FLOAT = new ReflectionClassWrapper(float.class);
    public static final ReflectionClassWrapper DOUBLE = new ReflectionClassWrapper(double.class);
    public static final ReflectionClassWrapper STRING = new ReflectionClassWrapper(String.class);
    //endregion

    private final Class<?> containedClass;

    //Lazy initialized lists of methods and fields
    private final List<ReflectionMethodWrapper> methods = new ArrayList<>();
    private final HashMap<String, ReflectionFieldWrapper> fields = new HashMap<>();

    /**
     * This method is marked as deprecated to remind  to remove it from public use
     *
     * @param cls
     */
    @Deprecated
    public ReflectionClassWrapper(Class<?> cls) {
        containedClass = cls;
    }

    public ReflectionClassWrapper(String name) throws ClassNotFoundException {
        containedClass = ClassManagement.forName(name); //TODO: make class not instantiated every time
    }

    /**
     * Construct an array from given ReflectionClassWrapper
     *
     * @param arrayDimension dimension of new array
     * @param basicType non-array type
     * @throws ClassNotFoundException
     */
    public ReflectionClassWrapper(int arrayDimension, ReflectionClassWrapper basicType) throws ClassNotFoundException {

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

    public ReflectionFieldWrapper getField(String fieldName) throws NoSuchFieldException {

        if(fields.containsKey(fieldName)) {
            return fields.get(fieldName);
        }

        var newField = new ReflectionFieldWrapper(containedClass, fieldName);
        fields.put(fieldName, newField);

        return newField;

    }

    public ReflectionMethodWrapper getMethod(String methodName, ReflectionClassWrapper[] params) throws NoSuchMethodException {

        for (ReflectionMethodWrapper method : methods) {

            if(method.matches(methodName, params))
                return method;

        }

        var newMethod = new ReflectionMethodWrapper(containedClass, methodName,
                Arrays.stream(params).map(ReflectionClassWrapper::getContainedClass).toArray(Class[]::new));

        methods.add(newMethod);

        return newMethod;


    }

    /**
     * Returns a JVM instruction opcode adapted to this ReflectionClassWrapper.
     * This method must not be used for method types
     * @param sample opcode - a JVM instruction opcode for int (e.g. IASTORE)
     * @return opcode that is similar to the given opcode, but adapted to this ReflectionClassWrapper
     */
    public int getOpcode(int sample) {
        return Type.getType(containedClass).getOpcode(sample);
    }

    /**
     * Determines if the specified ReflectionClassWrapper object represents an interface type
     * @return true if is interface false otherwise
     */
    public boolean isInterface() {
        return containedClass.isInterface();
    }

    /**
     * Determines if the specified ReflectionClassWrapper object is primitive type
     * @return true if primitive, false if reference
     */
    public boolean isPrimitive() {
        return containedClass.isPrimitive();
    }

    /**
     * Determines if the specified ReflectionClassWrapper object is array
     *
     * @return true if is array, else otherwise
     */
    public boolean isArray() {
        return containedClass.isArray();
    }

    /**
     * Get class contained in array in the specified ReflectionClassWrapper
     * e.g. for String[][] it will be String[]
     *
     * @return class contained in array if specified ReflectionClassWrapper is array, null otherwise
     */
    public ReflectionClassWrapper getArrayElementType() {

        if(!isArray())
            return null;

        try {
            return new ReflectionClassWrapper(containedClass.getName().substring(1));
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof ReflectionClassWrapper))
            return false;

        ReflectionClassWrapper comp = ((ReflectionClassWrapper) obj);

        return comp.getContainedClass().equals(containedClass);

    }

    private Class getContainedClass() {
        return containedClass;
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

    }

    @Override
    @Deprecated
    public ReflectionClassWrapper getType() {
        return this;
    }

}
