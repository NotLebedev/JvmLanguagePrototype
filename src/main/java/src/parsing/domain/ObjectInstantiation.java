package src.parsing.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.structure.ReflectionClassWrapper;

public class ObjectInstantiation extends Value {

    private String constructorOwnerClassName;
    private ReflectionClassWrapper constructorOwnerClass;

    private String[] paramNames;
    private Value[] paramValues;
    private ReflectionClassWrapper[] params;

    public void setNames(String constructorOwnerClassName, String[] paramNames) throws ClassNotFoundException {

        this.constructorOwnerClassName = constructorOwnerClassName;
        this.paramNames = paramNames;

        resolveNames();

    }

    private void resolveNames() throws ClassNotFoundException {

        constructorOwnerClass = new ReflectionClassWrapper(constructorOwnerClassName);

        params = new ReflectionClassWrapper[paramNames.length];

        for (int i = 0; i < paramNames.length; i++) {
            params[i] = new ReflectionClassWrapper(paramNames[i]);
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
                        " does not match field type of " + params[i].getJvmName());
            }

        }

        this.paramValues = paramValues;

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        methodVisitor.visitTypeInsn(Opcodes.NEW, constructorOwnerClass.getSlashName());
        methodVisitor.visitInsn(Opcodes.DUP);

        for (Value value : paramValues) {
            value.generateBytecode(methodVisitor);
        }

        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL,
                constructorOwnerClass.getSlashName(),
                "<init>",
                getDescriptor(),
                false);

    }

    private String getDescriptor() {

        StringBuilder sb = new StringBuilder();
        sb.append("(");

        for (ReflectionClassWrapper param : params) {
            sb.append(param.getJvmName());
        }

        sb.append(")");

        sb.append("V");

        return sb.toString();

    }

    @Override
    public String getTypeString() {
        return getType().getJvmName();
    }

    @Override
    public ReflectionClassWrapper getType() {
        return constructorOwnerClass;
    }

}
