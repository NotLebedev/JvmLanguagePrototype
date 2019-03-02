package src;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.objectweb.asm.ClassWriter;
import src.parsing.antlr4Gen.Root.RootLexer;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.CodeVisitor;
import src.parsing.visitors.errorHandling.CompilationError;
import src.parsing.visitors.errorHandling.ErrorCollector;

import javax.swing.*;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class Main {

    public static void main(String[] args) {

        try {

            RootLexer rootLexer = new RootLexer(CharStreams.fromFileName("E:\\Work\\JvmLanguagePrototype\\target\\classes\\source.lp"));

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

            ///////////////////////////

            String startPath = "E:\\Work\\JvmLanguagePrototype\\target\\classes\\src";

            JFileChooser fc = new JFileChooser(startPath);
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            var result = fc.showOpenDialog(null);

            if(result != JFileChooser.APPROVE_OPTION) {
                System.err.println("File not choosed");
                return;
            }

            String classPath = fc.getSelectedFile().getAbsolutePath() + "\\Test.class";

            try {
                OutputStream os = new FileOutputStream(classPath);
                os.write(classWriter.toByteArray());
                os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
