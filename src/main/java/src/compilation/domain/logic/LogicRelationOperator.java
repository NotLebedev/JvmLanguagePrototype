package src.compilation.domain.logic;

import org.objectweb.asm.MethodVisitor;
import src.compilation.domain.exceptions.IncompatibleTypesException;
import src.compilation.domain.exceptions.NotBoxedTypeException;
import src.compilation.domain.exceptions.OperatorCanNotBeAppliedException;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.math.MathUtils;
import src.compilation.domain.structure.ClassFactory;
import src.compilation.domain.structure.interfaces.AbstractClass;
import src.compilation.domain.utils.TypeMatcher;

import java.util.ArrayList;

public class LogicRelationOperator implements Value {

    private final Type operatorType;

    private final Value firstOperand;
    private final Value secondOperand;

    private static final AbstractClass type =
            ClassFactory.getInstance().forCorrectName("boolean");
    private static final ArrayList<AbstractClass> mathCompatible = MathUtils.getMathCompatible();

    private static final TypeMatcher typeMatcher = TypeMatcher.getInstance();

    public LogicRelationOperator(Type operatorType, Value firstOperand, Value secondOperand) throws IncompatibleTypesException, OperatorCanNotBeAppliedException {

        if(operatorType == Type.EQUAL || operatorType == Type.NOT_EQUAL) {

            if(!firstOperand.getType().equals(secondOperand.getType()))
                throw new IncompatibleTypesException(firstOperand.getType().getName(),
                        secondOperand.getType().getName());

        }else {

            AbstractClass firstType;
            AbstractClass secondType;

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

        }

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

        LESS("<"),
        LESS_EQUAL("<="),
        GREATER(">"),
        GREATER_EQUAL(">="),

        EQUAL("=="),
        NOT_EQUAL("!=");

        public final String name;

        Type(String name) {
            this.name = name;
        }
    }

}
