import java.util.Scanner;
import java.util.InputMismatchException;

public class Q3 {
    public void run() {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter an integer between 1 and 12: ");
            try {
                int monthIndex = scanner.nextInt() - 1; // subtract 1 because array indices start at 0
                System.out.println(months[monthIndex] + " has " + dom[monthIndex] + " days.");
                break; // exit the loop if the input is valid
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Wrong number");
                scanner.next(); // consume the invalid input
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // consume the invalid input
            }
        }
    }
}