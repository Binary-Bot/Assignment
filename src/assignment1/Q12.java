package assignment1;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        int roll = input.nextInt();

        System.out.print("Enter name: ");
        String name = input.next();

        System.out.print("Enter nationality: ");
        String nationality = input.next();

        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Nationality: " + nationality);
    }
}
