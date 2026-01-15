package zad4;

public class ArrayUtils {
    public static <T> void swap(T[] array, int i, int j) {
        if (array == null) {
            throw new IllegalArgumentException("Tablica nie może być null.");
        }

        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            throw new IndexOutOfBoundsException(
                    String.format("Indeks poza zakresem: i=%d, j=%d, długość tablicy=%d", i, j, array.length)
            );
        }

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
