package org.example;

import java.util.Comparator;

/**
 * Sorting a collection can be implemented in two ways:
 * 1. Implementing the Comparable interface on the class whose objects are to be
 * sorted.
 * 2. Creating a separate class that implements the Comparator interface.
 * 
 * Comparable interface is used to define the natural ordering of objects.
 * It contains the compareTo() method which compares the current object with the
 * specified object.
 * It is found in the java.lang package.
 * 
 * Comparator interface is used to define multiple ways of sorting objects.
 * It contains the compare() method which compares two objects.
 * It is found in the java.util package. It is implemented in a separate class.
 */
public class Student implements Comparable<Student> {

    private String name;
    private String email;
    private int rollNumber; // this will be used for default sorting

    public Student() {
    }

    public Student(String name, String email, int rollNumber) {
        this.name = name;
        this.email = email;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", email=" + email + ", rollNumber=" + rollNumber + "]";
    }

    @Override
    public int compareTo(Student other) {
        // Ascending order based on rollNumber
        return Integer.compare(this.getRollNumber(), other.getRollNumber());
    }

    // Inner classes: classes that are defined within another class
    // Inner classes can be static or non-static
    // Non static inner classes require an instance of the outer class to be
    // instantiated
    // Static inner classes can be instantiated without an instance of the outer class
    // Class file name Student$SortByName.class
    class SortByName implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
    }

    // Class file name Student$SortByEmail.class
    static class SortByEmail implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getEmail().compareTo(s2.getEmail());
        }
    }
}
