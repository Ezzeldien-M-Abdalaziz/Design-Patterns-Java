package Factory.FactorySolution;

public class PaymentProcessor {

    private final PaymentMethodFactory paymentMethodFactory;

    public PaymentProcessor(PaymentMethodFactory paymentMethodFactory) {
        this.paymentMethodFactory = paymentMethodFactory;
    }


    public void processPayment(CardTypes cardType , double amount, String cardHolder , String cardNumber , String cvv , String expiryDate ){

        PaymentMethod paymentMethod = paymentMethodFactory.createPaymentMethod(cardType , cardHolder , cardNumber , cvv , expiryDate);

        //process payment
        paymentMethod.authorizePayment();
        paymentMethod.startMoneyTransfer();
        paymentMethod.CalculatePaymentFees(amount);
    }

}
