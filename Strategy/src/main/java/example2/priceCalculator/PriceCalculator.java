package example2.priceCalculator;

import example2.priceCalculator.pricingStrategy.PricingStrategy;

public class PriceCalculator {
    private PricingStrategy pricingStrategy;

    public PriceCalculator() {
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
    public void calculate(int price, boolean isSignedForNewsLetter){
        pricingStrategy.calculatePrice(price,isSignedForNewsLetter);
    }
}
