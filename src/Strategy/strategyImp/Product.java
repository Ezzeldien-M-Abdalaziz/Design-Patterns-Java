package Strategy.strategyImp;

public class Product {
    private String name;
    private double price;
    private PricingStrategy pricingStrategy;

    public Product(String name, double price, PricingStrategy pricingStrategy) {
        this.name = name;
        this.price = price;
        this.pricingStrategy = pricingStrategy;
    }

    public void calculatePrice() {}

}
