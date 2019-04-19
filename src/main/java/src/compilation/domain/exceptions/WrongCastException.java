package src.compilation.domain.exceptions;

import src.compilation.domain.structure.interfaces.AbstractClass;

/**
 * @author NotLebedev
 */
public class WrongCastException extends Exception {

    private final AbstractClass castType;
    private final AbstractClass valueType;

    public WrongCastException(AbstractClass castType, AbstractClass valueType) {

        this.castType = castType;
        this.valueType = valueType;

    }

    public AbstractClass getCastType() {
        return castType;
    }

    public AbstractClass getValueType() {
        return valueType;
    }

}
