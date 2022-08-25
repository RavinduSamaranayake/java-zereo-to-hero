package patterns.designpatterns.factory;

/**
 * @author Ravindu
 * 8/4/2022
 */
public class DomesticPlan extends Plan{
    @Override
    public void getRate() {
        super.rate = 1.7;
    }
}
