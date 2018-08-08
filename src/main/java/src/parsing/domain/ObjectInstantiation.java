package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.Utils;
import src.parsing.domain.Interfaces.Value;

public class ObjectInstantiation extends Value {

    private String constructorOwnerClassName;
    private Class<?> constructorOwnerClass;

    private String[] paramNames;
    private Value[] paramValues;
    private Class<?>[] params;

    public void setNames(String constructorOwnerClassName, String[] paramNames) throws NoSuchMethodException, ClassNotFoundException {

        this.constructorOwnerClassName = constructorOwnerClassName;
        this.paramNames = paramNames;

        resolveNames();

    }

    private void resolveNames() throws ClassNotFoundException, NoSuchMethodException {

        constructorOwnerClass = Utils.classForName(constructorOwnerClassName);

        params = new Class<?>[paramNames.length];

        for (int i = 0; i < paramNames.length; i++) {
            params[i] = Utils.classForName(paramNames[i]);
        }

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

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        methodVisitor.visitTypeInsn(Opcodes.NEW, Utils.getJvmClassName(constructorOwnerClass));
        methodVisitor.visitInsn(Opcodes.DUP);

        for (Value value : paramValues) {
            value.generateBytecode(methodVisitor);
        }

        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL,
                Utils.getJvmClassName(constructorOwnerClass),
                "<init>",
                getDescriptor(),
                false);

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
    public String getTypeString() {
        return Utils.getClassName(getType());
    }

    @Override
    public Class<?> getType() {
        return constructorOwnerClass;
    }

}
