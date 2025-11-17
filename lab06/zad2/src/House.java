import java.util.Objects;

public class House extends Property {

    private int numberOfFloors;

    public House(String address, double size, double price, int numberOfFloors) {
        super(address, size, price);

        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfFloors() { return numberOfFloors; }
    public void setNumberOfFloors(int numberOfFloors) { this.numberOfFloors = numberOfFloors; }

    @Override
    public String toString() {
        return String.format("Dom [%s, Piętra: %d]",
                super.toString(), numberOfFloors);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        if (!super.equals(obj)) return false;

        House house = (House) obj;
        return numberOfFloors == house.numberOfFloors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfFloors);
    }
}
