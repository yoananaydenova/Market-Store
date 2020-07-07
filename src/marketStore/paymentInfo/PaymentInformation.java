package marketStore.paymentInfo;


import marketStore.cards.Card;

import static marketStore.common.ExceptionMessages.*;

public class PaymentInformation {

    public static String discountRate(Card card) {
        if (card == null) {
            throw new IllegalArgumentException(NON_EXISTENT_CARD);
        }
        return String.format("Discount rate: %.1f%%",card.getDiscountRate());
    }

    public static String discount(Card card, double valueOfPurchase) {
        if (card == null) {
            throw new IllegalArgumentException(NON_EXISTENT_CARD);
        }

        return String.format("Discount: $%.2f", card.discount(valueOfPurchase));
    }

    public static String total(Card card, double valueOfPurchase) {
        if (card == null) {
            throw new IllegalArgumentException(NON_EXISTENT_CARD);
        }
        double result = valueOfPurchase - card.discount(valueOfPurchase);
        return String.format("Total: $%.2f", result);
    }

}
