package Strategy.strategyImp;

public class PremiumPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(double price) {
        return price * 0.8;
    }
}
