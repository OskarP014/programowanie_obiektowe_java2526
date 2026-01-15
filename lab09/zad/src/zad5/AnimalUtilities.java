package zad5;

public class AnimalUtilities {
    public static <T extends Animal> T findMax(T element1, T element2) {
        if (element1 == null || element2 == null) {
            throw new IllegalArgumentException("Nie moze być null");
        }

        if (element1.getAge() >= element2.getAge()) {
            return element1;
        } else {
            return element2;
        }
    }
}

