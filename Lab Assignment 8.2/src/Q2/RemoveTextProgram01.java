package Q2;

import java.io.*;
import java.util.*;

public class RemoveTextProgram01 {
    public static void Q2Program1() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hank", "Irene", "John");
        String filename = "names.txt";

        // Use StringBuilder
        StringBuilder sb = new StringBuilder();
        for (String name : names) {
            sb.append(name).append("\n");
        }

        // Write names to the file
        try (PrintWriter out = new PrintWriter(filename)) {
            out.print(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

        // User input for name to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to remove: ");
        String nameToRemove = scanner.nextLine();

        // Read names, filter the list, and write to new file
        try (Scanner fileScanner = new Scanner(new File(filename));
             PrintWriter out = new PrintWriter("newNames.txt")) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                if (!name.equals(nameToRemove)) {
                    out.println(name);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}