package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.exceptions.ArrayExpectedException;
import src.parsing.domain.exceptions.IncompatibleTypesException;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.interfaces.AbstractClass;
import src.parsing.domain.utils.TypeMatcher;

/**
 * Class describing access to arrays
 *
 * @author NotLebedev
 */
public class ArrayAccess implements Value {

    private final static AbstractClass INDEX_TYPE = ClassFactory.getInstance().forCorrectName("int");

    private final Value array;
    private final Value index;

    private AbstractClass type;

    public ArrayAccess(Value array, Value index) throws ArrayExpectedException, IncompatibleTypesException {

        this.array = array;

        this.index = TypeMatcher.getInstance().softMatch(INDEX_TYPE, index);

        if(this.array.getType().getJvmName().length() < 2) //If length of classname is less than 2 it can not be an array
            throw new ArrayExpectedException();

        String typeString = this.array.getType().getJvmName().substring(1);

        if(typeString.charAt(0) != '[' && typeString.length() > 1)
            typeString = typeString.substring(1, typeString.length() - 1).replace('/', '.');

        try {
            type = ClassFactory.getInstance().forName(typeString);
        } catch (ClassNotFoundException e) {
            throw new ArrayExpectedException();
        }

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
    public AbstractClass getType() {
        return type;
    }

}
