package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.interfaces.Value;
import src.parsing.domain.exceptions.WrongCastException;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.interfaces.AbstractClass;

/**
 * Class describing conversion of types (e.g. {@code (int) var1})
 *
 * @author NotLebedev
 */
public class TypeCast implements Value {

    private final AbstractClass castType;
    private final Value value;
    private Conversion conversion = null;

    private static final Conversion[] conversions;
    private static final String[] conversionTypes = {
        "double", "float",
        "double", "int",
        "double", "long",
        "float", "double",
        "float", "int",
        "float", "long",
        "int", "long",
        "int", "float",
        "int", "double",
        "long", "double",
        "long", "float",
        "long", "int",

        "int", "byte",
        "int", "char",
        "int", "short"
    };
    private static final int[] conversionOpcodes = {
        Opcodes.D2F,
        Opcodes.D2I,
        Opcodes.D2L,
        Opcodes.F2D,
        Opcodes.F2I,
        Opcodes.F2L,
        Opcodes.I2L,
        Opcodes.I2F,
        Opcodes.I2D,
        Opcodes.L2D,
        Opcodes.L2F,
        Opcodes.L2I,

        Opcodes.I2B,
        Opcodes.I2C,
        Opcodes.I2S
    };

    static {

        ClassFactory cf = ClassFactory.getInstance();
        conversions = new Conversion[conversionOpcodes.length];

        for (int i = 0; i < conversionOpcodes.length; i++) {
            conversions[i] = new Conversion(cf.forCorrectName(conversionTypes[i*2]),
                    cf.forCorrectName(conversionTypes[i*2 + 1]),
                    conversionOpcodes[i]);
        }

    }

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

        //If cast is valid and primitive cast is expected
        if(primitiveOk && arrayOk && castType.isPrimitive()) {

            if(!Conversion.groupOneWord(value.getType()).equals(castType)) {

                for (Conversion iter : conversions) { //Check if such primitive cast exists
                    if (iter.isMatching(valueType, castType)) {
                        conversion = iter;
                        break;
                    }
                }

                if (conversion == null)
                    return false;

            }

        }

        return primitiveOk && arrayOk; //Must follow all rules

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        value.generateBytecode(methodVisitor);

        if (!Conversion.groupOneWord(value.getType()).equals(castType)) {
            if(castType.isPrimitive()) {
                //Select conversion opcode previously selected by check cast
                methodVisitor.visitInsn(conversion.getOpcode());
            } else if (!value.getType().hasSuperclass(castType)) {
                //Downcast, needs checkcast opcode to validate
                methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, castType.getSlashName());
            }
        }

    }

    @Override
    public AbstractClass getType() {
        return castType;
    }

    private static class Conversion {

        private final AbstractClass fromType;
        private final AbstractClass toType;

        private final int opcode;

        private Conversion(AbstractClass fromType, AbstractClass toType, int opcode) {
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
        private boolean isMatching(AbstractClass from, AbstractClass to) {

            if(fromType.equals(from) && toType.equals(to)) {
                return true;
            }else {

                from = groupOneWord(from);
                to = groupOneWord(to);

                return fromType.equals(from) && toType.equals(to);

            }

        }

        private int getOpcode() {
            return opcode;
        }

        /**
         * Replaces all one word primitives (int short byte char) with int, because they share same
         * i2* opcode
         * @param abstractClass class to be grouped
         * @return replaced type
         */
        private static AbstractClass groupOneWord(AbstractClass abstractClass) {

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
