package src.compilation.domain;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.exceptions.IncompatibleTypesException;
import src.compilation.domain.structure.interfaces.AbstractClass;
import src.compilation.domain.structure.interfaces.AbstractConstructor;
import src.compilation.domain.utils.TypeMatcher;

public class ObjectInstantiation implements Value {

    private AbstractClass constructorOwnerClass;

    private Value[] paramValues;

    private AbstractConstructor constructor;

    public void setNames(AbstractConstructor constructor) {

        this.constructor = constructor;
        constructorOwnerClass = constructor.getOwnerClass();

    }

    /**
     * Set values of parameters, this method expects
     * param types to softMatch types of paramValues
     *
     * @param paramValues parameter values
     * @throws IllegalArgumentException class of value doe not softMatch class of parameter
     */
    public void setParamValues(Value[] paramValues) {

        var tm = TypeMatcher.getInstance();
        var sampleTypes = constructor.getParameters();

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

        methodVisitor.visitTypeInsn(Opcodes.NEW, constructorOwnerClass.getSlashName());
        methodVisitor.visitInsn(Opcodes.DUP);

        for (Value value : paramValues) {
            value.generateBytecode(methodVisitor);
        }

        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL,
                constructorOwnerClass.getSlashName(),
                "<init>",
                constructor.getDescriptor(),
                false);

    }

    @Override
    public AbstractClass getType() {
        return constructorOwnerClass;
    }

}
