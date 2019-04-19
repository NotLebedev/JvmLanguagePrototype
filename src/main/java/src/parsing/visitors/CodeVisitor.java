package src.parsing.visitors;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.compilation.domain.Method;
import src.parsing.visitors.errorHandling.ErrorCollector;

/**
 * Class responsible for visiting single file aka top level visitor
 *
 * @author NotLebedev
 */
public class CodeVisitor extends RootBaseVisitor<ClassWriter> {

    private final ErrorCollector errorCollector;

    public CodeVisitor(ErrorCollector errorCollector) {
        this.errorCollector = errorCollector;
    }

    @Override
    public ClassWriter visitCode(RootParser.CodeContext ctx) {

        var classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES); // No need to use COMPUTE_MAXS as COMPUTE_FRAMES implies it

        classWriter.visit(54, Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER, "src/Test", null, "java/lang/Object", null);

        var method = new Method();

        method = ctx.methodCode().accept(MethodCodeVisitor.getInstance(method, errorCollector));

        method.generateBytecode(classWriter);

        classWriter.visitEnd();

        return classWriter;

    }
}
