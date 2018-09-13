package src.parsing.visitors.errorHandling.errors;

import src.parsing.visitors.errorHandling.CompilationError;

/**
 * @author NotLebedev
 */
public class CanNotResolveSymbolError implements CompilationError {

    private int line;
    private int symbol;
    private String offendingSymbol;

    public CanNotResolveSymbolError(int line, int symbol, String offendingSymbol) {
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
        return "Can not resolve symbol \"" + offendingSymbol + "\"";
    }

}