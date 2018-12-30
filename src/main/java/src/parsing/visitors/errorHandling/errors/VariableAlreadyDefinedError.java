package src.parsing.visitors.errorHandling.errors;

import src.parsing.visitors.errorHandling.CompilationError;

public class VariableAlreadyDefinedError implements CompilationError {

    private int line;
    private int symbol;
    private String offendingSymbol;

    public VariableAlreadyDefinedError(int line, int symbol, String offendingSymbol) {
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
        return "Variable \"" + offendingSymbol + "\" is" +
                " already defined in this scope";
    }

}
