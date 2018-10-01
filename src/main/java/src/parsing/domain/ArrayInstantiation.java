package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.exceptions.IncompatibleTypesException;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.interfaces.AbstractClass;
import src.parsing.domain.utils.TypeMatcher;

/**
 * Class describing instantiation of array (e.g. {@code new int[][]}
 *
 * @author NotLebedev
 */
public class ArrayInstantiation implements Value {

    private final static AbstractClass INDEX_TYPE = ClassFactory.getInstance().forCorrectName("int");

    private final int freeDimensions;
    private final Value[] sizes;

    private final AbstractClass arrayType;
    private final AbstractClass type;

    /**
     * @param arrayType      Type contained in upper most array, e.g. for String[3][4][] it is String
     * @param sizes          sizes of the initialized part of array
     * @param freeDimensions how many non-initialized dimensions array has for int[3] it is 0,
     *                       for int[3][][] it is 2
     */
    public ArrayInstantiation(AbstractClass arrayType, Value[] sizes, int freeDimensions) throws IncompatibleTypesException {

        this.arrayType = arrayType;

        this.sizes = new Value[sizes.length];

        var tm = TypeMatcher.getInstance();
        for (int i = 0; i < sizes.length; i++) {
            this.sizes[i] = tm.softMatch(INDEX_TYPE, sizes[i]);
        }

        this.freeDimensions = freeDimensions;

        type = ClassFactory.getInstance().toArray(sizes.length + freeDimensions, arrayType);

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        if(sizes.length == 1 && freeDimensions == 0) { //One dimensional array

            sizes[0].generateBytecode(methodVisitor);

            if(arrayType.isPrimitive()) {

                int typeI = arrayType.getOpcode(Opcodes.T_INT);

                methodVisitor.visitVarInsn(Opcodes.NEWARRAY, typeI);

            } else {

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
    public AbstractClass getType() {
        return type;
    }

}
