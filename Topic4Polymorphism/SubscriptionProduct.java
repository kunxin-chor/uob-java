package Topic4Polymorphism;

public class SubscriptionProduct extends Product {
    @Override
    public double calculateTotalPrice() {
        return price; 
    }
}
