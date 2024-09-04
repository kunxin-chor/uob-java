public class L12PrivateAccess {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        // if all properties can be publicly accessed and modified
        // it's hard to implement validation
        customer1.setFirstName("Jon");
        customer1.setMonthsInSystem(-122);
        System.out.println(customer1.getFirstName());
    }
}

class Customer {
    // if a member of a class is marked as private
    // it means only methods in that class can access it
    // and no other classes could
    private String firstName;
    private String lastName;
    private int monthsInSystem;

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
