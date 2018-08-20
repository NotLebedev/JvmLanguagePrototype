package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.Utils;
import src.parsing.domain.Interfaces.Value;

import java.lang.reflect.Method;

public class StaticMethodInvocation extends Value {

    private ClassO methodOwnerClass;

    private String methodName;
    private Method method;

    private String[] paramNames;
    private Value[] paramValues;
    private Class<?>[] params;

    public void setNames(ClassO methodOwnerClass, String methodName, String[] paramNames) throws ClassNotFoundException, NoSuchMethodException {

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
                throw new IllegalArgumentException("Value " + i + " type of " + paramValues[i].getTypeString() +
                        " does not match field type of " + Utils.getClassName(params[i]));
            }

        }

        this.paramValues = paramValues;

    }

    private void resolveNames() throws ClassNotFoundException, NoSuchMethodException {

        params = new Class<?>[paramNames.length];

        for (int i = 0; i < paramNames.length; i++) {
            params[i] = Utils.classForName(paramNames[i]);
        }

        method = methodOwnerClass.getMethod(methodName, params);

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        for (Value value : paramValues) {
            value.generateBytecode(methodVisitor);
        }

        methodVisitor.visitMethodInsn(  Opcodes.INVOKESTATIC,
                                        methodOwnerClass.getName().replace('.', '/'),
                                        method.getName(),
                                        getDescriptor(),
                                        methodOwnerClass.isInterface());

    }

    @Override
    public String getTypeString() {
        return Utils.getClassName(method.getReturnType());
    }

    public String getDescriptor() {

        StringBuilder sb = new StringBuilder();
        sb.append("(");

        for (Class<?> param : params) {
            sb.append(Utils.getClassName(param));
        }

        sb.append(")");

        sb.append(getTypeString());

        return sb.toString();

    }

    @Override
    public ClassO getType() {
        return method.getReturnType();
    }

}
