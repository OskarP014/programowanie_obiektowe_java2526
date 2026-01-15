package zad12;

import java.util.TreeMap;
import java.util.NavigableMap;

public class MapRangeUtils {

    public static <K, V> TreeMap<K, V> subMapInRange(TreeMap<K, V> map, K startKey, K endKey) {
        if (map == null || startKey == null || endKey == null) {
            return new TreeMap<>();
        }

        try {
            NavigableMap<K, V> subMapExtrakt = map.subMap(startKey, true, endKey, true);
            return new TreeMap<>(subMapExtrakt);

        } catch (IllegalArgumentException e) {
            return new TreeMap<>();
        }
    }
}
