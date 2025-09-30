# Problem Statement: **Online Learning Management System (LMS)**

An education startup wants to build an **Online Learning Management System (LMS)** to manage courses, learners, instructors, and certifications.

You are tasked with identifying **classes, abstract classes, interfaces, properties, and methods**, and defining the **relationships** between them.

---

## System Description

1. **Users of the System**

   * There are different types of users: **Student**, **Instructor**, and **Administrator**.

   * All users must have common properties like `userId`, `name`, `email`, and `password`.

   * All users must be able to **login()** and **logout()**, but the implementation may differ.
---

2. **Courses**

   * A `Course` contains: `courseId`, `title`, `description`, `duration`.

   * A course can be of different types: **OnlineCourse** and **OfflineCourse**.

     * `OnlineCourse` includes properties like `videoLink`, `platform`.
     * `OfflineCourse` includes `location`, `schedule`.

   * Each course must provide a method `startCourse()`, but the way it is implemented differs between online and offline.
---

3. **Enrollments**

   * A student can **enroll** in a course.
   * An enrollment records: `enrollmentId`, `student`, `course`, `enrollmentDate`, and `status`.
   * Students can **complete** an enrollment, which may lead to certification.

---

4. **Certification**

   * After successful course completion, students can receive a **Certificate**.

   * A certificate has: `certificateId`, `student`, `course`, `issueDate`.

   * Certification could be **downloadable (PDF)** or **verifiable online**.
---

5. **Payments**

   * Courses may be **free** or **paid**.
   * Paid courses require a payment process.
   * Payments can be done via **CreditCard**, **UPI**, or **PayPal**.
   * All payment types must implement a common **Payment interface** with methods like `pay(amount)` and `refund(amount)`.

---

6. **Relationships**

   * A `Student` **has-a** list of enrolled `Courses`.
   * An `Instructor` **has-a** list of created `Courses`.
   * A `Course` **has-a** list of `Enrollments`.
   * Certificates are generated **from** completed `Enrollments`.
   * Payments are linked to `Enrollments`.

---

## Deliverables

As a learner, you must:

1. Identify which entities should be **classes**, **abstract classes**, or **interfaces**.
2. Define **properties (attributes)** and **methods** for each class/interface.
3. Decide which classes use **inheritance (IS-A)** and which use **composition (HAS-A)**.
4. Show the relationships between classes (e.g., UML diagram or written explanation).