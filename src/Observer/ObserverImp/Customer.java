package Observer.ObserverImp;

public class Customer implements Subscriber{
    String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println("Customer " + name + " received notification: " + message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
