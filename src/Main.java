import Factory.FactorySolution.CardTypes;
import Factory.FactorySolution.PaymentMethodFactory;
import Factory.FactorySolution.PaymentProcessor;


public class Main {
    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new PaymentProcessor(new PaymentMethodFactory());
        paymentProcessor.processPayment(CardTypes.VISA , 100 , "s" , "1231231231" , "123" , "3242342");




    }
}
