package Topic05_Packages.accounting;

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
