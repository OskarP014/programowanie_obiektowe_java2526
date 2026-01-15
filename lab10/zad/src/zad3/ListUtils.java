package zad3;

import java.util.ArrayList;

public class ListUtils {

    public static <T> ArrayList<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2) {

        ArrayList<T> merged = new ArrayList<>(list1.size() + list2.size());

        merged.addAll(list1);
        merged.addAll(list2);

        return merged;
    }
}
