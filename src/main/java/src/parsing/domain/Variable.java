package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import src.parsing.Utils;
import src.parsing.domain.Interfaces.Value;

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

        int opcode = Type.getType(type.getType()).getOpcode(Opcodes.ILOAD);
        methodVisitor.visitVarInsn(opcode, id);

    }

    @Override
    public String getTypeString() {
        return Utils.getClassName(getType());
    }

    public ClassO getWrappedType() {
        return type;
    }

    @Override
    public Class<?> getType() {
        return type.getType();
    }
}
