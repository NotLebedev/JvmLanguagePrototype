package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ReflectionMethodWrapper;
import src.parsing.domain.structure.interfaces.AbstractClass;

/**
 * Class describing invoking methods of objects
 */
public class ObjectMethodInvocation implements Value {

    private Value object;
    private AbstractClass objectClass;

    private ReflectionMethodWrapper method;

    private Value[] paramValues;

    /**
     *
     * @param object object owning method
     * @param method method
     */
    public void setNames(Value object, ReflectionMethodWrapper method) {

        this.object = object;
        this.method = method;

        objectClass = object.getType();

    }

    /**
     *
     * @param paramValues parameter values
     * @throws IllegalArgumentException class of value doe not match class of parameter
     */
    public void setParamValues(Value[] paramValues) throws IllegalArgumentException {
        this.paramValues = paramValues;
    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        object.generateBytecode(methodVisitor);

        for (Value value : paramValues) {
            value.generateBytecode(methodVisitor);
        }


        methodVisitor.visitMethodInsn(  Opcodes.INVOKEVIRTUAL,
                                        objectClass.getSlashName(),
                                        method.getName(),
                                        method.getDescriptor(),
                                        objectClass.isInterface());

    }

    @Override
    public AbstractClass getType() {
        return method.getReturnType();
    }
}
