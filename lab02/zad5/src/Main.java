//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[] tablica = new int[30];
    Random generator = new Random();

    int iloscKwadratow = 0;

    System.out.println("Wylosowane liczby w tablicy:");

    for (int i = 0; i < tablica.length; i++) {
        tablica[i] = generator.nextInt(100) + 1;
        System.out.print(tablica[i] + " ");
    }
    System.out.println();
    System.out.println("Znalezione liczby będące kwadratami:");

    for (int i = 0; i < tablica.length; i++) {
        int badanaLiczba = tablica[i];

        double pierwiastek = Math.sqrt(badanaLiczba);

        int pierwiastekCalkowity = (int) pierwiastek;

        if (pierwiastekCalkowity * pierwiastekCalkowity == badanaLiczba) {
            System.out.print(badanaLiczba + " ");
            iloscKwadratow++;
        }
    }

    System.out.println("Łącznie znaleziono: " + iloscKwadratow + " takich liczb.");
}

