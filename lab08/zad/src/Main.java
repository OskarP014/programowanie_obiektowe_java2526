import Zad2.Product;
import zad1.Student;
import zad3.Osoba;
import zad3.WiekComparator;
import zad4.CustomerNameComparator;
import zad4.Order;
import zad4.OrderDateComparator;
import zad5.Cat;
import zad5.Dog;
import zad5.LoudAnimal;
import zad6.Circle;
import zad6.Drawable;

void main() {
    //1
    List<Student> listaStudentow = new ArrayList<>();
    listaStudentow.add(new Student("Jan Kowalski", 4.5, 2002));
    listaStudentow.add(new Student("Ania Nowak", 4.9, 2001));
    listaStudentow.add(new Student("Piotr Zielinski", 3.2, 2003));
    listaStudentow.add(new Student("Marta Szczepan", 4.75, 2002));
    listaStudentow.add(new Student("Krzysztof Konon", 3.8, 2000));

    System.out.println("Lista przed sortowaniem");
    for (Student s : listaStudentow) System.out.println(s);

    Collections.sort(listaStudentow);

    System.out.println("\nLista po sortowaniu");
    for (Student s : listaStudentow) System.out.println(s);

    //2
    List<Product> magazyn = new ArrayList<>();

    magazyn.add(new Product("Mleko", 4.50, LocalDate.of(2026, 1, 15)));
    magazyn.add(new Product("Ser", 25.00, LocalDate.of(2026, 2, 10)));
    magazyn.add(new Product("Jogurcik", 2.20, LocalDate.of(2026, 1, 20)));

    magazyn.add(new Product("Szynka", 3.50, LocalDate.of(2026, 1, 20)));
    magazyn.add(new Product("Masło", 7.00, LocalDate.of(2026, 3, 01)));

    System.out.println("\nMagazyn przed sortowaniem");
    magazyn.forEach(System.out::println);

    Collections.sort(magazyn);

    System.out.println("\nMagazyn po sortowaniu");
    magazyn.forEach(System.out::println);

    //3
    Osoba[] osoby = new Osoba[5];
    osoby[0] = new Osoba("Jan", 35, 180.5);
    osoby[1] = new Osoba("Anna", 22, 165.0);
    osoby[2] = new Osoba("Piotr", 40, 175.2);
    osoby[3] = new Osoba("Marta", 19, 170.0);
    osoby[4] = new Osoba("Krzysztof", 28, 188.4);

    System.out.println("\nPrzed sortowaniem");
    for (Osoba o : osoby) System.out.println(o);

    Arrays.sort(osoby, new WiekComparator());

    System.out.println("\nPo sortowaniu");
    for (Osoba o : osoby) System.out.println(o);

    //4
    List<Order> zamowienia = new ArrayList<>();
    zamowienia.add(new Order(1, "Zieliński", LocalDate.of(2026, 1, 5)));
    zamowienia.add(new Order(2, "Adamski",   LocalDate.of(2026, 1, 10)));
    zamowienia.add(new Order(3, "Nowak",     LocalDate.of(2026, 1, 5))); // Ta sama data co ID 1
    zamowienia.add(new Order(4, "Kowalski",  LocalDate.of(2026, 1, 8)));
    zamowienia.add(new Order(5, "Bąk",       LocalDate.of(2026, 1, 10))); // Ta sama data co ID 2

    System.out.println("\nZamówienia przed sortowaniem");
    zamowienia.forEach(System.out::println);

    Comparator<Order> wielopoziomowyComparator = new OrderDateComparator()
            .thenComparing(new CustomerNameComparator());

    zamowienia.sort(wielopoziomowyComparator);

    System.out.println("\nPo sortowaniu");
    zamowienia.forEach(System.out::println);

    //5
    List<LoudAnimal> zoo = new ArrayList<>();

    zoo.add(new Dog());
    zoo.add(new Cat());
    zoo.add(new Dog());

    System.out.println("\nZwierzeta krzycza nikt nie wie po co");

    for (LoudAnimal animal : zoo) {
        animal.makeNoise();
    }

    //6
    Circle mojeKolo = new Circle();

    System.out.println("\nTest");

    mojeKolo.setColor("Czerwony");

    mojeKolo.draw();

    Drawable d = mojeKolo;
    System.out.println("\nReferencja");
    d.draw();

}
