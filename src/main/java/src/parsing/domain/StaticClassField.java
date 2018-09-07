package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ReflectionClassWrapper;
import src.parsing.domain.structure.ReflectionFieldWrapper;


public class StaticClassField extends Value {

    private ReflectionClassWrapper fieldOwnerClass;

    private String fieldName;
    private ReflectionFieldWrapper field;

    public void setNames(ReflectionClassWrapper fieldOwnerClass, String fieldName) throws NoSuchFieldException {

        this.fieldOwnerClass = fieldOwnerClass;
        this.fieldName = fieldName;

        resolveNames();

    }

    private void resolveNames() throws NoSuchFieldException {

        field = fieldOwnerClass.getField(fieldName);

        if(!field.isStatic()) {
            throw new NoSuchFieldException();
        }

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, fieldOwnerClass.getSlashName(), field.getName(), getTypeString());

    }

    @Override
    public String getTypeString() {
        return getType().getJvmName();
    }

    @Override
    public ReflectionClassWrapper getType() {
        return field.getType();
    }

}
