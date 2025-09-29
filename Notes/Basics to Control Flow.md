# 📒 Java Notes – Basics to Control Flow

---

## 1. Compilation & Execution

* **File Extension**: `.java`
* **Compilation**:

  * `javac FileName.java` → produces `.class` file (bytecode)
* **Execution**:

  * `java ClassName`
* **Multiple Classes**:

  * One `.java` file can contain many classes.
  * Each class compiles into its own `.class` file.
  * Only **one public class**, and its name must match the file name.

---

## 2. Java Execution Flow

* Source Code → Bytecode → JVM → Machine Code
* **Steps**:

  1. **Class Loader** → loads `.class` files.
  2. **Bytecode Verifier** → checks illegal access & violations.
  3. **Interpreter** → reads and executes bytecode instructions.
  4. **JIT Compiler (Just-In-Time)** → optimizes execution by converting bytecode into machine code.

✅ Platform independence is achieved because bytecode runs on the JVM.
✅ Runs in a **sandboxed environment**, so Java code cannot directly access hardware.

---

## 3. Identifiers & Naming Conventions

### Rules for Identifiers

* Can contain: **letters, digits, `_`, `$**
* Must begin with: **letter, `_`, `$**
* Cannot use keywords (`public`, `class`, etc.)
* Cannot contain spaces
* Case-sensitive
* Should be descriptive

### Naming Conventions

* **Class Names** → `PascalCase` (e.g., `HelloWorld`, `MyClass`)
* **Methods & Variables** → `camelCase` (e.g., `findAverage`, `myNumber`)
* **Constants** → `UPPERCASE_WITH_UNDERSCORES` (e.g., `MAX_VALUE`, `PI`)

---

## 4. Data Types in Java

### Primitive Types

| Type    | Size    | Example             |
| ------- | ------- | ------------------- |
| byte    | 1 byte  | `byte b = 10;`      |
| short   | 2 bytes | `short s = 100;`    |
| int     | 4 bytes | `int i = 1000;`     |
| long    | 8 bytes | `long l = 10000L;`  |
| float   | 4 bytes | `float f = 10.5f;`  |
| double  | 8 bytes | `double d = 20.99;` |
| char    | 2 bytes | `char c = 'A';`     |
| boolean | 1 bit   | `boolean b = true;` |

### Non-Primitive Types

* `String`, Arrays, Classes, Interfaces

---

## 5. `var` Keyword (Java 10+)

* Allows **local type inference**:

  ```java
  var number = 100;     // int
  var pi = 3.14;        // double
  var name = "Ashish";  // String
  ```

⚠️ Rules:

* Must be initialized immediately.
* Cannot be `null`.
* Can only be used for **local variables** inside methods.

---

## 6. Strings in Java

* **Normal String**:

  ```java
  String str = "Hello, Java!";
  ```
* **Concatenation**:

  ```java
  String msg = "Hello," + " World!" + " Welcome.";
  ```
* **Escape Characters**:

  ```java
  String formatted = "Hello,\nThis is a message.";
  ```
* **Text Blocks (Java 13+)**:

  ```java
  String email = """
                 Hello Ashish,
                 This is a formatted message.
                 Regards,
                 Deloitte
                 """;
  ```

---

## 7. Constants

* Declared using `final` keyword.
* Value cannot be changed once assigned.
* Named in **UPPERCASE**.

```java
final double PI = 3.14159;
final String COMPANY_NAME = "Deloitte";
```

---

## 8. Type Casting

### Implicit (Widening Conversion)

* Small → Large (automatic, no data loss).

```java
int myInt = 100;
long myLong = myInt;
double myDouble = myLong;
```

### Explicit (Narrowing Conversion)

* Large → Small (requires casting, possible data loss).

```java
double d = 9.78;
int i = (int) d;    // 9
float f = (float) d; // 9.78
```

---

## 9. Wrapper Classes

Every primitive has an object wrapper class:

* `byte → Byte`, `short → Short`, `int → Integer`, `long → Long`
* `float → Float`, `double → Double`, `char → Character`, `boolean → Boolean`

---

## 10. Control Flow

### Loops

* **For Loop**:

  ```java
  for (int j = 1; j <= 5; j++) {
      System.out.println("Iteration: " + j);
  }
  ```
* **While Loop**:

  ```java
  int k = 1;
  while (k <= 5) {
      System.out.println(k);
      k++;
  }
  ```
* **Do-While Loop**:

  ```java
  int m = 1;
  do {
      System.out.println(m);
      m++;
  } while (m <= 5);
  ```

### Conditional Statements

* **If**:

  ```java
  if (age >= 18) System.out.println("Eligible to vote");
  ```
* **If-Else**:

  ```java
  if (num % 2 == 0) System.out.println("Even");
  else System.out.println("Odd");
  ```
* **If-Else-If Ladder**:

  ```java
  if (marks >= 90) System.out.println("A");
  else if (marks >= 80) System.out.println("B");
  else System.out.println("C");
  ```

### Switch Case

* **Traditional Switch**:

  ```java
  switch(day) {
      case 1: System.out.println("Monday"); break;
      case 2: System.out.println("Tuesday"); break;
      default: System.out.println("Invalid day");
  }
  ```
* **Enhanced Switch (Java 12+)**:

  ```java
  switch(day) {
      case 1 -> System.out.println("Monday");
      case 2 -> System.out.println("Tuesday");
      default -> System.out.println("Invalid day");
  }
  ```

---

## 11. Enums

* Define a fixed set of constants.

```java
enum DayOfTheWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
    THURSDAY, FRIDAY, SATURDAY
}
```

Usage:

```java
DayOfTheWeek today = DayOfTheWeek.THURSDAY;
System.out.println("Today is: " + today);
```

---

# ✅ Summary

* Java achieves **platform independence** via JVM.
* Programs start from the **`main` method**.
* Strictly typed → all variables must have a data type.
* Supports **type casting, constants, wrapper classes**.
* Control flow: **loops, if-else, switch, enhanced switch**.
* **Enums** represent fixed sets of constants (like days of week).

---