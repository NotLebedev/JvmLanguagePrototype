package src.parsing.visitors.errorHandling.errors;

import src.parsing.visitors.errorHandling.CompilationError;

public class WrongCastError implements CompilationError {

    private int line;
    private int symbol;
    private String offendingSymbol;
    private String castType;
    private String valueType;

    public WrongCastError(int line, int symbol, String offendingSymbol, String castType, String valueType) {

        this.line = line;
        this.symbol = symbol;
        this.offendingSymbol = offendingSymbol;
        this.castType = castType;
        this.valueType = valueType;

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
        return "Incompatible types\n\t\tType : \"" + valueType + "\" can no be cast to : \"" + castType + "\"";
    }

}
