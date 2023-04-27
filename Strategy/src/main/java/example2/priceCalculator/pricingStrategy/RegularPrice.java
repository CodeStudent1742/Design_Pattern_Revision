package example2.priceCalculator.pricingStrategy;

public class RegularPrice implements PricingStrategy{

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsLetter) {
        if(isSignedUpForNewsLetter){
            System.out.println("User subscribed to the newsletter, you should choose a different pricing strategy");
        }else{
            System.out.println("Normal price:" + price);
        }
    }
}
