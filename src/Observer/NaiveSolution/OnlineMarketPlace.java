package Observer.NaiveSolution;

import java.util.ArrayList;
import java.util.List;

public class OnlineMarketPlace {
    private List<User> users;
    private List<Product> products;
    private List<Offer> offers;

    public OnlineMarketPlace() {
        this.users = new ArrayList<>();
        this.products = new ArrayList<>();
        this.offers = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void addProduct(Product product) {
        this.products.add(product);
        notifyUsers(product);
    }

    public void addOffer(Offer offer) {
        offers.add(offer);
        notifyUsers(offer);
    }

    private void notifyUsers(Product product) {
        users.forEach(user -> {
            if (user.isSubscribedToProducts()) {
                user.notify(product);
            }
        });
    }

    private void notifyUsers(Offer offer) {
        users.forEach(user -> {
            if (user.isSubscribedToOffers()) {
                user.notify(offer);
            }
        });
    }



}
