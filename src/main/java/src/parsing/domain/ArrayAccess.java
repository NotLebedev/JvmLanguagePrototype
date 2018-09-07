package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ReflectionClassWrapper;

/**
 * Class describing access to arrays
 *
 * @author NotLebedev
 */
public class ArrayAccess extends Value {

    private final Value array;
    private final Value index;

    private ReflectionClassWrapper type;

    public ArrayAccess(Value array, Value index) throws ClassNotFoundException {

        this.array = array;
        this.index = index; //TODO : type check

        /*if(!this.array.getWrappedType().isArray())
            throw new Exception(); //TODO : proper exception

        type = this.array.getWrappedType().getArrayElementType();*/

        String typeString = this.array.getTypeString().substring(1);

        if(typeString.charAt(0) != '[' && typeString.length() > 1)
            typeString = typeString.substring(1, typeString.length() - 1).replace('/', '.');

        type = new ReflectionClassWrapper(typeString);

    }

    public Value getIndex() {
        return index;
    }

    public Value getArray() {
        return array;
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        array.generateBytecode(methodVisitor);
        index.generateBytecode(methodVisitor);

        int opcode = type.getOpcode(Opcodes.IALOAD);
        methodVisitor.visitInsn(opcode);

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
