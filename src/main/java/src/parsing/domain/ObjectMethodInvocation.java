package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ReflectionClassWrapper;
import src.parsing.domain.structure.ReflectionMethodWrapper;

/**
 * Class describing invoking methods of objects
 */
public class ObjectMethodInvocation implements Value {

    private Value object;
    private ReflectionClassWrapper objectClass;

    private String methodName;
    private ReflectionMethodWrapper method;

    private String[] paramNames;
    private Value[] paramValues;
    private ReflectionClassWrapper[] params;

    /**
     *
     * @param object object owning method
     * @param methodName name of method
     * @param paramNames name of param Classes
     * @throws NoSuchMethodException object class does not have such method
     * @throws ClassNotFoundException class of parameter can not be found
     */
    public void setNames(Value object, String methodName, String[] paramNames) throws NoSuchMethodException, ClassNotFoundException {

        this.object = object;
        this.methodName = methodName;
        this.paramNames = paramNames;

        resolveNames();

    }

    private void resolveNames() throws ClassNotFoundException, NoSuchMethodException {

        objectClass = object.getType();

        params = new ReflectionClassWrapper[paramNames.length];

        for (int i = 0; i < paramNames.length; i++) {
            params[i] = new ReflectionClassWrapper(paramNames[i]);
        }

        method = objectClass.getMethod(methodName, params);

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
    public ReflectionClassWrapper getType() {
        return method.getReturnType();
    }
}
