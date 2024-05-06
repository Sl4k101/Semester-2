import java.io.*;
import java.util.Collections;
import java.util.LinkedList;

public class CourseManagementDemo {
    public static void main(String[] args) {
        LinkedList<Course> courseList = new LinkedList<>();
        try {
            CourseRegistrationInfo.readList("course.txt", courseList);
            
            System.out.println("Courses before sorting:");
            displayCoursesRecursively(courseList, 0);
            
            Collections.sort(courseList, (c1, c2) -> c1.getCourseName().compareTo(c2.getCourseName()));
            
            System.out.println("\nCourses after sorting:");
            displayCoursesRecursively(courseList, 0);
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void displayCoursesRecursively(LinkedList<Course> courses, int index) {
        if (index < courses.size()) {
            System.out.println(courses.get(index));
            displayCoursesRecursively(courses, index + 1);
        }
    }
}