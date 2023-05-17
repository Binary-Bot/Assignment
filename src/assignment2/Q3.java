package assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class Q3 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        System.out.println("Original ArrayList: " + fruits);

        Collections.reverse(fruits);

        System.out.println("Reversed ArrayList: " + fruits);
    }
}
