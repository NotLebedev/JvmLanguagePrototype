package src.parsing.domain.Interfaces;

import src.parsing.domain.Variable;
import src.parsing.domain.VariableNotFoundException;

/**
 * Common interface for everything that can be treated as scope
 */
public interface Scope {

    void addVariable(Variable v);

    int getVariableCount();

    Variable getVariableByName(String name) throws VariableNotFoundException;

}
