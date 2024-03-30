import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select the program you want to run:");
            System.out.println("1. Program Q1");
            System.out.println("2. Program Q2");
            System.out.println("3. Program Q3");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    Q1.runQ1();
                    break;
                case 2:
                    Q2.runQ2();
                    break;
                case 3:
                    Q3.runQ3();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }
    }
}
