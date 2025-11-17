import java.util.ArrayList;
import java.util.Objects;

public class Gradebook {

    private String firstName;
    private String lastName;
    private ArrayList<Integer> grades;

    public Gradebook(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new ArrayList<>();
    }


    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public ArrayList<Integer> getGrades() {
        return new ArrayList<>(this.grades);
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = new ArrayList<>(grades);
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public void removeGrade(int index) {
        this.grades.remove(index);
    }

    public double averageGrade() {
        if (this.grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }

        return sum / this.grades.size();
    }

    @Override
    public String toString() {
        return String.format("Gradebook for %s %s: Average Grade = %.2f, Grades: %s.",
                this.firstName,
                this.lastName,
                this.averageGrade(),
                this.grades.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Gradebook that = (Gradebook) obj;

        return firstName.equals(that.firstName) &&
                lastName.equals(that.lastName) &&
                grades.equals(that.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, grades);
    }
}
