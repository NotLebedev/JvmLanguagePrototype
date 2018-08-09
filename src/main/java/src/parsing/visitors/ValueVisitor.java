package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.ClassO;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.PackageO;
import src.parsing.domain.StaticClassField;
import src.parsing.domain.VariableNotFoundException;
import src.parsing.packageManagement.ClassManagement;

public class ValueVisitor extends RootBaseVisitor<Value> {

    private final Scope scope;

    public ValueVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Value visitValue(RootParser.ValueContext ctx) {

        System.out.println();

        if(ctx.literalCG() != null) {
            return ctx.literalCG().accept(new LiteralCGVisitor());
        }

        if(ctx.id() != null) {

            try {
                return scope.getVariableByName(ctx.id().getText());
            } catch (VariableNotFoundException ignored) {
            }

            var packagePart = new PackageO();

            if(packagePart.updatePath(ctx.id().getText()))
                return packagePart;

        }

        if(ctx.objectInstantiation() != null) {
            return ctx.objectInstantiation().accept(new ObjectInstantiationVisitor(scope));
        }

        if(ctx.dotS() != null) {

            var val = ctx.value(0).accept(new ValueVisitor(scope));

            if(val instanceof PackageO && ctx.value(1).id() != null) {  // Package part may expect
                                                                        // only id to go next
                var packageO = (PackageO)val;

                String id = ctx.value(1).id().getText();

                //Is subpackage
                if(packageO.updatePath(id))
                    return packageO;
                //Is subpackage

                //Is class

                try {
                    return new ClassO(packageO.getPath() + "." + id);
                } catch (ClassNotFoundException ignored) {
                }
                //Is class

            }

            if(val instanceof ClassO) {

                var classO = (ClassO)val;

                if(ctx.value(1).id() != null) {

                    String id = ctx.value(1).id().getText();

                    //Is nested class
                    try {
                        return new ClassO(classO.getName() + "$" + id);
                    } catch (ClassNotFoundException ignored) {
                    }
                    //Is nested class

                    //Is static field
                    try {
                        var staticClassField = new StaticClassField();
                        staticClassField.setNames(classO, id);
                        return staticClassField;
                    } catch (NoSuchFieldException ignored) {
                    }
                    //Is static field

                }

            }

        }

        return null;

    }

}
