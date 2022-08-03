package keywords.oop.inheritance.computer;

/**
 * @author Ravindu
 * 8/2/2022
 */
public abstract class Computer implements Portable,Network{ //This is a concept. computer is not an actual object Creator. Lap,Desktops are the Object creators
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static void giveInput() {
        System.out.println("Base Input function here.........");
    }

    public abstract void getOutput();

    public abstract void code();

    private void test(){
        System.out.println("test private modifiers");
    }

    @Override
    public void addRouter() {
        Portable.super.addRouter(); //for avoid multiple inheritance problem
    }

    @Override
    public int getRouterNo() {
        return Network.super.getRouterNo();
    }
}
