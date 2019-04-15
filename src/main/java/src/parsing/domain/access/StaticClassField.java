package src.parsing.domain.access;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.interfaces.Accessible;
import src.parsing.domain.structure.ReflectionFieldWrapper;
import src.parsing.domain.structure.interfaces.AbstractClass;
import src.parsing.domain.structure.interfaces.AbstractField;


public class StaticClassField implements Accessible {

    private AbstractClass fieldOwnerClass;

    private String fieldName;
    private AbstractField field;

    public void setNames(AbstractClass fieldOwnerClass, String fieldName) throws NoSuchFieldException {

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

    public AbstractField getField() {
        return field;
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, fieldOwnerClass.getSlashName(), field.getName(), getType().getJvmName());

    }

    @Override
    public AbstractClass getType() {
        return field.getType();
    }

}
