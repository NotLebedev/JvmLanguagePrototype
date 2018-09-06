package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ClassO;
import src.parsing.domain.structure.ReflectionMethodContainer;

/**
 * Class describing invoking methods of objects
 */
public class ObjectMethodInvocation extends Value {

    private Value object;
    private ClassO objectClass;

    private String methodName;
    private ReflectionMethodContainer method;

    private String[] paramNames;
    private Value[] paramValues;
    private ClassO[] params;

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

        params = new ClassO[paramNames.length];

        for (int i = 0; i < paramNames.length; i++) {
            params[i] = new ClassO(paramNames[i]);
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
                throw new IllegalArgumentException("Value " + i + " type of " + paramValues[i].getTypeString() +
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
    public String getTypeString() {
        return getType().getJvmName();
    }

    @Override
    public ClassO getType() {
        return method.getReturnType();
    }
}
