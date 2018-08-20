package src.parsing.domain.Interfaces;

import org.objectweb.asm.MethodVisitor;
import src.parsing.domain.ClassO;

/**
 * Common interface for everything that can be treated as value
 */
public abstract class Value extends Expression {

    /**
     * Generates bytecode placing this value on stack
     * @param methodVisitor {@link MethodVisitor}  in which bytecode will be generated
     */
    @Override
    public abstract void generateBytecode(MethodVisitor methodVisitor);

    /**
     * @return Jvm-like formatted type {@link String}
     */
    public abstract String getTypeString();

    /**
     * @return {@link Class} which will be placed on stack
     */
    public abstract ClassO getType();

}
