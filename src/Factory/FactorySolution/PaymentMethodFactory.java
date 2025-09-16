package Factory.FactorySolution;

public class PaymentMethodFactory {

    public PaymentMethod createPaymentMethod(CardTypes cardType , String cardHolder , String cardNumber , String cvv , String expiryDate ) {

        if(cardType == CardTypes.VISA){
            return new Visa(cardHolder,cardNumber,cvv,expiryDate);
        }

        if (cardType == CardTypes.MASTERCARD) {
            return new MasterCard(cardHolder,cardNumber,cvv,expiryDate);
        }

        if (cardType == CardTypes.AMERICANEXPRESS) {
            return new AmericanExpress(cardHolder,cardNumber,cvv,expiryDate);
        }

            throw new IllegalArgumentException("Invalid card type");
    }
}
