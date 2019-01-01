package src.parsing.visitors.errorHandling.errors;

import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.errorHandling.CompilationError;

/**
 * @author NotLebedev
 */
public class CanNotResolveSymbolError implements CompilationError {

    private final int line;
    private final int symbol;
    private final String offendingSymbol;

    public CanNotResolveSymbolError(RootParser.IdContext ctx) {

        this.line = ctx.start.getLine();
        this.symbol = ctx.start.getCharPositionInLine();
        this.offendingSymbol = ctx.getText();

    }

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