package Q2;
import java.util.*;

public class TestCar {
    public static void main(String[] args) {
        // Create an ArrayList of Car objects
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Ferrari"));
        cars.add(new Car("Lamborghini"));
        cars.add(new Car("Porsche"));
        cars.add(new Car("Bugatti"));
        cars.add(new Car("McLaren"));
        cars.add(new Car("Aston Martin"));

        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter index: ");

        String index = obj1.nextLine();

        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter element: ");

        String element = obj2.nextLine();

        // Convert the index from String to int
        int indexInt = Integer.parseInt(index);

        // Insert a new Car at index
        cars.add(indexInt, new Car(element));

        // Create a LinkedList from the ArrayList
        LinkedList<Car> linkedCars = new LinkedList<>(cars);

        Scanner obj3 = new Scanner(System.in);
        System.out.println("Enter element to be Inserted: ");

        String elementInserted = obj3.nextLine();

        Scanner obj4 = new Scanner(System.in);
        System.out.println("Enter element to be Removed: ");

        String elementRemoved = obj4.nextLine();

        // Insert a new Car at the beginning and remove the last Car
        linkedCars.addFirst(new Car(elementInserted));
        linkedCars.remove(new Car(elementRemoved));

        // Traverse the list forward
        System.out.println("Forward traversal:");
        for (Car car : linkedCars) {
            System.out.println(car);
        }

        // Traverse the list backward
        System.out.println("\nBackward traversal:");
        ListIterator<Car> iterator = linkedCars.listIterator(linkedCars.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}