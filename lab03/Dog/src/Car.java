public class Car {
    public String brand;
    public String model;
    public Integer productionYear;

    public Car(String brand, String model, Integer productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }

    public Car()
    {
        brand = "Opelek";
        model = "Corsa <3";
        productionYear = 1997;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.productionYear = 0;
    }


}
