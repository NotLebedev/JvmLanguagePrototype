package src.compilation.domain.math;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.compilation.domain.exceptions.IncompatibleTypesException;
import src.compilation.domain.exceptions.NotBoxedTypeException;
import src.compilation.domain.exceptions.OperatorCanNotBeAppliedException;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.structure.interfaces.AbstractClass;
import src.compilation.domain.utils.TypeMatcher;

import java.util.ArrayList;

/**
 * Class describing mathematical binary operators (e.g. + / %)
 * @author NotLebedev
 */
public class MathBinaryOperator implements Value {

    private final Type operatorType;

    private final Value firstOperand;
    private final Value secondOperand;
    private final AbstractClass type;

    private static final ArrayList<AbstractClass> boxed = MathUtils.getBoxed();
    private static final ArrayList<AbstractClass> mathCompatible = MathUtils.getMathCompatible();

    private static final TypeMatcher typeMatcher = TypeMatcher.getInstance();

    public MathBinaryOperator(Type operatorType, Value firstOperand, Value secondOperand) throws OperatorCanNotBeAppliedException, IncompatibleTypesException {

        this.operatorType = operatorType;
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;

        AbstractClass firstType;
        AbstractClass secondType;

        var typeMatcher = TypeMatcher.getInstance();

        try { //Get unboxed types for both operands
            firstType = typeMatcher.getUnboxed(firstOperand.getType());
        } catch (NotBoxedTypeException e) {
            firstType = firstOperand.getType();
        }

        try {
            secondType = typeMatcher.getUnboxed(secondOperand.getType());
        } catch (NotBoxedTypeException e) {
            secondType = secondOperand.getType();
        }
        //Check if both operands are numbers
        if(!mathCompatible.contains(firstType))
            throw new OperatorCanNotBeAppliedException(operatorType.name, firstType);

        if(!mathCompatible.contains(secondType))
            throw new OperatorCanNotBeAppliedException(operatorType.name, secondType);
        //Check if both operands are of the same type
        if(!firstType.equals(secondType))
            throw new IncompatibleTypesException(firstType.getName(), secondType.getName());
        //If all checks passed unboxed type of first operand will be resulting type of operation
        this.type = firstType;

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {
        //Create both operands on stack and unbox them
        firstOperand.generateBytecode(methodVisitor);
        unBox(firstOperand.getType(), methodVisitor);

        secondOperand.generateBytecode(methodVisitor);
        unBox(secondOperand.getType(), methodVisitor);
        //Add created values
        methodVisitor.visitInsn(type.getOpcode(operatorType.opcode));

    }

    /**
     * Check if value is boxed and unbox on stack if it is
     * @param type type of value
     * @param methodVisitor MethodVisitor to be used
     */
    private void unBox(AbstractClass type, MethodVisitor methodVisitor) {

        if(boxed.contains(type)) {

            try {
                typeMatcher.doStackBoxing(type, methodVisitor);
            } catch (NotBoxedTypeException e) {
                throw new IllegalStateException("Expected to be boxed", e);
            }

        }
    }

    @Override
    public AbstractClass getType() {
        return type;
    }

    public enum Type {

        MULTIPLY("*", Opcodes.IMUL),
        DIVIDE("/", Opcodes.IDIV),
        REMAINDER("%", Opcodes.IREM),

        ADD("+", Opcodes.IADD),
        SUBSTRACT("-", Opcodes.ISUB);

        public final String name;
        public final int opcode;

        Type(String name, int opcode) {
            this.name = name;
            this.opcode = opcode;
        }
    }

}
