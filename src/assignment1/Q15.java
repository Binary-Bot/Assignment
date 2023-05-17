package assignment1;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code (between 0 - 128): ");
        int asciiCode = input.nextInt();

        char character = (char) asciiCode;

        System.out.println(asciiCode + " -> " + character);
    }
}
