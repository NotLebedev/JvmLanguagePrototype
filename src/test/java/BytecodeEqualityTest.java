import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.objectweb.asm.ClassWriter;
import src.parsing.antlr4Gen.Root.RootLexer;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.CodeVisitor;
import src.parsing.visitors.errorHandling.ErrorCollector;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Use this test to verify that compilation returns same result before and after changes
 *
 * @author NotLebedev
 */
@RunWith(Parameterized.class)
public class BytecodeEqualityTest {

    private final static String resourcesPath = "target\\test-classes";

    private final static String sourceName = "source.lp";
    private final static String bytecodeName = "sample.byt";

    private final String path;
    private final String directory;

    public BytecodeEqualityTest(String directory) {
        this.directory = directory;
        this.path = resourcesPath + "\\" + directory;
    }

    @Test
    public void testBytecodeCompilationIntegrity() throws IOException {

        System.out.println("\tExecuting " + directory);

        byte[] newBytecode = compile(CharStreams.fromFileName(path + "\\" + sourceName));
        byte[] oldBytecode = readBytes(path + "\\" + bytecodeName);

        assertArrayEquals(oldBytecode, newBytecode);
        System.out.println("\tSuccess for " + directory);
        System.out.println();

    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {

        var startDirectory = new File(resourcesPath);
        String[] directories = startDirectory.list((dir, name) -> new File(dir, name).isDirectory());

        Collection<Object[]> data = new ArrayList<>(Objects.requireNonNull(directories).length);

        System.out.println("Found directories : \n");

        for (String directory : directories) {
            System.out.println(directory);
            data.add(new Object[] {directory});
        }

        System.out.println("\n-------------------------\n\nTrying executing sources contained\n");

        return data;

    }

    private byte[] readBytes(String path) throws IOException {

        Path fileLocation = Paths.get(path);
        return Files.readAllBytes(fileLocation);

    }

    private byte[] compile(CharStream input) {

        RootLexer rootLexer = new RootLexer(input);

        CommonTokenStream tokenStream = new CommonTokenStream(rootLexer);
        RootParser rootParser = new RootParser(tokenStream);

        var tree = rootParser.code();

        ClassWriter classWriter = tree.accept(new CodeVisitor(new ErrorCollector()));

        return classWriter.toByteArray();

    }

}
