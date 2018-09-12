import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Ignore;
import org.junit.Test;
import org.objectweb.asm.ClassWriter;
import src.parsing.antlr4Gen.Root.RootLexer;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.CodeVisitor;
import src.parsing.visitors.errorHandling.ErrorCollector;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Use this test to verify that compilation returns same result before and after changes
 *
 * @author NotLebedev
 */
public class BytecodeEqualityTest {

    private final String bytecodePath = "E:\\Work\\JvmLanguagePrototype\\src\\test\\java\\resources\\sample.byt";
    private final String backupPath = "E:\\Work\\JvmLanguagePrototype\\src\\test\\java\\resources\\backup.byt";

    private final String testCodePath = "E:\\Work\\JvmLanguagePrototype\\src\\main\\resources\\source.lp";

    @Test
    public void testBytecodeCompilationIntegrity() throws IOException {

        byte[] newBytecode = compile(CharStreams.fromFileName(testCodePath));
        byte[] oldBytecode = readBytes(bytecodePath);

        assertTrue(Arrays.equals(oldBytecode, newBytecode));

    }

    /**
     * Use this method to change sample to which bytecode is compared,
     * also stores backup of old bytecode
     */
    @Test
    @Ignore
    public void test_updateSampleBytecode() {

        try {
            writeBytes(readBytes(bytecodePath), backupPath); //Backup if old bytecode exists
        } catch (IOException ignored) {
        }

        try {
            writeBytes(compile(CharStreams.fromFileName(testCodePath)), bytecodePath);
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
