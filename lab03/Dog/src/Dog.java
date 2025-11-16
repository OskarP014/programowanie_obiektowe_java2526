public class Dog {
    public String name;
    public String breed;
    public Integer age;

    public void bark(){
        System.out.println("Wow wow!");
    }

    public Dog(String name, String breed, Integer age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
}
