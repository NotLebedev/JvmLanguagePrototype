package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Interfaces.Value;

public class VariableAssignement extends Expression {

    private Variable variable;

    private Value value;

    public void setParams(Variable variable, Value value) {

        this.variable = variable;
        this.value = value;

        if(!variable.getType().equals(value.getType())) { // TODO : auto type casting/(un)boxing

            throw new IllegalArgumentException("Illegal argument exception : " + value.getTypeString()
                                                + " can not be assigned to variable type of " + variable.getTypeString());

        }

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        value.generateBytecode(methodVisitor);

        int opcode = variable.getType().getOpcode(Opcodes.ISTORE);
        methodVisitor.visitVarInsn(opcode, variable.getId());

    }

}
