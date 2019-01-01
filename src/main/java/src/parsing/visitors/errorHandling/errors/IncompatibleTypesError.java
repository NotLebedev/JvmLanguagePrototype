package src.parsing.visitors.errorHandling.errors;

import src.parsing.visitors.errorHandling.CompilationError;

/**
 * @author NotLebedev
 */
public class IncompatibleTypesError implements CompilationError {

    private final int line;
    private final int symbol;
    private final String offendingSymbol;
    private final String expectedType;
    private final String foundType;

    public IncompatibleTypesError(int line, int symbol, String offendingSymbol, String expectedType, String foundType) {

        this.line = line;
        this.symbol = symbol;
        this.offendingSymbol = offendingSymbol;
        this.expectedType = expectedType;
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
        return "Incompatible types\n\t\tRequired type : \"" + expectedType + "\"\n\t\tFound type : " + foundType;
    }

}
