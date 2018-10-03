package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.exceptions.WrongCastException;
import src.parsing.domain.structure.interfaces.AbstractClass;

/**
 * @author NotLebedev
 */
public class TypeCast implements Value {

    private final AbstractClass castType;
    private final Value value;

    public TypeCast(AbstractClass castType, Value value) throws WrongCastException {

        this.castType = castType;
        this.value = value;

        if(!checkCast(castType, value.getType()))
            throw new WrongCastException(castType, value.getType());

    }

    private boolean checkCast(AbstractClass castType, AbstractClass valueType)  {

        //Check if both types are same category
        boolean primitiveOk = castType.isPrimitive() == valueType.isPrimitive();
        //Chack if both types are (not) arrays
        boolean arrayOk = castType.isArray() == valueType.isArray();

        return primitiveOk && arrayOk; //Must follow all rules

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        if(castType.isPrimitive()) {
            //TODO : implement primitive cast
        } else if(value.getType().hasSuperclass(castType)) {
            //Upcast is always correct, no checking required
            value.generateBytecode(methodVisitor);
        } else {

            //Downcast, needs checkcast opcode to validate
            value.generateBytecode(methodVisitor);
            methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, castType.getSlashName());

        }

    }

    @Override
    public AbstractClass getType() {
        return castType;
    }
}
