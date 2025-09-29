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
import java.util.*;
// import a specific class from a package
import java.io.File;
// the java.lang package is imported by default
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        System.out.println();
    }
}

/**
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