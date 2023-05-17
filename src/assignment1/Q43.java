package assignment1;

import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {5, 8, 12, 6, 10};

        try {
            System.out.print("Enter the index to access element: ");
            int index = input.nextInt();
            System.out.println("Element at index " + index + ": " + numbers[index]);

            System.out.print("Enter two numbers for division: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int result = num1 / num2;
            System.out.println("Division result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
