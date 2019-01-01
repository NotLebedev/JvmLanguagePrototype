package src.parsing.domain.constantValues;

import org.objectweb.asm.MethodVisitor;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.interfaces.AbstractClass;

public class LongLiteral implements Value {

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
    public void generateBytecode(MethodVisitor methodVisitor) {

        methodVisitor.visitLdcInsn(aLong);

    }

    @Override
    public AbstractClass getType() {
        return type;
    }

}
