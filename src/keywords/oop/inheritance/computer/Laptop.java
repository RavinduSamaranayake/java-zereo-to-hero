package keywords.oop.inheritance.computer;

/**
 * @author Ravindu
 * 8/2/2022
 */
public class Laptop extends Computer{

    private String displayType;

    public static void giveInput() {
        System.out.println("Laptop Input here..............");
    }

    @Override
    public void getOutput() {
        System.out.println("Laptop Output here..............");
    }

    @Override
    public void code() {
        System.out.println("Laptop coding..........");
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    @Override
    public void getPortableType() {

    }
}
