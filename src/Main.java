import Adapter.NaiveSolution.LegacyWeatherService;
import Adapter.NaiveSolution.TemperatureData;
import Adapter.NaiveSolution.ThirdPartyWeatherService;
import Factory.FactorySolution.CardTypes;
import Factory.FactorySolution.PaymentMethodFactory;
import Factory.FactorySolution.PaymentProcessor;
import Observer.NaiveSolution.Offer;
import Observer.NaiveSolution.OnlineMarketPlace;
import Observer.NaiveSolution.Product;
import Observer.NaiveSolution.User;


public class Main {
    public static void main(String[] args) {

        OnlineMarketPlace marketPlace = new OnlineMarketPlace();
        marketPlace.addUser(new User("Alice", true, false));
        marketPlace.addUser(new User("ahmed", false, true));
        marketPlace.addUser(new User("Bob", true, true));
        marketPlace.addUser(new User("josef", false, false));

        marketPlace.addProduct(new Product("iPhone 14", 999.99));
        marketPlace.addProduct(new Product("iPhone 15", 999.99));
        marketPlace.addOffer(new Offer("50% off on all products!"));








    }
}
