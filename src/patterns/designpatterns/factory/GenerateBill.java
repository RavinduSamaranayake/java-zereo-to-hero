package patterns.designpatterns.factory;

/**
 * @author Ravindu
 * 8/4/2022
 */
public class GenerateBill {
    public static void main(String[] args) {
        Plan p = GetPlanFactory.getPlan('C');
        p.getRate();
        p.calculateBill(10);
    }
}
