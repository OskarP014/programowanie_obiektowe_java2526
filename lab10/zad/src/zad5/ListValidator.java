package zad5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListValidator {

    public static <T> HashSet<T> findUniqueElements(List<T> list) {
        if (list == null) {
            return new HashSet<>();
        }
        return new HashSet<>(list);
    }
}
