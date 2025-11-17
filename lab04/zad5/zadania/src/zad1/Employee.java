package zad1;

public class Employee extends Person{
    public Employee(String lastName, String fristName) {
        super(lastName, fristName);
    }

    /*public void probaDostepu(){
        System.out.println("Protected: " + lastName);

        System.out.println("Prywatne: " + firstName); nie ma dostepu
    }
    */

    public void wywietl(){
        System.out.println("Dane: " + getFristName() + " " + getLastName());
    }


}
