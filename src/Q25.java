import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStudents = input.nextInt();

        String highestScorer = "";
        double highestScore = -1;

        for (int i = 1; i <= numOfStudents; i++) {
            System.out.print("Enter the name of student " + i + ": ");
            String name = input.next();

            System.out.print("Enter the score of student " + i + ": ");
            double score = input.nextDouble();

            if (score > highestScore) {
                highestScore = score;
                highestScorer = name;
            }
        }

        System.out.println("The student with the highest score is " + highestScorer
                + " with a score of " + highestScore);
    }
}
