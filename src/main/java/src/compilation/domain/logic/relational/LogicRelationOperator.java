package src.compilation.domain.logic.relational;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
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

    private final RelationType operatorType;

    private final Value firstOperand;
    private final Value secondOperand;

    private static final AbstractClass type =
            ClassFactory.getInstance().forCorrectName("boolean");
    private static final ArrayList<AbstractClass> mathCompatible = MathUtils.getMathCompatible();

    private static ArrayList<AbstractClass> integers = MathUtils.getInts();
    private static AbstractClass object = ClassFactory.getInstance().forCorrectName("java.lang.Object");

    private static final TypeMatcher typeMatcher = TypeMatcher.getInstance();

    public LogicRelationOperator(RelationType operatorType, Value firstOperand, Value secondOperand
            ) throws IncompatibleTypesException, OperatorCanNotBeAppliedException {

        if(operatorType == RelationType.EQUAL || operatorType == RelationType.NOT_EQUAL) {

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

        firstOperand.generateBytecode(methodVisitor);
        secondOperand.generateBytecode(methodVisitor);

        var labelElse = new Label(); //Start of else branch #1
        var labelEnd = new Label(); //End of else branch #2

        JumpInstructionSelector.getJumpInstruction(firstOperand.getType())
            .branch(methodVisitor, labelElse, operatorType);

        methodVisitor.visitInsn(Opcodes.ICONST_0); // leave 0 (true) on stack
        methodVisitor.visitJumpInsn(Opcodes.GOTO, labelEnd); //goto #2 (proceed execution)

        methodVisitor.visitLabel(labelElse);// #1
        methodVisitor.visitInsn(Opcodes.ICONST_1); // leave 1 (true) on stack
        methodVisitor.visitLabel(labelEnd); //#2

    }

    @Override
    public AbstractClass getType() {
        return type;
    }

}
