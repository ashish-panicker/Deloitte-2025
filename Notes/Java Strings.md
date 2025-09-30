# 📘 Notes: Java Strings

---

## 1. **What is a String in Java?**

* A **String** is a **sequence of characters**.
* In Java:

  * Strings are **objects** (of class `java.lang.String`).
  * String objects are **immutable** (cannot be changed once created).
  * Example:

    ```java
    String s1 = "Hello";         // String literal
    String s2 = new String("Hi"); // Using new keyword
    ```

---

## 2. **Ways to Create Strings**

1. **String Literal**

   ```java
   String s1 = "Java";
   ```

   * Stored in **String Constant Pool (SCP)**.
   * Reuses object if already present.

2. **Using `new` Keyword**

   ```java
   String s2 = new String("Java");
   ```

   * Creates a **new object** in heap memory, even if the same string exists in SCP.

---

## 3. **String Constant Pool (SCP)**

* A special memory area inside the **heap**.
* Stores **string literals**.
* Ensures **reusability and memory efficiency**.
* Example:

  ```java
  String a = "Hello";
  String b = "Hello";
  System.out.println(a == b); // true (same reference from SCP)

  String c = new String("Hello");
  System.out.println(a == c); // false (different object in heap)
  ```

  ✅ Use `.equals()` to compare **contents**, not `==`.

---

## 4. **Important String Methods (String Manipulation)**

| Method                              | Usage                             |
| ----------------------------------- | --------------------------------- |
| `length()`                          | Returns length of string          |
| `charAt(int index)`                 | Returns character at given index  |
| `substring(begin, end)`             | Extracts substring                |
| `toUpperCase()` / `toLowerCase()`   | Case conversion                   |
| `trim()`                            | Removes leading & trailing spaces |
| `replace(old, new)`                 | Replace characters/words          |
| `split(regex)`                      | Splits string into array          |
| `equals()` / `equalsIgnoreCase()`   | Compare contents                  |
| `contains(str)`                     | Checks if substring exists        |
| `indexOf(str)` / `lastIndexOf(str)` | Find position of substring        |

**Example:**

```java
String str = "  Java Programming  ";
System.out.println(str.length());        // 19
System.out.println(str.trim());          // "Java Programming"
System.out.println(str.substring(0, 4)); // "Java"
System.out.println(str.toUpperCase());   // "JAVA PROGRAMMING"
```

---

## 5. **Immutability of Strings**

* Once a string is created, it **cannot be changed**.
* Any modification creates a **new string object**.

Example:

```java
String s = "Hello";
s.concat(" World");
System.out.println(s); // "Hello" (unchanged)

s = s.concat(" World");
System.out.println(s); // "Hello World" (new object created)
```

---

## 6. **StringBuilder and StringBuffer**

Since Strings are immutable, frequent modifications cause **new objects** to be created, which is **inefficient**.
Java provides **mutable alternatives**:

### (a) **StringBuilder**

* Introduced in Java 5.
* **Mutable** (can be modified without creating new object).
* **Not thread-safe** (faster).

Example:

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb); // "Hello World"
```

### (b) **StringBuffer**

* Older version (thread-safe, synchronized).
* Slower than `StringBuilder`.
* Example usage is same as StringBuilder.

---

## 7. **String vs StringBuilder vs StringBuffer**

| Feature       | String                      | StringBuilder                     | StringBuffer                     |
| ------------- | --------------------------- | --------------------------------- | -------------------------------- |
| Mutability    | Immutable                   | Mutable                           | Mutable                          |
| Thread Safety | Yes (immutable → safe)      | No                                | Yes (synchronized)               |
| Performance   | Slow (many objects created) | Fast                              | Slower (due to sync)             |
| Usage         | For constant data           | For single-threaded modifications | For multi-threaded modifications |

---

## 8. **Best Practices**

* Use **String** when data is constant and rarely modified.
* Use **StringBuilder** for frequent modifications (single-threaded).
* Use **StringBuffer** when thread safety is required.

---

✅ **Summary**

* **String** → immutable, stored in **SCP** when created as literal.
* **SCP** → reuses string literals for memory efficiency.
* **String manipulation methods** like `substring`, `replace`, `split`.
* **StringBuilder / StringBuffer** → mutable alternatives for efficiency.