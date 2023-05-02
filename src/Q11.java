import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Swap using temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Swapping using temp variable:");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);

        //Swapping again without using temp variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Swapping again without using temp variable:");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);

    }
}
