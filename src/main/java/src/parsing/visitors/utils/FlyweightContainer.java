package src.parsing.visitors.utils;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author NotLebedev
 */
public class FlyweightContainer<T> {

    private final MultiKeyHashMap<WeakReference<T>> flyweightMap;
    private final Cache<List<Integer>, T> flyweightCache;
    private final Class<?>[] keyTypes;

    public FlyweightContainer(Class<?>... keyTypes) {

        this.keyTypes = keyTypes;
        this.flyweightMap = new MultiKeyHashMap<>(keyTypes);
        this.flyweightCache = CacheBuilder.newBuilder().weakValues().build();

    }

    public T getFlyweight(Supplier<T> supplier, Object... keys) throws InvalidKeyTypesException {

        /*WeakReference<T> result = flyweightMap.get(keys);

        if(result != null)
            return result.get();
        else {

            T flyweight = supplier.get();
            flyweightMap.put(new WeakReference<>(flyweight), keys);
            return flyweight;

        }*/
        verifyKeys(keys);
        try {
            return flyweightCache.get(Arrays.stream(keys).map(Object::hashCode).collect(Collectors.toList()), supplier::get);
        } catch (ExecutionException e) {
            throw new IllegalStateException("flyweight cache failed");
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
