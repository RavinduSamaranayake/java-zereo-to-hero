package keywords.oop.inheritance;

import keywords.oop.inheritance.computer.*;

/**
 * @author Ravindu
 * 8/2/2022
 */
public class TestInheritance {
    public static void printInputType(char character){
        Computer device = switch (character) {
            case 'D' -> new Desktop();
            case 'M' -> new Mobile();
            case 'L' -> new Laptop();
            case 'T' -> new Tablet();
            default -> new Computer();
        };
        device.giveInput();
        device.getOutput();
    }

    public static void main(String[] args) {
        printInputType('M');
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        printInputType('L');
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        printInputType('C');
    }
}
