package Factory.AbstractFactorySolution;

public interface PaymentMethod {

    void authorizePayment();
    void startMoneyTransfer();
    void calculatePaymentFees(double amount);
}
