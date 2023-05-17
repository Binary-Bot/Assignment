import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q41 {
    public static void findDuplicateLetters(String word) {
        Map<Character, Integer> letterCount = new HashMap<>();

        for (char letter : word.toCharArray()) {
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
        }

        System.out.println("Duplicate letters in the word:");

        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        input.close();

        findDuplicateLetters(word);
    }
}
