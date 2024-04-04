package Q3;

import java.io.*;
import java.util.Scanner;

public class ReplaceTextProgram01 {
    public static void Q3Program1() {
        String filename = "original.txt";
        try (PrintWriter out = new PrintWriter(filename)) {
            out.println("(Remove text) Write two programs that remove all the occurrences of a specified string from a text file. For example, remove the string “John” from the specified file.");
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to be replaced: ");
        String toBeReplaced = scanner.nextLine();
        System.out.print("Enter the replacement string: ");
        String replacement = scanner.nextLine();

        StringBuilder content = new StringBuilder();
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                content.append(line.replace(toBeReplaced, replacement));
                content.append(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            return;
        }

        try (PrintWriter out = new PrintWriter("replaced.txt")) {
            out.print(content.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
