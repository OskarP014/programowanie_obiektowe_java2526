package zad9;

import java.util.PriorityQueue;

public class QueueMerger {

    public static <T> PriorityQueue<T> mergePriorityQueues(PriorityQueue<T> queue1, PriorityQueue<T> queue2) {
        if (queue1 == null && queue2 == null) return new PriorityQueue<>();
        if (queue1 == null) return new PriorityQueue<>(queue2);
        if (queue2 == null) return new PriorityQueue<>(queue1);

        int totalSize = queue1.size() + queue2.size();
        PriorityQueue<T> mergedQueue = new PriorityQueue<>(Math.max(1, totalSize));

        mergedQueue.addAll(queue1);
        mergedQueue.addAll(queue2);

        return mergedQueue;
    }
}
