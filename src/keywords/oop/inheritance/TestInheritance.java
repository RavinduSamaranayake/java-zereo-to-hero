package keywords.oop.inheritance;

import keywords.oop.inheritance.computer.*;

/**
 * @author Ravindu
 * 8/2/2022
 */
public class TestInheritance {
    public static void printInputType(char character){
        Computer device = switch (character) {
            case 'M' -> new Mobile();
            case 'L' -> new Laptop();
            case 'T' -> new Tablet();
            default -> new Desktop();
        };
        device.giveInput(); //Call static method Computer.giveInput();
        device.getOutput();
        device.addRouter();
        System.out.println("Router No is : "+device.getRouterNo());
        //This Computer is the example for Multiple behavior (Poly Morphic) of a class.
        // this concept names as Polymorphism
        //This allows us to perform a single action in different ways.
    }

    public static void main(String[] args) {
        printInputType('M');
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        printInputType('L');
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        printInputType('C');

        Portable.print(); // to test
    }
}
