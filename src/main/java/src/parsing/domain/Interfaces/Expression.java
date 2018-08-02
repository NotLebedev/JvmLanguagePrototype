package src.parsing.domain.Interfaces;

import org.objectweb.asm.MethodVisitor;

/**
 * Common interface for everything that can be treated as expression
 */
public interface Expression {

    /**
     * Generates bytecode executing this expression
     * @param methodVisitor {@link MethodVisitor}  in which bytecode will be generated
     */
    void generateBytecode(MethodVisitor methodVisitor);

}
