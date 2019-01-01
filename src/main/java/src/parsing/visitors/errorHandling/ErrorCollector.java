package src.parsing.visitors.errorHandling;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NotLebedev
 */
public class ErrorCollector {

    private final List<CompilationError> errors = new ArrayList<>();

    /**
     * Report error
     * Suggested to throw exception manually
     *
     * @param error {@link CompilationError} to be reported
     */
    public void reportError(CompilationError error) {
        errors.add(error);
    }

    /**
     * Get list of all {@link CompilationError} reported to this collector
     *
     * @return list of all {@link CompilationError} reported
     */
    public List<CompilationError> getErrors() {
        return errors;
    }

}
