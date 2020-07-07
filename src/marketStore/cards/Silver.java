package marketStore.cards;

import marketStore.interfaces.Discountable;

public class Silver extends Card implements Discountable {
    public Silver(String ownerName, double turnover) {
        super(ownerName, turnover, setDiscount(turnover));
    }

    private static double setDiscount(double turnover) {
        double currentDiscount = 2;
        if(turnover>300){
            currentDiscount = 3.5;
        }
        return currentDiscount;
    }
}
