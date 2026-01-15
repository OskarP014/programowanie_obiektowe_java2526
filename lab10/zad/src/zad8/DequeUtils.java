package zad8;

import java.util.Deque;
import java.util.Iterator;
import java.util.Objects;

public class DequeUtils {
    public static <T> boolean isSymmetric(Deque<T> deque) {
        if (deque == null) return false;
        if (deque.size() <= 1) return true;

        Iterator<T> forward = deque.iterator();
        Iterator<T> backward = deque.descendingIterator();

        int half = deque.size() / 2;
        for (int i = 0; i < half; i++) {
            T first = forward.next();
            T last = backward.next();

            if (!Objects.equals(first, last)) {
                return false;
            }
        }

        return true;
    }
}
