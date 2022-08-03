package keywords.oop.inheritance.computer;

/**
 * @author Ravindu
 * 8/3/2022
 */
public interface Portable {
    public void getPortableType();
    default void addRouter(){ //For testing to private
        System.out.println("Added Portable Router......");
    }

    static void print(){
        System.out.println("This is for Portable Devices");
    }
}
