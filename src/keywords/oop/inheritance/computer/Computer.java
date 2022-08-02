package keywords.oop.inheritance.computer;

/**
 * @author Ravindu
 * 8/2/2022
 */
public class Computer {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static void giveInput(){
        System.out.println("Base Input function here.........");
    }
    public void getOutput(){
        System.out.println("Base Output function here.........");
    }
}
