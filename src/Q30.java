import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms to generate in the Fibonacci series: ");
        int numTerms = input.nextInt();
        input.close();

        int firstTerm = 1, secondTerm = 1;
        System.out.print("Fibonacci series: " + firstTerm + " " + secondTerm);

        for (int i = 3; i <= numTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

}
