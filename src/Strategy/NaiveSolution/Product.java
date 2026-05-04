package Strategy.NaiveSolution;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calculatePrice(MemberShipType membershipType) {
        if(membershipType.equals(MemberShipType.REGULAR)) {
            return price;
        }else if (membershipType.equals(MemberShipType.GOLD)) {
            return price * 0.9; // 10% discount for gold members
        }else if (membershipType.equals(MemberShipType.PREMIUM)) {
            return price * 0.8; // 20% discount for premium members
        }
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
