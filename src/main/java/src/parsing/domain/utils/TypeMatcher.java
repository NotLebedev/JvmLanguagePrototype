package src.parsing.domain.utils;

import javafx.util.Pair;
import src.parsing.domain.Interfaces.Value;
import src.parsing.domain.ObjectMethodInvocation;
import src.parsing.domain.StaticMethodInvocation;
import src.parsing.domain.exceptions.IncompatibleTypesException;
import src.parsing.domain.structure.ClassFactory;
import src.parsing.domain.structure.interfaces.AbstractClass;

import java.util.ArrayList;
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

    private final List<Pair<AbstractClass, AbstractClass>> boxingPairs;

    private static final String[] conversionPairTypes = {"byte", "java.lang.Byte",
            "short", "java.lang.Short",
            "int", "java.lang.Integer",
            "char", "java.lang.Character",
            "long", "java.lang.Long",
            "boolean", "java.lang.Boolean",
            "float", "java.lang.Float",
            "double", "java.lang.Double"};
    private static final String[] singleWordGroup = {"byte", "java.lang.Byte",
            "short", "java.lang.Short",
            "int", "java.lang.Integer",
            "char", "java.lang.Character"};

    private TypeMatcher() {

        //region init boxingPairs

        boxingPairs = new ArrayList<>(8);

        final var cf = ClassFactory.getInstance();

        for (int i = 0; i < 16; i += 2) {
            boxingPairs.add(new Pair<>(cf.forCorrectName(conversionPairTypes[i]), cf.forCorrectName(conversionPairTypes[i + 1])));
        }

        //endregion

        //region init conversionGroups

        //conversionGroup = new ArrayList<>();
        //Arrays.stream(singleWordGroup).forEach(s -> conversionGroup.add(cf.forCorrectName(s)));

        //endregion

    }

    public static TypeMatcher getInstance() {

        if(instance == null)
            instance = new TypeMatcher();

        return instance;

    }

    public boolean softMatches(AbstractClass sample, AbstractClass value) {

        if(hardMatches(sample, value))
            return true;

        if(!(sample.isPrimitive()) && !(value.isPrimitive()))
            return false; //If two Objects are not of same type they can not be assigned

        //if(conversionGroup.contains(sample) && conversionGroup.contains(value))
        //    return true; //Match by single-word conversion group
        //else {

            for (Pair<AbstractClass, AbstractClass> boxingPair : boxingPairs) {

                if((boxingPair.getKey().equals(sample.getType()) && boxingPair.getValue().equals(value.getType())) ||
                        (boxingPair.getKey().equals(value.getType()) && boxingPair.getValue().equals(sample.getType())))
                    return true; //Match by (un)boxing

            }

        //}

        return false; //Not a match ;(


    }

    public boolean hardMatches(AbstractClass sample, AbstractClass value) {

        return sample.equals(value) || value.hasSuperclass(sample);

    }

    public Value hardMatch(AbstractClass sample, Value value) throws IncompatibleTypesException {

        if(!hardMatches(sample, value.getType()))
            throw new IncompatibleTypesException(sample.getName(), value.getType().getName());

        return value;

    }

    /**
     * Try matching value to sample with (un)boxing and single-word conversion.
     * Usually used in assignment
     * @param sample type to be matched to
     * @param value value to be matched
     * @return value with all necessary conversions
     * @throws IncompatibleTypesException thrown if two types can not be matched
     */
    public Value softMatch(AbstractClass sample, Value value) throws IncompatibleTypesException {

        if(!softMatches(sample, value.getType())) //Throw exception if it`s not a softMatch
            throw new IncompatibleTypesException(sample.getName(), value.getType().getName());

        if((sample.equals(value.getType())) || //If types are equal no conversion needed
                (sample.isPrimitive() && value.getType().isPrimitive()) ||  //If both are primitives, also no conversion needed
                value.getType().hasSuperclass(sample)) //If assigning to superclass no conversion is needed
            return value;


        if(sample.isPrimitive()) {
            return matchB2P(sample, value);
        } else {
            return matchP2B(sample, value);
        }

    }

    private Value matchB2P(AbstractClass sample, Value value) throws IncompatibleTypesException {

        for (Pair<AbstractClass, AbstractClass> boxingPair : boxingPairs) {

            if(boxingPair.getValue().equals(value.getType())) {

                try {

                    var method = value.getType().getMethod(boxingPair.getKey().getName() + "Value", new AbstractClass[0]);

                    var omi = new ObjectMethodInvocation();
                    omi.setNames(value, method);
                    omi.setParamValues(new Value[0]);

                    return omi;

                } catch (NoSuchMethodException e) {
                    throw new IllegalStateException("Method expected to be found", e);
                }

            }


        }

        throw new IncompatibleTypesException(sample.getName(), value.getType().getName());

    }

    private Value matchP2B(AbstractClass sample, Value value) throws IncompatibleTypesException {

        for (Pair<AbstractClass, AbstractClass> boxingPair : boxingPairs) {

            if(boxingPair.getValue().equals(sample)) {

                try {

                    var method = sample.getMethod("valueOf",
                            new AbstractClass[]{boxingPair.getKey()});

                    var smi = new StaticMethodInvocation();
                    smi.setNames(sample, method);
                    smi.setParamValues(new Value[]{value});

                    return smi;

                } catch (NoSuchMethodException e) {
                    throw new IllegalStateException("Method expected to be found", e);
                }

            }

        }

        throw new IncompatibleTypesException(sample.getName(), value.getType().getName());

    }

}
