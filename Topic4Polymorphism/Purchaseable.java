package Topic4Polymorphism;

// Interfaces does not have data
// So no variables can be added to it
public interface Purchaseable {
    // An interface has public methods which has no definition
    // All classes that implements an interface
    // must provide its own overriden versions
    // of all the methods in the interface
    String getPurchaseSummary();
}
