import java.io.IOException;
import java.util.Scanner;

import Q1.Fraction;
import Q2.RemoveTextProgram01;
import Q3.ReplaceTextProgram01;

public class Driver {
    public static void main(String[] args) throws IOException {
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
                    Fraction.Q1();
                    break;
                case 2:
                    RemoveTextProgram01.Q2Program1();
                    break;
                case 3:
                    ReplaceTextProgram01.Q3Program1();
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