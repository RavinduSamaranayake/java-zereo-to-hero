package keywords.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Ravindu
 * 8/13/2022
 */
public class Driver {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        OverrideTest test = new OverrideTestChild();
        test.display();
    }
}
