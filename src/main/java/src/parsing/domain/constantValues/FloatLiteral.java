package src.parsing.domain.constantValues;

import org.objectweb.asm.MethodVisitor;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.interfaces.AbstractClass;

public class FloatLiteral implements Value {

    private final float f;

    private AbstractClass type;

    public FloatLiteral(float f) {

        this.f = f;

        try {
            this.type = ClassFactory.getInstance().forName("float");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Literal type must be available", e);
        }

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        methodVisitor.visitLdcInsn(f);

    }

    @Override
    public AbstractClass getType() {
        return type;
    }

}
