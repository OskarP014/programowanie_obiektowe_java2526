import java.util.ArrayList;
import java.util.Objects;

public class ComputerGame {

    private String title;
    private String producer;
    private ArrayList<Double> ratings;

    public ComputerGame(String title, String producer) {
        this.title = title;
        this.producer = producer;
        this.ratings = new ArrayList<>(); // Zawsze inicjalizujemy listę!
    }

    public void addRating(double rating) {
        if (rating >= 0 && rating <= 10) {
            this.ratings.add(rating);
        } else {
            System.out.println("Błąd: Ocena " + rating + " jest poza skalą 0-10.");
        }
    }

    public void removeRating(double rating) {
        this.ratings.remove(Double.valueOf(rating));
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getProducer() { return producer; }
    public void setProducer(String producer) { this.producer = producer; }

    public ArrayList<Double> getRatings() {
        return new ArrayList<>(this.ratings);
    }

    public void setRatings(ArrayList<Double> ratings) {
        this.ratings = new ArrayList<>(ratings);
    }

    @Override
    public String toString() {
        return String.format("Gra: %s (producent: %s), Oceny: %s",
                title, producer, ratings.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        ComputerGame that = (ComputerGame) obj;

        return title.equals(that.title) &&
                producer.equals(that.producer) &&
                ratings.equals(that.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, producer, ratings);
    }
}