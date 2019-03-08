package src.parsing.domain.utils;

import src.parsing.domain.access.Variable;
import src.parsing.domain.exceptions.VariableAlreadyDefinedException;
import src.parsing.domain.exceptions.VariableNotFoundException;

import java.util.ArrayList;

public class VariableController {

    private final ArrayList<Variable> variables = new ArrayList<>();
    private int variableCount = 0;

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

    public void addVariable(Variable v) throws VariableAlreadyDefinedException {

        if(hasVariable(v.getName()))
            throw new VariableAlreadyDefinedException();

        v.setId(variableCount);
        variables.add(v);
        variableCount += v.isTwoWord() ? 2 : 1;

    }

    public int getVariableCount() {
        return variableCount;
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
