//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner skaner = new Scanner(System.in);

    System.out.print("Podaj znak: ");
    char znak = skaner.next().charAt(0);

    System.out.print("Podaj wysokość: ");
    int n = skaner.nextInt();

    StringBuilder bob = new StringBuilder();

    for(int i=1; i<=n; i++) {
        bob.setLength(0);

        for (int s = 0; s < n - 1; s++) {
            bob.append(" ");
        }

        int iloscZnakow = (i * 2) - 1;

        for(int z = 0; z < iloscZnakow; z++){
            bob.append(znak);
        }
        System.out.println(bob.toString());
    }
}
