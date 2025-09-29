/**
 * All java source code files have .java extension. 
 * This .java file is compiled using javac command to produce a .class file.
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
    // main method is the default entry point of any java application
    // first method to be executed in any java application
    // main methods are generally defined in a public class
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}