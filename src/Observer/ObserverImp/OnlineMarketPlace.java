package Observer.ObserverImp;

import java.util.*;

public class OnlineMarketPlace {
    private Map<EventType, List<Subscriber>> subscribers;
    private List<Product> products;
    private List<Offer> offers;
    private List<JobFinder> jobFinders;

    public OnlineMarketPlace() {
        this.subscribers = new HashMap<>();
        initializeSubscriberEvents();
        this.products = new ArrayList<>();
        this.offers = new ArrayList<>();
        this.jobFinders = new ArrayList<>();
    }

    public void initializeSubscriberEvents() {
        subscribers.put(EventType.NEW_PRODUCT, new ArrayList<>());
        subscribers.put(EventType.NEW_OFFER, new ArrayList<>());
        subscribers.put(EventType.JOB_OPENING, new ArrayList<>());
    }

    public void subscribe(EventType eventType , Subscriber subscriber) {
        subscribers.get(eventType).add(subscriber);
    }

    public void unSubscribe(EventType eventType , Subscriber subscriber) {
        subscribers.get(eventType).remove(subscriber);
    }

    public void addNewProduct(Product product) {
        products.add(product);
        notifySubscribers(EventType.NEW_PRODUCT , "new product has been added to the list: " + product.getName());
    }

    public void addNewOffer(Offer offer) {
        offers.add(offer);
        notifySubscribers(EventType.NEW_OFFER ,"new offer has been added to the list: " + offer.getName());
    }

    public void addNewJobOpening(String jobTitle) {
        notifySubscribers(EventType.JOB_OPENING , "new job opening has been added to the list: " + jobTitle);
    }

    private void notifySubscribers(EventType eventType , String s) {
        subscribers.get(eventType).forEach(subscriber -> subscriber.notify(s));
    }

}
