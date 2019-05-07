package src.parsing.visitors.utils;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

/**
 * Class used to store flyweights (currently only different tree visitors)
 * it stores all values and keys weakly to prevent memory leaks
 * @author NotLebedev
 */
public class FlyweightContainer<T> {

    private final Cache<List<Object>, T> flyweightCache;
    private final Class<?>[] keyTypes;

    /**
     * @param keyTypes types of keys to be associated with objects
     */
    public FlyweightContainer(Class<?>... keyTypes) {

        this.keyTypes = keyTypes;
        this.flyweightCache = CacheBuilder.newBuilder()
                .weakValues()//Values to be released as soon, as tree is visited
                .weakKeys() //Since on of the keys is Method which holds whole compilation tree
                .build();   //keys should also be weak referenced to be released as code is compiled

    }

    /**
     * Get an instance of flyweight T
     * @param supplier supplier of a new T object in case no object with given keys is stored
     * @param keys keys associated with required object T
     * @return T object associated with given keys
     * @throws InvalidKeyTypesException key types given do not match key types specified on
     * construction
     */
    public T getFlyweight(Supplier<T> supplier, Object... keys) throws InvalidKeyTypesException {

        verifyKeys(keys);

        try {
            return flyweightCache.get(Arrays.asList(keys), supplier::get);
        } catch (ExecutionException e) {
            throw new IllegalStateException("Flyweight cache failed");
        }

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
