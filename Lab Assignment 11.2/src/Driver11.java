// Date: 05/2/2024
// Creator: Matthew Cheung
// Teacher: MD. Istiaque Shariar

import java.util.Scanner;

public class Driver11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSelect the question number to execute (1-5) or 0 to exit:");
            System.out.println("1. Fibonachi");
            System.out.println("2. Reverse Display");
            System.out.println("3. String Counter");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                Fibonachi.Fibonachi();
                break;
                case 2:
                ReverseDisplay.ReverseDisplay();
                    break;
                case 3:
                StringCounter.StringCounter();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5, or 0 to exit.");
                    break;
            }
        } while (choice != 0);
    }
}