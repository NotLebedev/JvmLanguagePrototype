package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.exceptions.IncompatibleTypesException;
import src.parsing.domain.structure.ReflectionMethodWrapper;
import src.parsing.domain.structure.interfaces.AbstractClass;
import src.parsing.domain.utils.TypeMatcher;

public class StaticMethodInvocation implements Value {

    private AbstractClass methodOwnerClass;

    private ReflectionMethodWrapper method;

    private Value[] paramValues;

    public void setNames(AbstractClass methodOwnerClass, ReflectionMethodWrapper method) {

        this.methodOwnerClass = methodOwnerClass;
        this.method = method;

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
                this.paramValues[i] = tm.match(sampleTypes[i], paramValues[i]);
            }

        } catch (IncompatibleTypesException e) {
            throw new IllegalStateException("paramValues expected to be correct", e);
        }

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        for (Value value : paramValues) {
            value.generateBytecode(methodVisitor);
        }

        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC,
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
