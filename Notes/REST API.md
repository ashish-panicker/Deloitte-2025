## **1. Introduction to Web Services**

**Definition:**

A **Web Service** is a software system designed to support interoperable machine-to-machine communication over a network (usually HTTP). Web services allow applications to communicate and exchange data, regardless of the underlying platform or language.

**Key Features:**

* Platform-independent
* Language-independent
* Uses standard protocols like HTTP, SOAP, XML, JSON
* Can be **SOAP-based** or **REST-based**

**Common Use Cases:**

* Online payment systems (PayPal, Stripe)
* Weather information services
* Social media integrations
* Microservices communication

---

## **2. Basic Differences between SOAP and RESTful Web Services**

| Feature                | SOAP                                               | REST                                                        |
| ---------------------- | -------------------------------------------------- | ----------------------------------------------------------- |
| **Full Form**          | Simple Object Access Protocol                      | Representational State Transfer                             |
| **Protocol**           | Protocol                                           | Architectural Style                                         |
| **Message Format**     | XML only                                           | JSON, XML, YAML, or plain text                              |
| **Transport Protocol** | HTTP, SMTP, TCP                                    | HTTP/HTTPS                                                  |
| **State**              | Stateful or Stateless                              | Stateless                                                   |
| **Standards Support**  | Built-in security (WS-Security), ACID transactions | Relies on HTTPS and OAuth for security, no formal standards |
| **Performance**        | Slower due to XML and extensive standards          | Faster, lightweight (especially JSON)                       |
| **Error Handling**     | SOAP Fault                                         | HTTP Status codes                                           |
| **Tools**              | WSDL for contracts                                 | No strict contract; uses OpenAPI/Swagger for documentation  |

---

## **3. How to Build RESTful Services**

RESTful services are built around resources, each identified by a URI. The typical tech stack: **Spring Boot (Java), Express (Node.js), Django REST Framework (Python)**.

**Steps to build RESTful service (Java/Spring Boot example):**

1. **Create Spring Boot Project**

   ```bash
   spring init --dependencies=web,data-jpa,h2 demo-rest
   ```

2. **Define Entity**

   ```java
   @Entity
   public class Student {
       @Id @GeneratedValue
       private Long id;
       private String name;
       private int age;
   }
   ```

3. **Create Repository**

   ```java
   public interface StudentRepository extends JpaRepository<Student, Long> {}
   ```

4. **Create REST Controller**

   ```java
   @RestController
   @RequestMapping("/students")
   public class StudentController {
       @Autowired
       private StudentRepository repo;

       @GetMapping
       public List<Student> getAll() {
           return repo.findAll();
       }

       @PostMapping
       public Student create(@RequestBody Student s) {
           return repo.save(s);
       }

       @PutMapping("/{id}")
       public Student update(@PathVariable Long id, @RequestBody Student s) {
           s.setId(id);
           return repo.save(s);
       }

       @PatchMapping("/{id}")
       public Student patch(@PathVariable Long id, @RequestBody Map<String,Object> updates) {
           Student s = repo.findById(id).orElseThrow();
           updates.forEach((k,v) -> {
               if(k.equals("name")) s.setName((String)v);
               if(k.equals("age")) s.setAge((Integer)v);
           });
           return repo.save(s);
       }

       @DeleteMapping("/{id}")
       public void delete(@PathVariable Long id) {
           repo.deleteById(id);
       }
   }
   ```

---

## **4. Differences between PUT, PATCH, and POST**

| Method    | Description                 | Idempotent?        | Typical Use                            |
| --------- | --------------------------- | ------------------ | -------------------------------------- |
| **POST**  | Create a new resource       | No                 | Add a new student                      |
| **PUT**   | Replace the entire resource | Yes                | Update all fields of student           |
| **PATCH** | Update part of the resource | No/Yes (depending) | Update just the age or name of student |

**Key Rule:**

* Use **POST** for creation.
* Use **PUT** when replacing the whole resource.
* Use **PATCH** when partially updating.

---

## **5. Deploy RESTful Services**

**Options:**

1. **Local Deployment** – Run Spring Boot locally:

   ```bash
   mvn spring-boot:run
   ```
2. **Server Deployment** – Deploy on Tomcat, Jetty, or any application server.
3. **Cloud Deployment** – AWS, Azure, GCP, Heroku, or Docker container.

**Docker Example:**

```dockerfile
FROM openjdk:17
COPY target/demo-rest.jar demo-rest.jar
ENTRYPOINT ["java","-jar","/demo-rest.jar"]
```

---

## **6. How to Consume RESTful Services / Building Clients**

**Using Java (RestTemplate)**

```java
RestTemplate rest = new RestTemplate();
Student s = rest.getForObject("http://localhost:8080/students/1", Student.class);
```

**Using JavaScript (Fetch API)**

```javascript
fetch('http://localhost:8080/students')
  .then(response => response.json())
  .then(data => console.log(data));
```

**Tools for Testing / Clients:**

* **Postman** – manual testing
* **Insomnia** – REST client
* **Swagger UI** – auto-generated interactive docs

**Summary:**

* Web Services allow communication between systems.
* SOAP is protocol-based; REST is architecture-based.
* RESTful services are lightweight, use HTTP methods, and can be consumed easily with clients.
* POST/PUT/PATCH serve different update semantics.
* Deployment can be local, server-based, or cloud-based.
