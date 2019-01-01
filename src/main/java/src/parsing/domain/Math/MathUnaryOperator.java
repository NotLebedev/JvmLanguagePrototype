package src.parsing.domain.Math;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Accessible;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.Variable;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.interfaces.AbstractClass;

import java.util.Arrays;

public class MathUnaryOperator implements Value {

    private final MathUnaryOperatorType operatorType;

    private Accessible accessible;
    private final AbstractClass type;

    private final static AbstractClass[] ints;
    private final static AbstractClass[] floats;
    private final static AbstractClass longT;

    static {

        var cf = ClassFactory.getInstance();

        ints = new AbstractClass[4];
        ints[0] = cf.forCorrectName("int");
        ints[1] = cf.forCorrectName("short");
        ints[2] = cf.forCorrectName("byte");
        ints[3] = cf.forCorrectName("char");

        floats = new AbstractClass[2];
        floats[0] = cf.forCorrectName("float");
        floats[1] = cf.forCorrectName("double");

        longT = cf.forCorrectName("long");

    }

    public MathUnaryOperator(MathUnaryOperatorType operatorType, Accessible accessible) {
        this.operatorType = operatorType;
        this.accessible = accessible;
        this.type = accessible.getType();
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        switch (operatorType) {

            case POST_INCREMENT:
                generatePostIncrement(methodVisitor);
                break;
            default:
                throw new IllegalStateException("Not implemented yet");

        }

    }

    private void generatePostIncrement(MethodVisitor methodVisitor) {

        accessible.generateBytecode(methodVisitor);

        if(accessible instanceof Variable) {

            if(Arrays.binarySearch(ints, accessible.getType()) > 0)
                methodVisitor.visitIincInsn(((Variable) accessible).getId(), 1);
            else {
                if(accessible.getType().equals(floats[0]))
                    methodVisitor.visitLdcInsn(1f);
                else if(accessible.getType().equals(floats[1]))
                    methodVisitor.visitLdcInsn(1d);
                else if(accessible.getType().equals(longT))
                    methodVisitor.visitLdcInsn(1L);
                else
                    methodVisitor.visitLdcInsn(1); //Int

                methodVisitor.visitInsn(accessible.getType().getOpcode(Opcodes.IADD));

                methodVisitor.visitVarInsn(accessible.getType().getOpcode(Opcodes.ISTORE),
                        ((Variable) accessible).getId());

            }

        }else {

            //methodVisitor.visitInsn(Opcodes.ICONST_1);
            //methodVisitor.visitInsn(Opcodes);

        }

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
