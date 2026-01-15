package zad10;

import java.util.function.IntConsumer;

public class ConsumerTest {

    public static void process(int value, IntConsumer action) {
        action.accept(value);
    }
}
