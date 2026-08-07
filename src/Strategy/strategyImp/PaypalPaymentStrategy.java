package Strategy.strategyImp;

public class PaypalPaymentStrategy implements PaymentStrategy {
    @Override
    public void calculatePrice(double amount) {
        System.out.println("Processing Paypal Payment ...");
        System.out.println("calculating fees of the amount " + amount + "for Paypal...");
    }
}
