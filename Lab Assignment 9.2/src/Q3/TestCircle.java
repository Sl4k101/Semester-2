package Q3;

import java.util.Scanner;

public class TestCircle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to compare two circles, or 2 to compare a circle and a rectangle:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the radius for the first circle:");
                double radius1 = scanner.nextDouble();

                System.out.println("Enter the radius for the second circle:");
                double radius2 = scanner.nextDouble();

                ComparableCircle circle1 = new ComparableCircle(radius1);
                ComparableCircle circle2 = new ComparableCircle(radius2);

                if (circle1.compareTo(circle2) > 0) {
                    System.out.println("Circle 1 is larger");
                } else if (circle1.compareTo(circle2) < 0) {
                    System.out.println("Circle 2 is larger");
                } else {
                    System.out.println("Both circles are equal");
                }
                break;

            case 2:
                System.out.println("Enter the radius for the circle:");
                double radius = scanner.nextDouble();

                System.out.println("Enter the width and height for the rectangle:");
                double width = scanner.nextDouble();
                double height = scanner.nextDouble();

                ComparableCircle circle = new ComparableCircle(radius);
                Rectangle rectangle = new Rectangle(width, height);

                if (circle.compareTo(rectangle) > 0) {
                    System.out.println("Circle is larger");
                } else if (circle.compareTo(rectangle) < 0) {
                    System.out.println("Rectangle is larger");
                } else {
                    System.out.println("Both shapes are equal");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}