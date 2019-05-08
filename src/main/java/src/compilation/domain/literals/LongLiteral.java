package src.compilation.domain.literals;

import org.objectweb.asm.MethodVisitor;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.literals.interfaces.Literal;
import src.compilation.domain.structure.ClassFactory;
import src.compilation.domain.structure.interfaces.AbstractClass;

public class LongLiteral implements Literal {

    private final long aLong;

    private static final AbstractClass type;

    static {
        try {
            type = ClassFactory.getInstance().forName("long");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Literal type must be available", e);
        }
    }

    public LongLiteral(long aLong) {
        this.aLong = aLong;
    }

    @Override
    public String getString() {
        return Long.toString(aLong);
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        methodVisitor.visitLdcInsn(aLong);

    }

    @Override
    public AbstractClass getType() {
        return type;
    }

}
