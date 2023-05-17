package assignment2;

import java.util.LinkedList;

public class Q4 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Original LinkedList: " + colors);

        String newColor = "Yellow";
        colors.addLast(newColor);

        System.out.println("LinkedList after appending '" + newColor + "': " + colors);
    }
}
