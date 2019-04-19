package src.compilation.domain.structure.interfaces;

/**
 * @author NotLebedev
 */
public interface AbstractMethod {

    AbstractClass getReturnType();

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    boolean isBridge();

    String getDescriptor();

    int getModifiers();

    AbstractClass[] getParameters();

    String getName();

}
