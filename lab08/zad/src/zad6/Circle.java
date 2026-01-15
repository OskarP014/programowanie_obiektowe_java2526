package zad6;

public class Circle implements ColorDrawable{
    private String color = "brak koloru";

    @Override
    public void setColor(String color){
        this.color = color;
        System.out.println("Kolor koła: " + this.color);
    }

    @Override
    public void draw() {
        System.out.println("Rysuję koło o kolorze: " + this.color);
    }
}
