package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.exceptions.IncompatibleTypesException;
import src.parsing.domain.structure.ReflectionMethodWrapper;
import src.parsing.domain.structure.interfaces.AbstractClass;
import src.parsing.domain.utils.TypeMatcher;

/**
 * Class describing invoking methods of objects
 */
public class ObjectMethodInvocation implements Value {

    private Value object;
    private AbstractClass objectClass;

    private ReflectionMethodWrapper method;

    private Value[] paramValues;

    /**
     * @param object object owning method
     * @param method method
     */
    public void setNames(Value object, ReflectionMethodWrapper method) {

        this.object = object;
        this.method = method;

        objectClass = object.getType();

    }

    /**
     * @param paramValues parameter values
     */
    public void setParamValues(Value[] paramValues) {

        var tm = TypeMatcher.getInstance();
        var sampleTypes = method.getParameters();

        this.paramValues = new Value[paramValues.length];

        try {

            for (int i = 0; i < paramValues.length; i++) {
                this.paramValues[i] = tm.hardMatch(sampleTypes[i], paramValues[i]);
            }

        } catch (IncompatibleTypesException e) {
            throw new IllegalStateException("paramValues expected to be correct", e);
        }

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        object.generateBytecode(methodVisitor);

        for (Value value : paramValues) {
            value.generateBytecode(methodVisitor);
        }


        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL,
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
