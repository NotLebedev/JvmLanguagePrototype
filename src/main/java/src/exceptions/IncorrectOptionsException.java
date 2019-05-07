package src.exceptions;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;

public class IncorrectOptionsException extends Exception {

    private final HelpFormatter formatter;
    private final Options options;
    private final String message;

    public IncorrectOptionsException(HelpFormatter formatter, Options options, String message) {
        this.formatter = formatter;
        this.options = options;
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
        formatter.printHelp(" ", options);
    }

}
