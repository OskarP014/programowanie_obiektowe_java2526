import zad1.Shape;
import zad12.MathUtils;
import zad13.Person2;
import zad14.Person3;
import zad15.Person4;
import zad18.Person5;
import zad2.Valid;
import zad3.Action;
import zad3.Button;
import zad4.Logger;
import zad5.Task;
import zad5.Timer;
import zad8.Calculator;
import zad9.Person;

import java.util.Arrays;
import java.util.List;

import static zad10.ConsumerTest.process;


void main() {
    //1
    double width = 5.5;
    double height = 10.0;
    Shape rectangle = new Shape() {
        private final double a = width;
        private final double b = height;
        @Override
        public double area() {
            return a * b;
        }
    };
    System.out.println("Pole prostokąta (klasa anonimowa): " + rectangle.area());

    //2
    Valid passwordValidator = new Valid() {
        @Override
        public boolean isValid(String value) {
            if (value == null) return false;
            boolean hasMinLength = value.length() >= 6;
            boolean hasDigit = value.matches(".*\\d.*");
            return hasMinLength && hasDigit;
        }
    };

    String test1 = "Javsia2026";
    String test2 = "Abc1";
    String test3 = "Programowanie";

    System.out.println("\nTest " + test1 + " " + passwordValidator.isValid(test1));
    System.out.println("Test " + test2 + " " + passwordValidator.isValid(test2));
    System.out.println("Test " + test3 + " " + passwordValidator.isValid(test3));

    //3
    Button saveButton = new Button("Zapisz");

    saveButton.onClick(new Action() {
        @Override
        public void execute() {
            System.out.println("Zapisywanie danych");
            System.out.println("Dane zostały zapisane");
        }

        @Override
        public void handleError() {
            System.err.println("Nie udało się zapisać danych");
        }
    });

    //4
    Logger consoleLogger = new Logger() {
        @Override
        public void logInfo(String msg) {
            String timestamp = java.time.LocalTime.now().toString();
            System.out.println("\ninfo " + timestamp + ": " + msg);
        }

        @Override
        public void logError(String msg) {
            String timestamp = java.time.LocalTime.now().toString();
            System.err.println("error " + timestamp + ": " + msg);
        }
    };
    consoleLogger.logInfo("System uruchomiony.");
    consoleLogger.logError("Problem");

    //5
    Timer timer = new Timer();

    Task countingTask = new Task() {
        private int counter = 0;

        @Override
        public void run() {
            counter++;
            System.out.println("Stan licznika: " + counter);
        }
    };

    System.out.println("\nOdliczanie");
    timer.execute(countingTask);
    timer.execute(countingTask);
    timer.execute(countingTask);
    timer.execute(countingTask);

    //6
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());

    System.out.println("\nOryginalna lista: " + numbers);
    System.out.println("Nowa lista: " + evenNumbers);

    //7
    List<String> fruits = Arrays.asList("Figa", "Banan", "Gruszka", "Pietruszka");
    System.out.println("\nPrzed sortowaniem: " + fruits);
    fruits.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));
    System.out.println("Po sortowaniu: " + fruits);

    //8
    Calculator addition = (a, b) -> a + b;

    Calculator multiplication = (a, b) -> a * b;

    int x = 10;
    int y = 5;

    System.out.println("\nWynik dodawania " + addition.calculate(x, y));
    System.out.println("Wynik mnożenia " + multiplication.calculate(x, y));

    //9
    List<Person> people = Arrays.asList(
            new Person("Ania", 15),
            new Person("Marek", 22),
            new Person("Kasia", 17),
            new Person("Tomek", 30),
            new Person("Jan", 12)
    );

    Predicate<Person> isAdult = p -> p.getAge() >= 18;

    List<Person> adults = people.stream()
            .filter(isAdult)
            .collect(Collectors.toList());

    System.out.println("\nOsoby pełnoletnie:");
    adults.forEach(System.out::println);

    //10
    int number = 8;

    process(number, n -> System.out.println("\nKwadrat liczby " + n + " to: " + (n * n)));
    process(12, n -> System.out.println(n * n));

    //11
    List<String> names = Arrays.asList("Ania", "Jas", "Marek", "Caryca");

    System.out.println("\nLista: ");

    names.forEach(System.out::println);

    //12
    List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);

    List<Integer> squares = numbers2.stream()
            .map(MathUtils::square)
            .collect(Collectors.toList());

    System.out.println("\nLiczby: " + numbers2);
    System.out.println("Kwadrat: " + squares);

    //13
    List<Person2> people3 = Arrays.asList(
            new Person2("Anna"),
            new Person2("Jan"),
            new Person2("Marek"),
            new Person2("Katarzyna")
    );

    System.out.println("\nImiona osób:");
    people.stream()
            .map(Person::getName)
            .forEach(System.out::println);

    //14
    List<String> names3 = Arrays.asList("Ania", "Jan", "Marek", "Caryca");

    List<Person3> people4 = names3.stream()
            .map(Person3::new)
            .collect(Collectors.toList());

    System.out.println("\nUtworzona lista osób:");
    people4.forEach(System.out::println);

    //15
    List<Person4> people5 = Arrays.asList(
            new Person4("Anna", 25),
            new Person4("Jan", 30),
            new Person4("Marek", 20)
    );
    people5.sort(Comparator.comparing(Person4::getName));

    System.out.println("\nPosortowane: ");
    people5.forEach(p -> System.out.println(p.getName()));

    //16
    List<Integer> numbers5 = Arrays.asList(-5, 3, -2, 8, 0, 1, -1, 4);

    System.out.println("\nWyniki:");

    numbers5.stream()
            .filter(n -> n >= 0)
            .map(n -> n * n)
            .forEach(System.out::println);


    //17
    List<String> words = Arrays.asList("Kot", "Pies", "Programowanie", "Java");

    Optional<String> result = words.stream()
            .filter(s -> s.length() > 5)
            .findFirst();

    result.ifPresentOrElse(
            word -> System.out.println("\nZnaleziono: " + word),
            () -> System.out.println("Nie znaleziono")
    );

    //18
    List<Person5> people6 = Arrays.asList(
            new Person5("Anna", 25),
            new Person5("Jan", 30),
            new Person5("Marek", 20),
            new Person5("Katarzyna", 35)
    );

    OptionalDouble averageAge = people6.stream()
            .mapToInt(Person5::getAge)
            .average();

    if (averageAge.isPresent()) {
        System.out.printf("\nŚredni wiek: %.2f", averageAge.getAsDouble());
    } else {
        System.out.println("\nLista jest pusta");
    }

    //19
    List<Integer> numbers4 = Arrays.asList(5, 8, 12, 3, 1, 9);

    boolean allPositive = numbers4.stream()
            .allMatch(n -> n > 0);

    if (allPositive) {
        System.out.println("\nWszystkie liczby sa dodatnie");
    } else {
        System.out.println("\nNie wszystkie sa dodatnie");
    }

    //20
    List<String> fruits2 = Arrays.asList("Banan", "Jabłko", "Banan", "Arbuz", "Pietruszka", "Jabłko");

    List<String> result2 = fruits2.stream()
            .distinct()
            .sorted()
            .collect(Collectors.toList());

    System.out.println("\nOryginał: " + fruits2);
    System.out.println("Wynik:    " + result2);
}
