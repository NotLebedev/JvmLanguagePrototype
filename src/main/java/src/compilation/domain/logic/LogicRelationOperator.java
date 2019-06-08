package src.compilation.domain.logic;

import org.objectweb.asm.MethodVisitor;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.structure.ClassFactory;
import src.compilation.domain.structure.interfaces.AbstractClass;

public class LogicRelationOperator implements Value {

    private final Type operatorType;

    private final Value firstOperand;
    private final Value secondOperand;

    private static final AbstractClass type =
            ClassFactory.getInstance().forCorrectName("boolean");

    public LogicRelationOperator(Type operatorType, Value firstOperand, Value secondOperand) {

        this.operatorType = operatorType;
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

    }

    @Override
    public AbstractClass getType() {
        return type;
    }

    public enum Type {

        LESS,
        LESS_EQUAL,
        GREATER,
        GREATER_EQUAL,

        EQUAL,
        NOT_EQUAL

    }

}
