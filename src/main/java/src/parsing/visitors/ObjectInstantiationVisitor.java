package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.ArrayInstantiation;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.ObjectInstantiation;
import src.parsing.domain.exceptions.IncompatibleTypesException;
import src.parsing.domain.exceptions.NoSuchConstructorException;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.interfaces.AbstractClass;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.ClassNotFoundError;
import src.parsing.visitors.errorHandling.errors.IncompatibleTypesError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancelationException;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Class responsible for visiting object instantiation aka {@code new}
 *
 * @author NotLebedev
 */
public class ObjectInstantiationVisitor extends RootBaseVisitor<Value> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    public ObjectInstantiationVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    @Override
    public Value visitObjectInstantiation(RootParser.ObjectInstantiationContext ctx) {

        if(ctx.bracketOpenS() != null) {

            var objectInstantiation = new ObjectInstantiation();

            List<Value> params;

            var valueVisitor = new ValueVisitor(scope, errorCollector);

            params = ctx.value().stream()
                    .map(valueContext -> valueContext.accept(valueVisitor))
                    .collect(Collectors.toList());

            try {
                objectInstantiation.setNames(ClassFactory.getInstance().forName(ctx.arrayType().getText())
                        .getConstructor(params.stream().map(Value::getType).toArray(AbstractClass[]::new)));
            } catch (ClassNotFoundException e) {
                errorCollector.reportFatalError(
                        new ClassNotFoundError(ctx.arrayType().start.getLine(),                  //Reporting class not found
                                ctx.start.getCharPositionInLine(), ctx.arrayType().getText()),   //error
                        new ExpressionParseCancelationException());                         //This error fails compilation of expression only
            } catch (NoSuchConstructorException e) {
                e.printStackTrace();
            }

            objectInstantiation.setParamValues(params.toArray(new Value[0]));

            return objectInstantiation;

        } else {

            var dimensions = ctx.arrayIndex().stream()
                    .map(arrayIndexContext ->
                            arrayIndexContext.value().accept(new ValueVisitor(scope, errorCollector)))
                    .toArray(Value[]::new);
            var freeDimensions = ctx.arrayModifier().size();

            try {
                return new ArrayInstantiation(ClassFactory.getInstance().forName(ctx.arrayType().getText()),
                        dimensions, freeDimensions);
            } catch (ClassNotFoundException e) {
                errorCollector.reportFatalError(
                        new ClassNotFoundError(ctx.arrayType().start.getLine(),                  //Reporting class not found
                                ctx.start.getCharPositionInLine(), ctx.arrayType().getText()),   //error
                        new ExpressionParseCancelationException());                         //This error fails compilation of expression only
            } catch (IncompatibleTypesException e) {
                errorCollector.reportFatalError(
                        new IncompatibleTypesError(ctx.arrayType().start.getLine(),
                                ctx.start.getCharPositionInLine(), "[",
                                e.getTypeExpected(),
                                e.getTypeFound()),
                        new ExpressionParseCancelationException()
                );
            }

        }

        throw new IllegalStateException("visitObjectInstantiation execution should not reach this point");

    }
}
