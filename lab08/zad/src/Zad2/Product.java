package Zad2;

import java.time.LocalDate;
import java.util.Objects;

public class Product implements Comparable<Product> {

    private String name;
    private double price;
    private LocalDate expirationDate;

    public Product(String name, double price, LocalDate expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    @Override
    public int compareTo(Product other) {
        int dateComparison = other.expirationDate.compareTo(this.expirationDate);

        if (dateComparison != 0) {
            return dateComparison;
        }

        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return String.format("Produkt: %-12s Data ważności: %s Cena: %7.2f",
                name, expirationDate, price);
    }
}
