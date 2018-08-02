package src.parsing.domain.Interfaces;

import org.objectweb.asm.MethodVisitor;

/**
 * Common interface for everything that can be treated as value
 */
public interface Value {

    /**
     * Generates bytecode placing this value on stack
     * @param methodVisitor {@link MethodVisitor}  in which bytecode will be generated
     */
    void generateBytecode(MethodVisitor methodVisitor);

    /**
     * @return Jvm-like formatted type {@link String}
     */
    String getTypeString();

    /**
     * @return {@link Class} which will be placed on stack
     */
    Class<?> getType();

}
