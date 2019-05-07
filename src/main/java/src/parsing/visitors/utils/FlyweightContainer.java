package src.parsing.visitors.utils;

import java.lang.ref.WeakReference;
import java.util.function.Supplier;

/**
 * @author NotLebedev
 */
public class FlyweightContainer<T> {

    private final MultiKeyHashMap<WeakReference<T>> flyweightMap;
    private final Class<?>[] keyTypes;

    public FlyweightContainer(Class<?>... keyTypes) {

        this.keyTypes = keyTypes;
        this.flyweightMap = new MultiKeyHashMap<>(keyTypes);

    }

    public T getFlyweight(Supplier<T> supplier, Object... keys) throws InvalidKeyTypesException {

        WeakReference<T> result = flyweightMap.get(keys);

        if(result != null)
            return result.get();
        else {

            T flyweight = supplier.get();
            System.out.println("creating new flyweight");
            System.out.println(flyweight);
            flyweightMap.put(new WeakReference<>(flyweight), keys);
            return flyweight;

        }

    }

}
