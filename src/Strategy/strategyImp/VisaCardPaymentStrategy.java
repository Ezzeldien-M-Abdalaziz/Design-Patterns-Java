package Strategy.strategyImp;

public class VisaCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void calculatePrice(double amount) {
        System.out.println("Processing Visa Card Payment ...");
        System.out.println("calculating fees of the amount " + amount + "for Visa Cards...");
    }
}
