package zad4;

public class Saw extends WorkTool{
    public Saw(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    public void use() {
        System.out.println(name + "do ciencia chelba" + " z roku: " + productionYear);
    }
}
