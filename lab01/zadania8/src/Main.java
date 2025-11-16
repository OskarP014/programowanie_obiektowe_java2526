//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner skaner = new Scanner(System.in);

    System.out.print("Podaj pierwszą liczbę: ");
    int a = skaner.nextInt();

    System.out.print("Podaj drugą liczbę: ");
    int b = skaner.nextInt();

    int nww;

    if (a > b) {
        nww = a;
    } else {
        nww = b;
    }

    int krok = nww;

    while (true) {
        if (nww % a == 0 && nww % b == 0) {
            break;
        }
        nww += krok;
    }

    System.out.println("Najmniejsza Wspólna Wielokrotność: " + nww);
}

