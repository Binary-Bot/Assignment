package assignment1;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        System.out.println("The sum of the array elements is: " + sum);
    }
}
