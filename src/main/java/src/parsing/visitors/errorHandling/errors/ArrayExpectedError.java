package src.parsing.visitors.errorHandling.errors;

import src.parsing.visitors.errorHandling.CompilationError;

/**
 * @author NotLebedev
 */
public class ArrayExpectedError implements CompilationError {

    private final int line;
    private final int symbol;
    private final String offendingSymbol;
    private final String foundType;

    public ArrayExpectedError(int line, int symbol, String offendingSymbol, String foundType) {

        this.line = line;
        this.symbol = symbol;
        this.offendingSymbol = offendingSymbol;
        this.foundType = foundType;

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
        return "Array type expected, found \"" + foundType + "\"";
    }

}
