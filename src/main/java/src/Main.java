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

        ApplicationRunner runner = new ApplicationRunner();
        runner.runApplication(new ApplicationInstance());

    }

}
