package src.compilation.domain.math;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.compilation.domain.exceptions.NotBoxedTypeException;
import src.compilation.domain.exceptions.OperatorCanNotBeAppliedException;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.structure.interfaces.AbstractClass;
import src.compilation.domain.utils.TypeMatcher;

/**
 * @author NotLebedev
 */
public class MathNegate implements Value {

    private Value value;
    private AbstractClass type;

    public MathNegate(Value value) throws OperatorCanNotBeAppliedException {

        if(!MathUtils.getMathCompatible().contains(value.getType()))
            throw new OperatorCanNotBeAppliedException("-", value.getType());

        try {
            this.type = TypeMatcher.getInstance().getUnboxed(value.getType());
        } catch (NotBoxedTypeException e) {
            this.type = value.getType();
        }

        this.value = value;

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        value.generateBytecode(methodVisitor);

        if(MathUtils.getBoxed().contains(value.getType())) {

            try {
                TypeMatcher.getInstance().doStackBoxing(value.getType(), methodVisitor);
            } catch (NotBoxedTypeException e) {
                throw new IllegalStateException("Expected to be boxed", e);
            }

        }

        methodVisitor.visitInsn(type.getOpcode(Opcodes.INEG));

    }

    @Override
    public AbstractClass getType() {
        return type;
    }
}
