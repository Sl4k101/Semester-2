import java.io.*;

public class FileStats {
    public static void Q3() {
        String filename = "Q3.txt";
        try {
            countFileStats(filename);
        } catch (IOException e) {
            System.out.println("An error occurred while processing the file: " + e.getMessage());
        }
    }

    public static void countFileStats(String filename) throws IOException {
        int charCount = 0, wordCount = 0, lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String trimmedLine = line.trim();
                if (!trimmedLine.isEmpty()) {
                    wordCount += trimmedLine.split("\\s+").length;
                }
            }
        }
        System.out.println("File: " + filename);
        System.out.println("Characters (excluding line breaks): " + charCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lineCount);
    }
}