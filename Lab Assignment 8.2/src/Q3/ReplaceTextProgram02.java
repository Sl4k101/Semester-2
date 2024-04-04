package Q3;

import java.io.*;
import java.util.Scanner;

public class ReplaceTextProgram02 {
    public static void Q3Program2() {
        String filename = "original.txt";
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
            System.err.println("File not found: " + e.getMessage());
            return;
        }

        try (PrintWriter out = new PrintWriter(filename)) {
            out.print(content.toString());
        } catch (FileNotFoundException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
