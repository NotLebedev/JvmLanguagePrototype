package src.parsing.visitors.utils;

/**
 * @author NotLebedev
 */
public class InvalidKeyTypesException extends Exception {

    private final Integer idx;
    private final Class<?> expected;
    private final Class<?> actual;

    public InvalidKeyTypesException(Integer idx, Class<?> expected, Class<?> actual) {

        this.idx = idx;
        this.expected = expected;
        this.actual = actual;

    }

    public InvalidKeyTypesException() {

        this.idx = null;
        this.expected = null;
        this.actual = null;

    }

    public String getMessage() {

        if(actual != null && expected != null)
            return "Parameter " + idx +
                    " type of " + actual.getSimpleName() +
                    " does not match expected type " +
                    expected.getSimpleName();
        else
            return "Unequal number of keys";

    }

}
