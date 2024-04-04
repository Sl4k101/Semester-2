package Q2;

import java.io.*;
import java.util.*;

public class RemoveTextProgram02 {
    public static void Q2Program2() {
        String filename = "names.txt";

        // User input for name to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to remove: ");
        String nameToRemove = scanner.nextLine();

        // Read names, filter the list, and overwrite the original file
        List<String> names = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                if (!name.equalsIgnoreCase(nameToRemove)) {
                    names.add(name);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            return;
        }

        try (PrintWriter out = new PrintWriter(filename)) {
            for (String name : names) {
                out.println(name);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}