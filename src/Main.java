import Adapter.NaiveSolution.LegacyWeatherService;
import Adapter.NaiveSolution.TemperatureData;
import Adapter.NaiveSolution.ThirdPartyWeatherService;
import Factory.FactorySolution.CardTypes;
import Factory.FactorySolution.PaymentMethodFactory;
import Factory.FactorySolution.PaymentProcessor;
import Observer.ObserverImp.*;
import Observer.NaiveSolution.User;
import Strategy.NaiveSolution.Checkout;
import Strategy.NaiveSolution.MemberShipType;
import Strategy.NaiveSolution.PaymentMethod;
import Strategy.NaiveSolution.Product;


public class Main {
    public static void main(String[] args) {

        Product product = new Product("Laptop", 1200.0);
        double price = product.calculatePrice(MemberShipType.REGULAR);


        Product product2 = new Product("leather", 1100.0);
        double price2 = product.calculatePrice(MemberShipType.GOLD);

        Product product3 = new Product("Samsung", 1200.0);
        double price3 = product.calculatePrice(MemberShipType.PREMIUM);


        Checkout checkout = new Checkout();
        checkout.processPayment(price, PaymentMethod.VISA_CARD);
        checkout.processPayment(price2, PaymentMethod.PAYPAL);
        checkout.processPayment(price3, PaymentMethod.BANK_TRANSFER);









    }
}
