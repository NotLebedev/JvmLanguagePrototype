package src.parsing.domain.access;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.interfaces.Expression;
import src.parsing.domain.interfaces.Value;
import src.parsing.domain.exceptions.IncompatibleTypesException;
import src.parsing.domain.utils.TypeMatcher;

/**
 * @author NotLebedev
 */
public class ObjectFieldAssignment implements Expression {

    private final Value object;
    private final ObjectField field;
    private final Value value;

    public ObjectFieldAssignment(ObjectField field, Value value) throws IncompatibleTypesException {

        this.field = field;
        this.object = field.getObject();
        this.value = TypeMatcher.getInstance().softMatch(field.getType(), value);

    }


    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        value.generateBytecode(methodVisitor);
        object.generateBytecode(methodVisitor);

        methodVisitor.visitFieldInsn(Opcodes.PUTFIELD,
                field.getField().getOwnerClass().getSlashName(),
                field.getField().getName(),
                field.getType().getJvmName());

    }
}
