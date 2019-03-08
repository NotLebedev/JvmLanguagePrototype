import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.objectweb.asm.ClassWriter;
import src.parsing.antlr4Gen.Root.RootLexer;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.CodeVisitor;
import src.parsing.visitors.errorHandling.ErrorCollector;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class UpdateSampleBytecode {

    private final static String resourcesPath = "E:\\Work\\JvmLanguagePrototype\\src\\test\\java\\resources";

    private final static String sourceName = "source.lp";
    private final static String bytecodeName = "sample.byt";
    private final static String backupName = "backup.byt";

    public static void main(String[] args) {

        var startDirectory = new File(resourcesPath);
        String[] directories = startDirectory.list((dir, name) -> new File(dir, name).isDirectory());

        if(null == directories || directories.length == 0) {
            System.out.println("No tests found");
            return;
        }

        System.out.println("Found directories : ");

        for (int i = 0; i < directories.length; i++) {
            System.out.println(i + ". " + directories[i]);
        }

        System.out.println("Input number of directory to update");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        System.out.println("Confirm your choice [yes]");

        String confirmation = in.next().replaceAll("[^A-Za-z0-9]", "");

        if(!confirmation.equals("yes"))
            return;

        String path = resourcesPath + "\\" + directories[choice];

        try {
            writeBytes(readBytes( path + "\\" + bytecodeName), path + "\\" + backupName); //Backup if old bytecode exists
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            writeBytes(compile(CharStreams.fromFileName(path + "\\" + sourceName)), path + "\\" + bytecodeName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Successfully updated");

    }

    private static void writeBytes(byte[] bytes, String path) {

        try {
            OutputStream os = new FileOutputStream(path);
            os.write(bytes);
            os.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static byte[] readBytes(String path) throws IOException {

        Path fileLocation = Paths.get(path);
        return Files.readAllBytes(fileLocation);

    }

    private static byte[] compile(CharStream input) {

        RootLexer rootLexer = new RootLexer(input);

        CommonTokenStream tokenStream = new CommonTokenStream(rootLexer);
        RootParser rootParser = new RootParser(tokenStream);

        var tree = rootParser.code();

        ClassWriter classWriter = tree.accept(new CodeVisitor(new ErrorCollector()));

        return classWriter.toByteArray();

    }

}
