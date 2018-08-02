package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.Utils;
import src.parsing.domain.Interfaces.Value;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class StaticClassField implements Value {

    String fieldOwnerClassName;
    Class<?> fieldOwnerClass;

    String fieldName;
    Field field;

    public void setNames(String fieldOwnerClassName, String fieldName) throws ClassNotFoundException, NoSuchFieldException {

        this.fieldOwnerClassName = fieldOwnerClassName;
        this.fieldName = fieldName;

        resolveNames();

    }

    private void resolveNames() throws ClassNotFoundException, NoSuchFieldException {

        fieldOwnerClass = Utils.classForName(fieldOwnerClassName);

        field = fieldOwnerClass.getField(fieldName);

        if((field.getModifiers() & Modifier.STATIC) == 0) {
            throw new NoSuchFieldException();
        }

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, Utils.getJvmClassName(fieldOwnerClass), field.getName(), getTypeString());

    }

    @Override
    public String getTypeString() {
        return Utils.getClassName(field.getType());
    }

    @Override
    public Class<?> getType() {
        return field.getType();
    }

}
