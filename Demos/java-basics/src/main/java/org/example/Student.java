package org.example;

// Encapsulation: Can  be implemented with access specifiers
// public - accessible in the package and outside the package
// protected
// private
// default - used when no access specifier is used, package level access
// Java Bean
// Access Modifiers: static, final, abstract
public class Student {

    // All the attributes are declared private
    private int rollNumber;
    private String fullName;
    private String email;

    // If you have some data to be shared across all objects, we can assign that
    // into the class using static access modifier. Static refers to class level content
    // To access static content we use class reference: Student.topics;
    private static String[] topics;

    // static blocks: used to initialize static content
    static {
        System.out.println("static block 2");
    }

    static {
        System.out.println("This is a static block 1");
        topics = new String[10];
        // rollNumber = 1; // error
        // static methods or blocks cannot access non-static content
        // is loaded when the class is loaded
        // multiple static code blocks can be provided in class, and they will get executed in the order
        // which they are declared
    }

    public Student() {
        // this() method can be used to call another constructor, but it has to be the first line
        // of the current constructor
        this(0, "", "");
        System.out.println("This is constructor #1 of Student class");
    }

    public Student(int rollNumber, String fullName, String email) {
        //this(); // calling the zero argument constructor
        System.out.println("This is constructor #2 of Student class");
        this.rollNumber = rollNumber;
        this.fullName = fullName;
        this.email = email;
    }

    // Getters or Accessor
    public int getRollNumber() {
        return rollNumber;
    }

    // Setters or Mutators
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String[] getTopics() {
        return topics;
    }

    public static void setTopics(String[] topics) {
        Student.topics = topics;
    }
}
