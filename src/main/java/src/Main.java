package src;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import src.parsing.antlr4Gen.Root.RootLexer;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.CodeVisitor;

import javax.swing.*;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class Main implements Opcodes {

    public static void main(String[] args) {

        try{
            /*Class<?> cls = Class2.class;
            var method = cls.getMethod("getStr", (Class<?>[]) null);


            System.out.println(Utils.getClassName(method.getReturnType()));*/
            /*StaticMethodInvocation smi = new StaticMethodInvocation();
            smi.setNames("src.parsing.Class2", "getStr", new String[]{"[I", "java.lang.String", "[[J"});

            System.out.println(smi.getDescriptor());*/

            /*var classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES); // No need to use COMPUTE_MAXS as COMPUTE_FRAMES implies it

            classWriter.visit(54, ACC_PUBLIC + ACC_SUPER, "src/Test", null, "java/lang/Object", null);

            String [] str = new String[2];
            System.out.println(str.getClass().getName());

            Method method = new Method();

            Variable v = new Variable("java.lang.String", "str", 0);

            StaticMethodInvocation printSmi = new StaticMethodInvocation();
            printSmi.setNames("src.parsing.Class2", "print", new String[]{"[Ljava.lang.String;"});
            printSmi.setParamValues(new Value[]{v});

            method.addExpression(printSmi);*/

            /*method.generateBytecode(classWriter);

            classWriter.visitEnd();*/

            ///////////////////////////

            RootLexer rootLexer = new RootLexer(CharStreams.fromString("java.lang.String str = \"Hello!\"\n" +
                    "str = \"World!\"\n" +
                    "src.parsing.Class2 str2;\n" +
                    "str2.field.print()" +
                    "str2.sf.print()"));
            CommonTokenStream tokenStream = new CommonTokenStream(rootLexer);
            RootParser rootParser = new RootParser(tokenStream);

            var tree = rootParser.code();

            ClassWriter classWriter = tree.accept(new CodeVisitor());

            ///////////////////////////

            String startPath = "E:\\Work\\JvmLanguagePrototype\\target\\classes\\src";

            JFileChooser fc = new JFileChooser(startPath);
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            var result = fc.showOpenDialog(null);

            if(result != JFileChooser.APPROVE_OPTION){
                System.err.println("File not choosed");
                return;
            }

            String classPath = fc.getSelectedFile().getAbsolutePath() + "\\Test.class";

            try {
                OutputStream os = new FileOutputStream(classPath);
                os.write(classWriter.toByteArray());
                os.close();
            }catch (Exception e) {
                e.printStackTrace();
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

    }

}
