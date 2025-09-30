package org.example;

public class Math {

    // Function or method overloading
    // Multiple methods with the same name
    // Can be implemented if the functions have different signature
    // Number of parameters, order of parameters, or type of parameters

    int add(int a, int b) {
        return a + b;
    }

    // Overload add method: number of parameters are different
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded: type of parameters are different
    long add(int a, long b) {
        return a + b;
    }

    // Overloaded: order of parameters are different
    long add(long a, int b) {
        return a + b;
    }
}
