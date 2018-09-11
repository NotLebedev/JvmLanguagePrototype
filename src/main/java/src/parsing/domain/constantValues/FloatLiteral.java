package src.parsing.domain.constantValues;

import org.objectweb.asm.MethodVisitor;
import src.parsing.domain.structure.ReflectionClassWrapper;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.interfaces.AbstractClass;

public class FloatLiteral implements Value {

    private final float f;

    public FloatLiteral(float f) {
        this.f = f;
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        methodVisitor.visitLdcInsn(f);

    }

    @Override
    public AbstractClass getType() {
        return ReflectionClassWrapper.FLOAT;
    }

}
