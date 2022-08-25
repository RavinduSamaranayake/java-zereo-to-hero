package patterns.designpatterns.singleton.interviewQues;

/**
 * @author Ravindu
 * 8/24/2022
 */
public final class SingleCon {
    private static SingleCon con = null;
    private SingleCon(){
        System.out.println("Constructor called....");
    }
    public static synchronized SingleCon getInstance(){
        if(con == null) {
            con = new SingleCon();
        }
        System.out.println("Called get Instance method.........");
        return con;
    }
}
