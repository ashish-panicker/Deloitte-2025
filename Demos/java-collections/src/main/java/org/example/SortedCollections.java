package org.example;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SortedCollections {
    public static void main(String[] args) {

        List<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Pear");

        // Iterating over the list
        // 1. Use an iterator
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println("Fruit: " + iterator.next());
        }
        System.out.println();
        // 2. Enhanced for loop
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        System.out.println();
        System.out.println("Before Sorting Fruits: " + fruits);
        Collections.sort(fruits); // Collections class
        System.out.println("After Sorting Fruits: " + fruits);
    }
}
