import java.util.*;

public class TestGenericStack {
    public static void main(String[] args) {
        GenericStack<SportsCar> stack = new GenericStack<>();
        stack.push(new SportsCar("Ferrari"));
        stack.push(new SportsCar("Lamborghini"));
        stack.push(new SportsCar("Porsche"));
        stack.push(new SportsCar("McLaren"));
        stack.push(new SportsCar("Bugatti"));

        // Use toString() method for display
        System.out.println(stack);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter car: ");

        String model = scanner.nextLine();

        // Test the search method
        SportsCar searchCar = new SportsCar(model);
        int position = stack.search(searchCar);
        if (position != -1) {
            System.out.println("Found " + searchCar + " at position " + position);
        } else {
            System.out.println(searchCar + " is not in the stack");
        }
    }
}