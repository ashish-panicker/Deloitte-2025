/**
 * All java source code files have .java extension. 
 * The .java file is compiled using javac command to produce a .class file.
 * The .class file is executed using java command. These files contain bytecode.
 * 
 * One .java source file can contain multiple classes and each of these class will be compiled to separate .class files.
 * 
 * The java source code gets compiled to bytecode which is platform independent. This is done by Java Compiler.
 * These bytecode is stored in .class files.
 * 
 * These classes files are then interpreted by java interpreter which is part of Java Runtime Environment (JRE).
 * The JRE contains Java Virtual Machine (JVM) which interprets the bytecode to machine code.
 * 
 * Java Source Code -> Bytecode -> Java Virtual Machine -> Machine Code
 * 
 * This is how Java achieves platform independence.
 * 
 * Java Bytecode execution.
 * 
 * Class Loader: Loads the .class files containing bytecode.
 * Bytecode Verifier: Checks the code for illegal code that can violate access rights to objects.
 * Interpreter: Reads the bytecode stream then executes the instructions.
 * Just-In-Time Compiler (JIT): This is used to improve performance. It converts the bytecode into machine code.
 * 
 * Since java code is executed by JVM, it is also a sandboxed environment i.e your java code does not directly
 * access the underlying machine resources.
 * 
 */

/**
 * One java file can contain multiple classes but only one of these classes can
 * be public. The name of the public class must match the name of the file.
 */

// name of the file would be HelloWorld.java
// To compile the program use command: javac HelloWorld.java
// This would be compiled to HelloWorld.class
// To run the program use command: java HelloWorld
public class HelloWorld {
    // var xyz = 100; // compilation error: 'var' is not allowed here

    // main method is the default entry point of any java application
    // first method to be executed in any java application
    // main methods are generally defined in a public class
    public static void main(String[] args) {

        System.out.println("Hello, World!"); 

        // Identifier naming rules
        // 1. Can contain letters, digits, underscores, and dollar signs
        // 2. Must begin with a letter, underscore, or dollar sign
        // example: myVariable1, _myVariable, $myVariable
        // 3. Cannot be a reserved keyword like public, class, static, void, int, etc.
        // 4. Cannot contain spaces
        // 5. Case sensitive
        // example: myVariable and myvariable are different identifiers
        // 6. Should be meaningful and descriptive

        // Naming Conventions
        // 1. Class names should be in PascalCase example: HelloWorld, MyFirstClass, StudentMonitorDetails
        // 2. Method and variable names should be in camelCase example: myMethod, myVariable, findAverageMarks
        // 3. Constants should be in UPPERCASE with words separated by underscores example: MAX_VALUE, MIN_VALUE

        // Java is strictly typed language, meaning every variable must be declared with a data type
        // Datatypes in Java
        // Primitive Data Types:        byte, short, int, long, float, double, char, boolean
        // Non-Primitive Data Types:    String, Arrays, Classes, Interfaces

        byte    b   = 10;            // 1 byte
        short   s   = 100;          // 2 bytes    
        int     i   = 1000;           // 4 bytes
        long    l   = 10000L;        // 8 bytes
        long    l2  = 23_123_123L;  // underscores can be used to improve readability

        // while working with floating point numbers, double is the default data type
        // to specify a float, suffix the number with f or F
        float   f    = 10.5f;        // 4 bytes
        double  d    = 20.99;       // 8 bytes
        double  d2   = 123_456.789; // underscores can be used to improve readability

        char    c       = 'A';     // 2 bytes
        boolean bool    = true;    // 1 bit

        String  str  = "Hello, Java!"; // String is a class, not a primitive data type

        // Local Type Inference using var keyword (available from Java 10 onwards)
        var     number  = 100;          // int
        var     pi      = 3.14;         // double
        var     name    = "Ashish";     // String
        // var x = null; // compilation error: cannot infer type for local variable x initialized to 'null'
        // while using var keyword 
        // 1. variable must be initialized at the time of declaration
        // 2. cannot be initialized to null
        // 3. can only be used for local variables inside methods

        // multi line string
        String welcomeMessage =     "Hello," +
                                    " World!" +
                                    " Welcome to Java.";

        System.out.println(welcomeMessage); 
        
        String formattedEmailMesage =   "Hello Ashish,\n" + 
                                        "This is a formatted email message.\n" +
                                        "Regards,\n" +
                                        "Deloitte-2025";
        System.out.println(formattedEmailMesage);

        // text blocks (available from Java 13 onwards)
        String emailMessage = """
                            Hello Ashish,
                            This is a formatted email message.
                            Regards,
                            Deloitte-2025
                """;
        System.out.println(emailMessage);
    }
}