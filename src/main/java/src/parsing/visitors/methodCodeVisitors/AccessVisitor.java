package src.parsing.visitors.methodCodeVisitors;

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
import src.parsing.visitors.errorHandling.exceptions.ExpressionParseCancellationException;
import src.parsing.visitors.utils.InvalidKeyTypesException;
import src.parsing.visitors.utils.MultiKeyHashMap;

/**
 * Class used to visit dot access (e.g. {@code System.out.println()})
 * @author NotLebedev
 */
public class AccessVisitor extends RootBaseVisitor<Value> {

    private final Scope scope;
    private final ErrorCollector errorCollector;

    //region Flyweight container
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
    //endregion

    @Override
    public Value visitACCESS(RootParser.ACCESSContext ctx) {

        //Extract value to the left of the dot
        var val = ctx.value(0).accept(ValueVisitor.getInstance(scope, errorCollector));
        //Extract value to the right of the dot
        var response = ctx.value(1).accept(ValueExtractor.getInstance());
        //If it is of wrong type issue error
        if(response == null) {
            errorCollector.reportError(new CanNotResolveSymbolError(ctx.start.getLine(),
                    ctx.value(1).start.getCharPositionInLine(),
                    ctx.value(1).getText()));
            throw new ExpressionParseCancellationException();
        }
        //
        String idText = response.getStr();
        RootParser.MethodInvContext methodInv = response.getMethodInvContext();

        if(val instanceof PackageO && idText != null) { // Package part may expect
                                                        // only id to go next
            var packageO = (PackageO) val;

            //If package with given name relative to previous path exists
            if(packageO.updatePath(idText))
                return packageO;

            //Otherwise a class with given name should exist
            try {
                return ClassFactory.getInstance().forName(packageO.getPath() + "." + idText);
            } catch (ClassNotFoundException ignored) { //Or error will be issued
                errorCollector.reportError(new CanNotResolveSymbolError(ctx.start.getLine(),
                        ctx.value(1).start.getCharPositionInLine(),
                        ctx.value(1).getText()));
                throw new ExpressionParseCancellationException();
            }

        } else if(val instanceof AbstractClass) {

            var classO = (AbstractClass) val;

            if(idText != null) {

                //If nested class can be found
                try {
                    return ClassFactory.getInstance().forName(classO.getName() + "$" + idText);
                } catch (ClassNotFoundException ignored) {
                }

                //Otherwise search for a static field
                try {

                    var staticClassField = new StaticClassField();
                    staticClassField.setNames(classO, idText);
                    return staticClassField;

                } catch (NoSuchFieldException e) { //If nothing found issue error
                    errorCollector.reportError(new CanNotResolveSymbolError(ctx.start.getLine(),
                            ctx.value(1).start.getCharPositionInLine(),
                            ctx.value(1).getText()));
                    throw new ExpressionParseCancellationException();
                }

            }else if(methodInv != null) {
                //In this case it may only be static method invocation
                return methodInv.accept(new MethodInvVisitor(val, true, scope, errorCollector));
            }

        } else { // Last case is for any object value

            if(idText != null) {

                //If static field can be found
                try {

                    var staticField = new StaticClassField();
                    staticField.setNames(val.getType(), idText);
                    return staticField;

                } catch (NoSuchFieldException ignored) {
                }

                //Otherwise search for object fields
                try {

                    var objectField = new ObjectField();
                    objectField.setNames(val, idText);
                    return objectField;

                } catch (NoSuchFieldException e) {//If nothing found issue error
                    errorCollector.reportError(new CanNotResolveSymbolError(ctx.start.getLine(),
                            ctx.value(1).start.getCharPositionInLine(),
                            ctx.value(1).getText()));
                    throw new ExpressionParseCancellationException();
                }

            }else if(methodInv != null) {

                //In this case it`s a method that can be both static and dynamic
                return methodInv.accept(new MethodInvVisitor(val, false, scope, errorCollector));

            }

        }
        //This statement should be unreachable, since either methodInv or idText will be not null
        throw new IllegalStateException("errorCollector must throw exception");

    }

    /**
     * Class used to extract value to the right of the dot.
     * If value is id returns String, if method invocation returns context,
     * otherwise default RootBaseVisitor will return null
     */
    private static class ValueExtractor extends RootBaseVisitor<ValueExtractor.Response> {

        /**
         * Optional response, contains only one of two options
         */
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
