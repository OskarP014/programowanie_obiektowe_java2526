//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner skaner = new Scanner(System.in);

    System.out.println("Podawaj liczby całkowite, liczba ujemna kończy program: ");

    int liczba = skaner.nextInt();

    if (liczba < 0) {
        System.out.println("Nie podano żadnych liczb dodatnich.");
    } else {
        int min = liczba;
        int max = liczba;


        while (true) {
            liczba = skaner.nextInt();
            if (liczba < 0) {
                break;
            }
            if (liczba > max) {
                max = liczba;
            }
            if (liczba < min) {
                min = liczba;
            }
        }
        System.out.println("Najmniejsza liczba: " + min);
        System.out.println("Największa liczba: " + max);
    }
}
