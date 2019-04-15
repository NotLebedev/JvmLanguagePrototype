package src.parsing.domain.math;

import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.interfaces.AbstractClass;

import java.util.ArrayList;

/**
 * @author NotLebedev
 */
public class MathUtils {

    private final static ArrayList<AbstractClass> ints;
    private final static ArrayList<AbstractClass> floats;
    private final static AbstractClass longT;

    private final static ArrayList<AbstractClass> boxed;

    static {

        var cf = ClassFactory.getInstance();

        ints = new ArrayList<>(4);
        ints.add(cf.forCorrectName("int"));
        ints.add(cf.forCorrectName("short"));
        ints.add(cf.forCorrectName("byte"));
        ints.add(cf.forCorrectName("char"));

        floats = new ArrayList<>(2);
        floats.add(cf.forCorrectName("float"));
        floats.add(cf.forCorrectName("double"));

        longT = cf.forCorrectName("long");

        boxed = new ArrayList<>(7);
        boxed.add(cf.forCorrectName("java.lang.Integer"));
        boxed.add(cf.forCorrectName("java.lang.Short"));
        boxed.add(cf.forCorrectName("java.lang.Byte"));
        boxed.add(cf.forCorrectName("java.lang.Character"));
        boxed.add(cf.forCorrectName("java.lang.Float"));
        boxed.add(cf.forCorrectName("java.lang.Double"));
        boxed.add(cf.forCorrectName("java.lang.Long"));

    }

}
