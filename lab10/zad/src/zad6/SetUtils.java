package zad6;

import java.util.TreeSet;
import java.util.NavigableSet;

public class SetUtils {
    public static <T extends Comparable<T>> TreeSet<T> findElementsInRange(TreeSet<T> set, T lowerBound, T upperBound) {
        if (set == null || lowerBound == null || upperBound == null) {
            return new TreeSet<>();
        }

        if (lowerBound.compareTo(upperBound) > 0) {
            return new TreeSet<>();
        }

        NavigableSet<T> rangeView = set.subSet(lowerBound, true, upperBound, true);

        return new TreeSet<>(rangeView);
    }
}
