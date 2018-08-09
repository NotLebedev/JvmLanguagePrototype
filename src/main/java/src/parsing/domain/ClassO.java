package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import src.parsing.domain.Interfaces.Value;
import src.parsing.packageManagement.ClassManagement;

/**
 * Object containing class, no value-like access expected
 * This object always contains valid class
 */
public class ClassO extends Value {

    private Class<?> containedClass;

    public ClassO(String name) throws ClassNotFoundException {
        containedClass = ClassManagement.forName(name);
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
        return null;
    }

}
