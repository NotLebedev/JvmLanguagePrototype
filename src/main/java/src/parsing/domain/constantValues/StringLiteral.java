package src.parsing.domain.constantValues;

import org.objectweb.asm.MethodVisitor;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.interfaces.AbstractClass;

/**
 * Class describing {@link String} literals
 */
public class StringLiteral implements Value {

    private final String string;

    private static AbstractClass type;

    static {
        try {
            type = ClassFactory.getInstance().forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Literal type must be available", e);
        }
    }

    public StringLiteral(String string) {
        this.string = string;
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        methodVisitor.visitLdcInsn(string);

    }

    @Override
    public AbstractClass getType() {
        return type;
    }
}
