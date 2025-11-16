package zad1;

public class Person {

    private String fristName;
    protected String lastName;

    public Person(String lastName, String fristName) {
        this.lastName = lastName;
        this.fristName = fristName;
    }

    public String getFristName(){
        return this.fristName;
    }

    public String getLastName(){
        return this.lastName;
    }

}
