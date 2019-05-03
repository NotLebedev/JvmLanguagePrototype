package src.parsing.visitors.methodCodeVisitors.ValueVisitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.compilation.domain.access.ArrayInstantiation;
import src.compilation.domain.interfaces.Scope;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.ObjectInstantiation;
import src.compilation.domain.exceptions.IncompatibleTypesException;
import src.compilation.domain.exceptions.NoSuchConstructorException;
import src.compilation.domain.structure.ClassFactory;
import src.compilation.domain.structure.interfaces.AbstractClass;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.ClassNotFoundError;
import src.parsing.visitors.errorHandling.errors.IncompatibleTypesError;
import src.parsing.visitors.errorHandling.errors.NoSuchMethodError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancellationException;
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
            //If brackets are present its object instantiation
            var objectInstantiation = new ObjectInstantiation();

            List<Value> params;

            var valueVisitor = ValueVisitor.getInstance(scope, errorCollector);
            //Fetch all params
            params = ctx.value().stream()
                    .map(valueContext -> valueContext.accept(valueVisitor))
                    .collect(Collectors.toList());
            //Try creating ObjectInstantiation with given params
            try {
                objectInstantiation.setNames(ClassFactory.getInstance().forName(ctx.arrayType().getText())
                        .getConstructor(params.stream().map(Value::getType).toArray(AbstractClass[]::new)));
            } catch (ClassNotFoundException | NoClassDefFoundError ignored) {
                errorCollector.reportError(new ClassNotFoundError(ctx.arrayType().start.getLine(),
                                ctx.start.getCharPositionInLine(), ctx.arrayType().getText()));
                throw new ExpressionParseCancellationException();
            } catch (NoSuchConstructorException e) {
                errorCollector.reportError(
                        new NoSuchMethodError(ctx.arrayType().start.getLine(), ctx.arrayType().start.getCharPositionInLine(),
                                "<init>", params.stream().map(Value::getType).toArray(AbstractClass[]::new)));
                throw new ExpressionParseCancellationException();
            }
            //If constructor is found, set parameters
            objectInstantiation.setParamValues(params.toArray(new Value[0]));

            return objectInstantiation;

        } else {
            //If brackets are not present its array instantiation
            //Calculate array dimensions
            var dimensions = ctx.arrayIndex().stream()
                    .map(arrayIndexContext ->
                            arrayIndexContext.value().accept(ValueVisitor.getInstance(scope, errorCollector)))
                    .toArray(Value[]::new);
            //Free dimensions are arrays with unspecified size (new int [3][3][][] <- last two)
            var freeDimensions = ctx.arrayModifier().size();

            try {
                return new ArrayInstantiation(ClassFactory.getInstance().forName(ctx.arrayType().getText()),
                        dimensions, freeDimensions);
            } catch (ClassNotFoundException e) {
                errorCollector.reportError(
                        new ClassNotFoundError(ctx.arrayType().start.getLine(),
                                ctx.start.getCharPositionInLine(), ctx.arrayType().getText()));
                throw new ExpressionParseCancellationException();
            } catch (IncompatibleTypesException e) {
                errorCollector.reportError(
                        new IncompatibleTypesError(ctx.arrayType().start.getLine(),
                                ctx.start.getCharPositionInLine(), "[",
                                e.getTypeExpected(),
                                e.getTypeFound()));
                throw new ExpressionParseCancellationException();
            }

        }

    }
}
