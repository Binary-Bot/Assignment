package assignment1;

import java.util.Scanner;

public class Q39 {
    public static String getShortName(String fullName) {
        String[] names = fullName.split(" ");
        StringBuilder shortName = new StringBuilder();

        for (int i = 0; i < names.length - 1; i++) {
            String name = names[i];
            if (i == 0) {
                shortName.append(name.charAt(0)).append(". ");
            } else {
                shortName.append(Character.toLowerCase(name.charAt(0))).append(". ");
            }
        }

        shortName.append(names[names.length - 1]);

        return shortName.toString().trim();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a full name: ");
        String fullName = input.nextLine();
        input.close();

        String shortName = getShortName(fullName);
        System.out.println("Short name: " + shortName);
    }
}
