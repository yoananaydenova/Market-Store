package marketStore;

import marketStore.cards.Bronze;
import marketStore.cards.Card;
import marketStore.cards.Gold;
import marketStore.cards.Silver;
import marketStore.paymentInfo.PaymentInformation;

public class Main {


    public static void main(String[] args) {
        try {
            Card bronzeCard = new Bronze("Simo Simov", 0);
            printInfo(bronzeCard, 150);

            Card silverCard = new Silver("Toni Ivanov", 600);
            printInfo(silverCard, 850);

            Card goldCard = new Gold("Petar Vasilev", 1500);
            printInfo(goldCard, 1300);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


    private static void printInfo(Card card, double purchaseValue) {
        StringBuilder result = new StringBuilder(String.format("Purchase value: $%.2f", purchaseValue))
                .append(System.lineSeparator())
                .append(PaymentInformation.discountRate(card))
                .append(System.lineSeparator())
                .append(PaymentInformation.discount(card, purchaseValue))
                .append(System.lineSeparator())
                .append(PaymentInformation.total(card, purchaseValue));

        System.out.println(result.toString());
    }
}
