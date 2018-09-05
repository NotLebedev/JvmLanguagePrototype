package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ClassO;

public class Variable extends Value {

    private int id;
    private final String name;

    private final String typeName;
    private ClassO type;

    public Variable(String typeName, String name, int id) throws ClassNotFoundException {

        this.typeName = typeName;

        this.name = name;
        this.id = id;

        type = new ClassO(typeName);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        int opcode = type.getOpcode(Opcodes.ILOAD);
        methodVisitor.visitVarInsn(opcode, id);

    }

    @Override
    public String getTypeString() {
        return getType().getName();
    }

    public ClassO getWrappedType() {
        return type;
    }

    @Override
    public ClassO getType() {
        return type.getType();
    }
}
