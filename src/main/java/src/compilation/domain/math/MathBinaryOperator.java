package src.compilation.domain.math;

import org.objectweb.asm.MethodVisitor;
import src.compilation.domain.exceptions.NotBoxedTypeException;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.structure.interfaces.AbstractClass;
import src.compilation.domain.utils.TypeMatcher;

/**
 * @author NotLebedev
 */
public class MathBinaryOperator implements Value {

    private final Type operatorType;

    private final Value firstOperand;
    private final Value secondOperand;

    public MathBinaryOperator(Type operatorType, Value firstOperand, Value secondOperand) {

        this.operatorType = operatorType;
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;

        AbstractClass firstType;
        AbstractClass secondType;

        var typeMatcher = TypeMatcher.getInstance();

        try {
            firstType = typeMatcher.getUnboxed(firstOperand.getType());
        } catch (NotBoxedTypeException e) {
            firstType = firstOperand.getType();
        }

        try {
            secondType = typeMatcher.getUnboxed(secondOperand.getType());
        } catch (NotBoxedTypeException e) {
            secondType = secondOperand.getType();
        }

    }

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
