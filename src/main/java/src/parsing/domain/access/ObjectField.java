package src.parsing.domain.access;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.interfaces.Accessible;
import src.parsing.domain.interfaces.Value;
import src.parsing.domain.structure.ReflectionFieldWrapper;
import src.parsing.domain.structure.interfaces.AbstractClass;
import src.parsing.domain.structure.interfaces.AbstractField;

public class ObjectField implements Accessible {

    private Value object;
    private AbstractClass fieldOwnerClass;

    private String fieldName;
    private AbstractField field;

    public void setNames(Value object, String fieldName) throws NoSuchFieldException {

        this.object = object;
        this.fieldName = fieldName;

        resolveNames();

    }

    private void resolveNames() throws NoSuchFieldException {

        fieldOwnerClass = object.getType();

        field = fieldOwnerClass.getField(fieldName);

    }

    public AbstractField getField() {
        return field;
    }

    public Value getObject() {
        return object;
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        object.generateBytecode(methodVisitor);

        methodVisitor.visitFieldInsn(Opcodes.GETFIELD, fieldOwnerClass.getSlashName(), field.getName(), getType().getJvmName());

    }

    @Override
    public AbstractClass getType() {
        return field.getType();
    }
}
