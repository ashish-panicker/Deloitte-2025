package org.example;

// java-basics\src\main\java\org\example
/**
 * Packages in Java
 * 1. Packages are used to group related classes and interfaces together.
 * 2. They help in avoiding name conflicts and provide access control.
 * 3. Packages also make it easier to locate and use classes, interfaces, and sub-packages.
 * 4. The package name is typically in lowercase to avoid conflict with class names.
 * 5. The package structure usually follows the reverse domain name convention (e.g., com.example.project).
 * 6. To use a class from a package, you need to import it using the import statement.
 * 7. If no package is specified, the class belongs to the default package.
 * 8. Packages can be nested, allowing for a hierarchical organization of classes.
 * 9. The directory structure on the filesystem should match the package structure.
 * 10. Java provides built-in packages like java.lang, java.util, java.io, etc.
 * 11. You can create your own packages to organize your code better.
 * 12. The package statement must be the first line in the source file (excluding comments).
 * 13. After the package statement, you can have import statements and then the class/interface definitions.
 */

/**
 * Java source file structure
 * 1. Package Declaration (optional), if present it must be the first line,
 * only one package statement allowed in a file
 * 2. Import Statements (optional), if present they must come after the package
 * declaration, can have multiple import statements
 * 3. Class/Interface Declaration, appears after package and import statements
 * 4. Class Body, contains fields, methods, constructors, and inner
 * classes/interfaces
 */

// import all the classes from a package using wildcard '*'

import java.time.LocalDate;
import java.util.*;
// import a specific class from a package
import java.io.File;
// the java.lang package is imported by default
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        // Initialization before use: all local variables must be initialized before being used
        // Local variables are declared within a method, and must be initialized explicitly
        int x = 0;
        int y = 10;
        System.out.println(x + y);

//        Employee emp1, emp2, emp3; // declaring an object
        // creating a new object, we use the new keyword
        // Java memory management is performed by the JVM
//        emp1 = new Employee();
//        emp2 = new Employee(100, "Ashish", LocalDate.of(1990, 10, 10));
//        emp3 = new Employee(101, "John", "Manager",
//                    "Sales", LocalDate.of(1987, 10, 10));
//        Student s1 = new Student();
//        s1.setRollNumber(1);
//        s1.setEmail("user@someemail.com");
//        s1.setFullName("John Smith");

        Student s2 = new Student();
        Student.setTopics(new String[]{"A", "B", "C"});

        StringBuilder s3 = new StringBuilder();
        // StringBuffer sb = new StringBuffer(); // older
        s3.append("Hello");
        s3.append(" World");
        s3.append(" from");

    }
}

/***
 * Maven project Structure
 * project-name
 *  src
 *      main
 *          java [Main Source Code]
 *          resources [Additional configuration]
 *      test
 *          java [Testing Code]
 *          resources [Additional configuration]
 *  pom.xml [Maven Configuration]
 */

