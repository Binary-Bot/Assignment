package assignment1;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int digit, sum = 0, product = 1;

        while (num > 0) {
            digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Product of digits: " + product);
    }
}
