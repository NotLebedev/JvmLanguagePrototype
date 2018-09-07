package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.Interfaces.Expression;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.Variable;
import src.parsing.domain.VariableAssignment;

/**
 * Class responsible for visiting variable assignments (e.g. {@code String str})
 *
 * @author NotLebedev
 */
public class VariableDeclarationVisitor extends RootBaseVisitor<Expression> {

    private final Scope scope;

    public VariableDeclarationVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Expression visitVariableDeclaration(RootParser.VariableDeclarationContext ctx) {

        var type = ctx.declarationType().getText();
        var name = ctx.id().getText();

        Variable variable = null;

        try {
             variable = new Variable(type, name, 0);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        scope.addVariable(variable);

        if(ctx.assignment() != null) {

            var variableAssignment = new VariableAssignment();

            var valueVisitor = new ValueVisitor(scope);

            Value value = ctx.assignment().accept(valueVisitor);

            variableAssignment.setParams(variable, value);

            return variableAssignment;

        }

        return null;

    }
}
