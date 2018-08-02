package src.parsing.domain;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Interfaces.Scope;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * TODO: documentation, when class is more finished
 */
public class Method implements Scope {

    String name;

    private ArrayList<Expression> expressions = new ArrayList<>();
    private ArrayList<Variable> variables = new ArrayList<>();

    /**
     * Constructor to use, when method is static and has no fields
     * (In another words, no pre-defined fields exist)
     */
    public Method(){}

    /**
     * Constructor to use, when metod is non-static or has fields
     * (In another words, pre-defined fields exist)
     * @param variablesVisible variables
     */
    public Method(Variable[] variablesVisible) {
        this.variables.addAll(Arrays.asList(variablesVisible));
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

    @Override
    public void addVariable(Variable v) {

        v.setId(variables.size());
        variables.add(v);

    }

    @Override
    public int getVariableCount() {
        return variables.size();
    }

    @Override
    public Variable getVariableByName(String name) throws VariableNotFoundException {

        for (Variable variable : variables) {

            if(variable.getName().equals(name))
                return  variable;

        }

        throw new VariableNotFoundException("Variable " + name + " has not been declared in this scoope");

    }

    @Override
    public boolean hasVariable(String name) {

        for (Variable variable : variables) {

            if(variable.getName().equals(name))
                return  true;

        }

        return false;

    }
}
