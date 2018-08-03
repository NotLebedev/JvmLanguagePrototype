package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import src.parsing.Utils;
import src.parsing.domain.Interfaces.Value;

public class Variable extends Value {

    private int id;
    private String name;

    String typeName;
    Class<?> type;

    public Variable(String typeName, String name, int id) throws ClassNotFoundException {

        this.typeName = typeName;

        this.name = name;
        this.id = id;

        type = Utils.classForName(typeName);

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

        int opcode = Type.getType(type).getOpcode(Opcodes.ILOAD);
        methodVisitor.visitVarInsn(opcode, id);

    }

    @Override
    public String getTypeString() {
        return Utils.getClassName(getType());
    }

    @Override
    public Class<?> getType() {
        return type;
    }
}
