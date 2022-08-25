package patterns.designpatterns.singleton;

/**
 * @author Ravindu
 * 8/4/2022
 */
public class SingletonPatternEx { //Early Instantiation: creation of instance at load time.

    private static SingletonPatternEx obj = new SingletonPatternEx();

    private SingletonPatternEx(){
        System.out.println("IN Constructor.....");
    }

    public static SingletonPatternEx getSingletonObj(){
        System.out.println("Singleton method called.....");
        return obj;
    }

}
