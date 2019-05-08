package src.compilation.domain.literals;

import org.objectweb.asm.MethodVisitor;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.literals.interfaces.Literal;
import src.compilation.domain.structure.ClassFactory;
import src.compilation.domain.structure.interfaces.AbstractClass;

public class FloatLiteral implements Literal {

    private final float aFloat;

    private static final AbstractClass type;

    static {
        try {
            type = ClassFactory.getInstance().forName("float");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Literal type must be available", e);
        }
    }

    public FloatLiteral(float aFloat) {

        this.aFloat = aFloat;

    }

    @Override
    public String getString() {
        return Float.toString(aFloat);
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
