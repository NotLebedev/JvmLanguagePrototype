package src.compilation.domain.exceptions;

import src.compilation.domain.literals.StringLiteral;

/**
 * Two string literals are concatenated using StringConcat and were
 * replaced by another StringLiteral
 * @author NotLebedev
 */
public class StringLiteralConcatException extends Exception {

    private final StringLiteral stringLiteral;

    public StringLiteralConcatException(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public StringLiteral getStringLiteral() {
        return stringLiteral;
    }

}
