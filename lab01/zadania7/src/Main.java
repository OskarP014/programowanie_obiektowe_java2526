//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Podaj liczbę całkowitą (dodatnią): ");
    int liczba = scanner.nextInt();

    int odwrocona = 0;

    while (liczba > 0) {
        int ostatniaCyfra = liczba % 10;
        odwrocona = (odwrocona * 10) + ostatniaCyfra;
        liczba = liczba / 10;
    }

    System.out.println("Po odwróceniu: " + odwrocona);
}

