package Q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LetterCounter {

    private int[] letterCounts = new int[26]; // 26 letters in the alphabet

    public void countLetters(String filename) {
        try {
            Scanner fileScanner = new Scanner(new File(filename));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().toUpperCase(); // Convert to upper case for case insensitivity
                for (char c : line.toCharArray()) {
                    if (c >= 'A' && c <= 'Z') {
                        letterCounts[c - 'A']++;
                    }
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public void displayCounts() {
        for (int i = 0; i < letterCounts.length; i++) {
            System.out.println("Number of " + (char)(i + 'A') + "'s: " + letterCounts[i]);
        }
    }

    public static void Q2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String filename = input.next();

        LetterCounter counter = new LetterCounter();
        counter.countLetters(filename);
        counter.displayCounts();
    }
}

