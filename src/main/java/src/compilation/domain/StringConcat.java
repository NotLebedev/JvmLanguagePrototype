package src.compilation.domain;

import org.objectweb.asm.MethodVisitor;
import src.compilation.domain.exceptions.IncompatibleTypesException;
import src.compilation.domain.exceptions.StringLiteralConcatException;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.literals.StringLiteral;
import src.compilation.domain.structure.ClassFactory;
import src.compilation.domain.structure.interfaces.AbstractClass;

/**
 * @author NotLebedev
 */
public class StringConcat implements Value {

    private static final AbstractClass stringType = ClassFactory.getInstance()
            .forCorrectName("java.lang.String");
    private final Value str1;
    private final Value str2;

    public StringConcat(Value str1, Value str2) throws StringLiteralConcatException, IncompatibleTypesException {

        if((str1 instanceof StringLiteral) && (str2 instanceof StringLiteral))
            throw new StringLiteralConcatException(
                    new StringLiteral(
                            ((StringLiteral) str1).getString() +
                                    ((StringLiteral) str2).getString())
            );

        if(!str1.getType().equals(stringType))
            throw new IncompatibleTypesException(stringType.getName(), str1.getType().getName());

        this.str1 = str1;
        this.str2 = str2;

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

    }

    @Override
    public AbstractClass getType() {
        return stringType;
    }

}
