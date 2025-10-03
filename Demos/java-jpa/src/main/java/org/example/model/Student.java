package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

/**
 * CREATE TABLE students (
 * s_id BIGINT PRIMARY KEY AUTO_INCREMENT,
 * s_name VARCHAR(100) NOT NULL,
 * s_age INT NOT NULL,
 * s_email VARCHAR(100) UNIQUE
 * );
 * <p>
 * Rules for creating a JPA entity:
 * 1. The class must be annotated with @Entity.
 * 2. The class must have a no-argument constructor (can be implicit).
 * 3. The class must have a primary key field annotated with @Id.
 * 4. The class should be public and not final.
 * 5. The primary key field can be annotated with @GeneratedValue to specify
 * generation strategy.
 * 6. Fields can be annotated with @Column to specify column details (optional).
 * 7. The class should implement Serializable (optional but recommended for some
 * use cases).
 * 8. The class should override equals() and hashCode() methods (optional but
 * recommended for entity comparison).
 * 9. The class can have additional annotations for relationships
 * (e.g., @OneToMany, @ManyToOne) if needed.
 * 10. The class should follow Java naming conventions for class and field
 * names.
 */

@Entity
@Table(name = "students") // Optional: specify table name if different from class name
public class Student { // implementing java.io.Serializable is optional but recommended

    // Optional: specify column name if different from field name, can be applied on
    // getter as well
    // Optional: specify generation strategy, e.g., AUTO, IDENTITY, SEQUENCE, TABLE
    @Id
    @Column(name = "s_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Primary key field

    // Optional: specify column details, e.g., not null, length = 100
    @Column(name = "s_name", nullable = false, length = 100)
    private String name;

    // Optional: specify column details, e.g., not null
    @Column(name = "s_age", nullable = false)
    private Integer age;

    // Optional: specify column details, e.g., unique, length = 100
    @Column(name = "s_email", unique = true, length = 100)
    private String email;

    // Mandatory Zero argument constructor
    public Student() {
    }

    public Student(String name, Integer age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, email);
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", email='" + email + '\'' + '}';
    }
}
