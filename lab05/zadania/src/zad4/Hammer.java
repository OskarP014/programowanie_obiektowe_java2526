package zad4;

public class Hammer extends WorkTool{
    public Hammer(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    public void use() {
        System.out.println(name + "do tłuczenia miesa" + " z roku: " + productionYear);
    }
}
