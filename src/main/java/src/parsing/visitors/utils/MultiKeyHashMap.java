package src.parsing.visitors.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author NotLebedev
 */
public class MultiKeyHashMap <T> {

    private final HashMap<List<Integer>, T> map;
    private final Class<?>[] keyTypes;

    public MultiKeyHashMap(Class<?>... keyTypes) {

        this.keyTypes = keyTypes;
        this.map = new HashMap<>();

    }

    public void put(T value, Object... keys) throws InvalidKeyTypesException {

        verifyKeys(keys);
        map.put(Arrays.stream(keys).map(Object::hashCode).collect(Collectors.toList()), value);

    }

    public T get(Object... keys) throws InvalidKeyTypesException {

        verifyKeys(keys);
        return map.get(Arrays.stream(keys).map(Object::hashCode).collect(Collectors.toList()));

    }

    private void verifyKeys(Object[] keys) throws InvalidKeyTypesException {

        if(keys.length != keyTypes.length)
            throw new InvalidKeyTypesException();

        for(int i = 0; i < keys.length; i++) {

            try {
                keys[i].getClass().asSubclass(keyTypes[i]);
            }catch (ClassCastException ignored) {
                throw new InvalidKeyTypesException(i, keyTypes[i], keys[i].getClass());
            }

        }

    }

}
