package zad6;

public class Tree extends Plant implements Comparable<Tree> {
    private double height;

    public Tree(String species, double height) {
        super(species);
        this.height = height;
    }

    public double getHeight() { return height; }

    @Override
    public int compareTo(Tree other) {
        return Double.compare(this.height, other.height);
    }

    @Override
    public String toString() {
        return species + " " + height;
    }
}
