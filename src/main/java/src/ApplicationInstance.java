package src;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.objectweb.asm.ClassWriter;
import src.exceptions.IncorrectOptionsException;
import src.interfaces.CustomRunnable;
import src.parsing.antlr4Gen.Root.RootLexer;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.CodeVisitor;
import src.parsing.visitors.errorHandling.CompilationError;
import src.parsing.visitors.errorHandling.ErrorCollector;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @author NotLebedev
 */
public class ApplicationInstance implements CustomRunnable {

    private final String[] args;

    public ApplicationInstance(String[] args) {
        this.args = args;
    }

    @Override
    public void run() throws Exception {

        CommandLineOptionsParser optionParser;

        try {
            optionParser = new CommandLineOptionsParser(args);
        }catch (IncorrectOptionsException e) {
            e.printMessage();
            return;
        }

        RootLexer rootLexer = new RootLexer(CharStreams.fromFileName(optionParser.getInput()));

        CommonTokenStream tokenStream = new CommonTokenStream(rootLexer);
        RootParser rootParser = new RootParser(tokenStream);

        var tree = rootParser.code();

        ClassWriter classWriter = null;
        var errorCollector = new ErrorCollector();

        try {
            classWriter = tree.accept(new CodeVisitor(errorCollector));
        } catch (ParseCancellationException ignored) {
        }

        if(errorCollector.getErrors().size() > 0) {

            System.out.println("Compilation failed");

            for (CompilationError error : errorCollector.getErrors()) {

                System.out.println("Error on " + error.getLine() + ":" + error.getSymbol() +
                        " offending symbol \"" + error.getOffendingSymbol() + "\"\n\t" + error.getMessage());

            }

            return;

        }

        String classPath = optionParser.getOutput();

        try {
            OutputStream os = new FileOutputStream(classPath);
            os.write(classWriter.toByteArray());
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}
