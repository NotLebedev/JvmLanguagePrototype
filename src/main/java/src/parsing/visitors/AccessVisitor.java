package src.parsing.visitors;

import src.compilation.domain.access.ObjectField;
import src.compilation.domain.access.StaticClassField;
import src.compilation.domain.interfaces.Scope;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.structure.ClassFactory;
import src.compilation.domain.structure.PackageO;
import src.compilation.domain.structure.interfaces.AbstractClass;
import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.visitors.errorHandling.ErrorCollector;
import src.parsing.visitors.errorHandling.errors.CanNotResolveSymbolError;
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancelationException;
import src.parsing.visitors.utils.InvalidKeyTypesException;
import src.parsing.visitors.utils.MultiKeyHashMap;

/**
 * @author NotLebedev
 */
public class AccessVisitor extends RootBaseVisitor<Value> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    private static final MultiKeyHashMap<AccessVisitor> containerMap = new MultiKeyHashMap<>(Scope.class, ErrorCollector.class);

    private AccessVisitor(Scope scope, ErrorCollector errorCollector) {

        this.scope = scope;
        this.errorCollector = errorCollector;

    }

    public static AccessVisitor getInstance(Scope scope, ErrorCollector errorCollector) {

        try {

            AccessVisitor result = containerMap.get(scope, errorCollector);

            if(result != null)
                return result;
            else {

                AccessVisitor visitor = new AccessVisitor(scope, errorCollector);
                containerMap.put(visitor, scope, errorCollector);
                return visitor;

            }

        }catch (InvalidKeyTypesException e) {
            throw new IllegalStateException("Key types expected to be correct", e);
        }

    }

    @Override
    public Value visitACCESS(RootParser.ACCESSContext ctx) {

        var val = ctx.value(0).accept(ValueVisitor.getInstance(scope, errorCollector));

        if(val instanceof PackageO && ctx.value(1).id() != null) {  // Package part may expect
            // only id to go next
            var packageO = (PackageO) val;

            String id = ctx.value(1).id().getText();

            //region Subpackage
            if(packageO.updatePath(id))
                return packageO;
            //endregion

            //region Class
            try {
                return ClassFactory.getInstance().forName(packageO.getPath() + "." + id);
            } catch (ClassNotFoundException ignored) {
                errorCollector.reportError(
                        new CanNotResolveSymbolError(ctx.value(1).id()));
                throw new ExpressionParseCancelationException();
            }
            //endregion

        } else if(val instanceof AbstractClass) {

            var classO = (AbstractClass) val;

            if(ctx.value(1).id() != null) {

                String id = ctx.value(1).id().getText();

                //region Nested class
                try {
                    return ClassFactory.getInstance().forName(classO.getName() + "$" + id);
                } catch (ClassNotFoundException ignored) {
                }
                //endregion

                //region Static field
                try {

                    var staticClassField = new StaticClassField();
                    staticClassField.setNames(classO, id);
                    return staticClassField;

                } catch (NoSuchFieldException e) {
                    errorCollector.reportError(
                            new CanNotResolveSymbolError(ctx.value(1).id()));
                    throw new ExpressionParseCancelationException();
                }
                //endregion

            }

            if(ctx.value(1).methodInv() != null) {

                //Is static method invocation
                return ctx.value(1).methodInv().accept(new MethodInvVisitor(val, true, scope, errorCollector));
                //Is static method invocation

            }

        } else { // Last case is for any object value

            if(ctx.value(1).id() != null) {


                //region Is static field
                try {

                    var staticField = new StaticClassField();
                    staticField.setNames(val.getType(), ctx.value(1).id().getText());
                    return staticField;

                } catch (NoSuchFieldException ignored) {
                } //This exception will be thrown if no such static field exists
                //In this case search for object fields will happen
                //endregion

                //Is object field
                try {

                    var objectField = new ObjectField();
                    objectField.setNames(val, ctx.value(1).id().getText());
                    return objectField;

                } catch (NoSuchFieldException e) {
                    errorCollector.reportError(
                            new CanNotResolveSymbolError(ctx.value(1).id()));
                    throw new ExpressionParseCancelationException();
                }
                //Is object field

            }

            if(ctx.value(1).methodInv() != null) {

                //Is object method invocation
                return ctx.value(1).methodInv().accept(new MethodInvVisitor(val, false, scope, errorCollector));
                //Is object method invocation

            }

        }

        throw new IllegalStateException("errorCollector must throw exception");

    }

    private class IdExtractor extends RootBaseVisitor<String> {

    }

}
