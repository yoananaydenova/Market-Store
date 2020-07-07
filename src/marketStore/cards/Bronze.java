package marketStore.cards;

import marketStore.interfaces.Discountable;

public class Bronze extends Card implements Discountable {

    public Bronze(String ownerName, double turnover) {
        super(ownerName, turnover, setDiscount(turnover));
    }
    private static double setDiscount(double turnover) {
        double currentDiscount = 0;
        if (turnover > 99 && turnover < 300) {
            currentDiscount = 1;
        } else if (turnover >300){
            currentDiscount = 2.5;
        }
            return currentDiscount;
    }
}
