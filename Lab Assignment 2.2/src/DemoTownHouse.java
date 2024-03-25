import java.util.Scanner;

public class DemoTownHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TownHouse[] houseArray = new TownHouse[3];

        // TownHouse object using the no-arg constructor
        houseArray[0] = new TownHouse();
        System.out.println("Enter details for the first townhouse:");
        houseArray[0] = createTownHouseUsingNoArgConstructor(scanner);

        // TownHouse object using the first constructor
        System.out.println("Enter details for the second townhouse:");
        houseArray[1] = createTownHouseUsingFirstConstructor(scanner);

        // TownHouse object using the second constructor
        System.out.println("Enter details for the third townhouse:");
        houseArray[2] = createTownHouseUsingSecondConstructor(scanner);

        // Display all objects in array
        for (TownHouse house : houseArray) {
            System.out.println(house);
        }

        // Find the cheapest rental house
        TownHouse cheapestHouse = findCheapestHouse(houseArray);
        System.out.println("The cheapest rental house is: " + cheapestHouse);
    }

    private static TownHouse createTownHouseUsingNoArgConstructor(Scanner scanner) {
        TownHouse house = new TownHouse();
        house.setAddress(readAddress(scanner));
        System.out.print("Color: ");
        house.setColor(scanner.nextLine());
        System.out.print("Number of beds: ");
        house.setNoOfBeds(scanner.nextInt());
        System.out.print("Number of washrooms: ");
        house.setNoOfWashRooms(scanner.nextInt());
        scanner.nextLine();
        return house;
    }

    private static TownHouse createTownHouseUsingFirstConstructor(Scanner scanner) {
        Address address = readAddress(scanner);
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Number of beds: ");
        int noOfBeds = scanner.nextInt();
        System.out.print("Number of washrooms: ");
        int noOfWashRooms = scanner.nextInt();
        scanner.nextLine();
        TownHouse house = new TownHouse(address, color, noOfBeds, noOfWashRooms);
        return house;
    }

    private static TownHouse createTownHouseUsingSecondConstructor(Scanner scanner) {
        Address address = readAddress(scanner);
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Number of beds: ");
        int noOfBeds = scanner.nextInt();
        System.out.print("Number of washrooms: ");
        int noOfWashRooms = scanner.nextInt();
        System.out.print("Number of floors: ");
        int noOfFloors = scanner.nextInt();
        System.out.print("Year of construction: ");
        int yearOfConstruction = scanner.nextInt();
        System.out.print("Is waterfront (true/false): ");
        boolean isWaterFront = scanner.nextBoolean();
        System.out.print("Daily rent: ");
        double dailyRent = scanner.nextDouble();
        System.out.print("Discount rate: ");
        double discountRate = scanner.nextDouble();
        scanner.nextLine();
        return new TownHouse(address, color, noOfBeds, noOfWashRooms, noOfFloors, yearOfConstruction, isWaterFront,
                dailyRent, discountRate);
    }

    private static Address readAddress(Scanner scanner) {
        System.out.print("Civic Number: ");
        String civicNumber = scanner.nextLine();
        System.out.print("Street Name: ");
        String streetName = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("Postal Code: ");
        String postalCode = scanner.nextLine();
        System.out.print("Province: ");
        String province = scanner.nextLine();
        System.out.print("Country: ");
        String country = scanner.nextLine();
        return new Address(civicNumber, streetName, city, postalCode, province, country);
    }

    private static TownHouse findCheapestHouse(TownHouse[] houseArray) {
        TownHouse cheapestHouse = houseArray[0];
        for (int i = 1; i < houseArray.length; i++) {
            if (houseArray[i].calcRent() < cheapestHouse.calcRent()) {
                cheapestHouse = houseArray[i];
            }
        }
        return cheapestHouse;
    }
}
