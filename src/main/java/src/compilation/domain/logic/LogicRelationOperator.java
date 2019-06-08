package src.compilation.domain.logic;

import org.objectweb.asm.MethodVisitor;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.structure.interfaces.AbstractClass;

public class LogicRelationOperator implements Value {


    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

    }

    @Override
    public AbstractClass getType() {
        return null;
    }
}
