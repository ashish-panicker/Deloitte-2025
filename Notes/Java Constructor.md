# 📘 Notes: Java Class – `Employee` Example

---

## 1. **Package Declaration**

```java
package org.example;
```

* A package groups related classes together.
* Helps in **organizing code**, **avoiding name conflicts**, and **providing access control**.

---

## 2. **Imports**

```java
// import java.lang.*; // imported by default
import java.time.LocalDate;
```

* `java.lang` is **automatically imported** (contains fundamental classes like `String`, `Object`, `Math`).
* `java.time.LocalDate` must be imported explicitly → used to store **date values** like birthdays.

---

## 3. **Class Declaration**

```java
public class Employee {
   ...
}
```

* A **class** is a **blueprint** for objects.
* It contains **fields (attributes)**, **constructors**, and **methods**.

---

## 4. **Fields (Attributes / Class-level Variables)**

```java
int employeeId = 1000;
String fullName = "-";
String designation = "-";
String department = "-";
LocalDate dateOfBirth; // default null
```

* **Fields are initialized by default:**

  * Numeric types → `0`
  * Boolean → `false`
  * Reference types (e.g., `String`, `LocalDate`) → `null`

* In this class:

  * `employeeId` initialized to **1000**.
  * `fullName`, `designation`, `department` initialized to `"-"`.
  * `dateOfBirth` defaults to `null`.

---

## 5. **Constructors**

* Special methods executed **when an object is created**.
* They:

  * Have the **same name as the class**.
  * **Do not have a return type**.
  * Can be **overloaded** (multiple constructors with different parameter lists).
* If no constructor is provided, Java automatically adds a **default no-arg constructor**.

### (a) Default Constructor

```java
Employee() {
    System.out.println("Employee constructor 1.");
    System.out.println(employeeId + "\t" + fullName + "\t" + designation + "\t" + department);
}
```

* Prints default values of fields.
* Executed when object is created without arguments.

---

### (b) Overloaded Constructor (Partial Initialization)

```java
Employee(int employeeId, String fullName, LocalDate dateOfBirth) {
    this.employeeId = employeeId;
    this.fullName = fullName;
    this.dateOfBirth = dateOfBirth;
}
```

* Initializes **id**, **name**, and **DOB** only.
* Uses `this` keyword to differentiate between **fields** and **constructor parameters**.

---

### (c) Overloaded Constructor (Full Initialization)

```java
Employee(int employeeId, String fullName, String designation, String department, LocalDate dateOfBirth) {
    this.employeeId = employeeId;
    this.fullName = fullName;
    this.designation = designation;
    this.department = department;
    this.dateOfBirth = dateOfBirth;
}
```

* Initializes **all properties** of the employee.

---

## 6. **`this` Keyword**

* Refers to the **current instance of the class**.
* Used to:

  * Differentiate between fields and parameters (when they have the same name).
  * Pass the current object as an argument.

Example:

```java
this.department = department;
```

---

## 7. **Methods**

```java
void assignDepartment(String department) {
    this.department = department;
}
```

* Defines behavior of objects.
* In this case → assigns a department to the employee.

---

## 8. **Object Creation & Constructor Calls**

```java
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();  // calls constructor 1
        Employee e2 = new Employee(101, "Alice", LocalDate.of(1990, 5, 10)); // constructor 2
        Employee e3 = new Employee(102, "Bob", "Manager", "HR", LocalDate.of(1985, 8, 20)); // constructor 3
    }
}
```

---

## 9. **Key Takeaways**

* **Fields** → Class-level variables, auto-initialized by JVM.
* **Constructors** → Special methods for object initialization, can be overloaded.
* **`this` keyword** → Refers to the current instance.
* **Objects** are created using `new`, and constructor is executed immediately.

---