package Topic05_Packages.accounting;

// if a class is public, then it's shared ACROSS packages
// ALL OTHER PACKAGES can access
public class Transaction {
    private double amount;
    private Long senderID;
    private Long destinationID;
    public Transaction(double amount, Long senderID, Long destinationID) {
        this.amount = amount;
        this.senderID = senderID;
        this.destinationID = destinationID;
    }
    
}
