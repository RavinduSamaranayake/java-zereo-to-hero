package keywords.oop.inheritance.computer;

/**
 * @author Ravindu
 * 8/2/2022
 */
public class Desktop extends Computer{

    private String monitorType;

    public static void giveInput() {
        System.out.println("Desktop Input here.................");
    }

    @Override
    public void getOutput() {
        System.out.println("Desktop Output here.................");
    }

    @Override
    public void code() {
        System.out.println("Desktop coding..........");
    }


    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }

    @Override
    public void getPortableType() {
        System.out.println("Desktop Portable Type....");
    }
}
