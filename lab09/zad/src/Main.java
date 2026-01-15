import zad1.Box;
import zad2.Triple;
import zad3.GenericMath;
import zad4.ArrayUtils;
import zad5.Animal;
import zad5.AnimalUtilities;
import zad5.Dog;
import zad6.ForestUtils;
import zad6.Pair;
import zad6.Tree;
import zad6.Plant;
void main() {
    //1
    Box<String> stringBox = new Box<>();
    stringBox.set("67");
    String message = stringBox.get();
    System.out.println("stringBox: " + message);

    Box<Integer> integerBox = new Box<>();
    integerBox.set(89);
    int number = integerBox.get();
    System.out.println("integerBox: " + number);

    //2
    Triple<String, Integer, Double> productInfo =
            new Triple<>("Laptop", 5, 4500.99);

    String name = productInfo.getFirst();
    int stock = productInfo.getSecond();
    double price = productInfo.getThird();

    System.out.println("\nDane");
    System.out.println("Nazwa: " + name);
    System.out.println("Sztuk: " + stock);
    System.out.println("Cena:  " + price);
    System.out.println("Tekst: " + productInfo);

    //3
    Integer[] liczby = {3, 15, 7, 22, 1};
    System.out.println("\nMax: " + GenericMath.max(liczby));

    String[] owoce = {"Figa", "Zebra", "Mieta", "Wisniowka"};
    System.out.println("Max z owoców: " + GenericMath.max(owoce));

    try {
        String[] pusta = {};
        GenericMath.max(pusta);
    } catch (IllegalArgumentException e) {
        System.err.println("Błąd: " + e.getMessage());
    }

    //4
    Integer[] numbers = {10, 20, 30, 40};
    System.out.println("\nPrzed swap " + Arrays.toString(numbers));

    ArrayUtils.swap(numbers, 0, 2); // Zamiana 10 z 30
    System.out.println("Po swap " + Arrays.toString(numbers));

    String[] fruits = {"Jabłko", "Banan", "Cytryna"};
    System.out.println("Przed swap " + Arrays.toString(fruits));

    ArrayUtils.swap(fruits, 1, 2);
    System.out.println("Po swap " + Arrays.toString(fruits));

    try {
        System.out.println("Wywolanie z indeksem 10");
        ArrayUtils.swap(numbers, 0, 10);
    } catch (IndexOutOfBoundsException e) {
        System.err.println("Wyjątek: " + e.getMessage());
    }

    //5
    Dog leon = new Dog("Leon", 5);
    Dog abswan = new Dog("Abswan", 8);

    Dog starszyPies = AnimalUtilities.findMax(leon, abswan);

    System.out.println("\nPorównujemy: " + leon + " i " + abswan);
    System.out.println("Starszy pies: " + starszyPies);

    Animal kot = new Animal("Otis", 3);
    Animal starszyOgolnie = AnimalUtilities.findMax(leon, kot);

    System.out.println("Starszy między psem a kotem: " + starszyOgolnie);

    //6
    Tree[] las = {
            new Tree("Dąb", 15.5),
            new Tree("Sosna", 22.0),
            new Tree("Świerk", 12.8),
            new Tree("Brzoza", 18.2)
    };

    Pair<Tree> wynikDrzewa = new Pair<>();
    ForestUtils.findMinMaxHeight(las, wynikDrzewa);
    System.out.println("\nWynik w Pair<Tree>:  " + wynikDrzewa);

    Pair<Plant> wynikRosliny = new Pair<>();
    ForestUtils.findMinMaxHeight(las, wynikRosliny);
    System.out.println("Wynik w Pair<Plant>: " + wynikRosliny);
}

