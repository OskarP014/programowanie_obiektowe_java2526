public class Product {
    public static int numberOfProducts = 0;
    public static final int maxProducts = 3;

    public Product() {
        if(numberOfProducts < maxProducts){
            numberOfProducts++;
            System.out.println("Nowy produkt! Na stanie: " + numberOfProducts);
        }else {
            System.out.println("Osiagnieto limit: " + maxProducts);
        }
    }
}
