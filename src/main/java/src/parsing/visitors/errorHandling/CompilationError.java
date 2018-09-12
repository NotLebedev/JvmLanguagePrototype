package src.parsing.visitors.errorHandling;

/**
 * @author NotLebedev
 */
public interface CompilationError {

    int getLine();

    int getSymbol();

    String getOffendingSymbol();

    String getMessage();

}
