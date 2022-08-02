package keywords.teststatic;

/**
 * @author Ravindu
 * 7/31/2022
 */
public class StaticKeywordTest {

    int id;
    String name;
    static String language;

    public StaticKeywordTest(){
        System.out.println("in constructor");
    }

    static {
        System.out.println("In static block");
    }

    public void testInstanceMethod(){
        System.out.println("in instance method");
    }

    public static void testStaticMethod(){
        System.out.println("in static method");
    }

}

