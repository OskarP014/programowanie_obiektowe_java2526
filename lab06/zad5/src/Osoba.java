import java.time.LocalDate;

public abstract class Osoba {

    protected String imie;
    protected String nazwisko;
    protected LocalDate dataRozpoczecia;

    public Osoba(String imie, String nazwisko, LocalDate dataRozpoczecia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataRozpoczecia = dataRozpoczecia;
    }

    public abstract String getOpis();
}