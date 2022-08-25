package patterns.designpatterns.singleton.interviewQues;

/**
 * @author Ravindu
 * 8/24/2022
 */
public class SingletonTest {
    public static void main(String[] args) {
        System.out.println(SingleCon.getInstance());
        System.out.println(SingleCon.getInstance());
        System.out.println(SingleCon.getInstance());
        System.out.println(SingleCon.getInstance());
    }
}
