package zad3;

public class GenericMath {
    public static <T extends Comparable<T>> T max(T[] array) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być pusta lub null");
        }

        T maxElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(maxElement) > 0) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }
}
