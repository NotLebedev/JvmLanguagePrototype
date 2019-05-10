package src.compilation.domain;

import org.objectweb.asm.Handle;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.compilation.domain.exceptions.IncompatibleTypesException;
import src.compilation.domain.exceptions.StringLiteralConcatException;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.literals.StringLiteral;
import src.compilation.domain.literals.interfaces.Literal;
import src.compilation.domain.structure.ClassFactory;
import src.compilation.domain.structure.interfaces.AbstractClass;

import java.lang.invoke.StringConcatFactory;
import java.util.LinkedList;

/**
 * Class responsible for concatenating multiple strings
 * @author NotLebedev
 */
public class StringConcat implements Value {

    private static final AbstractClass stringType = ClassFactory.getInstance()
            .forCorrectName("java.lang.String");

    //In java 9+ string are concatenated using String concat factory and invoke dynamic construction
    private static final AbstractClass concatHandlerClass = ClassFactory.getInstance()
            .forCorrectName("java.lang.invoke.StringConcatFactory");
    //Strings will be concatenated using makeConcatWithConstants(Object ...) method
    //the first four parameters are not used, since method is called dynamically
    private static final String concatMethodName = "makeConcatWithConstants";
    //This method should be called statically
    private static final int methodTag = Opcodes.H_INVOKESTATIC;
    //Descriptor of original makeConcatWithConstants method
    private static final String bootstrapMethodDescriptor =
            "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;" +
                    "Ljava/lang/invoke/MethodType;" +
                    "Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;";

    /**
     * Tag used by makeConcatWithConstants rule to declare ordinary argument {@link StringConcatFactory}
     */
    private static final char TAG_ARG = '\u0001';

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

    private LinkedList<Value> getConcatElements() {

        LinkedList<Value> ll;

        if(str1 instanceof StringConcat)
            ll = ((StringConcat) str1).getConcatElements();
        else {
            ll = new LinkedList<>();
            ll.add(str1);
        }

        if(str2 instanceof StringConcat)
            ll.addAll(((StringConcat) str2).getConcatElements());
        else
            ll.add(str2);

        return ll;

    }

    @Override
    public void generateBytecode(MethodVisitor methodVisitor) {

        LinkedList<Value> elements = getConcatElements();

        //Build rule for concatenation
        StringBuilder concatRule = new StringBuilder();
        //Descriptor is built here
        StringBuilder descriptorBuilder = new StringBuilder();
        descriptorBuilder.append('(');

        elements.forEach(value ->
        {
            if(value instanceof Literal) { //If value is literal it can be added to concat rule
                concatRule.append(((Literal) value).getString());
            }else { //otherwise it should be passed as a parameter
                value.generateBytecode(methodVisitor);
                descriptorBuilder.append(value.getType().getJvmName());
                concatRule.append(TAG_ARG);
            }
        });
        descriptorBuilder.append(')');
        descriptorBuilder.append(stringType.getJvmName());

        //Creating dynamic method handle using params specified above
        Handle handle = new Handle(methodTag,
                concatHandlerClass.getSlashName(),
                concatMethodName,
                bootstrapMethodDescriptor);

        methodVisitor.visitInvokeDynamicInsn(concatMethodName,
                descriptorBuilder.toString(), handle, concatRule.toString());

    }

    @Override
    public AbstractClass getType() {
        return stringType;
    }

}
