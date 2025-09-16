package Factory.FactorySolution;

public class AmericanExpress extends PaymentMethod {

    public AmericanExpress(String cardHolder, String cardNumber, String cvv, String expiryDate) {
        super(cardHolder, cardNumber, cvv, expiryDate);
    }

    @Override
    public void authorizePayment() {
        System.out.println("AmericanExpress Authorize Payment");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("AmericanExpress Start Money Transfer");
    }

    @Override
    public void CalculatePaymentFees(double amount) {
        System.out.println("AmericanExpress Calculate Payment Fees " + amount);
    }


}
