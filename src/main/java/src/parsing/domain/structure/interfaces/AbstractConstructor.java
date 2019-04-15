package src.parsing.domain.structure.interfaces;

/**
 * @author NotLebedev
 */
public interface AbstractConstructor {

    AbstractClass getOwnerClass();

    AbstractClass[] getParameters();

    String getDescriptor();

}
