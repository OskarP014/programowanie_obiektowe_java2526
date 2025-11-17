import java.util.Objects;

public class Apartament extends Property {

    private int floorNumber; // Dodatkowe pole

    public Apartament(String address, double size, double price, int floorNumber) {

        super(address, size, price);

        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() { return floorNumber; }
    public void setFloorNumber(int floorNumber) { this.floorNumber = floorNumber; }

    @Override
    public String toString() {
        return String.format("Apartament [%s, Piętro: %d]",
                super.toString(), floorNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        if (!super.equals(obj)) return false;

        Apartament apartment = (Apartament) obj;
        return floorNumber == apartment.floorNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), floorNumber);
    }
}