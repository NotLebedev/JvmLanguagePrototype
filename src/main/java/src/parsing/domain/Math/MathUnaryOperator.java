package src.parsing.domain.Math;

import org.objectweb.asm.MethodVisitor;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.interfaces.AbstractClass;

public class MathUnaryOperator implements Value {

    private final MathUnaryOperatorType operatorType;

    private final Value value;
    private final AbstractClass type;

    public MathUnaryOperator(MathUnaryOperatorType operatorType, Value value) {
        this.operatorType = operatorType;
        this.value = value;
        this.type = value.getType();
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

    }

    @Override
    public AbstractClass getType() {
        return type;
    }

    enum MathUnaryOperatorType {

        POST_INCREMENT,
        POST_DECREMENT,
        PRE_INCREMENT,
        PRE_DECREMENT

    }

}
