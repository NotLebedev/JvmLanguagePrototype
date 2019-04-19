package src.compilation.domain.interfaces;

import src.compilation.domain.access.Variable;
import src.compilation.domain.exceptions.VariableAlreadyDefinedException;
import src.compilation.domain.exceptions.VariableNotFoundException;

/**
 * Common interface for everything that can be treated as scope
 */
public interface Scope {

    void addVariable(Variable v) throws VariableAlreadyDefinedException;

    int getVariableCount();

    Variable getVariableByName(String name) throws VariableNotFoundException;

    boolean hasVariable(String name);

}
