package keywords.oop.inheritance.computer;

/**
 * @author Ravindu
 * 8/2/2022
 */
public class Tablet extends Laptop{
    public int getRes(){
        System.out.println("Tablet Res here.......");
        return 1000;
    }

    public static void giveInput() {
        System.out.println("Tablet Input here.............");
    }

    @Override
    public void getOutput() {
        System.out.println("Tablet Output here.............");
    }
}
