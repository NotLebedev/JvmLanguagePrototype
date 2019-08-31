package src.compilation.domain.logic.relational;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.compilation.domain.math.MathUtils;
import src.compilation.domain.structure.ClassFactory;
import src.compilation.domain.structure.interfaces.AbstractClass;

import java.util.ArrayList;

/**
 * Class used to derive comparator type for {@link LogicRelationOperator}
 *
 * @author NotLebedev
 */
class JumpInstructionSelector {

    private static ClassFactory cf =  ClassFactory.getInstance();
    private static AbstractClass objectType = cf.forCorrectName("java.lang.Object");
    private static ArrayList<AbstractClass> ints = MathUtils.getInts();
    private static ArrayList<AbstractClass> boxed = MathUtils.getBoxed();
    private static AbstractClass longType = MathUtils.getLong();
    private static ArrayList<AbstractClass> floats = MathUtils.getFloats();

    private static JumpInstructionGenerator intJumpInstructionGenerator = (visitor, labelElse, type) -> {

        int opcode;

        switch(type) {

            case LESS:
                opcode = Opcodes.IF_ICMPLT;
                break;
            case LESS_EQUAL:
                opcode = Opcodes.IF_ICMPLE;
                break;
            case GREATER:
                opcode = Opcodes.IF_ICMPGT;
                break;
            case GREATER_EQUAL:
                opcode = Opcodes.IF_ICMPGE;
                break;

            case EQUAL:
                opcode = Opcodes.IF_ICMPEQ;
                break;
            case NOT_EQUAL:
                opcode = Opcodes.IF_ICMPNE;
                break;

            default:
                throw new IllegalStateException("One of RelationType cases not implemented");

        }

        visitor.visitJumpInsn(opcode, labelElse);
    };

    public static JumpInstructionGenerator getJumpInstruction(AbstractClass type) {

        if(ints.contains(type)) {
            return intJumpInstructionGenerator;
        }

        throw new IllegalStateException("One of jump instruction types has not been implemented");

    }

    interface JumpInstructionGenerator {
        void branch(MethodVisitor methodVisitor, Label labelElse, RelationType type);
    }

}
