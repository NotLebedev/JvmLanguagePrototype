package src.parsing.domain.Math;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Accessible;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.ObjectField;
import src.parsing.domain.StaticClassField;
import src.parsing.domain.Variable;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.interfaces.AbstractClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MathUnaryOperator implements Value {

    private final Type operatorType;

    private Accessible accessible;
    private final AbstractClass type;

    private final static ArrayList<AbstractClass> ints;
    private final static ArrayList<AbstractClass> floats;
    private final static AbstractClass longT;

    static {

        var cf = ClassFactory.getInstance();

        ints = new ArrayList<>(4);
        ints.add(cf.forCorrectName("int"));
        ints.add(cf.forCorrectName("short"));
        ints.add(cf.forCorrectName("byte"));
        ints.add(cf.forCorrectName("char"));

        floats = new ArrayList<>(2);
        floats.add(cf.forCorrectName("float"));
        floats.add(cf.forCorrectName("double"));

        longT = cf.forCorrectName("long");

    }

    public MathUnaryOperator(Type operatorType, Accessible accessible) {
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

            if(ints.contains(accessible.getType()))
                methodVisitor.visitIincInsn(((Variable) accessible).getId(), 1);
            else {

                dupUpdate(methodVisitor, accessible, Opcodes.IADD);

                methodVisitor.visitVarInsn(accessible.getType().getOpcode(Opcodes.ISTORE),
                        ((Variable) accessible).getId());

            }

        }else {

            dupUpdate(methodVisitor, accessible, Opcodes.IADD);

            if(accessible instanceof StaticClassField) {

                var field = ((StaticClassField) accessible);

                methodVisitor.visitFieldInsn(Opcodes.PUTSTATIC,
                        field.getField().getOwnerClass().getSlashName(),
                        field.getField().getName(),
                        field.getType().getJvmName());

            } else { //Object field

                var field = ((ObjectField) accessible);

                field.getObject().generateBytecode(methodVisitor);
                methodVisitor.visitInsn(Opcodes.SWAP);
                methodVisitor.visitFieldInsn(Opcodes.PUTFIELD,
                        field.getField().getOwnerClass().getSlashName(),
                        field.getField().getName(),
                        field.getType().getJvmName());

            }

        }

    }

    private void dupUpdate(MethodVisitor methodVisitor, Accessible accessible, int sample) {

        if(accessible.getType().equals(floats.get(0))) {

            methodVisitor.visitInsn(Opcodes.DUP);
            methodVisitor.visitLdcInsn(1f);

        } else if(accessible.getType().equals(floats.get(0))) {

            methodVisitor.visitInsn(Opcodes.DUP2);
            methodVisitor.visitLdcInsn(1d);

        } else if(accessible.getType().equals(longT)) {

            methodVisitor.visitInsn(Opcodes.DUP2);
            methodVisitor.visitLdcInsn(1L);

        } else {

            methodVisitor.visitInsn(Opcodes.DUP);
            methodVisitor.visitLdcInsn(1); //Int

        }

        methodVisitor.visitInsn(accessible.getType().getOpcode(sample));

    }

    @Override
    public AbstractClass getType() {
        return type;
    }

    public enum Type {

        POST_INCREMENT,
        POST_DECREMENT,
        PRE_INCREMENT,
        PRE_DECREMENT

    }

}
