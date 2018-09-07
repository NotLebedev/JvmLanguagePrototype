package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ReflectionClassWrapper;

/**
 * Class describing instantiation of array (e.g. {@code new int[][]}
 *
 * @author NotLebedev
 */
public class ArrayInstantiation extends Value {

    private int freeDimensions;
    private Value[] sizes;

    private ReflectionClassWrapper arrayType;
    private ReflectionClassWrapper type;

    /**
     *
     * @param arrayType Type contained in upper most array, e.g. for String[3][4][] it is String
     * @param sizes sizes of the initialized part of array
     * @param freeDimensions how many non-initialized dimensions array has for int[3] it is 0,
     *                       for int[3][][] it is 2
     */
    public ArrayInstantiation(ReflectionClassWrapper arrayType, Value[] sizes, int freeDimensions) {

        this.arrayType = arrayType;
        this.sizes = sizes; //TODO : arrayType check
        this.freeDimensions = freeDimensions;

        try {
            type = new ReflectionClassWrapper(sizes.length + freeDimensions, arrayType);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        if(sizes.length == 1 && freeDimensions == 0) { //One dimensional array

            sizes[0].generateBytecode(methodVisitor);

            if(arrayType.isPrimitive()) {

                int typeI = arrayType.getOpcode(Opcodes.T_INT);

                methodVisitor.visitVarInsn(Opcodes.NEWARRAY, typeI);

            }else {

                methodVisitor.visitTypeInsn(Opcodes.ANEWARRAY, arrayType.getSlashName());

            }

        } else { //Multi-dimensional array

            for (Value size : sizes) {
                size.generateBytecode(methodVisitor);
            }

            methodVisitor.visitMultiANewArrayInsn(type.getSlashName(), sizes.length);

        }

    }

    @Override
    public String getTypeString() {
        return getType().getJvmName();
    }

    @Override
    public ReflectionClassWrapper getType() {
        return type;
    }

}
