package Topic2OOP;

import java.util.Scanner;

public class L13EncapsulationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = sc.nextLine();
        System.out.println("Enter last name: ");
        String lastName = sc.nextLine();
        Employee e = new Employee();
        // using the SETTER is optional
        if (firstName.length() > 0) {
            // by not putting the business rules in the setters
            // it means ANYTIME we change the firstName, we need to write a
            // IF statement
            e.firstName = firstName;
        }

        e.lastName = lastName;
    }
}

class Employee {
    public String firstName;
    public String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 0) {
            this.firstName = firstName;
        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 0) {
            this.lastName = lastName;
        }

    }

}

class Wallet {
    private int cents;

    public double getAmountInDollars() {
        return cents / 100.0;
    }

    public double getAmount() {
        return cents;
    }
}
