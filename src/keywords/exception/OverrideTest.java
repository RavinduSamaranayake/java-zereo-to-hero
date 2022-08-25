package keywords.exception;

import java.io.FileNotFoundException;

/**
 * @author Ravindu
 * 8/13/2022
 */
public abstract class OverrideTest {
    public void display() throws FileNotFoundException, ClassNotFoundException {
        System.out.println("Hi.. I declared a Exception here");
        throw new FileNotFoundException();
    }

}
