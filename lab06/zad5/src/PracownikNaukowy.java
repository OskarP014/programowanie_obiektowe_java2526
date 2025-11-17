import java.time.LocalDate;

public class PracownikNaukowy extends Osoba {

    public PracownikNaukowy(String imie, String nazwisko, LocalDate dataRozpoczecia) {
        super(imie, nazwisko, dataRozpoczecia);
    }

    @Override
    public String getOpis() {
        return "Pracownik Naukowy: Dr " + this.nazwisko + ", " + this.imie +
                " (staż od: " + this.dataRozpoczecia + ")";
    }
}