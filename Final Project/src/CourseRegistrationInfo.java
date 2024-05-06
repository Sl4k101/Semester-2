import java.io.*;
import java.util.LinkedList;

class CourseRegistrationInfo {
    public static void readList(String fileName, LinkedList<Course> courses) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] instructorDetails = line.split(",");
                Instructor instructor = new Instructor(instructorDetails[1].trim(), instructorDetails[0].trim(), instructorDetails[2].trim());
                String courseName = reader.readLine().trim();
                String author = reader.readLine().trim();
                TextBook textBook = new TextBook(courseName, author);
                courses.add(new Course(courseName, instructor, textBook));
            }
        }
    }
}