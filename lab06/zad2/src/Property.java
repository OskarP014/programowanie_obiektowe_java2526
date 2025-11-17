import java.util.Objects;

public class Property {

    private String adres;
    private double size;
    private double prize;

    public Property(String adres, double size, double prize) {
        this.adres = adres;
        this.size = size;
        this.prize = prize;
    }

    public String getAdres() {
        return adres;
    }

    public double getSize() {
        return size;
    }

    public double getPrize() {
        return prize;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return String.format("Adres: %s, Rozmiar: %.2f, Cena: %.2f",
                adres, size, prize);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Property property = (Property) obj;


        return Double.compare(property.size, size) == 0 &&
                Double.compare(property.prize, prize) == 0 &&
                adres.equals(property.adres);
    }

    // --- Metoda hashCode() ---
    @Override
    public int hashCode() {
        return Objects.hash(adres, size, prize);
    }
}
