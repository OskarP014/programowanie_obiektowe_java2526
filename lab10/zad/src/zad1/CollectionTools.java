package zad1;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionTools {
    public static <T> void printUnique(Collection<T> items) {
        if (items == null || items.isEmpty()) {
            System.out.println("Kolekcja jest pusta");
            return;
        }

        Set<T> uniqueItems = new HashSet<>(items);

        System.out.println("Unikalne elementy: ");
        for (T item : uniqueItems) {
            System.out.println(item);
        }
    }
}
