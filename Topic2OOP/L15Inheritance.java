package Topic2OOP;

import java.util.ArrayList;

public class L15Inheritance {
    public static void main(String args[]) {
        SavingAccount account = new SavingAccount("Jon", "Snow", 1000, 0.05);
        System.out.println(account); // when we try to print object, Java will automatically call `toString()` and use its return value



        // when we define a class we are defining a new data type
         // This arraylist can only store instances of SavingAccount
        ArrayList<SavingAccount> accounts = new ArrayList<SavingAccount>();
        accounts.add(account);  // <-- works
        //accounts.add(new CheckingAccount()); // <-- error

        // what if we want to be able to store checking accounts and saving accounts together?
        // create an arraylist that stores the parent class of checking account and saving account
        ArrayList<BankAccount> allAccounts = new ArrayList<BankAccount>();
        allAccounts.add(new SavingAccount("Jon", "Snow", 1000, 0.0025));
        allAccounts.add(new CheckingAccount("Tyrion", "Lannister", 2000.0, 250.0));

        for (BankAccount a : allAccounts) {
            System.out.println(a);
        }

    }
}



// Demonstratio of grandchild inheritance
// usually it's a bad practice to have a very deep inheritance chain
// class DebitCardAccount extends SavingAccount {
//     private String creditCardNumber;
//     private int cvc;

//     public DebitCardAccount() {
//         super();
//     }

//     public DebitCardAccount(String firstName, String lastName, double balance, double interestRate, String cardCreditNumber, int cvc) {
//         super(firstName, lastName, balance, interestRate);
//         this.creditCardNumber = cardCreditNumber;
//         this.cvc = cvc;
//     }
// }



// How to support saving accounts and checking account?
// saving accounts have interest rate, but no overdraft limit
// checking accounts don't have interest rate, but have overdraft limit
class BankAccount {
    // private: only methods in this class can access
    private String firstName;
    protected String lastName;  // protected means descendant classes can access 
    protected double balance;

    public BankAccount() {
        firstName = "N/A";
        lastName = "N/A";
        balance = 0;
    }

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return firstName + " " + lastName + "," + balance;
    }
    
    
}


// do inheritance with extends
// the child class inherits all the properties and methods of the parent class
// syntax:
// class <child class> extends <parent class> { }
class SavingAccount extends BankAccount {
    private double interestRate;

    // set the default interestRate to 0.001
    public SavingAccount() {
        // call the parent's default constructor
        super();  // `super` here refers to the parent class
        interestRate = 0.001;
    }

    public SavingAccount(String firstName, String lastName, double balance, double interestRate) {
        // call the parent's the overloaded class
        super(firstName, lastName, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getInfo() {
        // return a string that shows the balance, the interest rate and the first name and last name
        // note: we need use getFirstName() because firstName is private in the parent class
        // whereas lastName and balance are protected in the parent class.
        return getFirstName() + " " + lastName + " have balance of " + balance + " and interest rate is " + interestRate;
    }

    // the child's class toString will override the parent's class toString
    public String toString() {
        return getFirstName() + " " + lastName + ", balance=" + balance + " intrestRate=" + interestRate;
    }
}

class CheckingAccount extends BankAccount {
    private double overDraftLimit;
    public CheckingAccount(String firstName, String lastName, double balance, double overdraftLimit) {
        super(firstName, lastName, balance);
        this.overDraftLimit = overdraftLimit;
    }

    public String toString() {
        return super.toString() +  ", overdraftLimit=" + overDraftLimit;
    }

}