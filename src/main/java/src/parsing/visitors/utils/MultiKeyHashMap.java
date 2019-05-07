package src.parsing.visitors.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author NotLebedev
 */
public class MultiKeyHashMap <T> {

    private final HashMap<List<Object>, T> map;
    private final Class<?>[] keyTypes;

    public MultiKeyHashMap(Class<?>... keyTypes) {

        this.keyTypes = keyTypes;
        this.map = new HashMap<>();

    }

    public void put(T value, Object... keys) throws InvalidKeyTypesException {

        verifyKeys(keys);
        map.put(Arrays.asList(keys), value);

    }

    public T get(Object... keys) throws InvalidKeyTypesException {

        verifyKeys(keys);
        return map.get(Arrays.asList(keys));

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
