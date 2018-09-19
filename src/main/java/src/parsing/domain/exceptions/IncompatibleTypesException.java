package src.parsing.domain.exceptions;

/**
 * @author NotLebedev
 */
public class IncompatibleTypesException extends Exception {

    private String typeFound;
    private String typeExpected;

    @Deprecated (forRemoval = true)
    public IncompatibleTypesException() {
    }

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
