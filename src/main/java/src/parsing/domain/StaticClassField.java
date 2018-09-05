package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.Utils;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ClassO;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class StaticClassField extends Value {

    private ClassO fieldOwnerClass;

    private String fieldName;
    private Field field;

    public void setNames(ClassO fieldOwnerClass, String fieldName) throws NoSuchFieldException {

        this.fieldOwnerClass = fieldOwnerClass;
        this.fieldName = fieldName;

        resolveNames();

    }

    private void resolveNames() throws NoSuchFieldException {

        field = fieldOwnerClass.getField(fieldName);

        if((field.getModifiers() & Modifier.STATIC) == 0) {
            throw new NoSuchFieldException();
        }

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, fieldOwnerClass.getSlashName(), field.getName(), getTypeString());

    }

    @Override
    public String getTypeString() {
        return Utils.getClassName(field.getType());
    }

    @Override
    public ClassO getType() {
        return new ClassO(field.getType());
    }

}
