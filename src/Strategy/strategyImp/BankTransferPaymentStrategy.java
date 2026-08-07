package Strategy.strategyImp;

public class BankTransferPaymentStrategy implements PaymentStrategy {
    @Override
    public void calculatePrice(double amount) {
        System.out.println("Processing Bank Transfer Payment ...");
        System.out.println("calculating fees of the amount " + amount + "for Bank Transfer...");
    }
}
