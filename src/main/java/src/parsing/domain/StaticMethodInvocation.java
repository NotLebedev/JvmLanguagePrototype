package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.Utils;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Interfaces.MethodInvocation;
import src.parsing.domain.Interfaces.Value;

import java.lang.reflect.Method;

public class StaticMethodInvocation implements MethodInvocation {

    private String methodOwnerClassName;
    private Class<?> methodOwnerClass;

    private String methodName;
    private Method method;

    private String[] paramNames;
    private Value[] paramValues;
    private Class<?>[] params;

    public void setNames(String methodOwnerClassName, String methodName, String[] paramNames) throws ClassNotFoundException, NoSuchMethodException {

        this.methodOwnerClassName = methodOwnerClassName;
        this.methodName = methodName;
        this.paramNames = paramNames;

        resolveNames();

    }

    public void setParamValues(Value[] paramValues) {
        this.paramValues = paramValues;
    }

    private void resolveNames() throws ClassNotFoundException, NoSuchMethodException {

        methodOwnerClass = Utils.classForName(methodOwnerClassName);

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
                                        Utils.getJvmClassName(methodOwnerClass),
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
    public Class<?> getType() {
        return method.getReturnType();
    }
}
