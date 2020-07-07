package marketStore.cards;

import static marketStore.common.ExceptionMessages.*;

public abstract class Card {

    private String ownerName;
    private double turnover;
    private double discountRate;

    protected Card(String ownerName, double turnover, double discountRate) {
        this.setOwnerName(ownerName);
        this.setTurnover(turnover);
        this.discountRate = discountRate;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.trim().isEmpty()) {
            throw new NullPointerException(NAME_NULL);
        }
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    private void setTurnover(double turnover) {
        if (turnover < 0) {
            throw new IllegalArgumentException(NEGATIVE_TURNOVER);
        }
        this.turnover = turnover;
    }

    public double getTurnover() {
        return this.turnover;
    }

    public double getDiscountRate() {
        return this.discountRate;
    }


    public double discount(double valueOfPurchase) {
        if (valueOfPurchase < 0) {
            throw new IllegalArgumentException(NEGATIVE_PURCHASE_VALUE);
        }
        return valueOfPurchase * (discountRate/100);
    }

}
