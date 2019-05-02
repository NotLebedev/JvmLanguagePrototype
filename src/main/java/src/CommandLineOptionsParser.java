package src;

import org.apache.commons.cli.*;
import src.exceptions.IncorrectOptionsException;

public class CommandLineOptionsParser {

    private final static Options options;
    private final CommandLine cmd;

    static {

        options = new Options();

        for (Opts opt : Opts.values()) {

            var input = new Option(opt.getOpt(), opt.getLongOpt(), opt.hasArg(), opt.getDescription());
            input.setRequired(opt.isRequired());
            options.addOption(input);

        }

    }

    CommandLineOptionsParser(String[] args) throws IncorrectOptionsException {

        CommandLineParser parser = new DefaultParser();

        CommandLine cmd;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            throw new IncorrectOptionsException(new HelpFormatter(), options, e.getMessage());
        }

        this.cmd = cmd;

    }

    public String getInput() {
        return getOptionValue(Opts.INPUT);
    }

    public String getOutput() {
        return getOptionValue(Opts.OUTPUT);
    }

    private String getOptionValue(Opts opt) {
        return cmd.getOptionValue(opt.longOpt);
    }

    private enum Opts {
        OUTPUT("o", "output", true, "output file", true),
        INPUT("i", "input", true, "input file", true);

        private final String opt;
        private final String longOpt;
        private final boolean hasArg;
        private final String description;
        private final boolean isRequired;

        Opts(String opt, String longOpt, boolean hasArg, String description, boolean isRequired) {
            this.opt = opt;
            this.longOpt = longOpt;
            this.hasArg = hasArg;
            this.description = description;
            this.isRequired = isRequired;
        }

        public String getOpt() {
            return opt;
        }

        public String getLongOpt() {
            return longOpt;
        }

        public boolean hasArg() {
            return hasArg;
        }

        public String getDescription() {
            return description;
        }

        public boolean isRequired() {
            return isRequired;
        }
    }

}
