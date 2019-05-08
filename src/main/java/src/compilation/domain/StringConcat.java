package src.compilation.domain;

import org.objectweb.asm.Handle;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import src.compilation.domain.exceptions.IncompatibleTypesException;
import src.compilation.domain.exceptions.StringLiteralConcatException;
import src.compilation.domain.interfaces.Value;
import src.compilation.domain.literals.StringLiteral;
import src.compilation.domain.structure.ClassFactory;
import src.compilation.domain.structure.interfaces.AbstractClass;

import java.util.LinkedList;

/**
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

        //Descriptor is built here
        StringBuilder descriptorBuilder = new StringBuilder();
        descriptorBuilder.append('(');

        elements.forEach(value ->
        {
            value.generateBytecode(methodVisitor);
            descriptorBuilder.append(value.getType().getJvmName());
        });
        descriptorBuilder.append(')');
        descriptorBuilder.append(stringType.getJvmName());

        //Arrays.stream(StringConcatFactory.class.getMethods()).filter(e -> e.getName().equals(concatMethodName)).findFirst().get();

        //Creating dynamic method handle using params specified above
        Handle handle = new Handle(methodTag,
                concatHandlerClass.getSlashName(),
                concatMethodName,
                "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;");

        methodVisitor.visitInvokeDynamicInsn(concatMethodName, descriptorBuilder.toString(), handle, "\u0001\u0001");

    }

    @Override
    public AbstractClass getType() {
        return stringType;
    }

}
