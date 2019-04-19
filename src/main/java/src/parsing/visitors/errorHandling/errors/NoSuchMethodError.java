package src.parsing.visitors.errorHandling.errors;

import src.compilation.domain.structure.interfaces.AbstractClass;
import src.parsing.visitors.errorHandling.CompilationError;

/**
 * @author NotLebedev
 */
public class NoSuchMethodError implements CompilationError {

    private final int line;
    private final int symbol;
    private final String offendingSymbol;
    private final AbstractClass[] params;

    public NoSuchMethodError(int line, int symbol, String offendingSymbol, AbstractClass[] params) {
        this.line = line;
        this.symbol = symbol;
        this.offendingSymbol = offendingSymbol;
        this.params = params;
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

        var sb = new StringBuilder();

        sb.append("No method found for name \"");
        sb.append(offendingSymbol);

        if(params.length > 0) {

            sb.append("\", and parameters :\n");

            for (AbstractClass param : params) {
                sb.append("\t\t");
                sb.append(param.getName());
                sb.append("\n");
            }

        } else {
            sb.append(", and no parameters");
        }

        return sb.toString();
    }

}
