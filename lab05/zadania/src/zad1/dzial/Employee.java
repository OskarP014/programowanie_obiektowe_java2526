package zad1.dzial;
import zad1.Person;

public class Employee extends Person {

    public Employee(String f, String l) {super (f,l);}

    public void testDostepu(){
        System.out.println("Getter: " + getLastName());

        System.out.println("Bezposrednio: " + this.lastName);
    }

}
