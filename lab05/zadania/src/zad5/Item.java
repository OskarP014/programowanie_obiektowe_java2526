package zad5;

public abstract class Item {
    public String name;

    public Item(String name) {
        this.name = name;
    }

    public abstract void use();

}
