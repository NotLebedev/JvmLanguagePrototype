package src.parsing.domain.utils;

import src.parsing.domain.Variable;
import src.parsing.domain.exceptions.VariableNotFoundException;

import java.util.ArrayList;

public class VariableController {

    private final ArrayList<Variable> variables = new ArrayList<>();

    /**
     * Initializer with additional variables
     * @param variablesVisible variables to be added to list
     */
    public VariableController(ArrayList<Variable> variablesVisible) {
        variables.addAll(variablesVisible);
    }

    /**
     * Initializer for empty controller
     */
    public VariableController(){}

    public void addVariable(Variable v) {

        v.setId(variables.size());
        variables.add(v);

    }

    public int getVariableCount() {
        return variables.size();
    }

    public Variable getVariableByName(String name) throws VariableNotFoundException {

        for (Variable variable : variables) {

            if(variable.getName().equals(name))
                return variable;

        }

        throw new VariableNotFoundException("Variable " + name + " has not been declared in this scope");

    }

    public boolean hasVariable(String name) {

        for (Variable variable : variables) {

            if(variable.getName().equals(name))
                return true;

        }

        return false;

    }

}
