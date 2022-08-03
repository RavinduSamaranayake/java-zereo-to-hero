package keywords.oop.inheritance.computer;

/**
 * @author Ravindu
 * 8/3/2022
 */
public interface Network {

    int routerNo = 11;
    default void addRouter(){
        System.out.println("Added Network Router......");
    }

    default int getRouterNo(){
        return routerNo;
    }

    default void setRouterNo(int n){
       //routerNo = n; //can't do this due to this variable is final
    }

}
