package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import src.parsing.Utils;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Interfaces.Value;

/**
 * Class describing storing to array elements
 *
 * @author NotLebedev
 */
public class ArrayAssignment extends Expression {

    private Value array;
    private Value index;
    private Value value;

    private ClassO type;

    public ArrayAssignment(Value array, Value index, Value value) throws ClassNotFoundException {

        this.array = array;
        this.index = index; //TODO : type check
        this.value = value;

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
        value.generateBytecode(methodVisitor);

        int opcode = Type.getType(type.getType()).getOpcode(Opcodes.IASTORE);
        methodVisitor.visitInsn(opcode);

    }

}
