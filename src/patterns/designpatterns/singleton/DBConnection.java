package patterns.designpatterns.singleton;

/**
 * @author Ravindu
 * 8/4/2022
 */
public class DBConnection { //Lazy Instantiation: creation of instance when required.

    private static DBConnection con;

    private DBConnection(String port){
        System.out.println("IN DBConnection constructor...");
    }

    public static DBConnection getConnection(){
        System.out.println("get connection method called...");
        if(con == null){
            con = createDBCon();
            System.out.println("created a initial object : "+con);
        }
        return con;
    }

    private static DBConnection createDBCon(){
        String port = "12345";
        System.out.println("Creating a DB Connection... at port : "+port);
        return new DBConnection(port);
    }
}
