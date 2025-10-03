package org.example;

import java.util.Scanner;

import org.example.model.Student;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
        System.out.println("EntityManagerFactory created: " + emf);
        var em = emf.createEntityManager();

        Student johnSmith = new Student("John Smith", 22, "john.smith");
        Student janeDoe = new Student("Jane Doe", 21, "jane.doe");

        // var tx = em.getTransaction(); // For all DML operations, we need a
        // transaction
        // tx.begin(); // Start the transaction
        // em.persist(johnSmith); // Insert operation
        // em.persist(janeDoe); // Insert operation
        // tx.commit(); // Commit the transaction
        // System.out.println("Students persisted: " + johnSmith + ", " + janeDoe);

        // System.out.println("Press ENTER to terminate...");
        // new Scanner(System.in).nextLine();

        // Fetch by email
        Student student = em.createQuery("from Student s where s.email = :email", Student.class)
                .setParameter("email", "john.smith")
                .getSingleResult();
        System.out.println("Found student by email: " + student);
        var tx = em.getTransaction(); // For all DML operations, we need a
        // transaction
        tx.begin(); // Start the transaction
        student.setAge(23); // Update operation
        tx.commit(); // Commit the transaction
        System.out.println("Student updated: " + student);

        // Fetch all data
        var query = em.createQuery("from Student s", Student.class);
        var list = query.getResultList();
        if (list.isEmpty()) {
            System.out.println("No students found");
        } else {
            System.out.println("Found " + list.size() + " students");
            for (Student s : list) {
                System.out.println(s);
            }
        }

        em.close();
        emf.close();
    }
}