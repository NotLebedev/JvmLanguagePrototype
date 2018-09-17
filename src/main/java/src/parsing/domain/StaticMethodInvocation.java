package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.ReflectionMethodWrapper;
import src.parsing.domain.structure.interfaces.AbstractClass;

public class StaticMethodInvocation implements Value {

    private AbstractClass methodOwnerClass;

    private ReflectionMethodWrapper method;

    private Value[] paramValues;

    public void setNames(AbstractClass methodOwnerClass, ReflectionMethodWrapper method) {

        this.methodOwnerClass = methodOwnerClass;
        this.method = method;

    }

    /**
     *
     * @param paramValues parameter values
     */
    public void setParamValues(Value[] paramValues) {
        this.paramValues = paramValues;
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        for (Value value : paramValues) {
            value.generateBytecode(methodVisitor);
        }

        methodVisitor.visitMethodInsn(  Opcodes.INVOKESTATIC,
                                        methodOwnerClass.getSlashName(),
                                        method.getName(),
                                        method.getDescriptor(),
                                        methodOwnerClass.isInterface());

    }

    @Override
    public AbstractClass getType() {
        return method.getReturnType();
    }

}
