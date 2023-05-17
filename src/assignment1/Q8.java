package assignment1;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();

        System.out.print("Enter the length of the cylinder: ");
        double length = input.nextDouble();

        double area = Math.PI * radius * radius;
        double volume = area * length;

        System.out.println("The volume of the cylinder is " + volume);
    }
}
