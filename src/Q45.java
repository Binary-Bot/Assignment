import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = input.nextLine();
        input.close();

        try (Scanner fileReader = new Scanner(new File(fileName))) {
            Map<String, Integer> nameCount = new HashMap<>();

            while (fileReader.hasNext()) {
                String name = fileReader.next();

                name = name.replaceAll("[^a-zA-Z]", "");

                if (!name.isEmpty()) {
                    nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
                }
            }

            System.out.println("Duplicate names in the file:");

            for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found.");
            e.printStackTrace();
        }
    }
}
