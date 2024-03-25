//Submitted For: Data Structures and Object Oriented Programming (420-202-RE)
//Submitted By: Matthew Cheung (2331037) For Istique Shariar
//Submitted On: 3/21/2024
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int programNumber;

        do {
            System.out.println("Enter the program number (1-4) or 0 to exit: ");
            programNumber = input.nextInt();

            switch (programNumber) {
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                case 1:
                    Q1 program1 = new Q1();
                    program1.run();
                    break;
                case 2:
                    Q2 program2 = new Q2();
                    program2.run();
                    break;
                case 3:
                    Q3 program3 = new Q3();
                    program3.run();
                    break;
                case 4:
                    Q4 program4 = new Q4();
                    program4.run();
                    break;
                default:
                    System.out.println("Invalid program number.");
                    break;
            }
        } while (programNumber != 0);
    }
}