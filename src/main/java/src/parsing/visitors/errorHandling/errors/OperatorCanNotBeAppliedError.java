package src.parsing.visitors.errorHandling.errors;

import src.parsing.visitors.errorHandling.CompilationError;

/**
 * @author NotLebedev
 */
public class OperatorCanNotBeAppliedError implements CompilationError {

    private final int line;
    private final int symbol;
    private final String offendingSymbol;
    private final String errorMessage;

    public OperatorCanNotBeAppliedError(int line, int symbol, String offendingSymbol, String errorMessage) {
        this.line = line;
        this.symbol = symbol;
        this.offendingSymbol = offendingSymbol;
        this.errorMessage = errorMessage;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getSymbol() {
        return symbol;
    }

    @Override
    public String getOffendingSymbol() {
        return offendingSymbol;
    }

    @Override
    public String getMessage() {

        return errorMessage;

    }

}
