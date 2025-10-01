# 📝 **Practice Problem: Employee Records System (Collections + JDBC)**

## 🎯 Objective

Design and implement a Java application that manages **Employee Records** by loading data from a **MySQL database** into **Collections**, performing operations, and syncing updates back to the database.

---

## 📖 Problem Description

The company database contains a table `employees`. Your program must:

1. Load employee data from the database into a **`List<Employee>`**.
2. Perform operations:

   * **Sorting** employees by salary (high → low).
   * **Searching** employees by department.
   * **Filtering** employees with salary above a threshold.
   * **Grouping (Optional)** employees by department using a `Map<String, List<Employee>>`.
3. Insert, update, and delete employees in both the **Collection** and the **Database**.
4. Display employee records neatly in the console.

---

## 🏗️ Database Schema

```sql
CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    department VARCHAR(50),
    salary DECIMAL(10,2)
);
```

---

## 📂 Java Classes & Skeleton Code

### 1. **Employee Model Class**

```java
public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) { }

    // Getters and Setters
    public int getId() { }
    public void setId(int id) { }

    public String getName() { }
    public void setName(String name) { }

    public String getDepartment() { }
    public void setDepartment(String department) { }

    public double getSalary() { }
    public void setSalary(double salary) { }

    // toString() for easy printing
    @Override
    public String toString() { }
}
```

---

### 2. **DBUtil Class (JDBC Utility)**

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/company";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    // Return database connection
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
```

---

### 3. **EmployeeDAO Class (Database Operations)**

```java
import java.util.List;

public class EmployeeDAO {
    // Fetch all employees from DB
    public List<Employee> getAllEmployees() { }

    // Insert new employee
    public void insertEmployee(Employee employee) { }

    // Update salary of an employee
    public void updateEmployeeSalary(int id, double newSalary) { }

    // Delete employee
    public void deleteEmployee(int id) { }
}
```

---

### 4. **EmployeeService Class (Collection Operations)**

```java
import java.util.List;
import java.util.Map;

public class EmployeeService {
    private List<Employee> employees; // loaded from DB

    public EmployeeService(List<Employee> employees) {
        this.employees = employees;
    }

    // Sort employees by salary (desc)
    public List<Employee> sortBySalaryDesc() { }

    // Search employees by department
    public List<Employee> searchByDepartment(String dept) { }

    // Filter employees above a salary
    public List<Employee> filterBySalary(double minSalary) { }

    // Group employees by department
    public Map<String, List<Employee>> groupByDepartment() { }

    // Add new employee (collection + DB)
    public void addEmployee(Employee employee, EmployeeDAO dao) { }

    // Update employee salary (collection + DB)
    public void updateSalary(int id, double newSalary, EmployeeDAO dao) { }

    // Remove employee (collection + DB)
    public void removeEmployee(int id, EmployeeDAO dao) { }

    // Display all employees
    public void displayEmployees(List<Employee> list) { }
}
```

---

### 5. **Main Class**

```java
import java.util.List;

public class EmployeeApp {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();

        // 1. Load employees from DB into List
        List<Employee> employees = dao.getAllEmployees();

        // 2. Initialize service with the list
        EmployeeService service = new EmployeeService(employees);

        // 3. Perform operations
        service.displayEmployees(service.sortBySalaryDesc());
        service.displayEmployees(service.searchByDepartment("IT"));
        service.displayEmployees(service.filterBySalary(60000));

        // 4. Add new employee
        Employee newEmp = new Employee(0, "John", "HR", 65000);
        service.addEmployee(newEmp, dao);

        // 5. Update salary
        service.updateSalary(2, 90000, dao);

        // 6. Remove employee
        service.removeEmployee(3, dao);
    }
}
```

---

## ✅ Key Learning Outcomes

* **JDBC CRUD operations** (DAO pattern).
* **Collections operations** (sorting, filtering, grouping, searching).
* **Synchronization** between in-memory data and database.
* **Layered architecture**: Model → DAO → Service → Main.