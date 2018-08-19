package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.*;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;

/**
 * Class responsible for visiting assignments (e.g. {@code str1 = str2})
 *
 * @author NotLebedev
 */
public class VariableAssignmentVisitor extends RootBaseVisitor<Expression> {

    private final Scope scope;

    public VariableAssignmentVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Expression visitVariableAssignment(RootParser.VariableAssignmentContext ctx) {

        Value val = ctx.value().accept(new ValueVisitor(scope));

        if(val instanceof Variable) {

            var variableAssignment = new VariableAssignement();

            var variable = ((Variable) val);

            var valueVisitor = new ValueVisitor(scope);

            var value = ctx.assignment().accept(valueVisitor);

            variableAssignment.setParams(variable, value);

            return variableAssignment;

        }

        if(val instanceof ArrayAccess) {

            var arrayAccess = ((ArrayAccess) val);

            var value = ctx.assignment().accept(new ValueVisitor(scope));

            try {
                return new ArrayAssignment(arrayAccess.getArray(), arrayAccess.getIndex(), value);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

        return null; //TODO : implement other cases

    }
}
