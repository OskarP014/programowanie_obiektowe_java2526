package zad3;
import java.util.ArrayList;

public class Doctor {
    private String firstName;
    private String lastName;
    private String specialization;

    private ArrayList<Patient> patients;

    public Doctor(String firstName, String lastName, String specialization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient p) {
        this.patients.add(p);
    }

    public void showMyPatients() {
        System.out.println("Lekarz: " + firstName + " " + lastName + " " + specialization);
        System.out.println("Lista pacjentów:");
        for (Patient p : patients) {
            System.out.println(p + " Dane karty: " + p.getCard());
        }
    }
}
