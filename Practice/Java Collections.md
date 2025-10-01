# **Problem Statement: Student Course Registration System**

A university wants to build a **Course Registration System** to manage **students, courses, and enrollments**. The system must allow storing, searching, and sorting data using Java Collections.

## **Requirements**

### 1. **Entities**

* **Student**
  * Properties: `id`, `name`, `email`, `cgpa`
  * Must be uniquely identified by `id`.
* **Course**
  * Properties: `courseCode`, `title`, `credits`
  * Must be uniquely identified by `courseCode`.
* **Enrollment**
  * Properties: `studentId`, `courseCode`, `semester`, `grade`

### 2. **Functional Requirements**

1. **Maintain a list of students**
   * Add, remove, update students.
   * Store students in a `List<Student>` for ordered access.

2. **Maintain a set of courses**
   * Each course should be unique → use `Set<Course>`.
   * Prevent duplicate courses from being added.

3. **Map student to courses enrolled**
   * Use a `Map<Student, List<Course>>` to maintain enrollments.
   * One student can enroll in multiple courses.

4. **Sorting Requirements**
   * Sort students by:
     * Natural order: `id` (default using `Comparable`).
     * Custom order: `name`, or descending `cgpa` (using `Comparator`).
   * Sort courses by `credits`.

5. **Searching Requirements**
   * Find a student by `id`.
   * Find all courses taken by a particular student.
   * Check if a particular course exists in the catalog.

6. **Advanced Features (Optional)**
   * Maintain a `PriorityQueue<Student>` to identify students with **highest CGPA first** (e.g., for scholarship allocation).
   * Maintain a `LinkedHashMap<String, Course>` as a course catalog that preserves insertion order.

## **Constraints**
* No duplicates allowed for students (unique `id`) or courses (unique `courseCode`).
* Searching and sorting must leverage Java Collections (`Collections.sort`, `Comparator`, `Map` lookup).
* Should demonstrate both **natural ordering** and **custom ordering**.

## **Expected Outcomes**

By the end of the exercise, learners should be able to:

* Design **custom classes** (`Student`, `Course`, `Enrollment`).
* Use **different collections** appropriately (`List`, `Set`, `Map`, `PriorityQueue`).
* Apply **sorting** (natural + custom).
* Perform **searching** operations (linear search in lists, direct lookup in sets/maps).
* Understand trade-offs between collections in terms of **efficiency**.

## **Step-by-Step Tasks**

### **Task 1: Define Domain Classes**

1. Create a `Student` class with properties:
   * `int id`
   * `String name`
   * `String email`
   * `double cgpa`
   * Override `toString()` for readable output.
   * Implement `Comparable<Student>` to compare students by `id` (natural order).

2. Create a `Course` class with properties:
   * `String courseCode`
   * `String title`
   * `int credits`
   * Override `equals()` and `hashCode()` to ensure uniqueness based on `courseCode`.

3. Create an `Enrollment` class with properties:
   * `int studentId`
   * `String courseCode`
   * `String semester`
   * `String grade`

### **Task 2: Store Students**
* Use a **`List<Student>`** to store all registered students.
* Write methods to:
  * Add a student
  * Remove a student
  * Update student details
* Demonstrate insertion order and duplicates (if not handled).
  
### **Task 3: Store Courses**
* Use a **`Set<Course>`** (e.g., `HashSet<Course>`) to ensure no duplicate courses are added.
* Add at least 5 courses to the system.
* Demonstrate uniqueness check when adding the same course twice.

### **Task 4: Student–Course Mapping**

* Use a **`Map<Student, List<Course>>`** to maintain enrollments.
* For a given student, list all enrolled courses.
* Show how to:
  * Enroll a student into a course.
  * Retrieve all courses taken by a student.

### **Task 5: Sorting**

1. Sort students by:
   * Natural order (`id`) using `Collections.sort()` (relies on `Comparable`).
   * Name (alphabetically) using `Comparator`.
   * CGPA (descending) using `Comparator`.

2. Sort courses by number of credits.

### **Task 6: Searching**

1. Find a student by `id` (linear search in `List<Student>`).
2. Find a course by `courseCode` (direct lookup in `Set<Course>`).
3. Find all courses a particular student has enrolled in (lookup in `Map<Student, List<Course>>`).

### **Task 7: Advanced (Optional)**

1. Use a **`PriorityQueue<Student>`** to get top students by CGPA (highest CGPA first).
2. Use a **`LinkedHashMap<String, Course>`** as a course catalog that preserves insertion order.

## **Expected Deliverables**

* **Java classes**: `Student`, `Course`, `Enrollment`, and a `Main` class for testing.
* Demonstrations of:
  * Adding/removing/searching students & courses.
  * Enrolling students in courses.
  * Sorting students and courses using both `Comparable` and `Comparator`.
  * Searching in collections.
  * Using `PriorityQueue` for CGPA ranking.