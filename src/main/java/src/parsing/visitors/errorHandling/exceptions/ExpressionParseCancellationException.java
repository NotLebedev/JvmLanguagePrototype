package src.parsing.visitors.errorHandling.exceptions;

import java.util.concurrent.CancellationException;

/**
 * Expression to be thrown, when parsing of expression can not be continiued
 * but this does not affect the rest of method code
 *
 * @author NotLebedev
 */
public class ExpressionParseCancellationException extends CancellationException {
}
