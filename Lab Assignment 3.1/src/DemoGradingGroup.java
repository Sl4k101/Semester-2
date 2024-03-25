
import java.util.Scanner;

public class DemoGradingGroup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradingGroup[] gradingGroupArray = new GradingGroup[2];

        // User input to create GradingGroup objects
        for (int i = 0; i < gradingGroupArray.length; i++) {
            // For each GradingGroup we need to create two Student objects
            System.out.println("Enter details for Grading Group " + (i + 1));

            // Create first Student object
            System.out.println("Enter details for Student 1:");
            System.out.print("Student ID: ");
            String studentId1 = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName1 = scanner.nextLine();
            System.out.print("First Name: ");
            String firstName1 = scanner.nextLine();
            System.out.print("Self Score: ");
            double selfScore1 = scanner.nextDouble();
            scanner.nextLine(); // consume the leftover newline
            System.out.print("Score Provided: ");
            double scoreProvided1 = scanner.nextDouble();
            scanner.nextLine(); // consume the leftover newline
            System.out.print("Comments Received: ");
            String commentsReceived1 = scanner.nextLine();
            System.out.print("Comments Provided: ");
            String commentsProvided1 = scanner.nextLine();

            Student student1 = new Student(studentId1, lastName1, firstName1, selfScore1, scoreProvided1,
                    commentsReceived1, commentsProvided1);

            // Create second Student object
            System.out.println("Enter details for Student 2:");
            System.out.print("Student ID: ");
            String studentId2 = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName2 = scanner.nextLine();
            System.out.print("First Name: ");
            String firstName2 = scanner.nextLine();
            System.out.print("Self Score: ");
            double selfScore2 = scanner.nextDouble();
            scanner.nextLine(); // consume the leftover newline
            System.out.print("Score Provided: ");
            double scoreProvided2 = scanner.nextDouble();
            scanner.nextLine(); // consume the leftover newline
            System.out.print("Comments Received: ");
            String commentsReceived2 = scanner.nextLine();
            System.out.print("Comments Provided: ");
            String commentsProvided2 = scanner.nextLine();

            Student student2 = new Student(studentId2, lastName2, firstName2, selfScore2, scoreProvided2,
                    commentsReceived2, commentsProvided2);

            // Create GradingGroup object
            System.out.println("Enter the evaluation date (YYYY-MM-DD):");
            String evaluationDate = scanner.nextLine();
            System.out.println("Enter the evaluation lab number:");
            String evaluationLabNo = scanner.nextLine();

            GradingGroup gradingGroup = new GradingGroup(student1, student2, evaluationDate, evaluationLabNo);
            gradingGroupArray[i] = gradingGroup;
        }

        // Display all objects in the array using their toString methods
        for (GradingGroup group : gradingGroupArray) {
            System.out.println(group);
        }

        // Find and display the top student based on the self score
        Student topStudent = gradingGroupArray[0].findTopStudent();
        for (int i = 1; i < gradingGroupArray.length; i++) {
            Student currentTop = gradingGroupArray[i].findTopStudent();
            if (currentTop.getScoreSelfLatest() > topStudent.getScoreSelfLatest()) {
                topStudent = currentTop;
            }
        }

        System.out.println("Top student: " + topStudent.getFirstName() + " " + topStudent.getLastName());
    }
}
