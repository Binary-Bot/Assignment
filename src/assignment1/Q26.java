package assignment1;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int reversedNum = 0;

        while (num != 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        System.out.println("Reversed number: " + reversedNum);
    }
}
