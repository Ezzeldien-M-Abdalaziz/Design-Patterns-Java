package SOLID_principles;

public class MasterCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing master card payments...");
    }
}
