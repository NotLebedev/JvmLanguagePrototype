package src.compilation.domain.logic;

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

        firstOperand.generateBytecode(methodVisitor);
        secondOperand.generateBytecode(methodVisitor);

        operatorType.opcodeGen.generate(methodVisitor);

    }

    @Override
    public AbstractClass getType() {
        return type;
    }

    public enum Type {

        LESS("<", visitor -> {

            var labelElse = new Label(); //Start of else branch #1
            var labelEnd = new Label(); //End of else branch #2

            visitor.visitJumpInsn(Opcodes.IF_ICMPLT, labelElse); //if val1 < val2 goto #1

            visitor.visitInsn(Opcodes.ICONST_0); // leave 0 (true) on stack
            visitor.visitJumpInsn(Opcodes.GOTO, labelEnd); //goto #2 (proceed execution)

            visitor.visitLabel(labelElse);// #1
            visitor.visitInsn(Opcodes.ICONST_1); // leave 1 (true) on stack
            visitor.visitLabel(labelEnd); //#2


        }),
        LESS_EQUAL("<=", visitor -> {
            //Code here
        }),
        GREATER(">", visitor -> {
            //Code here
        }),
        GREATER_EQUAL(">=", visitor -> {
            //Code here
        }),

        EQUAL("==", visitor -> {
            //Code here
        }),
        NOT_EQUAL("!=", visitor -> {
            //Code here
        });

        public final String name;
        public final OpcodeGen opcodeGen;

        Type(String name, OpcodeGen opcodeGen) {
            this.name = name;
            this.opcodeGen = opcodeGen;
        }

        interface OpcodeGen {
            void generate(MethodVisitor methodVisitor);
        }

    }

}
