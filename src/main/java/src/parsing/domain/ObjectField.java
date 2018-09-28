package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ReflectionFieldWrapper;
import src.parsing.domain.structure.interfaces.AbstractClass;

public class ObjectField implements Value {

    private Value object;
    private AbstractClass fieldOwnerClass;

    private String fieldName;
    private ReflectionFieldWrapper field;

    public void setNames(Value object, String fieldName) throws NoSuchFieldException {

        this.object = object;
        this.fieldName = fieldName;

        resolveNames();

    }

    private void resolveNames() throws NoSuchFieldException {

        fieldOwnerClass = object.getType();

        field = fieldOwnerClass.getField(fieldName);

    }

    public ReflectionFieldWrapper getField() {
        return field;
    }

    public Value getObject() {
        return object;
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        object.generateBytecode(methodVisitor);

        methodVisitor.visitFieldInsn(Opcodes.GETFIELD, fieldOwnerClass.getJvmName(), field.getName(), getType().getJvmName());

    }

    @Override
    public AbstractClass getType() {
        return field.getType();
    }
}
