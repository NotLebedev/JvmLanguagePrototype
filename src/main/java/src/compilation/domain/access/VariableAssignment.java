package src.compilation.domain.access;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.compilation.domain.interfaces.Expression;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.exceptions.IncompatibleTypesException;
import src.compilation.domain.utils.TypeMatcher;

public class VariableAssignment implements Expression {

    private Variable variable;

    private Value value;

    public void setParams(Variable variable, Value value) throws IncompatibleTypesException {

        this.variable = variable;
        this.value = TypeMatcher.getInstance().softMatch(variable.getType(), value);

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        value.generateBytecode(methodVisitor);

        int opcode = variable.getType().getOpcode(Opcodes.ISTORE);
        methodVisitor.visitVarInsn(opcode, variable.getId());

    }

}
