package src.parsing.visitors.errorHandling;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NotLebedev
 */
public class ErrorCollector {

    private final List<CompilationError> errors = new ArrayList<>();

    public void reportError(CompilationError error) {
        errors.add(error);
    }

    public List<CompilationError> getErrors() {
        return errors;
    }

}
