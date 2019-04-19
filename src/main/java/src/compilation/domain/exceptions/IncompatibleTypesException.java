package src.compilation.domain.exceptions;

/**
 * @author NotLebedev
 */
public class IncompatibleTypesException extends Exception {

    private final String typeFound;
    private final String typeExpected;

    public IncompatibleTypesException(String typeExpected, String typeFound) {
        this.typeFound = typeFound;
        this.typeExpected = typeExpected;
    }

    public String getTypeFound() {
        return typeFound;
    }

    public String getTypeExpected() {
        return typeExpected;
    }

}
