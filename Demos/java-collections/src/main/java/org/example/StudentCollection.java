package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class StudentCollection {
    public static void main(String[] args) {
        Student john = new Student("John Smith", "john.smith1", 100);
        Student alice = new Student("Alice", "sm.alice1", 200);
        Student bob = new Student("Bob", "bob.king", 75);
        Student james = new Student("James", "james.bond", 150);

        // Set -> SortedSet -> NavigableSet -> TreeSet
        // Class name would be StudentCollection$1.class
        SortedSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getEmail().compareTo(o2.getEmail());
            }
        });
        students.add(john);
        students.add(alice);
        students.add(bob);
        students.add(james);

        System.out.println("Total number of students: " + students.size());
        System.out.println("Students in the collection:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("-----------------------------------------------");
        System.out.println();
    }

    static void listOfStudents() {

        Student john = new Student("John Smith", "john.smith1", 100);
        Student alice = new Student("Alice", "sm.alice1", 200);
        Student bob = new Student("Bob", "bob.king", 75);
        Student james = new Student("James", "james.bond", 150);

        List<Student> students = new ArrayList<>();

        students.add(john);
        students.add(alice);
        students.add(bob);
        students.add(james);

        System.out.println("Total number of students: " + students.size());
        System.out.println("Students in the collection:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("-----------------------------------------------");
        System.out.println();

        // Sorting the students based on rollNumber (default sorting)
        Collections.sort(students);
        System.out.println("Students after sorting based on rollNumber:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("-----------------------------------------------");
        System.out.println();

        // Sort the students based on name (custom sorting)
        Student s = new Student();
        Student.SortByName compareByName = s.new SortByName();
        Collections.sort(students, compareByName);
        System.out.println("Students after sorting based on name:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("-----------------------------------------------");
        System.out.println();

        // Sort the students based on email (custom sorting)
        Student.SortByEmail compareByEmail = new Student.SortByEmail();
        Collections.sort(students, compareByEmail);
        System.out.println("Students after sorting based on email:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("-----------------------------------------------");
        System.out.println();
    }
}
