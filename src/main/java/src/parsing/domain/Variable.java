package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Accessible;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.interfaces.AbstractClass;

public class Variable implements Accessible {

    private int id;
    private final String name;

    private final AbstractClass type;

    public Variable(String typeName, String name, int id) throws ClassNotFoundException {

        this.name = name;
        this.id = id;

        type = ClassFactory.getInstance().forName(typeName);

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
    public AbstractClass getType() {
        return type;
    }
}
