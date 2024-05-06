import java.util.Scanner;

public class StringCounter {
    public static void StringCounter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0);

        System.out.println("Enter the Type of method you want to use: ");
        System.out.println("1. Recursive count\n2. Iterative count");
        int method = scanner.nextInt();

        if (method == 1) {
            System.out.println("Recursive count: " + count(str, ch));
        } else if (method == 2) {
            System.out.println("Iterative count: " + iterativeCount(str, ch));
        } else {
            System.out.println("Invalid input");
        }
    }

    public static int count(String str, char a) {
        if (str.length() == 0) {
            return 0;
        } else {
            return count(str.substring(1), a) + ((str.charAt(0) == a) ? 1 : 0);
        }
    }
    public static int iterativeCount(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
}