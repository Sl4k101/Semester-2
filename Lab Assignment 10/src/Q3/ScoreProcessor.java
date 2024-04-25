package Q3;

import java.util.Scanner;
import java.net.URL;

public class ScoreProcessor {
    public static void Q3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String urlString = input.next();

        try {
            URL url = new URL(urlString);
            Scanner scanner = new Scanner(url.openStream());

            int count = 0;
            double sum = 0;
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) { // Check if the next token is a double
                    double score = scanner.nextDouble();
                    sum += score;
                    count++;
                } else {
                    scanner.next(); // Skip the non-double value
                }
            }
            scanner.close();

            if (count > 0) {
                System.out.println("Total of scores: " + sum);
                System.out.printf("Average of scores: %.2f\n", (sum / count)); // Print with 2 decimal points
            } else {
                System.out.println("No scores to process.");
            }

        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (java.io.IOException ex) {
            System.out.println("I/O Errors: " + ex.getMessage());
        }
    }
}
