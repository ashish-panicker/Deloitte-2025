# Basics of Java

## 1. Introduction to Java

* **What is Java?**
  Java is a **programming language** used to create applications that can run on any device (Windows, Mac, Linux, Android, etc.) without changing the code.
* **Why is it popular?**

  * Reliable and widely used in companies.
  * Runs everywhere (thanks to the JVM).
  * Large community and lots of learning resources.

## 2. Java Architecture

When we write Java code, several steps happen before it runs:

1. **Write the code** → File with `.java` extension.
2. **Compile the code** → Compiler (`javac`) converts it into **bytecode** (a `.class` file).
3. **JVM (Java Virtual Machine)** runs the bytecode → Translates it into machine language that your computer understands.

**Flow Diagram**

```
Source Code (.java) → Compiler → Bytecode (.class) → JVM → Machine Code
```

**Why this matters**: This is what makes Java **platform independent** (Write Once, Run Anywhere).

## 3. Basic Syntax

* Java is **case-sensitive**: `Hello` ≠ `hello`.
* Every program must have a **class**.
* The execution starts from the **main() method**.
* Each line (statement) ends with a **semicolon `;`**.

Example:

```java
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!"); // prints text on screen
    }
}
```

**Explanation**:

* `class HelloWorld` → Defines a class named HelloWorld.
* `public static void main(String[] args)` → Starting point of the program.
* `System.out.println()` → Prints output to the screen.

## 4. Data Types

In Java, **variables must have a type**. Think of a type as the “kind of box” you use to store data.

### a) Primitive Data Types (basic building blocks)

| Type    | Size    | Example      |
| ------- | ------- | ------------ |
| byte    | 1 byte  | 100          |
| short   | 2 bytes | 1000         |
| int     | 4 bytes | 25000        |
| long    | 8 bytes | 100000L      |
| float   | 4 bytes | 3.14f        |
| double  | 8 bytes | 3.14159      |
| char    | 2 bytes | 'A'          |
| boolean | 1 bit   | true / false |

### b) Non-Primitive Data Types (more complex)

* **String** (sequence of characters).
* **Arrays** (collection of values).
* **Objects** (instances of classes).

Example:

```java
int age = 25;
double price = 19.99;
boolean isStudent = true;
char grade = 'A';
String name = "Alice";
```

## 5. Variables

A **variable** is like a container that stores information.

Types of variables in Java:

* **Local variable** → Inside a method, used temporarily.
* **Instance variable** → Belongs to an object.
* **Static variable** → Shared by all objects of a class.

Example:

```java
class Employee {
    String name; // instance variable
    static String company = "TechCorp"; // static variable

    void setName(String n) {
        String temp = n; // local variable
        name = temp;
    }
}
```

**Analogy**:

* Local variable = A note you scribble for the day.
* Instance variable = Your personal ID card.
* Static variable = The company name shared by all employees.

## 6. Operators

Operators are **symbols** used to perform operations on data.

* **Arithmetic**: `+ - * / %`
* **Relational (comparison)**: `== != > < >= <=`
* **Logical**: `&& (and), || (or), ! (not)`
* **Assignment**: `= += -= *= /=`
* **Unary**: `++ --`
* **Ternary**: `condition ? value1 : value2`

Example:

```java
int a = 10, b = 5;
System.out.println(a + b);  // 15
System.out.println(a > b);  // true
```

## 7. Control Flow Statements

Control flow decides **which part of the program runs**.

### a) If-Else

```java
if (x > 0) {
    System.out.println("Positive");
} else {
    System.out.println("Non-positive");
}
```

### b) Switch

```java
int day = 2;
switch(day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    default: System.out.println("Other day");
}
```

### c) Loops

* **for loop** → Repeat when you know the count.

```java
for (int i=0; i<3; i++) {
    System.out.println("Hello");
}
```

* **while loop** → Repeat until condition becomes false.

```java
int i = 1;
while (i <= 3) {
    System.out.println(i);
    i++;
}
```

* **do-while loop** → Runs at least once.

```java
int j = 1;
do {
    System.out.println(j);
    j++;
} while(j <= 3);
```

## 8. Arrays

* An **array** stores multiple values in a single variable.
* All values must be of the same type.

Example:

```java
int[] numbers = {10, 20, 30, 40};
for(int n : numbers) {
    System.out.println(n);
}
```

**Analogy**:
Think of an array as a row of lockers. Each locker has a number (index) and stores one value.

## 9. Methods

A **method** is a block of code you can reuse.

* **Instance method** → Belongs to an object.
* **Static method** → Belongs to the class, can be used without creating an object.

Example:

```java
class Calculator {
    int add(int a, int b) { // instance method
        return a + b;
    }

    static int multiply(int x, int y) { // static method
        return x * y;
    }
}
```

## 10. Classes and Objects

* **Class** = Blueprint.
* **Object** = Real-world thing created from the blueprint.

Example:

```java
class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}

class Test {
    public static void main(String[] args) {
        Car c1 = new Car();  // object created
        c1.brand = "Toyota";
        c1.speed = 120;
        c1.drive();
    }
}
```

**Analogy**:

* Class = Recipe for a cake.
* Object = Actual cake baked from that recipe.

## 11. Constructors

* A **constructor** is a special method used to initialize objects.
* It has the **same name as the class**.
* Runs automatically when an object is created.

Example:

```java
class Student {
    String name;
    int age;

    Student(String n, int a) {  // constructor
        name = n;
        age = a;
    }
}

class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        System.out.println(s1.name + " " + s1.age);
    }
}
```