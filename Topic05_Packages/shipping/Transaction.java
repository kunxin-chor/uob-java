package Topic05_Packages.shipping;

public class Transaction {
    private String destinationAddress;
    private String recipientName;
    private Long shipmentID;
    public Transaction(String destinationAddress, String recipientName, Long shipmentID) {
        this.destinationAddress = destinationAddress;
        this.recipientName = recipientName;
        this.shipmentID = shipmentID;
    }
    
}
