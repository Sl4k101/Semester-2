package LabAssignment6_1;
//Submitted For: Data Structures and Object Oriented Programming (420-202-RE)
//Submitted By: Matthew Cheung (2331037) For Istique Shariar
//Submitted On: 3/20/2024
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select the program you want to run:");
            System.out.println("1. Program Q1");
            System.out.println("2. Program Q2");
            System.out.println("3. Program Q3");
            System.out.println("4. Program Q4");
            System.out.println("0. Exit");

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
                    Q4.runQ4();
                    break;
                case 5:
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
