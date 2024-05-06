import java.util.Scanner;

public class ReverseDisplay {

    public static void ReverseDisplay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("Enter the Type of method you want to use: ");
        System.out.println("1. Recursive reverse display\n2. Iterative reverse display");
        int method = scanner.nextInt();

        if (method == 1) {
            System.out.println("Recursive reverse display: ");
            reverseDisplay(str);
        } else if (method == 2) {
            System.out.println("Iterative reverse display: ");
            iterativeReverseDisplay(str);
        } else {
            System.out.println("Invalid input");
        }
    }
    
    public static void iterativeReverseDisplay(String value) {
        for (int i = value.length() - 1; i >= 0; i--) {
            System.out.print(value.charAt(i));
        }
    }

    public static void reverseDisplay(String value) {
        if (value.length() == 0) {
            return;
        } else {
            System.out.print(value.charAt(value.length() - 1));
            reverseDisplay(value.substring(0, value.length() - 1));
        }
    }
}