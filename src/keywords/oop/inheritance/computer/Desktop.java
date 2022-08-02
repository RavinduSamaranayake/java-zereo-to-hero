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

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }
}
