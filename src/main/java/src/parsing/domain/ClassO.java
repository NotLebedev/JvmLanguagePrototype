package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import src.parsing.Utils;
import src.parsing.domain.Interfaces.Value;
import src.parsing.packageManagement.ClassManagement;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Object containing class, no value-like access expected
 * This object always contains valid class
 */
public class ClassO extends Value {

    private final Class<?> containedClass;

    public ClassO(String name) throws ClassNotFoundException {
        containedClass = ClassManagement.forName(name);
    }

    public ClassO(int arrayDimension, ClassO basicType) throws ClassNotFoundException {

        StringBuilder sb = new StringBuilder();

        sb.append(basicType.getName());

        for (int i = 0; i < arrayDimension; i++) {
            sb.append("[]");
        }

        containedClass = ClassManagement.forName(sb.toString());

    }

    public String getName() {
        return containedClass.getName();
    }

    public String getJvmName() {
        return Utils.getJvmClassName(containedClass);
    }

    //TODO: replace with domain Field, when ready
    public Field getField(String fieldName) throws NoSuchFieldException {
        return containedClass.getField(fieldName);
    }

    //TODO: replace with
    public Method getMethod(String methodName, Class<?>[] params) throws NoSuchMethodException {
        return containedClass.getMethod(methodName, params);
    }

    public boolean isInterface() {
        return containedClass.isInterface();
    }

    public boolean isPrimitive() {
        return containedClass.isPrimitive();
    }

    public boolean isArray() {
        return containedClass.isArray();
    }

    public ClassO getArrayElementType() throws ClassNotFoundException {

        if(!isArray())
            return null;

        return new ClassO(containedClass.getName().substring(1));
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

    }

    @Override
    public String getTypeString() {
        return null;
    }

    @Override
    public Class<?> getType() {
        return containedClass;
    }

}
