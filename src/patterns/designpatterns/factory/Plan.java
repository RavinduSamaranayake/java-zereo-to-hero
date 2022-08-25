package patterns.designpatterns.factory;

/**
 * @author Ravindu
 * 8/4/2022
 */
public abstract class Plan {
    protected double rate;
    protected abstract void getRate();
    public void calculateBill(int units){
        System.out.println("Bill calculate : "+rate*units);
    }
}
