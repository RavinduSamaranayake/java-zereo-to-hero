package patterns.designpatterns.factory;

/**
 * @author Ravindu
 * 8/4/2022
 */
public class CommercialPlan extends Plan{
    @Override
    public void getRate() {
        rate = 2.8;
    }
}
