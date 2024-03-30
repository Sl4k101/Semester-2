import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void runQ1() {
        java.io.File file = new java.io.File("Q1.txt");
        int[] randomInt = randomArray(10);
        int sum = 0;

        java.io.PrintWriter output = null;
        try {
            // Create a file
            output = new java.io.PrintWriter(file);

            // write formatted output to the file
            for (int i = 0; i < randomInt.length; i++) {
                output.print(randomInt[i] + " ");
            }
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                output.close();
            }
        }

        // Create a Scanner for the file
        Scanner input = null;
        try {
            input = new Scanner(file);

            // Read data from a file
            while (input.hasNext()) {
                sum += input.nextInt();
            }
            System.out.println("Sum of the numbers in the file is: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }

    public static int[] randomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
}
