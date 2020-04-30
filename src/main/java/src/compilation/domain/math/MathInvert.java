package src.compilation.domain.math;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.compilation.domain.exceptions.NotBoxedTypeException;
import src.compilation.domain.exceptions.OperatorCanNotBeAppliedException;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.structure.interfaces.AbstractClass;
import src.compilation.domain.utils.TypeMatcher;

public class MathInvert implements Value {

    private final Value value;
    private AbstractClass type;

    public MathInvert(Value value) throws OperatorCanNotBeAppliedException {

        try {
            this.type = TypeMatcher.getInstance().getUnboxed(value.getType());
        } catch (NotBoxedTypeException e) {
            this.type = value.getType();
        }

        if(!MathUtils.getInts().contains(type) && !MathUtils.getLong().equals(type))
            throw new OperatorCanNotBeAppliedException("~", value.getType());

        this.value = value;

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        long l = -1;
        int i = -1;

        if (MathUtils.getLong().equals(type))
            methodVisitor.visitLdcInsn(l);
        else
            methodVisitor.visitLdcInsn(i);

        value.generateBytecode(methodVisitor);
        if(MathUtils.getBoxed().contains(value.getType())) {

            try {
                TypeMatcher.getInstance().doStackBoxing(value.getType(), methodVisitor);
            } catch (NotBoxedTypeException e) {
                throw new IllegalStateException("Expected to be boxed", e);
            }

        }

        methodVisitor.visitInsn(type.getOpcode(Opcodes.IXOR));

    }

    @Override
    public AbstractClass getType() {
        return type;
    }
}
