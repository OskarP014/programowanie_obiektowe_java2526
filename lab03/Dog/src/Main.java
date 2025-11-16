public class Main {
    public static void main(String[] args) {
        Dog pies = new Dog("leon", "bernenczyk",4);
        pies.bark();

        Point A = new Point(4,8);
        Point B = new Point(-2,1);
        Point.distance(A,B);

        Person czlowiek = new Person("Ja", "haslo");
        //System.out.println(czlowiek.name, czlowiek.password);

        Book pierwsza = new Book();
        System.out.println("Autor: " + pierwsza.author + " Tytul: " + pierwsza.title + " Rok publiakcji: " + pierwsza.publicationYear);
        Book druga = new Book("Oskar", "Javsia", 1944);
        System.out.println("Autor: " + druga.author + " Tytul: " + druga.title + " Rok publiakcji: " + druga.publicationYear);

        Car s1 = new Car();
        Car s2 = new Car("Lambo", "Diablo", 1991);
        Car s3 = new Car("Tata", "Diawoo");

        Television telewizor = new Television("Samsung", 32, "HD", true, 3000);
        telewizor.showInformation();

        Osoba o = Osoba.stworzOsobe("Oskar ", 21);
        o.PrzedstawSie();

        Kalkulator kalk = new Kalkulator();
        int wynik = kalk.obliczSume(10,5);
        System.out.println("wynik: " + wynik);
        int wynik2 = kalk.obliczSume(-1,6);
        System.out.println("wynik 2: " + wynik2);

    }
}