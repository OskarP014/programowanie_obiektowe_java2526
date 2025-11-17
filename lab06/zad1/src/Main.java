public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 25);
        Person person2 = new Person("Jan", "Kowalski", 25);
        Person person3 = new Person("Anna", "", -5);

        System.out.println(person1); // Person: Jan Kowalski, Age: 25.
        System.out.println(person3); // Person: Anna , Age: 0.

        System.out.println(person1.equals(person2)); // true
        System.out.println(person1.equals(person3)); // false
    }
}