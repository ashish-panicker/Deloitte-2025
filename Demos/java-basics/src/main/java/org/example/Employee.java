package org.example;

// import java.lang.*; // Imported by default

import java.time.LocalDate;

/**
 * Properties of Employees: Employee Id, Full Name, Designation, Department, DateOfBirth
 */
public class Employee {

    // Attributes, Methods all use came case
    // Fields, Class level attributes, they are initialized by default
    // All reference types are initialized to null
    int employeeId = 1000;
    String fullName = "-";
    String designation = "-";
    String department = "-";
    LocalDate dateOfBirth; // null is the default value

    // Constructors:
    // Special methods that are executed when an object is created
    // They have the same name as case as that of the class
    // They do not have a return type
    // If you do not provide a constructor java will add a default constructor to the class
    Employee() {
        System.out.println("Employee constructor 1.");
        System.out.println(employeeId + "\t" + fullName + "\t" + designation + "\t" + department);
        System.out.println();
    }

    // Constructors can be overloaded as well
    Employee(int employeeId, String fullName, LocalDate dateOfBirth) {
        System.out.println("Employee constructor 2.");
        System.out.println(this.employeeId + "\t" + this.fullName + "\t" + this.dateOfBirth); // Fields or Constructor params?
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        System.out.println(this.employeeId + "\t" + this.fullName + "\t" + this.dateOfBirth);
        System.out.println();
    }

    Employee(int employeeId, String fullName, String designation, String department, LocalDate dateOfBirth) {
        System.out.println("Employee constructor 3.");
        System.out.println(employeeId + "\t" + fullName + "\t" + designation + "\t" + department + "\t" + dateOfBirth);// Buggy
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.designation = designation;
        this.department = department;
        this.dateOfBirth = dateOfBirth;
        System.out.println(employeeId + "\t" + fullName + "\t" + designation + "\t" + department + "\t" + dateOfBirth);// Buggy
        System.out.println();
    }

    // this keyword represents the current instance
    void assignDepartment(String department) {
        this.department = department;
    }

}
