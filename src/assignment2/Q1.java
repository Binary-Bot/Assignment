package assignment2;

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Elderberry");

        System.out.println("Original ArrayList: " + arrayList);
        arrayList.remove(2);
        System.out.println("ArrayList after removing the third element: " + arrayList);
    }
}
