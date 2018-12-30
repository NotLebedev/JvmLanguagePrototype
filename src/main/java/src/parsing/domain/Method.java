package src.parsing.domain;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.exceptions.VariableNotFoundException;
import src.parsing.domain.utils.VariableController;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * TODO: documentation, when class is more finished
 */
public class Method extends VariableController implements Scope {

    String name;

    private final ArrayList<Expression> expressions = new ArrayList<>();

    /**
     * Constructor to use, when method is static and has no fields
     * (In another words, no pre-defined fields exist)
     */
    public Method() {
        super();
    }

    /**
     * Constructor to use, when method is non-static or has fields
     * (In another words, pre-defined fields exist)
     *
     * @param variablesVisible variables
     */
    public Method(ArrayList<Variable> variablesVisible) {
        super(variablesVisible);
    }

    public void addExpression(Expression e) {
        expressions.add(e);
    }

    public ArrayList<Expression> getExpressions() {
        return expressions;
    }

    public void generateBytecode(ClassWriter classWriter) {

        var methodVisitor = classWriter.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);

        for (Expression expression : expressions) {
            expression.generateBytecode(methodVisitor);
        }

        methodVisitor.visitInsn(Opcodes.RETURN);

        methodVisitor.visitMaxs(-1, -1); // Arguments here are ignored if if ClassWriter has COMPUTE_MAXS flag
        methodVisitor.visitEnd();

    }


}
