package src.parsing.visitors.errorHandling;

import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/**
 * @author NotLebedev
 */
public class ErrorCollector {

    private final List<CompilationError> errors = new ArrayList<>();

    /**
     * Report error that is not fatal for compilation process
     * @param error {@link CompilationError} to be reported
     */
    public void reportError(CompilationError error) {
        errors.add(error);
    }

    /**
     * Report error that is fatal for compilation process
     *
     * This method throws {@link CancellationException}
     * @param error {@link CompilationError} to be reported
     * @param e exception to be thrown
     */
    public void reportFatalError(CompilationError error, CancellationException e) {

        errors.add(error);
        throw e;

    }

    /**
     * Get list of all {@link CompilationError} reported to this collector
     * @return list of all {@link CompilationError} reported
     */
    public List<CompilationError> getErrors() {
        return errors;
    }

}
