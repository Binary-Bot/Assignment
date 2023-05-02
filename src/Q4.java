import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("P: ");
        int p = input.nextInt();
        System.out.println("T: ");
        int t = input.nextInt();
        System.out.println("R: ");
        double r = input.nextDouble();

        System.out.println("Simple Interest: " + (p*t*r)/100);
    }
}
