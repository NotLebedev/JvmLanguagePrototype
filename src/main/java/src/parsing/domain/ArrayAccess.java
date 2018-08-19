package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import src.parsing.Utils;
import src.parsing.domain.Interfaces.Value;

/**
 * @author NotLebedev
 */
public class ArrayAccess extends Value {

    private Value array;
    private Value index;

    private ClassO type;

    public ArrayAccess(Value array, Value index) throws ClassNotFoundException {

        this.array = array;
        this.index = index; //TODO : type check

        /*if(!this.array.getWrappedType().isArray())
            throw new Exception(); //TODO : proper exception

        type = this.array.getWrappedType().getArrayElementType();*/

        String typeString = this.array.getTypeString().substring(1);

        if(typeString.charAt(0) != '[' && typeString.length() > 1)
            typeString = typeString.substring(1, typeString.length() - 1).replace('/', '.');

        type = new ClassO(typeString);

    }

    public Value getIndex() {
        return index;
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        array.generateBytecode(methodVisitor);
        index.generateBytecode(methodVisitor);

        int opcode = Type.getType(type.getType()).getOpcode(Opcodes.IALOAD);
        methodVisitor.visitInsn(opcode);

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
