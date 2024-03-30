import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void runQ2() {
        try {
            double[] randomDoubles = generateRandomDoubles(15);
            writeDoublesToFile(randomDoubles, "Q2.txt");
            double[] readDoubles = readDoublesFromFile("Q2.txt");
            displayHighestLowest(readDoubles);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static double[] generateRandomDoubles(int size) {
        Random rand = new Random();
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextDouble() * 100; // Generate random double numbers up to 100
        }
        return arr;
    }

    public static void writeDoublesToFile(double[] doubles, String filename) throws FileNotFoundException {
        try (java.io.PrintWriter output = new java.io.PrintWriter(filename)) {
            for (double value : doubles) {
                output.println(value);
            }
        }
    }

    public static double[] readDoublesFromFile(String filename) throws FileNotFoundException {
        try (Scanner input = new Scanner(new java.io.File(filename))) {
            double[] doubles = new double[15];
            int index = 0;
            while (input.hasNextDouble()) {
                doubles[index++] = input.nextDouble();
            }
            return doubles;
        }
    }

    public static void displayHighestLowest(double[] doubles) {
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;
        for (double value : doubles) {
            if (value > highest) {
                highest = value;
            }
            if (value < lowest) {
                lowest = value;
            }
        }
        System.out.println("Highest number is: " + highest);
        System.out.println("Lowest number is: " + lowest);
    }
}
