# JPA - Java/Jakarata Pesistence API 

**Jakarata Persistence API formerly Java Persistence API.**

JPA is a specification for **Object relational Mapping(ORM)** in Java. ORM allows mapping of Database Tables into Java
classes and objects. Hibernate, EclipseLnk are some common implmentations of JPA.

## ORM - Object Relational Mapping

A technique to map Java classes to relational tables. It is done by:
- Every Table is mapped to a class
- Every Column is mapped to a attribute in that class
- Every row is mapped to an object of that class

```sql
CREATE TABLE students (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    email VARCHAR(100) UNIQUE
);
```

```java
class Student {
    private long id;
    private String name;
    private short age;
    private String email;

    // constructors
    // getters
    // setters
}
```

```java
// Using JDBC
class StudentDao {

    // Insert via jDBC
    public int insert(Student student) {
        String query = "insert into students (id, name, age, email) values (? ,? ,?, ?)";
        Connection conn = DriverManger.getConnection("", "", ""); // provide username, pasword, url
        PreparedStatement ps = conn.prepareStatment(query);
        ps.setLong(1, student.getId());
        ps.setString(2, student.getName());
        ps.setShort(3, student.getAge());
        ps.setString(4, student.getEmail());
        int rows = ps.executeUpdate();
        conn.close();
        return rows;
    }
}
```

The traditional way invloves writing code using JDBC api, which is slow, time consuming. Using an ORM library, allows the developers to
focus on the data layer rather than the inderlying implementations.

### Advantages of using ORM

- Automatic SQL generation
- Lazy Loading, we can load the realted objects when needed
- Cache objects to reduce db calls.
- Transaction Management, automatically creates transactions
- Schema generation - can automatically create or drop or update tables based on the ORM
- JPQL - Java Persistence Query Language

## JPA Concepts

### Entity

- A Java class the represents a database table
- Each instance represents a row
- Marked with `@Entity` annotation

### Entity Manager

- Central API that interacts with the database
- Manages the entity lifecylce
- Created from the `EntityManagerFactory`
  
  **Most used methods**
  - persist() // save the data to the db
  - find() // find the data

### Persistence Unit

- Defined in a `persistence.xml`
- Defines the database connection details
- Specifies the entities
- Configures JPA

### JPA Annotations

- `@Entity` - marks the java class as an Entity class
- `@Table` - name of the table to which the class is mapped
- `@Column` - the name of the column to which the class atribute is mapped
- `@Id` - maps the primary key column

```java
@Entity
@Table(name="students")
class Student {

    @Id
    private long id; // primary key column
    @Column(name="name")
    private String name; // map this field to the name column of students table
    private short age;
    private String email;

    // constructors
    // getters
    // setters
}
```

### JPA Relations
### JPQL