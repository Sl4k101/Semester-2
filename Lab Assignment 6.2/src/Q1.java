import java.util.Scanner;

public class Q1 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String operation;
        double num1 = 0;
        double num2 = 0;

        System.out.println("Enter operation (Add/Subtract/Multiply/Divide): ");
        operation = scanner.nextLine();

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter first number: ");
                num1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter second number: ");
                num2 = Double.parseDouble(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        performOperation(operation, num1, num2);
    }

    public static void performOperation(String operation, double num1, double num2) {
        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "subtract":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "multiply":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "divide":
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please enter Add, Subtract, Multiply, or Divide.");
                break;
        }
    }
}