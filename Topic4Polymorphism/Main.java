package Topic4Polymorphism;
import java.util.ArrayList;


public class Main {
    public static void main(String args[]) {

        // Polymorphism "of many forms"
        // 1. A more generic reference can store 
        // a more specific object if they are in the same
        // class hierarchy
        // Product product = new DigitalProduct();
        // Product product2 = new PhysicalProduct();

        // one issue: since the variable type is `Product`
        // we cannot use it to refer any of the methods
        // that the child class will have
        // product.getFileName(); // <-- does not work

        // this works, BUT is considered bad practice
        // ((DigitalProduct)product).getFileName();

        // if a reference of a more generic type can
        // store an instance of a more specific type
        // that's the case for ArrayList and other collections
        ArrayList<Product> catalog = new ArrayList<>();
        catalog.add(new DigitalProduct("Lord of the Rings Ebook", "EBK1", 50, "mp3", "lotr.mp3", 20000));
        catalog.add(new PhysicalProduct("ACME Anvil", "ACME01", 2000, 5, 50));
    
        
        for (Product p : catalog) {
            // when Java complies the program 
            // it has NO IDEA if p is a digital product or physical product
            // polymorphism happens depending on the specific type of p
            // there will be a different behaviour
            System.out.println(p.getName() + " = " + p.calculateTotalPrice());

        }

        // we can add DigitalProduct or PhysicalProduct to an array list of purchasable
        // because Product implements Purchasable
        ArrayList<Purchaseable> purchaseSummary = new ArrayList<>();
        purchaseSummary.add(new DigitalProduct("Lord of the Rings Ebook", "EBK1", 50, "mp3", "lotr.mp3", 20000));
        purchaseSummary.add(new Subscription("Prime Movies", 2.5, 30, new ArrayList<String>()));

        for (Purchaseable purchase : purchaseSummary) {
            System.out.println(purchase.getPurchaseSummary());
        }







    }
}
