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

## **Evolution of JPA**

### 1. The Early Days – JDBC (Java Database Connectivity)

* Before JPA, the **only way** to work with databases in Java was through **JDBC**.
* Developers had to write **a lot of boilerplate code**:

  * Open connection
  * Create `PreparedStatement`
  * Execute query
  * Loop through `ResultSet`
  * Manually map columns → object fields
  * Close connections properly

Problems with JDBC:

* **Manual Object-Relational Mapping (ORM)** → had to manually copy DB fields to POJOs.
* **Boilerplate code** → repetitive SQL, connection handling.
* **Hard to maintain** → any schema change required rewriting queries.
* **Business logic mixed with persistence logic** → poor separation of concerns.

---

### 2. Entity Beans in EJB (Enterprise JavaBeans 2.x, ~2001)

* Sun introduced **Entity Beans** in **EJB 2.0** as part of J2EE to reduce JDBC pain.
* Entity Beans tried to **represent database rows as Java objects** automatically.

Problems with Entity Beans:

* **Heavyweight** → required EJB container, deployment descriptors.
* **Complex lifecycle management** → developers had to deal with `ejbActivate()`, `ejbPassivate()`, etc.
* **Poor portability** → tightly coupled to app servers.
* **Developers hated it** → too much overhead for simple CRUD.

---

### 3. Hibernate & Other ORMs (2001–2005)

* Frustration with EJB Entity Beans led to **open-source ORM frameworks** like:

  * **Hibernate (2001)** → lightweight ORM that simplified persistence.
  * **TopLink** (Oracle)
  * **JDO (Java Data Objects)** → an early standard, but never gained traction.

What Hibernate did well:

* Introduced **transparent persistence** → developers worked with plain POJOs.
* Provided **mapping via XML or annotations**.
* Added **caching, lazy loading, transactions, JPQL-like HQL**.
* Became very popular in the Java community.

But there was a problem:

* Every ORM had its **own APIs** (Hibernate’s `Session`, JDO’s `PersistenceManager`, etc.).
* No **common standard** across Java EE.

---

### 4. Birth of JPA (2006, as part of EJB 3.0 / Java EE 5)

* In 2006, **Java Persistence API (JPA)** was introduced as part of **EJB 3.0** (Java EE 5).
* JPA was heavily influenced by **Hibernate** and **TopLink**.
* Goal: **Unify persistence** under a standard API, while allowing vendors to provide implementations.

Key features JPA introduced:

* **POJO-based entities** (no need for special classes like Entity Beans).
* **Annotations** for ORM mapping (`@Entity`, `@Table`, `@OneToMany`).
* **EntityManager API** instead of vendor-specific APIs.
* **JPQL** (object-oriented query language).
* **Pluggable providers** → developers can use Hibernate, EclipseLink, OpenJPA, etc., without changing code.

---

### 5. Further Evolution

* **JPA 2.0 (Java EE 6, 2009)** → added Criteria API, standardized caching, better collections support.
* **JPA 2.1 (Java EE 7, 2013)** → added Stored Procedures, Entity Graphs.
* **JPA 2.2 (Java EE 8, 2017)** → added Java 8 `Stream`, Date/Time API support.
* **Jakarta Persistence 3.x (Jakarta EE 9/10, 2020+)** → package moved from `javax.persistence` → `jakarta.persistence`.

---

### **Why JPA Was Conceived**

1. **Simplify persistence**
   → Developers should focus on **business logic**, not JDBC plumbing.

2. **Standardize ORM in Java**
   → A common API across providers (Hibernate, EclipseLink, OpenJPA).

3. **POJO-based approach**
   → No need for heavyweight EJB entity beans or container-managed lifecycles.

4. **Reduce boilerplate**
   → Mapping, CRUD, transactions handled by JPA instead of manual SQL.

5. **Portability**
   → Applications can switch providers with minimal changes.

---

### **Problems JPA Solved**

| Problem (Before JPA)                    | Solution (With JPA)                              |
| --------------------------------------- | ------------------------------------------------ |
| Manual mapping of ResultSet → POJOs     | Automatic ORM via annotations                    |
| Lots of boilerplate JDBC code           | EntityManager simplifies CRUD                    |
| Vendor lock-in (Hibernate API, JDO API) | Standard API (JPA) works with multiple providers |
| Heavy EJB Entity Beans                  | Lightweight POJOs                                |
| Hard schema updates                     | Annotations + schema generation (`ddl-auto`)     |
| SQL tightly coupled with code           | JPQL for object-oriented queries                 |

---

### 🎯 **In Short**

* JDBC was **too low-level**.
* EJB Entity Beans were **too heavy**.
* Hibernate was **good but proprietary**.
* **JPA brought the best of Hibernate into a standard API**, making persistence in Java **simple, portable, and powerful**.
