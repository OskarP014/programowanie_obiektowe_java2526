package zad3;
import java.util.ArrayList;

public class PatientCard {
    private ArrayList<String> medicalHistory;
    private ArrayList<String> allergies;
    private ArrayList<String> medications;

    public PatientCard() {
        this.medicalHistory = new ArrayList<>();
        this.allergies = new ArrayList<>();
        this.medications = new ArrayList<>();
    }

    public void addEntry(String entry) { medicalHistory.add(entry); }
    public void addAllergy(String allergy) { allergies.add(allergy); }
    public void addMedication(String medication) { medications.add(medication); }

    @Override
    public String toString() {
        return "Historia: " + medicalHistory + ", Alergie: " + allergies + ", Leki: " + medications;
    }
}
