public class TownHouse {
    private Address address;
    private String color;
    private int noOfBeds;
    private int noOfWashRooms;
    private int noOfFloors;
    private int yearOfConstruction;
    private boolean isWaterFront;
    private double dailyRent;
    private double discountRate;

    // No-arg constructor
    public TownHouse() {
    }

    // First constructor
    public TownHouse(Address address, String color, int noOfBeds, int noOfWashRooms) {
        this.address = address;
        this.color = color;
        this.noOfBeds = noOfBeds;
        this.noOfWashRooms = noOfWashRooms;
    }

    // Second constructor
    public TownHouse(Address address, String color, int noOfBeds, int noOfWashRooms, int noOfFloors,
            int yearOfConstruction, boolean isWaterFront, double dailyRent, double discountRate) {
        this(address, color, noOfBeds, noOfWashRooms); // Call the first constructor
        this.noOfFloors = noOfFloors;
        this.yearOfConstruction = yearOfConstruction;
        this.isWaterFront = isWaterFront;
        this.dailyRent = dailyRent;
        this.discountRate = discountRate;
    }

    // Accessor methods
    public Address getAddress() {
        return this.address;
    }

    public String getColor() {
        return this.color;
    }

    public int getNoOfBeds() {
        return this.noOfBeds;
    }

    public int getNoOfWashRooms() {
        return this.noOfWashRooms;
    }

    public int getNoOfFloors() {
        return this.noOfFloors;
    }

    public int getYearOfConstruction() {
        return this.yearOfConstruction;
    }

    public boolean getIsWaterFront() {
        return this.isWaterFront;
    }

    public double getDailyRent() {
        return this.dailyRent;
    }

    public double getDiscountRate() {
        return this.discountRate;
    }

    // Mutator methods
    public void setAddress(Address address) {
        this.address = address;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNoOfBeds(int noOfBeds) {
        this.noOfBeds = noOfBeds;
    }

    public void setNoOfWashRooms(int noOfWashRooms) {
        this.noOfWashRooms = noOfWashRooms;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public void setIsWaterFront(boolean isWaterFront) {
        this.isWaterFront = isWaterFront;
    }

    public void setDailyRent(double dailyRent) {
        this.dailyRent = dailyRent;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    // Calculate total rent
    public double calcRent() {
        return dailyRent * (1 - discountRate);
    }

    // Display details of the town house
    public String toString() {
        return "Address: " + address + "\nColor: " + color + "\nNumber of beds: " + noOfBeds + "\nNumber of washrooms: "
                + noOfWashRooms + "\nNumber of floors: " + noOfFloors + "\nYear of construction: " + yearOfConstruction
                + "\nIs waterfront: " + isWaterFront + "\nDaily rent: " + dailyRent + "\nDiscount rate: " + discountRate
                + "\nTotal rent: " + calcRent();
    }
}