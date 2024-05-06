import java.io.*;
import java.util.*;

public class AuthorBookManager {

    private static final String AUTHORS_FILE = "Authors.txt";
    private static final String BOOKS_FILE = "Books.txt";

    public static void Q4() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the author's name: ");
        String authorName = scanner.nextLine().trim();
        System.out.print("Enter the title of the book: ");
        String bookTitle = scanner.nextLine().trim();
        
        int authorLineNumber = addAuthorInAlphabeticalOrder(authorName);
        addBookIfNotPresent(bookTitle, authorLineNumber);
    }

    private static int addAuthorInAlphabeticalOrder(String authorName) throws IOException {
        File authorsFile = new File(AUTHORS_FILE);
        List<String> authors = new ArrayList<>();

        if (authorsFile.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(authorsFile));
            String line;
            while ((line = reader.readLine()) != null) {
                authors.add(line);
            }
            reader.close();
        }

        int index = Collections.binarySearch(authors, authorName, String.CASE_INSENSITIVE_ORDER);
        if (index < 0) { // If author is not present, add them
            index = -index - 1; // Calculate insertion point
            authors.add(index, authorName);
            PrintWriter writer = new PrintWriter(new FileWriter(authorsFile));
            for (String author : authors) {
                writer.println(author);
            }
            writer.close();
        }

        return index + 1; // Return the line number of the author
    }

    private static void addBookIfNotPresent(String bookTitle, int authorLineNumber) throws IOException {
        File booksFile = new File(BOOKS_FILE);
        Set<String> books = new HashSet<>();

        if (booksFile.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(booksFile));
            String line;
            while ((line = reader.readLine()) != null) {
                books.add(line.substring(line.indexOf(' ') + 1));
            }
            reader.close();
        }

        if (!books.contains(bookTitle)) {
            PrintWriter writer = new PrintWriter(new FileWriter(booksFile, true));
            writer.println(authorLineNumber + " " + bookTitle);
            writer.close();
            System.out.println("Book title added successfully.");
        } else {
            System.out.println("Book title already exists in " + BOOKS_FILE);
        }
    }
}
