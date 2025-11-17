import java.time.LocalDate;

public class PracownikAdministracyjny extends Osoba {

    public PracownikAdministracyjny(String imie, String nazwisko, LocalDate dataRozpoczecia) {
        super(imie, nazwisko, dataRozpoczecia);
    }

    @Override
    public String getOpis() {
        return "Pracownik Administracji: " + this.imie + " " + this.nazwisko;
    }
}