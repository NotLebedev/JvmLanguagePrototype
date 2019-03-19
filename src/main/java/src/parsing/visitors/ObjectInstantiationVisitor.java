package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.access.ArrayInstantiation;
import src.parsing.domain.interfaces.Scope;
import src.parsing.domain.interfaces.Value;
import src.parsing.domain.ObjectInstantiation;
import src.parsing.domain.exceptions.IncompatibleTypesException;
import src.parsing.domain.exceptions.NoSuchConstructorException;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.interfaces.AbstractClass;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.ClassNotFoundError;
import src.parsing.visitors.errorHandling.errors.IncompatibleTypesError;
import src.parsing.visitors.errorHandling.errors.NoSuchMethodError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancelationException;
import src.parsing.visitors.utils.InvalidKeyTypesException;
import src.parsing.visitors.utils.MultiKeyHashMap;

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

    private static final MultiKeyHashMap<ObjectInstantiationVisitor> objectInstantiationVisitorMap = new MultiKeyHashMap<>(Scope.class, ErrorCollector.class);

    private ObjectInstantiationVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static ObjectInstantiationVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            ObjectInstantiationVisitor result = objectInstantiationVisitorMap.get(scope, errorCollector);

            if(result != null)
                return result;
            else {

                ObjectInstantiationVisitor visitor = new ObjectInstantiationVisitor(scope, errorCollector);
                objectInstantiationVisitorMap.put(visitor, scope, errorCollector);
                return visitor;

            }

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }

    @Override
    public Value visitObjectInstantiation(RootParser.ObjectInstantiationContext ctx) {

        if(ctx.bracketOpenS() != null) {

            var objectInstantiation = new ObjectInstantiation();

            List<Value> params;

            var valueVisitor = ValueVisitor.getInstance(scope, errorCollector);

            params = ctx.value().stream()
                    .map(valueContext -> valueContext.accept(valueVisitor))
                    .collect(Collectors.toList());

            try {
                objectInstantiation.setNames(ClassFactory.getInstance().forName(ctx.arrayType().getText())
                        .getConstructor(params.stream().map(Value::getType).toArray(AbstractClass[]::new)));
            } catch (ClassNotFoundException | NoClassDefFoundError ignored) {
                errorCollector.reportError(new ClassNotFoundError(ctx.arrayType().start.getLine(),
                                ctx.start.getCharPositionInLine(), ctx.arrayType().getText()));
                throw new ExpressionParseCancelationException();
            } catch (NoSuchConstructorException e) {
                errorCollector.reportError(
                        new NoSuchMethodError(ctx.arrayType().start.getLine(), ctx.arrayType().start.getCharPositionInLine(),
                                "<init>", params.stream().map(Value::getType).toArray(AbstractClass[]::new)));
                throw new ExpressionParseCancelationException();
            }

            objectInstantiation.setParamValues(params.toArray(new Value[0]));

            return objectInstantiation;

        } else {

            var dimensions = ctx.arrayIndex().stream()
                    .map(arrayIndexContext ->
                            arrayIndexContext.value().accept(ValueVisitor.getInstance(scope, errorCollector)))
                    .toArray(Value[]::new);
            var freeDimensions = ctx.arrayModifier().size();

            try {
                return new ArrayInstantiation(ClassFactory.getInstance().forName(ctx.arrayType().getText()),
                        dimensions, freeDimensions);
            } catch (ClassNotFoundException e) {
                errorCollector.reportError(
                        new ClassNotFoundError(ctx.arrayType().start.getLine(),                  //Reporting class not found
                                ctx.start.getCharPositionInLine(), ctx.arrayType().getText()));   //error
                throw new ExpressionParseCancelationException();                         //This error fails compilation of expression only
            } catch (IncompatibleTypesException e) {
                errorCollector.reportError(
                        new IncompatibleTypesError(ctx.arrayType().start.getLine(),
                                ctx.start.getCharPositionInLine(), "[",
                                e.getTypeExpected(),
                                e.getTypeFound()));
                throw new ExpressionParseCancelationException();
            }

        }

    }
}
