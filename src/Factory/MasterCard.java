package Factory;

public class MasterCard extends PaymentMethod {


    public MasterCard(String cardHolder, String cardNumber, String cvv, String expiryDate) {
        super(cardHolder, cardNumber, cvv, expiryDate);
    }

    @Override
    public void authorizePayment() {
        System.out.println("MasterCard Authorize Payment");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("MasterCard Start Money Transfer");
    }

    @Override
    public void CalculatePaymentFees(double amount) {
        System.out.println("MasterCard Calculate Payment Fees " + amount);
    }
}
