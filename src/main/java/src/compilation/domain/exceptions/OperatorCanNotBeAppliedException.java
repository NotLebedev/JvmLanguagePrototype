package src.compilation.domain.exceptions;

import src.compilation.domain.structure.interfaces.AbstractClass;

/**
 * @author NotLebedev
 */
public class OperatorCanNotBeAppliedException extends Exception {

    private final String operator;
    private final AbstractClass type;

    public OperatorCanNotBeAppliedException(String operator, AbstractClass type) {
        this.operator = operator;
        this.type = type;
    }

    public String getMessage() {

        return "Operator '" + operator + "' can not be applied to " + type.getName();

    }

}
