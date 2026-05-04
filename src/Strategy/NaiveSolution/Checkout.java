package Strategy.NaiveSolution;

public class Checkout {

    public void processPayment(double amount, PaymentMethod paymentMethod)
    {
        if(paymentMethod.equals(PaymentMethod.VISA_CARD)) {
            System.out.println("Processing visa card payment of $" + amount);
        } else if (paymentMethod.equals(PaymentMethod.PAYPAL)) {
            System.out.println("Processing PayPal payment of $" + amount);
        } else if (paymentMethod.equals(PaymentMethod.BANK_TRANSFER)) {
            System.out.println("Processing bank transfer payment of $" + amount);
        } else {
            System.out.println("Unsupported payment method: " + paymentMethod);
        }
    }
}
