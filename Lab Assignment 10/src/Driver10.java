// Date: 04/24/2024
// Creator: Matthew Cheung
// Teacher: MD. Istiaque Shariar

import java.io.IOException;
import java.util.Scanner;

import Q2.LetterCounter;
import Q3.ScoreProcessor;


public class Driver10 {
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Select the question number to execute (1-5) or 0 to exit:");
            System.out.println("1. Addition Quiz");
            System.out.println("2. Letter Counter");
            System.out.println("3. Score Processor");
            System.out.println("4. Author and Book Linker");
            System.out.println("5. Sum the Areas of Geometric Objects");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                QuizDriver.Q1();
                break;
                case 2:
                LetterCounter.Q2();
                    break;
                case 3:
                ScoreProcessor.Q3();
                    break;
                case 4:
                AuthorBookManager.Q4();
                    break;
                case 5:
                    GeometricDriver.Q5();
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