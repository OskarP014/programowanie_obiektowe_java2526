//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Podaj mniejszą liczbę (n): ");
    int n = scanner.nextInt();

    System.out.print("Podaj większą liczbę (m): ");
    int m = scanner.nextInt();

    int suma = 0;

    for(int i =n; i<=m; i++){
        suma = suma + i;
    }
    System.out.println("Suma liczb wynosi: " + suma);

}
