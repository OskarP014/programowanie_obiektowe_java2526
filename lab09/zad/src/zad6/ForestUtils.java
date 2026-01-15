package zad6;

public class ForestUtils {

    public static void findMinMaxHeight(Tree[] trees, Pair<? super Tree> result) {
        if (trees == null || trees.length == 0) {
            return;
        }

        Tree min = trees[0];
        Tree max = trees[0];

        for (Tree current : trees) {
            if (current.compareTo(min) < 0) {
                min = current;
            }
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }

        result.setFirst(min);
        result.setSecond(max);
    }
}