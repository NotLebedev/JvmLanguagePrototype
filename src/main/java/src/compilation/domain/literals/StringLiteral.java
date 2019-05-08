package src.compilation.domain.literals;

import org.objectweb.asm.MethodVisitor;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.structure.ClassFactory;
import src.compilation.domain.structure.interfaces.AbstractClass;

/**
 * Class describing {@link String} literals
 */
public class StringLiteral implements Value {

    private final String string;

    private static final AbstractClass type;

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

    public String getString() {
        return string;
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
