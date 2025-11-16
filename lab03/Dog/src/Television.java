public class Television {
    private String brand;
    private Integer screenDiagonal;
    private String resolotion;
    private Boolean isSmart;
    private Integer price;

    public Television(String brand, Integer screenDiagonal, String resolotion, Boolean isSmart, Integer price) {
        this.brand = brand;
        this.screenDiagonal = screenDiagonal;
        this.resolotion = resolotion;
        this.isSmart = isSmart;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getScreenDiagonal() {
        return screenDiagonal;
    }

    public Integer getPrice() {
        return price;
    }

    public Boolean getIsSmart(){
        return isSmart;
    }

    public String getResolotion(){
        return resolotion;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setScreenDiagonal(int screenDiagonal){
        this.screenDiagonal = screenDiagonal;
    }

    public void setResolotion(String resolotion){
        this.resolotion = resolotion;
    }

    public void setIsSmart(boolean isSmart){
        this.isSmart = isSmart;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void showInformation(){
        System.out.println("Telewizor:");
        System.out.println("Marka: " + brand);
        System.out.println("Przekątna: " + screenDiagonal + " cali");
        System.out.println("Rozdzielczość: " + resolotion);

        String czySmart = (isSmart) ? "Tak" : "Nie";
        System.out.println("Smart TV: " + czySmart);

        System.out.println("Cena: " + price);
    }

}
