# **Git & GitHub Assignment — Java Edition (Manual File Setup)**

## **Objective**

Simulate a real-world software development workflow using **Git** and **GitHub**, including:

* Branching
* Merging
* Handling merge conflicts
* Pull Requests
* Tagging and releasing

---

## **Project Theme: “Feature Tracker App (Java CLI)”**

You’ll build a simple **Java console app** that tracks application features — allowing users to **add**, **list**, and **remove** features.

Each functionality will be implemented in a separate branch and merged through GitHub PRs.

---

## **Assignment Steps**

### Step 1 — Initialize the Repository

1. Create a new project folder:

   ```
   feature-tracker
   ```
2. Inside it, create these subfolders and files manually:

   ```
   src/com/example/FeatureTracker.java
   README.md
   features.txt
   ```
3. Initialize Git:

   ```bash
   git init
   ```
4. Open `src/com/example/FeatureTracker.java` in your editor and write:

   ```java
   package com.example;

   public class FeatureTracker {
       public static void main(String[] args) {
           System.out.println("Feature Tracker App");
       }
   }
   ```
5. Save all files, then:

   ```bash
   git add .
   git commit -m "Initial project setup with main class"
   ```

---

### Step 2 — Create Branches

Create separate branches for different features:

```bash
git branch feature-add
git branch feature-list
git branch feature-remove
git branch feature-refactor
```

---

### Step 3 — Implement “Add Feature”

1. Switch to the **feature-add** branch:

   ```bash
   git switch feature-add
   ```
2. Modify `FeatureTracker.java`:

   ```java
   package com.example;
   import java.io.FileWriter;
   import java.io.IOException;

   public class FeatureTracker {
       public static void main(String[] args) {
           addFeature("Login functionality");
       }

       public static void addFeature(String feature) {
           try (FileWriter writer = new FileWriter("features.txt", true)) {
               writer.write(feature + "\n");
               System.out.println("Feature added: " + feature);
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
   }
   ```
3. Save and commit:

   ```bash
   git add .
   git commit -m "Implemented addFeature method"
   ```

---

### Step 4 — Implement “List Features”

1. Switch to **feature-list** branch:

   ```bash
   git switch feature-list
   ```
2. Modify the same file:

   ```java
   package com.example;
   import java.io.BufferedReader;
   import java.io.FileReader;
   import java.io.IOException;

   public class FeatureTracker {
       public static void main(String[] args) {
           listFeatures();
       }

       public static void listFeatures() {
           try (BufferedReader reader = new BufferedReader(new FileReader("features.txt"))) {
               String line;
               System.out.println("Feature List:");
               while ((line = reader.readLine()) != null) {
                   System.out.println("- " + line);
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
   }
   ```
3. Commit:

   ```bash
   git add .
   git commit -m "Implemented listFeatures method"
   ```

---

### Step 5 — Push to GitHub

1. Create a **new repository** on GitHub named `feature-tracker-java`.
2. Connect and push:

   ```bash
   git remote add origin https://github.com/<your-username>/feature-tracker-java.git
   git branch -M main
   git push -u origin main
   git push origin feature-add
   git push origin feature-list
   git push origin feature-remove
   git push origin feature-refactor
   ```

---

### Step 6 — Create Pull Requests

On GitHub:

* Open a **Pull Request** from `feature-add` → `main`
* Merge it
* Repeat for `feature-list`

---

### Step 7 — Simulate a Merge Conflict

1. Switch to `feature-remove`:

   ```bash
   git switch feature-remove
   ```
2. Add a new method:

   ```java
   public static void removeFeature(String feature) {
       System.out.println("Feature removed: " + feature);
   }
   ```
3. Commit and try merging into main:

   ```bash
   git switch main
   git merge feature-remove
   ```
4. A **merge conflict** will appear.

---

### Step 8 — Resolve Merge Conflict

Open the conflicted file. You’ll see:

```java
<<<<<<< HEAD
   public static void listFeatures() {
       // ...
   }
=======
   public static void removeFeature(String feature) {
       // ...
   }
>>>>>>> feature-remove
```

Fix it manually to include both:

```java
   public static void listFeatures() {
       // ...
   }

   public static void removeFeature(String feature) {
       // ...
   }
```

Then:

```bash
git add src/com/example/FeatureTracker.java
git commit -m "Resolved merge conflict between list and remove features"
git push
```

---

### Step 9 — Tag a Release

```bash
git tag -a v1.0 -m "First release with add, list, and remove features"
git push origin v1.0
```

---

## **Bonus Challenges**

* Add `.gitignore` for `*.class` and `target/`
* Add a GitHub Action that runs:

  ```bash
  javac src/com/example/FeatureTracker.java
  java -cp src com.example.FeatureTracker
  ```
