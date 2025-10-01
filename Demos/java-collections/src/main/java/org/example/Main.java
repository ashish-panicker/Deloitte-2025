package org.example;

/**
 * Java Collections: 
 * Introduced from Java version 2. Java version 5 introduced the concept of Generics.
 * Java version 8 introduced the concept of Streams API and Lambdas.
 * Generics allow you to specify the type of elements stored in a collection.
 * Java Collections Framework provides a set of classes and interfaces and algorithms to work with different 
 * types of collections. They are part of the java standard library (java.util package).
 * 
 * The main interfaces in the Java Collections Framework are:
 * Collection: The root interface in the collection hierarchy. It defines basic methods for adding, removing,
 * and checking elements in a collection.
 * 
 * List: An ordered collection (also known as a sequence) that allows duplicate elements. Implementations include 
 * ArrayList, LinkedList.
 * 
 * Set: A collection that does not allow duplicate elements. Implementations include HashSet, Linked
 * HashSet, and TreeSet.
 * 
 * Map: An object that maps keys to values. It does not allow duplicate keys. Implementations include HashMap, 
 * LinkedHashMap, and TreeMap.
 * 
 * Queue: A collection designed for holding elements prior to processing. Implementations include LinkedList, 
 * PriorityQueue, and ArrayDeque.
 * 
 * Deque: A double-ended queue that allows insertion and removal of elements from both ends. Implementations include ArrayDeque 
 * and LinkedList.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    static void fruitsAsArrayList() {
        // Working with List
        // List<Type> listName = new ArrayList<>();  
        // Here the List is implemented using ArrayList, which is a resizable array implementation of the List interface.
        // Useful if you need fast random access to elements.
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Orange");
        System.out.println("Fruits: " + fruits);
        System.out.println("Size of the list: " + fruits.size());
        System.out.println("Element at index 1: " + fruits.get(1));
        fruits.remove("Banana");
        System.out.println("Fruits after removal: " + fruits);
        System.out.println("Contains Apple? " + fruits.contains("Apple"));
        fruits.addFirst("Grapes"); // adds Grapes at the beginning
        System.out.println("Fruits after adding Grapes at the beginning: " + fruits);
        fruits.add(2, "Mango"); // adds Mango at index 2
        System.out.println("Fruits after adding Mango at index 2: " + fruits);
        fruits.remove(3);
        System.out.println("Fruits after removing element at index 3: " + fruits);
        fruits.clear(); // removes all elements from the list
        System.out.println("Fruits after clearing the list: " + fruits);
    }

    static void fruitsAsLinkedList() {
        // Working with List
        // List<Type> listName = new LinkedList<>();  
        // Here the List is implemented using LinkedList, which is a doubly linked list implementation of the List interface.
        // Useful if you need fast insertions and deletions.
        List<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Orange");
        System.out.println("Fruits: " + fruits);
        System.out.println("Size of the list: " + fruits.size());
        System.out.println("Element at index 1: " + fruits.get(1));
        fruits.remove("Banana");
        System.out.println("Fruits after removal: " + fruits);
        System.out.println("Contains Apple? " + fruits.contains("Apple"));
        fruits.addFirst("Grapes"); // adds Grapes at the beginning
        System.out.println("Fruits after adding Grapes at the beginning: " + fruits);
        fruits.add(2, "Mango"); // adds Mango at index 2
        System.out.println("Fruits after adding Mango at index 2: " + fruits);
        fruits.remove(3);
        System.out.println("Fruits after removing element at index 3: " + fruits);
        fruits.clear(); // removes all elements from the list
        System.out.println("Fruits after clearing the list: " + fruits);
    }
    public static void main(String[] args) {
        fruitsAsLinkedList();
    }
}