package Observer.NaiveSolution;

public class User {
    private String name;
    private boolean isSubscribedToProducts;
    private boolean isSubscribedToOffers;

    public User(String name, boolean isSubscribedToProducts, boolean isSubscribedToOffers) {
        this.name = name;
        this.isSubscribedToProducts = isSubscribedToProducts;
        this.isSubscribedToOffers = isSubscribedToOffers;
    }

    public void notify(Product product) {
        System.out.println("User " + name + " has been notified about new product: " + product.getName() + " with price: " + product.getPrice());
    }

    public void notify(Offer offer) {
        System.out.println("User " + name + " has been notified about new offer: " + offer.getMessage());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSubscribedToProducts() {
        return isSubscribedToProducts;
    }

    public void setSubscribedToProducts(boolean subscribedToProducts) {
        isSubscribedToProducts = subscribedToProducts;
    }

    public boolean isSubscribedToOffers() {
        return isSubscribedToOffers;
    }

    public void setSubscribedToOffers(boolean subscribedToOffers) {
        isSubscribedToOffers = subscribedToOffers;
    }



}
