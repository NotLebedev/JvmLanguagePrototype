package src.parsing.domain.constantValues;

import org.objectweb.asm.MethodVisitor;
import src.parsing.domain.structure.ReflectionClassWrapper;
import src.parsing.domain.Interfaces.Value;

/**
 * Class describing {@link String} literals
 */
public class StringLiteral extends Value {

    private final String string;

    public StringLiteral(String string) {
        this.string = string;
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        methodVisitor.visitLdcInsn(string);

    }

    @Override
    public String getTypeString() {
        return "Ljava/lang/String;";
    }

    @Override
    public ReflectionClassWrapper getType() {
        return ReflectionClassWrapper.STRING;
    }
}
