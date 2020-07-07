package marketStore.cards;

import marketStore.interfaces.Discountable;

public class Gold extends Card implements Discountable {
    public Gold(String ownerName, double turnover) {
        super(ownerName, turnover, setDiscount(turnover));
    }

    private static double setDiscount(double turnover) {
        double currentDiscount = 2;
        return  Math.min(10, currentDiscount + turnover/100);
    }
}
