import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Ignore;
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
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Use this test to verify that compilation returns same result before and after changes
 *
 * @author NotLebedev
 */
@RunWith(Parameterized.class)
public class BytecodeEqualityTest {

    private final static String resourcesPath = "C:\\Users\\Tema\\IdeaProjects\\JvmLanguagePrototype\\src\\test\\java\\resources";

    private final static String sourceName = "source.lp";
    private final static String bytecodeName = "sample.byt";
    private final static String backupName = "backup.byt";

    private final String path;
    private final String directory;

    public BytecodeEqualityTest(String directory) {
        this.directory = directory;
        this.path = resourcesPath + "\\" + directory;
    }

    @Test
    public void testBytecodeCompilationIntegrity() throws IOException {

        System.out.println();
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

        System.out.println("Found directories : ");

        for (String directory : directories) {
            System.out.println(directory);
            data.add(new Object[] {directory});
        }

        System.out.println("Trying executing sources contained");

        return data;

    }

    /**
     * Use this method to change sample to which bytecode is compared,
     * also stores backup of old bytecode
     */
    @Test
    @Ignore
    public void test_updateSampleBytecode() {

        try {
            writeBytes(readBytes(path + "\\" + bytecodeName), path + "\\" + backupName); //Backup if old bytecode exists
        } catch (IOException ignored) {
        }

        try {
            writeBytes(compile(CharStreams.fromFileName(path + "\\" + sourceName)), path + "\\" + bytecodeName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void writeBytes(byte[] bytes, String path) {

        try {
            OutputStream os = new FileOutputStream(path);
            os.write(bytes);
            os.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

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
