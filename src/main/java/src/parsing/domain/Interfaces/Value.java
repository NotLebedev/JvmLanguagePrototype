package src.parsing.domain.Interfaces;

import org.objectweb.asm.MethodVisitor;
import src.parsing.domain.structure.ReflectionClassWrapper;

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
     * @return {@link Class} which will be placed on stack
     */
    public abstract ReflectionClassWrapper getType();

}
