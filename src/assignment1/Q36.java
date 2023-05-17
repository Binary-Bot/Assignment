package assignment1;

import java.util.*;

public class Q36 {
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : arr) {
            if (uniqueElements.contains(num)) {
                duplicates.add(num);
            } else {
                uniqueElements.add(num);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 5, 6, 3};
        List<Integer> duplicates = findDuplicates(arr);

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found in the array.");
        } else {
            System.out.println("Duplicate elements in the array: " + duplicates);
        }
    }
}
