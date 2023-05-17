import java.util.Arrays;

public class Q33 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 8, 2, 10};

        // Sort the array in ascending order
        Arrays.sort(arr);

        System.out.println("Array elements in ascending order:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
