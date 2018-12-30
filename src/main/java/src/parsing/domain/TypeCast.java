package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.exceptions.WrongCastException;
import src.parsing.domain.structure.ClassFactory;
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

    /**
     * Check if this cast can be theoretically preformed
     * @param castType initial type
     * @param valueType destination type
     * @return true if cast can be preformed false otherwise
     */
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

    private class Conversion {

        private AbstractClass fromType;
        private AbstractClass toType;

        private int opcode;

        public Conversion(AbstractClass fromType, AbstractClass toType, int opcode) {
            this.fromType = fromType;
            this.toType = toType;
            this.opcode = opcode;
        }

        /**
         * Checks if this conversion is suitable for specified types
         * @param from initial type
         * @param to target type
         * @return whether conversion is suitable or not
         */
        public boolean isMatching(AbstractClass from, AbstractClass to) {

            from = groupOneWord(from);
            to = groupOneWord(to);

            return fromType.equals(from) && toType.equals(to);

        }

        /**
         * Replaces all one word primitives (int short byte char) with int, because they share same
         * i2* opcode
         * @param abstractClass class to be grouped
         * @return replaced type
         */
        private AbstractClass groupOneWord(AbstractClass abstractClass) {

            switch (abstractClass.getName()) {
                case "int":
                case "short":
                case "byte":
                case "char":
                    return ClassFactory.getInstance().forCorrectName("int");
                default:
                    return abstractClass;

            }

        }

    }

}
