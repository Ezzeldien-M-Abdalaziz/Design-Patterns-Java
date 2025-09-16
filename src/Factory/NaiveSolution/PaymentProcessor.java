package Factory.NaiveSolution;

public class PaymentProcessor {
    public void processPayment(String cardType, double amount , String cardHolder , String cardNumber , String cvv , String expiryDate ){
        //logic of create the real card and processing
        PaymentMethod paymentMethod = null;
        if(cardType.equalsIgnoreCase(CardTypes.VISA.toString())){
            paymentMethod = new Visa(cardHolder,cardNumber,cvv,expiryDate);
        } else if (cardType.equalsIgnoreCase(CardTypes.MASTERCARD.toString())) {
            paymentMethod = new MasterCard(cardHolder,cardNumber,cvv,expiryDate);
        } else if (cardType.equalsIgnoreCase(CardTypes.AMERICANEXPRESS.toString())) {
            paymentMethod = new AmericanExpress(cardHolder,cardNumber,cvv,expiryDate);
        }else{
            throw new IllegalArgumentException("Invalid card type");
        }

        //process payment
        paymentMethod.authorizePayment();
        paymentMethod.startMoneyTransfer();
        paymentMethod.CalculatePaymentFees(amount);
    }

}
