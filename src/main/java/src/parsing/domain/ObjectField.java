package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;

import java.lang.reflect.Field;

public class ObjectField extends Value {

    private Value object;
    private ClassO fieldOwnerClass;

    private String fieldName;
    private Field field;

    public void setNames(Value object, String fieldName) throws ClassNotFoundException, NoSuchFieldException {

        this.object = object;
        this.fieldName = fieldName;

        resolveNames();

    }

    private void resolveNames() throws NoSuchFieldException {

        fieldOwnerClass = object.getType();

        field = fieldOwnerClass.getField(fieldName);

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        object.generateBytecode(methodVisitor);

        methodVisitor.visitFieldInsn(Opcodes.GETFIELD, fieldOwnerClass.getJvmName(), field.getName(), getTypeString());

    }

    @Override
    public String getTypeString() {
        return getType().getJvmName();
    }

    @Override
    public ClassO getType() {
        return new ClassO(field.getType());
    }
}
