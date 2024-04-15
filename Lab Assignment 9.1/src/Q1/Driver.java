package Q1;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        while (true) { // Run app (with menu)
            // Display menu options
            System.out.println("--- Demos ---\n [1] Q1\n [2] Q2\n [3] Q3\n [4] exit");

            // Get choice of demo from user
            int choice = input.nextInt();
            if (choice > 4 || choice < 1) {
                System.out.println("Invalid choice: " + choice + "\nPlease choose a value between 1 and 4.");
                continue;
            }

            switch (choice) {
                case 1:
                    Q1(); // Call method for Q1
                    break;
                case 2:
                    Q2(); // Call method for Q2
                    break;
                case 3:
                    Q3(); // Call method for Q3
                    break;
                default:
                    System.exit(0); // Exit the program if choice is 4
                    break;
            }
        }
    }

    // Method for Question 1
    public static void Q1() throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter sides of the triangle: ");
        Triangle triangle = new Triangle();
        while (true) {
            try {
                double side1 = input.nextDouble();
                double side2 = input.nextDouble();
                double side3 = input.nextDouble();
                triangle = new Triangle(side1, side2, side3);
                break;
            } catch (Triangle.IllegalTriangleException error) {
                System.out.println("INVALID TRIANGLE, Please enter a valid triangle:");
                System.out.println("Enter sides of the triangle: ");
            }
        }

        // Input color and filled status
        System.out.println("Enter color: ");
        String color = input.next();
        System.out.println("Enter filled: (true or false)");
        boolean filled = input.nextBoolean();
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Display triangle information
        System.out.println(triangle.toString() + "\nColor: " + color + "\nFilled: " + filled + "\nArea: " + triangle.getArea() + "\nPerimeter: " + triangle.getPerimeter() + "\n");


    }


    // Method for Question 2
    public static void Q2() throws Exception {

    }

    // Method for Question 3
    public static void Q3() throws Exception {

    }
}
