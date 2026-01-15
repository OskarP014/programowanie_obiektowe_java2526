package zad2;

import java.util.ArrayList;
import java.util.List;

public class SequenceTools {

    public static <T> void reversePrint(Iterable<T> items) {
        if (items == null) {
            System.out.println("Kolekcja jest równa null");
            return;
        }

        List<T> buffer = new ArrayList<>();
        for (T item : items) {
            buffer.add(item);
        }

        if (buffer.isEmpty()) {
            System.out.println("Sekwencja jest pusta");
            return;
        }

        System.out.println("Elementy w odwrotnej kolejności:");
        for (int i = buffer.size() - 1; i >= 0; i--) {
            System.out.println(buffer.get(i));
        }
    }
}
