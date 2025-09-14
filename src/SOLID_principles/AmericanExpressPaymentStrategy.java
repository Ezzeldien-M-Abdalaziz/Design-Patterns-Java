package SOLID_principles;

public class AmericanExpressPaymentStrategy implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing american express card payments...");
    }
}
