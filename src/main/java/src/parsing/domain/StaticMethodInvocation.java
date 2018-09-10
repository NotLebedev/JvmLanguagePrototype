package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ReflectionClassWrapper;
import src.parsing.domain.structure.ReflectionMethodWrapper;

public class StaticMethodInvocation extends Value {

    private ReflectionClassWrapper methodOwnerClass;

    private String methodName;
    private ReflectionMethodWrapper method;

    private String[] paramNames;
    private Value[] paramValues;
    private ReflectionClassWrapper[] params;

    public void setNames(ReflectionClassWrapper methodOwnerClass, String methodName, String[] paramNames) throws ClassNotFoundException, NoSuchMethodException {

        this.methodOwnerClass = methodOwnerClass;
        this.methodName = methodName;
        this.paramNames = paramNames;

        resolveNames();

    }

    /**
     *
     * @param paramValues parameter values
     * @throws IllegalArgumentException class of value doe not match class of parameter
     */
    public void setParamValues(Value[] paramValues) throws IllegalArgumentException {

        for (int i = 0; i < params.length; i++) {

            if(!paramValues[i].getType().equals(params[i])) { // TODO : auto type casting/(un)boxing
                throw new IllegalArgumentException("Value " + i + " type of " + paramValues[i].getType().getJvmName() +
                        " does not match field type of " + params[i].getJvmName());
            }

        }

        this.paramValues = paramValues;

    }

    private void resolveNames() throws ClassNotFoundException, NoSuchMethodException {

        params = new ReflectionClassWrapper[paramNames.length];

        for (int i = 0; i < paramNames.length; i++) {
            params[i] = new ReflectionClassWrapper(paramNames[i]);
        }

        method = methodOwnerClass.getMethod(methodName, params);

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
    public ReflectionClassWrapper getType() {
        return method.getReturnType();
    }

}
