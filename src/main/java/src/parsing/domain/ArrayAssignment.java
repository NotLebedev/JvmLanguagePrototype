package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.exceptions.ArrayExpectedException;
import src.parsing.domain.exceptions.IncompatibleTypesException;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.interfaces.AbstractClass;
import src.parsing.domain.utils.TypeMatcher;
import src.parsing.visitors.errorHandling.errors.IncompatibleTypesError;

/**
 * Class describing storing to array elements
 *
 * @author NotLebedev
 */
public class ArrayAssignment implements Expression {

    private final static AbstractClass INDEX_TYPE = ClassFactory.getInstance().forCorrectName("int");

    private final Value array;
    private final Value index;
    private final Value value;

    private AbstractClass type;

    public ArrayAssignment(Value array, Value index, Value value) throws IncompatibleTypesException {

        this.array = array;
        this.index = TypeMatcher.getInstance().match(INDEX_TYPE, index);
        //this.value = value;

        String typeString = this.array.getType().getJvmName().substring(1);

        if(typeString.charAt(0) != '[' && typeString.length() > 1)
            typeString = typeString.substring(1, typeString.length() - 1).replace('/', '.');

        try {
            type = ClassFactory.getInstance().forName(typeString);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Array value can not be reduced to non-existing value", e);
        }

        //if(!type.equals(value.getType()))
        //    throw new IncompatibleTypesException();
        this.value = TypeMatcher.getInstance().match(type, value);

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        array.generateBytecode(methodVisitor);
        index.generateBytecode(methodVisitor);
        value.generateBytecode(methodVisitor);

        int opcode = type.getOpcode(Opcodes.IASTORE);
        methodVisitor.visitInsn(opcode);

    }

}
