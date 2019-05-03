package src.compilation.domain;

import org.objectweb.asm.MethodVisitor;
import src.compilation.domain.interfaces.Expression;

/**
 * Class representing expressions that do not generate any bytecode
 */
public class EmptyExpression implements Expression {
    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {
        //Since this expression is empty it generates no bytecode
    }
}
