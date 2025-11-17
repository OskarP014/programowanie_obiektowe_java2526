import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public Person(String firstName, String lastName, int age) {
        if (firstName == null || firstName.isEmpty()) {
            this.firstName = "";
        } else {
            this.firstName = firstName;
        }

        if (lastName == null || lastName.isEmpty()) {
            this.lastName = "";
        } else {
            this.lastName = lastName;
        }

        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName + ", Age: " + age + ".";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}