import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        double sum = num1 + num2;
        double avg = sum / 2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println("The average of " + num1 + " and " + num2 + " is " + avg);
    }
}
