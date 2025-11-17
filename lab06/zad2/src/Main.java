//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    House h1 = new House("Słoneczna 10, Warszawa", 150.5, 800000, 2);
    House h2 = new House("Słoneczna 10, Warszawa", 150.5, 800000, 2);
    House h3 = new House("Leśna 5, Kraków", 200.0, 1200000, 1);

    Apartament a1 = new Apartament("Główna 1, Gdańsk", 60.0, 500000, 3);


    System.out.println(h1);
    System.out.println(a1);

    System.out.println("h1 == h2 (identyczne) \t" + h1.equals(h2));
    System.out.println("h1 == h3 (różne) \t\t" + h1.equals(h3));
    System.out.println("h1 == a1 (inne typy) \t" + h1.equals(a1));


    System.out.println("Hash h1: " + h1.hashCode());
    System.out.println("Hash h2: " + h2.hashCode());
    System.out.println("Hash h3: " + h3.hashCode());
    System.out.println("hash h1 i h2 jest taki sam? " + (h1.hashCode() == h2.hashCode()));
}

