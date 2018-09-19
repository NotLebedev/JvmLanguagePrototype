package src.parsing.domain.structure;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;
import src.parsing.domain.utils.Utils;
import src.parsing.domain.structure.interfaces.AbstractClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Object containing class, no value-like access expected
 * This object always contains valid class
 */
class ReflectionClassWrapper implements AbstractClass {

    private final Class<?> containedClass;

    //Lazy initialized lists of methods and fields
    private final List<ReflectionMethodWrapper> methods = new ArrayList<>();
    private final HashMap<String, ReflectionFieldWrapper> fields = new HashMap<>();

    ReflectionClassWrapper(Class<?> cls) {

        containedClass = cls;

        Arrays.stream(containedClass.getMethods())
                .forEach(method -> methods.add(new ReflectionMethodWrapper(method)));

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

    public ReflectionMethodWrapper getMethod(String methodName, AbstractClass[] params) throws NoSuchMethodException {

        var convParams = new ReflectionClassWrapper[params.length];

        for (int i = 0; i < params.length; i++) {

            if(!(params[i] instanceof ReflectionClassWrapper))
                throw new NoSuchMethodException(); //For obvious reasons classes from libraries can not be type-linked to code being compiled
            else
                convParams[i] = ((ReflectionClassWrapper) params[i]);

        }

        for (ReflectionMethodWrapper method : methods) { //First pass, finding strict match

            if(method.strictMatches(methodName, convParams) && (!method.isBridge())) //Method must be not bridge in order
                return method;                                                 //to prevent covariant super method selection
            //                                                                   (e.g. select public StringBuilder append(String)
        }                                                                      //instead of public AbstractStringBuilder append(String)

        for (ReflectionMethodWrapper method : methods) { //Second pass, to find if any method matches unstrictly

            if(method.unstrictMatches(methodName, convParams) && (!method.isBridge()))
                return method;

        }

        throw new NoSuchMethodException();


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
    public AbstractClass getType() {
        return this;
    }

}
