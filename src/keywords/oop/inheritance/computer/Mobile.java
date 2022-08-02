package keywords.oop.inheritance.computer;

/**
 * @author Ravindu
 * 8/2/2022
 */
public class Mobile extends Tablet{                      //public class Mobile extends Laptop, Tablet {} <- multiple Inheritance not supported to java
    public static void giveInput() {
        System.out.println("mobile Input here.............");
    }

    @Override
    public void getOutput() {
        System.out.println("mobile Output here.............");
    }

    @Override
    public int getRes() {
        System.out.println("mobile res is here.........");
        return 1024;
    }

    private void getSimName(){
        System.out.println("HUTCH here................ ");
    }

}
