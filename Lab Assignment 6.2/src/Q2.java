import java.util.Scanner;

public class Q2 {
    public void run() {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 12: ");
        try {
            int monthIndex = scanner.nextInt() - 1; // subtract 1 because array indices start at 0
            System.out.println(months[monthIndex] + " has " + dom[monthIndex] + " days.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong number");
        }
    }
}