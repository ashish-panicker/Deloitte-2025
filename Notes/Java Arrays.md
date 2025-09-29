# 📘 Java Arrays – Lecture Notes

## 1. What is an Array?

* An **array** is a collection of elements of the **same data type** stored in a **contiguous memory block**.
* Arrays allow random access to elements using **indexing**.
* Index always starts from **0** and goes up to **size – 1**.

---

## 2. Declaring and Initializing Arrays

### Declaration

```java
int[] numbers;   // Preferred
int numbers[];   // Also valid
```

### Initialization

```java
numbers = new int[5]; // Creates array of size 5, default values assigned
```

### Declaration + Initialization in one line

```java
int[] moreNumbers = new int[3];
```

### Declaration with values

```java
int[] primes = {2, 3, 5, 7, 11};
```

---

## 3. Default Values in Arrays

When an array is created, Java assigns default values based on the data type:

| Data Type        | Default Value |
| ---------------- | ------------- |
| int              | 0             |
| double           | 0.0           |
| boolean          | false         |
| String / Objects | null          |

Example:

```java
int[] numbers = new int[5];   // [0, 0, 0, 0, 0]
String[] names = new String[4]; // [null, null, null, null]
```

---

## 4. Accessing and Modifying Arrays

* Use **indexing** to access or update array elements.

```java
numbers[0] = 10; // Assign value
numbers[1] = 20;

System.out.println(numbers[0]); // 10
System.out.println(numbers[1]); // 20
```

---

## 5. Iterating through Arrays

### Using For Loop

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### Using Enhanced For Loop (For-Each)

```java
for (int num : numbers) {
    System.out.println(num);
}
```

---

## 6. Array Properties

* `array.length` → gives size of the array.

```java
System.out.println(numbers.length); // 5
```

---

## 7. Multi-Dimensional Arrays

### Regular 2D Array

```java
int[][] matrix = new int[2][3];
matrix[0][0] = 1; 
matrix[1][2] = 6;
```

Iteration:

```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

### Jagged Array (Irregular 2D Array)

* Inner arrays can have different sizes.

```java
int[][] jaggedArray = { {1, 2}, {3, 4, 5}, {6} };
```

---

## 8. Key Points about Arrays

* Arrays are **fixed-size** → size must be known at creation.
* Once created, size **cannot change**.
* Arrays can hold **primitives** and **object references**.
* Stored in **heap memory** when created with `new`.
* **IndexOutOfBoundsException** occurs if we access invalid indices.

---

## 9. Limitations of Arrays

* Fixed size (not resizable).
* No built-in methods for searching, sorting, or resizing.
* For dynamic structures, use `ArrayList` or other collections from **Java Collections Framework (JCF)**.

---

## 10. Summary

* Arrays store multiple values of same type.
* Declared with `[]`.
* Indexed from 0 to (n – 1).
* Default values depend on data type.
* Support **1D, 2D (matrix), and jagged arrays**.
* Useful for performance (fast access), but limited flexibility compared to collections.

---