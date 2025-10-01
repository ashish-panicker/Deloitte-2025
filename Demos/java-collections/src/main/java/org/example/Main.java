package org.example;

/**
 * Java Collections: 
 * Introduced from Java version 2. Java version 5 introduced the concept of Generics.
 * Java version 8 introduced the concept of Streams API and Lambdas.
 * Generics allow you to specify the type of elements stored in a collection.
 * Java Collections Framework provides a set of classes and interfaces and algorithms to work with different 
 * types of collections. They are part of the java standard library (java.util package).
 * 
 * https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
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
import java.util.Map;
import java.util.Queue;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    static void fruitsAsArrayList() {
        // Working with List
        // List<Type> listName = new ArrayList<>();
        // Here the List is implemented using ArrayList, which is a resizable array
        // implementation of the List interface.
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
        // Here the List is implemented using LinkedList, which is a doubly linked list
        // implementation of the List interface.
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

    static void listFromFactoryMethod() {
        // Creating a List using the factory method List.of()
        // String[] arrFruits = new String[]{"Apple", "Banana", "Orange"};
        // Introduced in Java 9, the of method provides a convenient way to create
        // immutable lists.
        List<String> fruits = List.of("Apple", "Banana", "Orange");
        System.out.println("Fruits: " + fruits);
        System.out.println("Size of the list: " + fruits.size());
        System.out.println("Element at index 1: " + fruits.get(1));
        System.out.println("Contains Apple? " + fruits.contains("Apple"));
        // Creation List using the of method returns an immutable list
        // fruits.add("Grapes"); // This will throw UnsupportedOperationException
        // fruits.remove("Banana"); // This will throw UnsupportedOperationException
        // fruits.clear(); // This will throw UnsupportedOperationException
    }

    static void namesAsHashSet() {
        // Working with Set
        // Set<Type> setName = new HashSet<>();
        // Here the Set is implemented using HashSet, which is a hash table based
        // implementation of the Set interface.
        // It does not guarantee any specific order of elements.
        // Useful if you need fast lookups and do not care about the order of elements.
        // Duplicate elements are not allowed in a Set
        // Other implementations of Set include LinkedHashSet (which maintains insertion
        // order)
        // and TreeSet (which sorts elements in natural order or according to a
        // specified comparator).
        Set<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Charlie");
        names.add("Bob");
        System.out.println("Adding Alice: " + names.add("Alice"));// Duplicate elements are not allowed in a Set
        System.out.println("Names: " + names);
        System.out.println("Size of the set: " + names.size());
        names.remove("Bob");
        System.out.println("Names after removal: " + names);
        System.out.println("Contains Alice? " + names.contains("Alice"));
        names.clear(); // removes all elements from the set
        System.out.println("Names after clearing the set: " + names);
    }

    static void simpleHashMap() {

        // https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/HashMap.html

        Map<Integer, String> students = new HashMap<>();
        // Adding key-value pairs to the HashMap
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");
        System.out.println("Students: " + students);
        System.out.println("Size of the map: " + students.size());
        // Accessing a value by its key
        System.out.println("Student with ID 2: " + students.get(2));
        // Removing a key-value pair by its key
        students.remove(3);
        System.out.println("Students after removal: " + students);
        // Checking if a key exists in the map
        System.out.println("Contains key 1? " + students.containsKey(1));
        // Checking if a value exists in the map
        System.out.println("Contains value 'Bob'? " + students.containsValue("Bob"));
        // Get keys from the map
        System.out.println("Keys: " + students.keySet());
        // Get values from the map
        System.out.println("Values: " + students.values());
        // IIterate over the map as key-value pairs
        // the entrySet() method returns a set of Map.Entry objects
        Set<Entry<Integer, String>> entrySet = students.entrySet();
        for (Entry<Integer, String> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        students.clear(); // removes all key-value pairs from the map
        System.out.println("Students after clearing the map: " + students);
    }

    static void configMap() {
        Map<String, String> config = new HashMap<>();
        config.put("url", "https://example.com");
        config.put("username", "admin");
        config.put("password", "password123");
        System.out.println("Config: " + config);
        System.out.println("Size of the map: " + config.size());
        System.out.println("URL: " + config.get("url"));
        config.remove("password");
        System.out.println("Config after removal: " + config);
        System.out.println("Contains key 'username'? " + config.containsKey("username"));
        System.out.println("Contains value 'admin'? " + config.containsValue("admin"));
        config.clear(); // removes all key-value pairs from the map
        System.out.println("Config after clearing the map: " + config);
    }

    static void queue() {
        // Queue is a collection designed for holding elements prior to processing.
        // It follows the First-In-First-Out (FIFO) principle.
        // Common implementations of the Queue interface include LinkedList,
        // PriorityQueue, and ArrayDeque.
        Queue<String> queue = new LinkedList<>();
        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");
        System.out.println("Queue: " + queue);
        System.out.println("Size of the queue: " + queue.size());
        System.out.println("Peek: " + queue.peek()); // Retrieves, but does not remove, the head of the queue
        System.out.println("Poll: " + queue.poll()); // Retrieves and removes the head of the queue
        System.out.println("Queue after poll: " + queue);
        System.out.println("Contains 'Task 2'? " + queue.contains("Task 2"));
        queue.clear(); // removes all elements from the queue
        System.out.println("Queue after clearing: " + queue);
    }

    static void deque() {
        // Deque (Double-Ended Queue) is a linear collection that supports the
        // insertion and removal of elements from both ends.
        // It can be used as both a stack (LIFO) and a queue (FIFO).
        // Common implementations of the Deque interface include ArrayDeque and
        // LinkedList.
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("Task 1");
        deque.addLast("Task 2");
        deque.addLast("Task 3");
        System.out.println("Deque: " + deque);
        System.out.println("Size of the deque: " + deque.size());
        System.out.println("Peek First: " + deque.peekFirst()); // Retrieves, but does not remove, the first element
        System.out.println("Peek Last: " + deque.peekLast()); // Retrieves, but does not remove, the last element
        System.out.println("Poll First: " + deque.pollFirst()); // Retrieves and removes the first element
        System.out.println("Poll Last: " + deque.pollLast()); // Retrieves and removes the last element
        System.out.println("Deque after polls: " + deque);
        System.out.println("Contains 'Task 2'? " + deque.contains("Task 2"));
        deque.clear(); // removes all elements from the deque
        System.out.println("Deque after clearing: " + deque);
    }

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        queue();
        System.out.println("--------------------------------------------------");
        deque();
        System.out.println("--------------------------------------------------");
    }
}