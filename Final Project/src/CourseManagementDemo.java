import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.io.*;

public class CourseManagementDemo {
    public static void main(String[] args) {
        System.out.println("\n--- Original course.txt content ---\n");
        printFileContent("course.txt");
        
        LinkedList<Course> courseList = new LinkedList<>();
        CourseRegistrationInfo.readList("course.txt", courseList);
        
        System.out.println("\n--- Courses before sorting ---");
        int count = 1;  // Initialize counter for course numbering
        for (Course course : courseList) {
            System.out.println("\nCourse #" + count + ":\n");
            System.out.println(course);
            count++;  // Increment counter after printing each course
        }

        // Sort courses by courseName
        Collections.sort(courseList, new Comparator<Course>() {
            public int compare(Course c1, Course c2) {
                return c1.getCourseName().compareTo(c2.getCourseName());
            }
        });

        System.out.println("\n--- Courses after sorting ---");
        count = 1;  // Reset counter for sorted list
        for (Course course : courseList) {
            System.out.println("\nCourse #" + count + ":\n");
            System.out.println(course);
            count++;  // Increment counter after printing each course
        }
    }

    private static void printFileContent(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
