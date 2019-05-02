package src.compilation.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.compilation.domain.interfaces.Expression;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.structure.ClassFactory;
import src.compilation.domain.structure.interfaces.AbstractClass;

import java.util.Arrays;
import java.util.List;

/**
 * This class is used to represent operations that leave
 * values on stack as expressions (e.g. {@code i++;})
 * This wrapper generates code of value and adds pop or pop2
 * opcode according to value type
 */
public class ValueAsExpressionHolder implements Expression {

    private final Value containedValue;
    private final boolean is2Word;
    private final boolean notVoid;

    private final static List<AbstractClass> types2Word = Arrays.asList(
            ClassFactory.getInstance().forCorrectName("long"),
            ClassFactory.getInstance().forCorrectName("double")
    );
    private final static AbstractClass voidType = ClassFactory.getInstance().forCorrectName("void");

    public ValueAsExpressionHolder(Value containedValue) {

        this.containedValue = containedValue;
        notVoid = !voidType.equals(containedValue.getType());
        is2Word = types2Word.contains(containedValue.getType());

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        containedValue.generateBytecode(methodVisitor);
        if(notVoid)
            methodVisitor.visitInsn(is2Word ? Opcodes.POP2 : Opcodes.POP);

    }

}
