package src.parsing.domain.utils;

import javafx.util.Pair;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.ObjectMethodInvocation;
import src.parsing.domain.StaticMethodInvocation;
import src.parsing.domain.exceptions.IncompatibleTypesException;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.interfaces.AbstractClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class used to check if two types match
 * This class checks if assignment is valid (e.g.
 * int to int, Integer to int, int to integer, byte to int, BUT
 * NOT int to float, Integer to Byte, int to long)
 * and does necessary (un)boxing
 *
 * @author NotLebedev
 */
public class TypeMatcher {

    private static TypeMatcher instance;

    private List<Pair<AbstractClass, AbstractClass>> boxingPairs;
    private List<AbstractClass> conversionGroup;

    private static final String[] singleWordGroup = {"byte", "java.lang.Byte",
                                                     "short", "java.lang.Short",
                                                     "int", "java.lang.Integer",
                                                     "char", "java.lang.Character"};

    private TypeMatcher() {

        //region init boxingPairs

        boxingPairs = new ArrayList<>(8);

        final var cf = ClassFactory.getInstance();

        boxingPairs.add(new Pair<>(cf.forCorrectName("byte"), cf.forCorrectName("java.lang.Byte")));
        boxingPairs.add(new Pair<>(cf.forCorrectName("short"), cf.forCorrectName("java.lang.Short")));
        boxingPairs.add(new Pair<>(cf.forCorrectName("int"), cf.forCorrectName("java.lang.Integer")));
        boxingPairs.add(new Pair<>(cf.forCorrectName("long"), cf.forCorrectName("java.lang.Long")));
        boxingPairs.add(new Pair<>(cf.forCorrectName("char"), cf.forCorrectName("java.lang.Character")));
        boxingPairs.add(new Pair<>(cf.forCorrectName("boolean"), cf.forCorrectName("java.lang.Boolean")));
        boxingPairs.add(new Pair<>(cf.forCorrectName("float"), cf.forCorrectName("java.lang.Float")));
        boxingPairs.add(new Pair<>(cf.forCorrectName("double"), cf.forCorrectName("java.lang.Double")));

        //endregion

        //region init conversionGroups

        conversionGroup = new ArrayList<>();
        Arrays.stream(singleWordGroup).forEach(s -> conversionGroup.add(cf.forCorrectName(s)));

        //endregion

    }

    public static TypeMatcher getInstance() {

        if(instance == null)
            instance = new TypeMatcher();

        return instance;

    }

    public boolean matches(AbstractClass sample, AbstractClass value) {

        if(sample.equals(value))
            return true;

        if(!(sample.isPrimitive()) && !(value.isPrimitive()))
            return false; //If two Objects are not of same type they can not be assigned

        if(conversionGroup.contains(sample) && conversionGroup.contains(value))
            return true; //Match by single-word conversion group
        else {

            for (Pair<AbstractClass, AbstractClass> boxingPair : boxingPairs) {

                if((boxingPair.getKey().equals(sample.getType()) && boxingPair.getValue().equals(value.getType())) ||
                        (boxingPair.getKey().equals(value.getType()) && boxingPair.getValue().equals(sample.getType())))
                    return true; //Match by (un)boxing

            }

        }

        return false; //Not a match ;(


    }

    public Value match(Value sample, Value value) throws IncompatibleTypesException {

        if(!matches(sample.getType(), value.getType())) //Throw exception if it`s not a match
            throw new IncompatibleTypesException();

        if((sample.getType().equals(value.getType())) || //If types are equal no conversion needed
           (sample.getType().isPrimitive() && value.getType().isPrimitive())) //If both are primitives, also no conversion needed
            return value;


        if(sample.getType().isPrimitive()) {
            return matchB2P(sample, value);
        }else {
            return matchP2B(sample, value);
        }

    }

    private Value matchB2P(Value sample, Value value) throws IncompatibleTypesException {

        for (Pair<AbstractClass, AbstractClass> boxingPair : boxingPairs) {

            if(boxingPair.getKey().equals(sample.getType()) && boxingPair.getValue().equals(value.getType())) {

                try {

                    var method = value.getType().getMethod(sample.getType().getName() + "Value", new AbstractClass[0]);

                    var omi = new ObjectMethodInvocation();
                    omi.setNames(value, method);
                    omi.setParamValues(new Value[0]);

                    return omi;

                } catch (NoSuchMethodException e) {
                    throw new IllegalStateException("Method expected to be found", e);
                }

            }


        }

        throw new IncompatibleTypesException();

    }

    private Value matchP2B(Value sample, Value value) throws IncompatibleTypesException {

        for (Pair<AbstractClass, AbstractClass> boxingPair : boxingPairs) {

            if(boxingPair.getKey().equals(value.getType()) && boxingPair.getValue().equals(sample.getType())) {

                try {

                    var method = sample.getType().getMethod("valueOf", new AbstractClass[]{value.getType()});

                    var smi = new StaticMethodInvocation();
                    smi.setNames(sample.getType(), method);
                    smi.setParamValues(new Value[]{value});

                    return smi;

                } catch (NoSuchMethodException e) {
                    throw new IllegalStateException("Method expected to be found", e);
                }

            }

        }

        throw new IncompatibleTypesException();

    }

}
