package Factory.AbstractFactorySolution;

public interface PaymentMethodFactory {

    PaymentMethod createPaymentMethod(CardType cardType, String cardHolder, String cardNumber,
                                                   String cvv, String expiryDate);
}
