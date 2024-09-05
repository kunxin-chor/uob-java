package Topic4Polymorphism;

import java.util.ArrayList;

// When a class implements an interface,
// we are saying the class possess some kind of traits represented by interface
public class Subscription implements Purchaseable {
    private String name; // what the subscription is for
    private double fees; // how much the subscription is
    private int recurringPeriod; // how often is the subscription paid for (in days)
    private ArrayList<String> permissions = new ArrayList<String>();
    
    public Subscription() {
    }

    public Subscription(String name, double fees, int recurringPeriod, ArrayList<String> permissions) {
        this.name = name;
        this.fees = fees;
        this.recurringPeriod = recurringPeriod;
        this.permissions = permissions;
    }

    public String getPurchaseSummary() {
        return name + " recurring period =" + recurringPeriod + " =  at $" + fees;
    }
    

    
}
