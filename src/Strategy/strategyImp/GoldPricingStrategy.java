package Strategy.strategyImp;

public class GoldPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(double price) {
        return price *  0.9;
    }
}
