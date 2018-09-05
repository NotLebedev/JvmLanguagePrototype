package src.parsing.domain.constantValues;

import org.objectweb.asm.MethodVisitor;
import src.parsing.domain.structure.ClassO;
import src.parsing.domain.Interfaces.Value;

public class FloatLiteral extends Value {

    private final float f;

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
    public ClassO getType() {
        return ClassO.FLOAT;
    }

}
