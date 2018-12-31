package src.parsing.domain.constantValues;

import org.objectweb.asm.MethodVisitor;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.interfaces.AbstractClass;

public class LongLiteral implements Value {

    private final long aLong;

    private AbstractClass type;

    public LongLiteral(long aLong) {

        this.aLong = aLong;

        try {
            this.type = ClassFactory.getInstance().forName("long");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Literal type must be available", e);
        }

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
