package assignment2;

import java.util.LinkedList;
import java.util.ListIterator;

public class Q5 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Original LinkedList: " + colors);

        ListIterator<String> iterator = colors.listIterator(colors.size());

        System.out.println("LinkedList in reverse order:");

        while (iterator.hasPrevious()) {
            String color = iterator.previous();
            System.out.println(color);
        }
    }
}
