package src.parsing.visitors;

import src.parsing.antlr4Gen.Root.RootBaseVisitor;
import src.parsing.antlr4Gen.Root.RootParser;
import src.parsing.domain.ClassO;
import src.parsing.domain.Interfaces.Scope;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.PackageO;
import src.parsing.domain.VariableNotFoundException;

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

            if(val instanceof PackageO && ctx.value(1).id() != null) {   // Package part may expect
                                                                            // only id to go next
                //Is subpackage
                var packageO = (PackageO)val;

                if(packageO.updatePath(ctx.value(1).id().getText()))
                    return packageO;
                //Is subpackage

                //Is class
                ClassO classO;

                try {

                    classO = new ClassO(packageO.getPath() + "." + ctx.value(1).id().getText());
                    return classO;

                } catch (ClassNotFoundException ignored) {
                }
                //Is class

            }

        }

        return null;

    }

}
