//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
enum Miesiac {
    STYCZEN, LUTY, MARZEC, KWIECIEN, MAJ, CZERWIEC,
    LIPIEC, SIERPIEN, WRZESIEN, PAZDZIERNIK, LISTOPAD, GRUDZIEN
}

void main() {
    Scanner scanner = new Scanner(System.in);
    try {
        System.out.print("Podaj dzień: ");
        int dzien = scanner.nextInt();

        System.out.print("Podaj miesiąc: ");
        String miesiacTekst = scanner.next();

        System.out.print("Podaj rok: ");
        int rok = scanner.nextInt();

        Miesiac miesiac = Miesiac.valueOf(miesiacTekst.toUpperCase());


        int maxDni = 0;

        switch (miesiac) {
            case KWIECIEN:
            case CZERWIEC:
            case WRZESIEN:
            case LISTOPAD:
                maxDni = 30;
                break;

            case LUTY:
                if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
                    maxDni = 29;
                } else {
                    maxDni = 28;
                }
                break;

            default:
                maxDni = 31;
                break;
        }


        if (dzien > 0 && dzien <= maxDni && rok > 0) {
            System.out.println("Poprawna data");
        } else {
            System.out.println("Błędna data");
        }

    } catch (IllegalArgumentException e) {
        System.out.println("Błędna data (niepoprawna nazwa miesiąca)");
    }
}
