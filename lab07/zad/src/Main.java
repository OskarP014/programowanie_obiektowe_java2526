import zad1.BookDTO;
import zad2.BankAccount;
import zad3.Doctor;
import zad3.Patient;
import zad5.NiepoprawnyFormatDanychException;

import static zad4.WalidacjaWieku.testujWiek;
import static zad5.WalidatorDanych.sprawdzFormatDanych;

void main() {
    //1
    BookDTO ksiazka1 = new BookDTO("Wiedźmin", "Andrzej Sapkowski", 39.99, 1993);
    BookDTO ksiazka2 = new BookDTO("Hobbit", "Tolkien", 45.50, 1937);

    System.out.println("Książki");
    System.out.println(ksiazka1);
    System.out.println(ksiazka2);

    System.out.println("\nCena drugiej książki: " + ksiazka2.price());

    BookDTO kopiaKsiazki1 = new BookDTO("Wiedźmin", "Andrzej Sapkowski", 39.99, 1993);
    System.out.println("Czy ksiazka1 jest taka sama jak kopia? " + ksiazka1.equals(kopiaKsiazki1));

    BankAccount noweKonto = new BankAccount("PL123456789");
    System.out.println("Nowo otwarte konto: " + noweKonto);

    //2
    BankAccount kontoZasobne = new BankAccount("PL987654321", 1000.0);
    System.out.println("Konto z wpłatą: " + kontoZasobne);

    BankAccount kontoPoOdsetkach = kontoZasobne.withInterest(5.0);

    System.out.println("\nPo naliczeniu 5% odsetek");
    System.out.println("Stary rekord: " + kontoZasobne);
    System.out.println("Nowy rekord: " + kontoPoOdsetkach);

    if (kontoZasobne.accountNumber().equals(kontoPoOdsetkach.accountNumber())) {
        System.out.println("Numer konta pozostał bez zmian");
    }

    //3
    Patient p1 = new Patient("Jan", "Kowalski", LocalDate.of(1985, 5, 20));
    Patient p2 = new Patient("Ania", "Nowak", LocalDate.of(1992, 11, 10));

    p1.getCard().addEntry("Zlamanie reki 2010");
    p1.getCard().addAllergy("Por");

    p2.getCard().addMedication("Piwo");

    Doctor doc = new Doctor("Gregory", "House", "Diagnosta");

    doc.addPatient(p1);
    doc.addPatient(p2);
    System.out.println("\n");
    doc.showMyPatients();

    //4
    System.out.println("\nSprawdzanie wieku");
    testujWiek(25);
    testujWiek(15);
    testujWiek(18);

    //5
    String[] testy = {"oprokop@gmail.com", "niepoprawnyemail", "esa.pl"};

        System.out.println("\nRozpoczynamy sprawdzanie formatów");

        for (String email : testy) {
            try {
                System.out.print("Testuje: " + email + " ");
                sprawdzFormatDanych(email);
                System.out.println("Poprawny");
            } catch (NiepoprawnyFormatDanychException e) {
                System.out.println("Bład: " + e.getMessage());
            }
        }
}


