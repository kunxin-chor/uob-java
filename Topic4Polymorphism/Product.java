package Topic4Polymorphism;

public class Product {
    protected String name;
    protected String sku;
    protected double price;

    // default constructor
    public Product() {
        name= "N/A";
        sku = "N/A";
        price = 0; // not necessary, since default values 
                   // for primitives is 0.
    }

    public Product(String name, String sku, double price) {
        this.name = name;
        this.sku = sku;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateTotalPrice() {
        return price;
    }

    
}
