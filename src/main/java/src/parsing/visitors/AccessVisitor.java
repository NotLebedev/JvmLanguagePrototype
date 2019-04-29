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

        var response = ctx.value(1).accept(ValueExtractor.getInstance());

        if(response == null) {
            errorCollector.reportError(new CanNotResolveSymbolError(ctx.start.getLine(),
                    ctx.value(1).start.getCharPositionInLine(),
                    ctx.value(1).getText()));
            throw new ExpressionParseCancelationException();
        }

        String idText = response.getStr();
        RootParser.MethodInvContext methodInv = response.getMethodInvContext();

        if(val instanceof PackageO && idText != null) {  // Package part may expect
            // only id to go next
            var packageO = (PackageO) val;

            //region Subpackage
            if(packageO.updatePath(idText))
                return packageO;
            //endregion

            //region Class
            try {
                return ClassFactory.getInstance().forName(packageO.getPath() + "." + idText);
            } catch (ClassNotFoundException ignored) {
                errorCollector.reportError(new CanNotResolveSymbolError(ctx.start.getLine(),
                        ctx.value(1).start.getCharPositionInLine(),
                        ctx.value(1).getText()));
                throw new ExpressionParseCancelationException();
            }
            //endregion

        } else if(val instanceof AbstractClass) {

            var classO = (AbstractClass) val;

            if(idText != null) {

                //region Nested class
                try {
                    return ClassFactory.getInstance().forName(classO.getName() + "$" + idText);
                } catch (ClassNotFoundException ignored) {
                }
                //endregion

                //region Static field
                try {

                    var staticClassField = new StaticClassField();
                    staticClassField.setNames(classO, idText);
                    return staticClassField;

                } catch (NoSuchFieldException e) {
                    errorCollector.reportError(new CanNotResolveSymbolError(ctx.start.getLine(),
                            ctx.value(1).start.getCharPositionInLine(),
                            ctx.value(1).getText()));
                    throw new ExpressionParseCancelationException();
                }
                //endregion

            }

            if(methodInv != null) {

                //Is static method invocation
                return methodInv.accept(new MethodInvVisitor(val, true, scope, errorCollector));
                //Is static method invocation

            }

        } else { // Last case is for any object value

            if(idText != null) {


                //region Is static field
                try {

                    var staticField = new StaticClassField();
                    staticField.setNames(val.getType(), idText);
                    return staticField;

                } catch (NoSuchFieldException ignored) {
                } //This exception will be thrown if no such static field exists
                //In this case search for object fields will happen
                //endregion

                //Is object field
                try {

                    var objectField = new ObjectField();
                    objectField.setNames(val, idText);
                    return objectField;

                } catch (NoSuchFieldException e) {
                    errorCollector.reportError(new CanNotResolveSymbolError(ctx.start.getLine(),
                            ctx.value(1).start.getCharPositionInLine(),
                            ctx.value(1).getText()));
                    throw new ExpressionParseCancelationException();
                }
                //Is object field

            }

            if(methodInv != null) {

                //Is object method invocation
                return methodInv.accept(new MethodInvVisitor(val, false, scope, errorCollector));
                //Is object method invocation

            }

        }

        throw new IllegalStateException("errorCollector must throw exception");

    }

    private static class ValueExtractor extends RootBaseVisitor<ValueExtractor.Response> {

        private class Response {

            private String str;
            private RootParser.MethodInvContext methodInvContext;

            private Response(String str) {
                this.str = str;
                this.methodInvContext = null;
            }

            private Response(RootParser.MethodInvContext methodInvContext) {
                this.methodInvContext = methodInvContext;
                this.str = null;
            }

            private String getStr() {
                return str;
            }

            private RootParser.MethodInvContext getMethodInvContext() {
                return methodInvContext;
            }

        }

        private ValueExtractor() {}

        private static class ValueExtractorLazyHolder {
            private static final ValueExtractor INSTANCE = new ValueExtractor();
        }

        public static ValueExtractor getInstance() {
            return ValueExtractorLazyHolder.INSTANCE;
        }

        @Override
        public Response visitID_LABEL(RootParser.ID_LABELContext ctx) {
            return new Response(ctx.id().getText());
        }

        @Override
        public Response visitMETHOD_INV(RootParser.METHOD_INVContext ctx) {
            return new Response(ctx.methodInv());
        }

    }

}
