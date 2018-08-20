package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import src.parsing.Utils;
import src.parsing.domain.Interfaces.Value;

/**
 * Class describing instantiation of array (e.g. {@code new int[][]}
 *
 * @author NotLebedev
 */
public class ArrayInstantiation extends Value {

    private int freeDimensions;
    private Value[] sizes;

    private ClassO arrayType;
    private ClassO type;

    /**
     *
     * @param arrayType Type contained in upper most array, e.g. for String[3][4][] it is String
     * @param sizes sizes of the initialized part of array
     * @param freeDimensions how many non-initialized dimensions array has for int[3] it is 0,
     *                       for int[3][][] it is 2
     */
    public ArrayInstantiation(ClassO arrayType, Value[] sizes, int freeDimensions) {

        this.arrayType = arrayType;
        this.sizes = sizes; //TODO : arrayType check
        this.freeDimensions = freeDimensions;

        try {
            type = new ClassO(sizes.length + freeDimensions, arrayType);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        if(sizes.length == 1 && freeDimensions == 0) { //One dimensional array

            sizes[0].generateBytecode(methodVisitor);

            if(arrayType.isPrimitive()) {

                int typeI = Type.getType(arrayType.getType()).getOpcode(Opcodes.T_INT);

                methodVisitor.visitVarInsn(Opcodes.NEWARRAY, typeI);

            }else {

                methodVisitor.visitTypeInsn(Opcodes.ANEWARRAY, arrayType.getJvmName());

            }

        } else { //Multi-dimensional array

        }

    }

    @Override
    public String getTypeString() {
        return Utils.getClassName(getType());
    }

    @Override
    public Class<?> getType() {
        return type.getType();
    }

}
