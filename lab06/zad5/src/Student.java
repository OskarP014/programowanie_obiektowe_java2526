import java.time.LocalDate;

public class Student extends Osoba {

    public Student(String imie, String nazwisko, LocalDate dataRozpoczecia) {
        super(imie, nazwisko, dataRozpoczecia);
    }

    @Override
    public String getOpis() {
        return "Student: " + this.imie + " " + this.nazwisko +
                " (na uczelni od: " + this.dataRozpoczecia + ")";
    }
}
