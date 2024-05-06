import java.util.*;
import java.io.*;

public class ReverseSortFile {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = console.nextLine();

        // Check if the file exists
        File file = new File(filename);
        while (!file.exists()) {
            System.out.println("The file " + filename + " does not exist. Please try again.");
            System.out.print("Enter the filename: ");
            filename = console.nextLine();
            file = new File(filename);
        }

        // Read the file and store the words in an ArrayList
        ArrayList<String> words = new ArrayList<>();
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String word = input.next();
                if (Character.isLetter(word.charAt(0))) {
                    words.add(word);
                }
            }
        }

        System.out.println("    Unsorted words:\n");
        for (String word : words) {
            System.out.println(word);
        }

        // Sort the words in reverse order
        Collections.sort(words, Collections.reverseOrder());

        // Print the sorted words
        System.out.println("\n    Sorted words:\n");
        for (String word : words) {
            System.out.println(word);
        }

        // Append the sorted words to the original file
        try (PrintWriter output = new PrintWriter(new FileWriter(file, true))) {
            output.println("\nSorted words:");
            for (String word : words) {
                output.println(word);
            }
        }
    }
}