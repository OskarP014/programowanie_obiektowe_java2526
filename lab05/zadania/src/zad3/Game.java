package zad3;

public class Game {

    private boolean czyZainiciowana = false;

    public Game(){
        this.initialize();
        System.out.println("Konstruktor Game");
    }

    public final void initialize(){
        System.out.println("Działa finalna metoda");
        this.czyZainiciowana = true;
    }

    public boolean isCzyZainiciowana(){
        return this.czyZainiciowana;
    }

}
