package src.compilation.domain.access;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.compilation.domain.interfaces.Expression;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.exceptions.IncompatibleTypesException;
import src.compilation.domain.utils.TypeMatcher;

/**
 * @author NotLebedev
 */
public class StaticClassFieldAssignment implements Expression {

    private final StaticClassField field;
    private final Value value;

    public StaticClassFieldAssignment(StaticClassField field, Value value) throws IncompatibleTypesException {

        this.field = field;
        this.value = TypeMatcher.getInstance().softMatch(field.getType(), value);

    }


    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        value.generateBytecode(methodVisitor);

        methodVisitor.visitFieldInsn(Opcodes.PUTSTATIC,
                field.getField().getOwnerClass().getSlashName(),
                field.getField().getName(),
                field.getType().getJvmName());

    }

}
