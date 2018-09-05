package src.parsing.domain.constantValues;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.structure.ClassO;
import src.parsing.domain.Interfaces.Value;

/**
 * Class describing {@link int} literals
 */
public class IntLiteral extends Value {

    private final int integer;

    public IntLiteral(int integer) {
        this.integer = integer;
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        switch (integer) {
            case -1:
                methodVisitor.visitInsn(Opcodes.ICONST_M1);
                return;
            case 0:
                methodVisitor.visitInsn(Opcodes.ICONST_0);
                return;
            case 1:
                methodVisitor.visitInsn(Opcodes.ICONST_1);
                return;
            case 2:
                methodVisitor.visitInsn(Opcodes.ICONST_2);
                return;
            case 3:
                methodVisitor.visitInsn(Opcodes.ICONST_3);
                return;
            case 4:
                methodVisitor.visitInsn(Opcodes.ICONST_4);
                return;
            case 5:
                methodVisitor.visitInsn(Opcodes.ICONST_5);
                return;
            default:
                break;
        }

        methodVisitor.visitLdcInsn(integer);

    }

    @Override
    public String getTypeString() {
        return "I";
    }

    @Override
    public ClassO getType() {
        return ClassO.INT;
    }

}
