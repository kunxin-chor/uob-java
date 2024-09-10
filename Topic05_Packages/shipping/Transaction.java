package Topic05_Packages.shipping;

public class Transaction {
    private Address address;
    private String recipientName;
    private Long shipmentID;
    public Transaction(String destinationAddress, String recipientName, Long shipmentID) {
        this.address = new Address(recipientName, recipientName, destinationAddress, recipientName, 0);
        this.recipientName = recipientName;
        this.shipmentID = shipmentID;
    }
    @Override
    public String toString() {
        // use package access to get the streetName from `address`.
        return address.streetName;
    }
    
    // package only access
    void doSomeProcessing() {

    }
}
