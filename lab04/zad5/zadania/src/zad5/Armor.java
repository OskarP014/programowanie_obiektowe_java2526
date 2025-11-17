package zad5;

public class Armor extends Item{
    public int armor;

    public Armor(String name, int armor) {
        super(name);
        this.armor = armor;
    }

    @Override
    public void use() {
        System.out.println("Ubierasz" + name + " daje on " + armor + "punktów obrony");
    }
}
