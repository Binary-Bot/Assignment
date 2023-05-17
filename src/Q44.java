import java.io.*;
import java.util.*;

class Student {
    private String name;
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address;
    }
}
public class Q44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter name for student " + i + ": ");
            String name = input.nextLine();
            System.out.print("Enter address for student " + i + ": ");
            String address = input.nextLine();

            students.add(new Student(name, address));
        }

        try (PrintWriter writer = new PrintWriter("student_database.txt")) {
            for (Student student : students) {
                writer.println(student.getName() + "," + student.getAddress());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
            return;
        }

        System.out.print("Enter a name to search for address: ");
        String searchName = input.nextLine();
        input.close();

        boolean found = false;

        try (Scanner fileReader = new Scanner(new File("student_database.txt"))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                String address = parts[1];

                if (name.equalsIgnoreCase(searchName)) {
                    System.out.println("Address found: " + address);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Address not found for the given name.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("The student database file was not found.");
            e.printStackTrace();
        }
    }
}
