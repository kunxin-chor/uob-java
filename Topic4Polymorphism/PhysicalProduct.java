package Topic4Polymorphism;

public class PhysicalProduct extends Product {
    private int stock;
    private double weight;

    // if we define an overloaded constructor for
    // a class, the default constructor is necessary
    public PhysicalProduct() {
        super(); // call the parent's default constructor
        stock = 0; // not necessary, they default to 0 anyway
        weight = 0;
    }

    public PhysicalProduct(String name, String sku, double price, int stock, double weight) {
        super(name, sku, price);
        this.stock = stock;
        this.weight = weight;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // override the parent's calculateTotalPrice
    @Override
    public double calculateTotalPrice() {
        double weightPrice = 0;
        if (weight < 1) {
            weightPrice = 0.50;
        } else if (weight >= 1 && weight <= 10) {
            weightPrice = 5;
        } else {
            weightPrice = 10;
        }
        return price + weightPrice;
    }
}
