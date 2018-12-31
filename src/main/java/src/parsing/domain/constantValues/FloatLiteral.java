package src.parsing.domain.constantValues;

import org.objectweb.asm.MethodVisitor;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.interfaces.AbstractClass;

public class FloatLiteral implements Value {

    private final float aFloat;

    private static AbstractClass type = null;

    public FloatLiteral(float aFloat) {

        this.aFloat = aFloat;

        if(type == null) {

            try {
                type = ClassFactory.getInstance().forName("float");
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Literal type must be available", e);
            }

        }

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        methodVisitor.visitLdcInsn(aFloat);

    }

    @Override
    public AbstractClass getType() {
        return type;
    }

}
