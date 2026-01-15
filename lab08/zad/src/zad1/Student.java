package zad1;
import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private double averageGrade;
    private int yearOfBirth;

    public Student(String name, double averageGrade, int yearOfBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.averageGrade, this.averageGrade);
    }

    @Override
    public String toString() {
        return String.format("Student: %-15s  Średnia: %.2f  Rok ur: %d",
                name, averageGrade, yearOfBirth);
    }

    public String getName() { return name; }
    public double getAverageGrade() { return averageGrade; }
}
