package Observer.ObserverImp;

public class JobFinder implements Subscriber {

    private String name;

    public JobFinder(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message){
        System.out.println("JobFinder " + name + " received notification: " + message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
