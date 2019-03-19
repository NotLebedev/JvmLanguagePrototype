package src.parsing.domain.interfaces;

import org.objectweb.asm.MethodVisitor;
import src.parsing.domain.structure.interfaces.AbstractClass;

/**
 * Common interface for everything that can be treated as value
 */
public interface Value extends Expression {

    /**
     * Generates bytecode placing this value on stack
     *
     * @param methodVisitor {@link MethodVisitor}  in which bytecode will be generated
     */
    @Override
    void generateBytecode(MethodVisitor methodVisitor);

    /**
     * @return {@link Class} which will be placed on stack
     */
    AbstractClass getType();

}
