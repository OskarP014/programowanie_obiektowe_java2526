package zad7;

import java.util.Queue;

public class QueueUtils {
    public static <T> void reverseQueue(Queue<T> queue) {
        if (queue == null || queue.isEmpty()) {
            return;
        }

        T element = queue.poll();

        reverseQueue(queue);
        queue.add(element);
    }
}

