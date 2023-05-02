import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---------------------");

        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = input.nextInt();

        double temperature;
        if (choice == 1) {
            System.out.print("Enter the temperature in Fahrenheit: ");
            temperature = input.nextDouble();
            temperature = (temperature - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + temperature + " degrees.");
        } else if (choice == 2) {
            System.out.print("Enter the temperature in Celsius: ");
            temperature = input.nextDouble();
            temperature = temperature * 9 / 5 + 32;
            System.out.println("The temperature in Fahrenheit is " + temperature + " degrees.");
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }
}
