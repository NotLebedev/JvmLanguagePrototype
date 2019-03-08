package src.parsing.domain.Interfaces;

import src.parsing.domain.access.Variable;
import src.parsing.domain.exceptions.VariableAlreadyDefinedException;
import src.parsing.domain.exceptions.VariableNotFoundException;

/**
 * Common interface for everything that can be treated as scope
 */
public interface Scope {

    void addVariable(Variable v) throws VariableAlreadyDefinedException;

    int getVariableCount();

    Variable getVariableByName(String name) throws VariableNotFoundException;

    boolean hasVariable(String name);

}
