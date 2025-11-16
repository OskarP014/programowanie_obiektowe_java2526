//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj rok: ");
    int rok = scanner.nextInt();

    if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
        System.out.println(rok + " jest rokiem przestępnym.");
    } else {
        System.out.println(rok + " nie jest rokiem przestępnym.");
    }

}
