# 📘 Java Classes, Objects, OOP Features, and Object Lifecycle

---

## 1. **Classes in Java**

* A **class** is a blueprint/template from which objects are created.
* It defines:

  * **Fields (Attributes/Variables):** State of the object.
  * **Methods:** Behavior of the object.
  * **Constructors:** Special methods used to initialize objects.
  * **Nested classes, blocks, and interfaces** (optional).

**Syntax Example:**

```java
class Car {
    // fields
    String color;
    int speed;

    // constructor
    Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    // method
    void drive() {
        System.out.println("Car is driving at " + speed + " km/h");
    }
}
```

---

## 2. **Objects in Java**

* An **object** is an instance of a class.
* Each object has its own:

  * **Identity** (unique reference in memory).
  * **State** (values of fields).
  * **Behavior** (methods it can perform).

**Creating Objects:**

```java
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Red", 120);  // object creation
        myCar.drive();                    // calling method
    }
}
```

---

## 3. **Core OOP Features in Java**

Java supports **four fundamental Object-Oriented Programming (OOP) features**:

### (a) **Encapsulation**

* Wrapping **data** (fields) and **methods** (behavior) together into a single unit (class).
* Provides **data hiding** using access modifiers (`private`, `protected`, `public`).
* Access given via **getters and setters**.

```java
class BankAccount {
    private double balance;

    public void deposit(double amount) { balance += amount; }
    public double getBalance() { return balance; }
}
```

---

### (b) **Inheritance**

* Mechanism to acquire properties and behaviors from another class.
* Promotes **code reusability**.
* Uses `extends` keyword.

```java
class Vehicle {
    void start() { System.out.println("Vehicle starting..."); }
}
class Bike extends Vehicle {
    void honk() { System.out.println("Bike horn!"); }
}
```

---

### (c) **Polymorphism**

* **Many forms**: Same method can have different implementations.
* Two types:

  * **Compile-time (Method Overloading):**

    ```java
    class MathUtil {
        int add(int a, int b) { return a+b; }
        double add(double a, double b) { return a+b; }
    }
    ```
  * **Runtime (Method Overriding):**

    ```java
    class Animal {
        void sound() { System.out.println("Some sound"); }
    }
    class Dog extends Animal {
        @Override
        void sound() { System.out.println("Bark"); }
    }
    ```

---

### (d) **Abstraction**

* Hiding implementation details, exposing only functionality.
* Achieved via:

  * **Abstract Classes**
  * **Interfaces**

```java
interface Shape {
    void draw();
}
class Circle implements Shape {
    public void draw() { System.out.println("Drawing Circle"); }
}
```

---

## 4. **Object Lifecycle in Java**

The **life of an object** in Java passes through several stages:

1. **Creation (Instantiation):**

   * Objects are created using `new` keyword.
   * Memory allocated on **Heap**.

   ```java
   Car car = new Car("Blue", 100);
   ```

2. **Initialization:**

   * Constructor initializes the object’s fields.
   * Can also use instance blocks.

3. **Usage:**

   * Object methods are invoked, fields are accessed/modified.

   ```java
   car.drive();
   ```

4. **Destruction (Garbage Collection):**

   * When no reference points to the object, it becomes **eligible for Garbage Collection (GC)**.
   * GC is automatic in Java, managed by JVM.
   * `finalize()` method (deprecated since Java 9) was once used before object destruction.

---

✅ **Summary**

* **Class** = Blueprint
* **Object** = Instance
* **OOP Features** = Encapsulation, Inheritance, Polymorphism, Abstraction
* **Object Lifecycle** = Creation → Initialization → Usage → Destruction