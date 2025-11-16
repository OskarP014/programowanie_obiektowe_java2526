//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner skaner = new Scanner(System.in);

    System.out.println("Podaj liczbę a (górna granica): ");
    int a = skaner.nextInt();

    System.out.println("Podaj liczbę b (dolna granica): ");
    int b = skaner.nextInt();

    System.out.println("Podaj liczbę c (dzielnik): ");
    int c = skaner.nextInt();

    System.out.println("Liczby spełniające warunki: ");

    for (int i = b + 1; i <= a; i++) {
        if (i % c == 0) {
            System.out.print(i + " ");
        }
    }
}
