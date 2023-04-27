package example2;

import example2.priceCalculator.PriceCalculator;
import example2.priceCalculator.pricingStrategy.RegularPrice;
import example2.priceCalculator.pricingStrategy.SalePrice;

public class Main {

    public static void main(String[] args) {

        PriceCalculator priceCalculator = new PriceCalculator();

        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100, false);

        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100, true);

        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, true);

        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, false);
    }
}
