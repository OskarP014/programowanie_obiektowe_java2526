package zad3;
import java.time.LocalDate;
public class Patient {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    private final PatientCard card;

    public Patient(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.card = new PatientCard();
    }

    public PatientCard getCard() { return card; }

    @Override
    public String toString() {
        return firstName + " " + lastName+ " " + birthDate;
    }
}
