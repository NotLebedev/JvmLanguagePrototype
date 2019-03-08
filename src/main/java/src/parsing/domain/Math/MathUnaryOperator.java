package src.parsing.domain.Math;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Accessible;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.ObjectField;
import src.parsing.domain.StaticClassField;
import src.parsing.domain.Variable;
import src.parsing.domain.exceptions.NotBoxedTypeException;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.interfaces.AbstractClass;
import src.parsing.domain.utils.TypeMatcher;

import java.util.ArrayList;

public class MathUnaryOperator implements Value {

    private final Type operatorType;

    private Accessible accessible;
    private final AbstractClass type;

    private final static ArrayList<AbstractClass> ints;
    private final static ArrayList<AbstractClass> floats;
    private final static AbstractClass longT;

    private final static ArrayList<AbstractClass> boxed;

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

        boxed = new ArrayList<>(7);
        boxed.add(cf.forCorrectName("java.lang.Integer"));
        boxed.add(cf.forCorrectName("java.lang.Short"));
        boxed.add(cf.forCorrectName("java.lang.Byte"));
        boxed.add(cf.forCorrectName("java.lang.Character"));
        boxed.add(cf.forCorrectName("java.lang.Float"));
        boxed.add(cf.forCorrectName("java.lang.Double"));
        boxed.add(cf.forCorrectName("java.lang.Long"));

    }

    public MathUnaryOperator(Type operatorType, Accessible accessible) {

        this.operatorType = operatorType;
        this.accessible = accessible;

        AbstractClass abstractClass;

        try {
            abstractClass = TypeMatcher.getInstance().getUnboxed(accessible.getType());
        } catch (NotBoxedTypeException ignored) {
            abstractClass = accessible.getType();
        }

        this.type = abstractClass;

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        switch(operatorType) {

            case POST_INCREMENT:
                generatePost(methodVisitor, Opcodes.IADD, 1);
                break;
            case POST_DECREMENT:
                generatePost(methodVisitor, Opcodes.ISUB, -1);
                break;
            case PRE_INCREMENT:
                generatePre(methodVisitor, Opcodes.IADD, 1);
                break;
            case PRE_DECREMENT:
                generatePre(methodVisitor, Opcodes.ISUB, -1);
                break;
            default:
                throw new IllegalStateException("Unexpected operatorType");

        }

    }

    /**
     * Generate a pre increment/decrement
     * @param methodVisitor method visitor to use
     * @param opcode {@code Opcodes.IADD} to increment, {@code Opcodes.ISUB} to decrement
     * @param iincN 1 to increment, -1 to decrement
     */
    private void generatePre(MethodVisitor methodVisitor, int opcode, int iincN) {

        if(accessible instanceof Variable && ints.contains(accessible.getType())) {

            methodVisitor.visitIincInsn(((Variable) accessible).getId(), iincN);
            accessible.generateBytecode(methodVisitor);

        }else {

            accessible.generateBytecode(methodVisitor);

            if(boxed.contains(accessible.getType()))
                boxTo(accessible.getType(), methodVisitor);

            dupUpdate(methodVisitor, accessible, opcode, false);

            if(boxed.contains(accessible.getType()))
                boxTo(type, methodVisitor);

            if(accessible instanceof Variable) {
                methodVisitor.visitVarInsn(accessible.getType().getOpcode(Opcodes.ISTORE),
                        ((Variable)accessible).getId());
            }else {
                storeField(methodVisitor, accessible);
            }

        }

    }

    /**
     * Generate a post increment/decrement
     * @param methodVisitor method visitor to use
     * @param opcode {@code Opcodes.IADD} to increment, {@code Opcodes.ISUB} to decrement
     * @param iincN 1 to increment, -1 to decrement
     */
    private void generatePost(MethodVisitor methodVisitor, int opcode, int iincN) {

        accessible.generateBytecode(methodVisitor);

        if(boxed.contains(accessible.getType())) {
            boxTo(accessible.getType(), methodVisitor);
        }

        if(accessible instanceof Variable) {

            if(ints.contains(accessible.getType()))
                methodVisitor.visitIincInsn(((Variable) accessible).getId(), iincN);
            else {

                dupUpdate(methodVisitor, accessible, opcode, true);

                if(boxed.contains(accessible.getType())) {
                    boxTo(type, methodVisitor);
                }

                methodVisitor.visitVarInsn(accessible.getType().getOpcode(Opcodes.ISTORE),
                        ((Variable) accessible).getId());

            }

        }else {

            dupUpdate(methodVisitor, accessible, opcode, true);

            if(boxed.contains(accessible.getType())) {
                boxTo(type, methodVisitor);
            }

            storeField(methodVisitor, accessible);

        }

    }

    /**
     * Dup value and update it
     * @param methodVisitor method visitor to use
     * @param accessible accessible to preform action on
     * @param sample sample of opcode (IADD/ISUB) to be used
     * @param dupFirst true if value must be first duped than only
     *                 one should be incremented false otherwise
     */
    private void dupUpdate(MethodVisitor methodVisitor, Accessible accessible, int sample, boolean dupFirst) {

        int dupOpcode;
        Object constant;

        if(type.equals(floats.get(0))) {

            dupOpcode = Opcodes.DUP;
            constant = 1f;

        } else if(type.equals(floats.get(1))) {

            dupOpcode = Opcodes.DUP2;
            constant = 1d;

        } else if(type.equals(longT)) {

            dupOpcode = Opcodes.DUP2;
            constant = 1L;

        } else {

            dupOpcode = Opcodes.DUP;
            constant = 1; //int

        }

        if(dupFirst)
            methodVisitor.visitInsn(dupOpcode);

        methodVisitor.visitLdcInsn(constant);
        methodVisitor.visitInsn(type.getOpcode(sample));

        if(!dupFirst)
            methodVisitor.visitInsn(dupOpcode);

    }

    private void storeField(MethodVisitor methodVisitor, Accessible accessible) {

        if(accessible instanceof StaticClassField) {

            var field = ((StaticClassField) accessible);

            methodVisitor.visitFieldInsn(Opcodes.PUTSTATIC,
                    field.getField().getOwnerClass().getSlashName(),
                    field.getField().getName(),
                    field.getType().getJvmName());

        } else if(accessible instanceof ObjectField) {

            var field = ((ObjectField) accessible);

            field.getObject().generateBytecode(methodVisitor);
            methodVisitor.visitInsn(Opcodes.SWAP);
            methodVisitor.visitFieldInsn(Opcodes.PUTFIELD,
                    field.getField().getOwnerClass().getSlashName(),
                    field.getField().getName(),
                    field.getType().getJvmName());

        } else
            throw new IllegalStateException("Expected to have a field in storeField");

    }

    private AbstractClass boxTo(AbstractClass type, MethodVisitor methodVisitor) {

        try {
            return TypeMatcher.getInstance().doStackBoxing(type, methodVisitor);
        } catch (NotBoxedTypeException e) {
            throw new IllegalStateException("Expected to be boxed", e);
        }

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
