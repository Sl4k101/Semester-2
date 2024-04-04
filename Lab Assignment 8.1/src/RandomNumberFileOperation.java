import java.io.*;
import java.util.*;

public class RandomNumberFileOperation {
    public static void Q2() throws IOException {
        generateAndSaveNumbers();
        displayExtremes("Q2.txt");
        appendMoreNumbers();
        displayExtremes("Q2.txt");
    }

    public static void generateAndSaveNumbers() throws IOException {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            numbers.add(random.nextInt(11) + 10); // 10 to 20
        }
        saveNumbersToFile(numbers, "Q2.txt");
    }

    public static void saveNumbersToFile(List<Integer> numbers, String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int number : numbers) {
                writer.write(number + "\n");
            }
        }
    }

    public static void displayExtremes(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int highest = Integer.MIN_VALUE;
            int lowest = Integer.MAX_VALUE;
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (number > highest) highest = number;
                if (number < lowest) lowest = number;
            }
            System.out.println("Highest: " + highest + " Lowest: " + lowest);
            appendToFile("Q2Res.txt", "Highest: " + highest + " Lowest: " + lowest + "\n");
        }
    }

    public static void appendMoreNumbers() throws IOException {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            numbers.add(random.nextInt(11) + 20); // 20 to 30
        }
        saveNumbersToFile(numbers, "Q2.txt");
    }

    public static void appendToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(content);
        }
    }
}