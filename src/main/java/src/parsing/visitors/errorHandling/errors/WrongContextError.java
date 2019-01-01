package src.parsing.visitors.errorHandling.errors;

import src.parsing.visitors.errorHandling.CompilationError;

/**
 * @author NotLebedev
 */
public class WrongContextError implements CompilationError {

    private final int line;
    private final int symbol;
    private final String offendingSymbol;

    public WrongContextError(int line, int symbol, String offendingSymbol) {
        this.line = line;
        this.symbol = symbol;
        this.offendingSymbol = offendingSymbol;
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
        return "Non-static method \"" + offendingSymbol + "\" can not be referenced from static context";
    }

}