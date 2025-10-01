# 📚 **Java Collections Framework (JCF)**

## 1. **History**

* **Before Java 2 (JDK 1.2)**
  Java only had:

  * **Arrays**: Fixed-size, type-safe but inflexible.
  * **Vector**, **Stack**, **Hashtable**, **Dictionary**: Legacy classes for storing objects.
    These lacked a common architecture and consistency.

* **Java 2 (JDK 1.2)**
  → The **Collections Framework** was introduced.
  It unified **interfaces (like List, Set, Map)**, **implementations (like ArrayList, HashSet, HashMap)**, and **algorithms (like sort, search, shuffle)** into one powerful framework.

* **Java 5 (2004)**

  * **Generics** introduced → type safety in collections.
  * **Enhanced for-each loop** for easier iteration.
  * **Autoboxing/unboxing** to handle primitives in collections.

* **Java 8 (2014)**

  * **Streams API** added → functional programming style for processing collections.
  * **forEach()**, **removeIf()**, **replaceAll()** default methods.

* **Java 9+**

  * Factory methods like `List.of()`, `Set.of()`, `Map.of()` for immutable collections.
  * Performance improvements and more utility methods.

---

## 2. **Why Collections? (Use Cases)**

* **Store and process groups of objects** dynamically.
* **Efficient data manipulation** (searching, sorting, insertion, deletion).
* **Data modeling**: Represent relationships like unique elements (Set), key-value pairs (Map), ordered lists (List).
* **Common in real-world apps**:

  * E-commerce → Cart items (List), Unique product IDs (Set), Product catalog (Map).
  * Banking → Transactions (List), Unique customers (Set), Customer-Account mapping (Map).
  * Social Media → Followers (Set), News feed (List), User-profile mapping (Map).

---

## 3. **Advantages**

✅ Pre-built data structures, ready to use.
✅ Consistent API across implementations.
✅ Generic types (type safety, no casting).
✅ Efficient algorithms (sorting, searching, etc.).
✅ Thread-safe variants available (e.g., `ConcurrentHashMap`).
✅ Rich ecosystem with Streams and functional operations.

---

## 4. **Disadvantages / Cons**

❌ **Overhead**: More memory usage than arrays in some cases.
❌ **Complexity**: Choosing the right collection requires understanding time/space trade-offs.
❌ **Thread safety**: Most collections are not synchronized by default.
❌ **Performance pitfalls**: Wrong choice (e.g., using `ArrayList` for frequent insertions at the start) leads to inefficiency.

---

## 5. **Core Interfaces in Java Collections Framework**

1. **Collection (root)**

   * Extended by: **List, Set, Queue**
2. **Map (separate hierarchy)**

   * Key-value pairs.

---

## 6. **Most Common Collection Classes & Their Methods**

### **(A) List (Ordered, Duplicates Allowed)**

1. **ArrayList**

   * Dynamic array, fast random access.
   * Use when reads are more frequent than inserts/deletes.
   * **Methods**:

     * `add(E e)`, `get(int index)`, `remove(int index)`, `size()`, `contains(Object o)`

2. **LinkedList**

   * Doubly-linked list, good for frequent insertions/deletions.
   * Can be used as **Queue** and **Deque**.
   * **Methods**:

     * `addFirst(E e)`, `addLast(E e)`, `removeFirst()`, `removeLast()`

3. **Vector (Legacy)**

   * Synchronized ArrayList (thread-safe but slower).
   * Rarely used now.

---

### **(B) Set (Unique Elements, Unordered or Ordered)**

1. **HashSet**

   * No duplicates, unordered.
   * Backed by a `HashMap`.
   * **Methods**:

     * `add(E e)`, `remove(Object o)`, `contains(Object o)`

2. **LinkedHashSet**

   * Maintains insertion order.
   * Useful when iteration order matters.

3. **TreeSet**

   * Sorted set, implemented using **Red-Black tree**.
   * **Methods**:

     * `first()`, `last()`, `headSet(E toElement)`, `tailSet(E fromElement)`

---

### **(C) Queue (FIFO, Processing Order)**

1. **PriorityQueue**

   * Elements ordered by natural ordering or comparator.
   * Used for scheduling tasks, Dijkstra’s algorithm.
   * **Methods**:

     * `offer(E e)`, `poll()`, `peek()`

2. **ArrayDeque**

   * Double-ended queue, faster than `Stack`/`LinkedList`.
   * **Methods**:

     * `addFirst(E e)`, `addLast(E e)`, `removeFirst()`, `removeLast()`

---

### **(D) Map (Key-Value Pairs)**

1. **HashMap**

   * Most used, stores unique keys with values.
   * O(1) average lookup.
   * **Methods**:

     * `put(K key, V value)`, `get(Object key)`, `remove(Object key)`, `containsKey(Object key)`

2. **LinkedHashMap**

   * Maintains insertion order.
   * Good for caches (can be configured with access order).

3. **TreeMap**

   * Sorted map, keys ordered.
   * **Methods**:

     * `firstKey()`, `lastKey()`, `headMap(K toKey)`, `tailMap(K fromKey)`

4. **ConcurrentHashMap**

   * Thread-safe, high-performance.
   * Used in multi-threaded apps.

5. **Hashtable (Legacy)**

   * Predecessor of `HashMap`, synchronized but slower.

---

## 7. **Special Utility Classes**

* **Collections** (class) → static methods like `sort()`, `reverse()`, `shuffle()`, `unmodifiableList()`.
* **Arrays** (class) → works with arrays: `Arrays.sort()`, `Arrays.asList()`.

---

## 8. **Summary Table**

| Interface | Common Implementations          | Key Features                | Use Case                  |
| --------- | ------------------------------- | --------------------------- | ------------------------- |
| List      | ArrayList, LinkedList, Vector   | Ordered, duplicates allowed | To-do lists, ordered data |
| Set       | HashSet, LinkedHashSet, TreeSet | Unique elements             | User IDs, unique tags     |
| Queue     | PriorityQueue, ArrayDeque       | FIFO, priority ordering     | Task scheduling           |
| Map       | HashMap, TreeMap, LinkedHashMap | Key-value pairs             | Dictionaries, caches      |