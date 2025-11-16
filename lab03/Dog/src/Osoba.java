public class Osoba {

    private String imie;
    private int wiek;

    private Osoba(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
    }


    public static Osoba stworzOsobe(String imie, int wiek){
        return new Osoba(imie, wiek);
    }

    public void PrzedstawSie(){
        System.out.println(imie + wiek);
    }

}
