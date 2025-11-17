import java.util.ArrayList;

public class Szkola {
    private ArrayList<String> uczniowe;

    public Szkola() {
        this.uczniowe = new ArrayList<>();
    }

    public void dodajUcznia(String imieNazwisko){
        this.uczniowe.add(imieNazwisko);
    }

    public ArrayList<String> zwrocUczniow() {
        return this.uczniowe;
    }
}
