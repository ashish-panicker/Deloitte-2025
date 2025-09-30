package org.inheritance;

/**
 * Is-A and Has-A relationships
 * <p>
 * Is-A
 * This represents inheritance
 * Engineer Is-A Employee
 * Circle Is-A Shape
 * Supports polymorphism, overriding, inheritance
 * <p>
 * Has-A
 * Represents either Composition or Aggregation
 * Customer Has A Address
 * <p>
 * Inheritance is a feature in OOP that allows one class to extend an already exiting class
 * and acquire it's features and behaviors.
 *
 */

// Cat Is A Animal
// We use extends keyword to extend from a class
// Cat is Child or Derived class and Animal is the Parent class
// Java only support single inheritance between classes
// Constructor execution is always from base class to derived class
// super that can access the content of the base class
// super() can call the base class constructor
// super.baseClassMethod() to call the base class method
class Animal {
    String animal;

    Animal(String animal) {
        this.animal = animal;
        System.out.println("Animal constructor");
    }

    public void eat() {
        System.out.println(animal + " is eating");
    }
}

class Cat extends Animal {
    Cat(String animal) {
        super(animal); // call the Animal() base class constructor
        System.out.println("Cat constructor");
    }

    public void meow() {
        System.out.println("Cat meowing");
    }
}

class Dog extends Animal {
    Dog(String animal) {
        super(animal);
        System.out.println("Dog constructor");
    }

    public void bark() {
        System.out.println("Dog barking");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        dog.eat();
//        dog.bark();

        System.out.println();

        Cat cat = new Cat("Cat");
        cat.eat();
//        cat.meow();
    }
}