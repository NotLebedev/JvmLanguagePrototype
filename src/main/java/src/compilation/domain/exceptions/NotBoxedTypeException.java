package src.compilation.domain.exceptions;

/**
 * @author NotLebedev
 */
public class NotBoxedTypeException extends Exception {

    private final String typeFound;

    public NotBoxedTypeException(String typeFound) {
        this.typeFound = typeFound;
    }

    public String getTypeFound() {
        return typeFound;
    }

}
