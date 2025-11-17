package zad5;

public class Weapon extends Item{
    public int damage;

    public Weapon(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    @Override
    public void use() {
        System.out.println("Atak " + name + " zadane: " + damage + "obrazen");
    }
}
