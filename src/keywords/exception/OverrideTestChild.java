package keywords.exception;

import java.io.FileNotFoundException;

/**
 * @author Ravindu
 * 8/13/2022
 */
public class OverrideTestChild extends OverrideTest{
    @Override
    public void display() throws ClassNotFoundException{
        System.out.println(" Hi I'm a child");
        throw new ArithmeticException("Hi child threw exception.....");
    }
}
