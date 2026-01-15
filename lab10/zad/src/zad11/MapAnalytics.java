package zad11;

import java.util.HashMap;
import java.util.Map;

public class MapAnalytics {

    public static <K, V> HashMap<V, Integer> countValueOccurrences(HashMap<K, V> map) {
        if (map == null) {
            return new HashMap<>();
        }

        HashMap<V, Integer> valueCounts = new HashMap<>();

        for (V value : map.values()) {
            int currentCount = valueCounts.getOrDefault(value, 0);
            valueCounts.put(value, currentCount + 1);
        }

        return valueCounts;
    }
}
