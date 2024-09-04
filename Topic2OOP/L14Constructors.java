package Topic2OOP;

public class L14Constructors {
    public static void main(String[] args) {
        Customer customer1 = new Customer(); // <-- when we say `new Customer()` we are calling the constructor

        System.out.println(customer1.getFirstName());  
        System.out.println(customer1.getLastName());
        System.out.println(customer1.getMonthsInSystem());

        Bill b = new Bill();
        System.out.println("bill reference = " + b.getReference());

        Bill b2 = new Bill("REF-1212", 120);
        System.out.println("b2 = " + b2.getReference() + " - " + b2.getTotal());
    }
}

class Bill {
    private String reference;
    private double total; // <-- by default if unassigned, primitive value will have a default 0

    public Bill() {
        reference = "0000";
        total = 0.0;
    }

    // Overloaded constructor: default constructor + setter
    // an overloaded method is a method that the same as another method
    // but with data types as parameters
    public Bill(String reference, double total) {
        this.reference = reference;
        this.total = total;
    }

    public Bill(String reference) {
        this.reference = reference;
    }



    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
}

class Customer {

    // a constructor is a method which name is the same as the class
    // and is usually public
    // it is known as the default constructor because when we say `new Customer()`
    // this is the constructor called by default
    public Customer() {
        // the default value for firstName is "N/A"
        // the default value for lastName is "N/A"
        firstName = "N/A";
        lastName = "N/A";
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // if a member of a class is marked as private
    // it means only methods in that class can access it
    // and no other classes could
    private String firstName;  // <-- for a variable that stores an object, the defaut value is null
    private String lastName;
    private int monthsInSystem; // <-- for any primtiive, the default value is 0

    // getter and setter methods
    // public access means can be accessed or used by any classes
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMonthsInSystem() {
        return this.monthsInSystem;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // setter allow us to change the value of a property of the class
    public void setFirstName(String newFirstName) {

        // we can put validation rules and other business logic in setters
        if (newFirstName.length() > 0) {
            // assign newFirstName to be the new value of the
            // firstName property
            firstName = newFirstName;
        }

    }

    public void setMonthsInSystem(int monthsInSystem) {
        if (monthsInSystem >= 0) {
            this.monthsInSystem = monthsInSystem;
        }
    }
}