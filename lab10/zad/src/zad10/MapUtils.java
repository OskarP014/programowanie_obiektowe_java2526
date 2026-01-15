package zad10;

import java.util.HashMap;
import java.util.Map;

public class MapUtils {

    public static <K, V> Map<V, K> reverseMap(Map<K, V> map) {
        if (map == null) {
            return new HashMap<>();
        }

        Map<V, K> reversed = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            reversed.put(entry.getValue(), entry.getKey());
        }

        return reversed;
    }
}
