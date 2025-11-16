//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner skaner = new Scanner(System.in);

    System.out.print("Podaj swój dochód: ");
    double dochod = skaner.nextDouble();
    double podatek = 0;

    if (dochod <= 85528) {
        podatek = dochod * 0.18;
    } else {
        double nadwyzka = dochod - 85528;
        podatek = 14839.02 + (nadwyzka * 0.32);
    }

    System.out.printf("Należny podatek: %.2f PLN", podatek);
}

