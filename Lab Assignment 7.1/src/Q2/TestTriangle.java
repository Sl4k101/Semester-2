package Q2;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        
        System.out.print("Enter the color of the triangle: ");
        String color = input.next();
        
        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();
        
        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(filled);
            
            System.out.println("The area of the triangle is " + triangle.getArea());
            System.out.println("The perimeter of the triangle is " + triangle.getPerimeter());
            System.out.println("The color of the triangle is " + triangle.getColor());
            System.out.println("Is the triangle filled? " + triangle.isFilled());
        } catch (IllegalTriangleException ex) {
            System.out.println("Cannot create a triangle: " + ex.getMessage());
        }
    }
}
