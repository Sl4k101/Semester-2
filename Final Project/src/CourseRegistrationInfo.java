import java.io.*;
import java.util.LinkedList;

public class CourseRegistrationInfo {
    public static void readList(String fileName, LinkedList<Course> courses) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] instructorData = line.split(" ");
                if (instructorData.length < 4) {
                    System.out.println("Skipping incomplete instructor data: " + line);
                    continue; // Skip this iteration if data is incomplete
                }
                String courseName = instructorData[0];
                String familyName = instructorData[1];
                String name = instructorData[2];
                String officeNumber = instructorData[3];
                
                String title = reader.readLine();
                if (title == null) {
                    System.out.println("Missing title for course " + courseName);
                    break; // Exit if no title line found
                }
                title = title.trim();
                
                String author = reader.readLine();
                if (author == null) {
                    System.out.println("Missing author for course " + courseName);
                    break; // Exit if no author line found
                }
                author = author.trim();
                
                Instructor instructor = new Instructor(name, familyName, officeNumber);
                TextBook textBook = new TextBook(title, author);
                Course course = new Course(courseName, instructor, textBook);
                
                courses.add(course);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
