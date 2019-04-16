package src.parsing.domain.math;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.exceptions.NotBoxedTypeException;
import src.parsing.domain.exceptions.OperatorCanNotBeAppliedException;
import src.parsing.domain.interfaces.Value;
import src.parsing.domain.structure.interfaces.AbstractClass;
import src.parsing.domain.utils.TypeMatcher;

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
                TypeMatcher.getInstance().doStackBoxing(type, methodVisitor);
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
