package assignment1;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double circlePerimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of the circle is: " + circlePerimeter);

        System.out.print("Enter the length of side 1 of the triangle: ");
        double side1 = input.nextDouble();
        System.out.print("Enter the length of side 2 of the triangle: ");
        double side2 = input.nextDouble();
        System.out.print("Enter the length of side 3 of the triangle: ");
        double side3 = input.nextDouble();
        double trianglePerimeter = side1 + side2 + side3;
        System.out.println("The perimeter of the triangle is: " + trianglePerimeter);

        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        double rectanglePerimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is: " + rectanglePerimeter);
    }
}
