
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj pierwsza liczbe: ");
    double liczba1 = scanner.nextDouble();

    System.out.println("Podaj druga liczbe: ");
    double liczba2 = scanner.nextDouble();

    System.out.println("Dodawanie: " + (liczba1 + liczba2));
    System.out.println("Odejmowanie: " + (liczba1 - liczba2));
    System.out.println("Mnożenie: " + (liczba1 * liczba2));

    if (liczba2 != 0) {
        System.out.println("Dzielenie: " + (liczba1 / liczba2));
    } else {
        System.out.println("Dzielenie: Nie można dzielić przez zero!");
    }
}
