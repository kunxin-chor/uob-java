package Topic05_Packages.shipping;

// Only classes in the shipping package (i.e, the package that is in right now)
// can create, access and mutate Address objects
// NOTE: no access modifier before the `class` means "package access"
class Address {
    // If a variable has no access modifier then it
    // assumed to be `package access`. All other classes
    // in the same package can read and modify it
    String streetName;
    String buildingNumber;
    String postalCode;
    String unitNumber;
    int region;
    public Address(String streetName, String buildingNumber, String postalCode, String unitNumber, int region) {
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.postalCode = postalCode;
        this.unitNumber = unitNumber;
        this.region = region;
    }

    String getAddress() {
        return streetName + " " + buildingNumber;
    }
    

}
