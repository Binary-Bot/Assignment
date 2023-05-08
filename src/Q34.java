import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        // Reverse the array elements
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("Array elements in reverse order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
