package Factory;

public class Visa extends PaymentMethod{

    public Visa(String cardHolder, String cardNumber, String cvv, String expiryDate) {
        super(cardHolder, cardNumber, cvv, expiryDate);
    }

    @Override
    public void authorizePayment() {
        System.out.println("Visa authorizePayment...");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("Visa startMoneyTransfer... ");
    }

    @Override
    public void CalculatePaymentFees(double amount) {
        System.out.println("Visa calculatePaymentFees... " + amount);
    }
}
