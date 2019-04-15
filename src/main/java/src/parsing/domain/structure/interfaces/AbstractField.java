package src.parsing.domain.structure.interfaces;

/**
 * @author NotLebedev
 */
public interface AbstractField {

    String getName();

    boolean isStatic();

    AbstractClass getOwnerClass();

    AbstractClass getType();

}
