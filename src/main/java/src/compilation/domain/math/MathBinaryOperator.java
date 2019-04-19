package src.compilation.domain.math;

import org.objectweb.asm.MethodVisitor;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.structure.interfaces.AbstractClass;

/**
 * @author NotLebedev
 */
public class MathBinaryOperator implements Value {



    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

    }

    @Override
    public AbstractClass getType() {
        return null;
    }

    public enum Type {

        MULTIPLY,
        DIVIDE,
        REMAINDER

    }

}
