package example2.priceCalculator.pricingStrategy;

public class SalePrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsLetter) {
        if (isSignedUpForNewsLetter == true) {
            System.out.println("Discount: " + price / 2);
        } else {
            System.out.println("You are not signed for newsletter, you do not have discount. Price is: " + price);
        }
    }
}
