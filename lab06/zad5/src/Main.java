//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Student s1 = new Student("Jan", "Kowalski", LocalDate.of(2022, 10, 1));
    PracownikNaukowy pn1 = new PracownikNaukowy("Anna", "Nowak", LocalDate.of(2018, 5, 15));
    PracownikAdministracyjny pa1 = new PracownikAdministracyjny("Piotr", "Zieliński", LocalDate.of(2020, 9, 1));

    ArrayList<Osoba> listaOsob = new ArrayList<>();
    listaOsob.add(s1);
    listaOsob.add(pn1);
    listaOsob.add(pa1);

    System.out.println("--- Lista osób (test polimorfizmu) ---");
    for (Osoba o : listaOsob) {
        System.out.println(o.getOpis());
    }

    System.out.println("\n--- Test różnicy lat ---");

    System.out.println("Różnica (s1 vs pn1): " + roznicaLat(s1, pn1) + " lat.");

    System.out.println("Różnica (pa1 vs s1): " + roznicaLat(pa1, s1) + " lat.");

    Student s2 = new Student("Test", "A", LocalDate.of(2020, 11, 15));
    Student s3 = new Student("Test", "B", LocalDate.of(2021, 11, 14)); // Dzień za wcześnie
    System.out.println("Różnica (prawie rok): " + roznicaLat(s2, s3) + " lat."); // Oczekiwano: 0

    Student s4 = new Student("Test", "C", LocalDate.of(2021, 11, 15));
    System.out.println("Różnica (dokładnie rok): " + roznicaLat(s2, s4) + " lat."); // Oczekiwano: 1
}

public static long roznicaLat(Osoba a, Osoba b) {
    LocalDate dataA = a.dataRozpoczecia;
    LocalDate dataB = b.dataRozpoczecia;

    LocalDate wczesniejsza, pozniejsza;
    if (dataA.isBefore(dataB)) {
        wczesniejsza = dataA;
        pozniejsza = dataB;
    } else {
        wczesniejsza = dataB;
        pozniejsza = dataA;
    }

    long lata = pozniejsza.getYear() - wczesniejsza.getYear();

    if (pozniejsza.getDayOfYear() < wczesniejsza.getDayOfYear()) {
        lata--;
    }

    return lata;
}

