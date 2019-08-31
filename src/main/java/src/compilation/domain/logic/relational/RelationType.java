package src.compilation.domain.logic.relational;

/**
 * @author NotLebedev
 */
public enum RelationType {

    LESS("<"),
    LESS_EQUAL("<="),
    GREATER(">"),
    GREATER_EQUAL(">="),

    EQUAL("=="),
    NOT_EQUAL("!=");

    public final String name;

    RelationType(String name) {
        this.name = name;
    }

}
