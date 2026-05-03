import Adapter.NaiveSolution.LegacyWeatherService;
import Adapter.NaiveSolution.TemperatureData;
import Adapter.NaiveSolution.ThirdPartyWeatherService;
import Factory.FactorySolution.CardTypes;
import Factory.FactorySolution.PaymentMethodFactory;
import Factory.FactorySolution.PaymentProcessor;
import Observer.ObserverImp.*;
import Observer.NaiveSolution.User;


public class Main {
    public static void main(String[] args) {

        OnlineMarketPlace marketPlace = new OnlineMarketPlace();
        Subscriber alice = new Customer("Alice");
        Subscriber bob = new Customer("Bob");
        Subscriber charlie = new Customer("Charlie");
        Subscriber david = new JobFinder("David");

        marketPlace.subscribe(EventType.NEW_PRODUCT , alice);
        marketPlace.subscribe(EventType.NEW_OFFER , alice);

        marketPlace.subscribe(EventType.NEW_PRODUCT , bob);


        marketPlace.subscribe(EventType.NEW_PRODUCT , charlie);
        marketPlace.subscribe(EventType.NEW_OFFER , charlie);

        marketPlace.subscribe(EventType.JOB_OPENING , david);


        marketPlace.addNewProduct(new Product("Laptop" , 9.99));
        marketPlace.addNewOffer(new Offer("50% off on all electronics!"));

        marketPlace.addNewJobOpening("Software Engineer");














    }
}
