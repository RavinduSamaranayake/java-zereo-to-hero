package patterns.designpatterns.singleton;

/**
 * @author Ravindu
 * 8/4/2022
 */
public class TestDriver {
    public static void main(String[] args) {
        SingletonPatternEx.getSingletonObj();
        SingletonPatternEx.getSingletonObj();
        SingletonPatternEx.getSingletonObj();
        SingletonPatternEx.getSingletonObj();
        SingletonPatternEx.getSingletonObj();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        DBConnection.getConnection();
        DBConnection.getConnection();
        DBConnection.getConnection();
        DBConnection.getConnection();
    }
}
