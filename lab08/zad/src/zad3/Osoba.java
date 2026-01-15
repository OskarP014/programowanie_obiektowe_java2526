package zad3;

public class Osoba {
    private String imie;
    private int wiek;
    private double wzrost;

    public Osoba(String imie, int wiek, double wzrost) {
        this.imie = imie;
        this.wiek = wiek;
        this.wzrost = wzrost;
    }

    // Gettery są niezbędne, aby Komparator mógł pobrać dane
    public String getImie() { return imie; }
    public int getWiek() { return wiek; }
    public double getWzrost() { return wzrost; }

    @Override
    public String toString() {
        return String.format("%-10s Wiek: %d Wzrost: %.2f", imie, wiek, wzrost);
    }
}
