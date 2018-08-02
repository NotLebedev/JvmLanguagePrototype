package src.parsing.domain.constantValues;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;

public class FloatLiteral implements Value {

    private float f;

    public FloatLiteral(float f) {
        this.f = f;
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        methodVisitor.visitLdcInsn(f);

    }

    @Override
    public String getTypeString() {
        return "F";
    }

    @Override
    public Class<?> getType() {
        return float.class;
    }

}
