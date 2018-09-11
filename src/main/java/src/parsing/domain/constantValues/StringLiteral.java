package src.parsing.domain.constantValues;

import org.objectweb.asm.MethodVisitor;
import src.parsing.domain.structure.ReflectionClassWrapper;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.interfaces.AbstractClass;

/**
 * Class describing {@link String} literals
 */
public class StringLiteral implements Value {

    private final String string;

    public StringLiteral(String string) {
        this.string = string;
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        methodVisitor.visitLdcInsn(string);

    }

    @Override
    public AbstractClass getType() {
        return ReflectionClassWrapper.STRING;
    }
}
