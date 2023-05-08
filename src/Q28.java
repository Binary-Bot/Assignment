import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (isPrimeNumber(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println("The first " + n + " prime numbers are:");
        firstNthPrime(n);

        System.out.print("Enter two numbers: ");
        int start = input.nextInt();
        int end = input.nextInt();
        System.out.println("The prime numbers between " + start + " and " + end + " are:");
        allPrimeBetween(start, end);
    }

    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void firstNthPrime(int n) {
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrimeNumber(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }

        System.out.println();
    }

    public static void allPrimeBetween(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
