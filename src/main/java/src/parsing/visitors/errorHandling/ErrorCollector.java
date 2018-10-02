package src.parsing.visitors.errorHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

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
     * Report error that is fatal for compilation process
     * <p>
     * This method throws {@link CancellationException}
     *
     * @param error {@link CompilationError} to be reported
     * @param e     exception to be thrown
     */
    @Deprecated
    public void reportFatalError(CompilationError error, CancellationException e) throws CancellationException {

        errors.add(error);
        throw e;

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
