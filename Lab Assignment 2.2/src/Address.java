public class Address {
    private String civicNumber;
    private String streetName;
    private String city;
    private String postalCode;
    private String province;
    private String country;

    // No-arg constructor
    public Address() {
    }

    // Constructor that accepts all parameters
    public Address(String civicNumber, String streetName, String city, String postalCode, String province,
            String country) {
        this.civicNumber = civicNumber;
        this.streetName = streetName;
        this.city = city;
        this.postalCode = postalCode;
        this.province = province;
        this.country = country;
    }

    public String toString() {
        return civicNumber + " " + streetName + ", " + city + ", " + postalCode + ", " + province + ", " + country;
    }
}
