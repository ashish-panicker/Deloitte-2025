# Array Problems with Problem Statements and Algorithm

---

```java
// Problem 1: Find Maximum Element in an Array
// Description: Given an integer array, find and return the maximum element.
// Algorithm:
// 1. Initialize a variable 'max' with the first element of the array.
// 2. Traverse the array from start to end.
// 3. For each element, if it is greater than 'max', update 'max'.
// 4. After traversal, 'max' will hold the largest element.
public class MaxElement {
    public static void main(String [] args) {

    }
}
````

---

```java
// Problem 2: Find Minimum Element in an Array
// Description: Given an integer array, find and return the minimum element.
// Algorithm:
// 1. Initialize a variable 'min' with the first element of the array.
// 2. Traverse the array.
// 3. Update 'min' whenever a smaller element is found.
// 4. After traversal, 'min' will hold the smallest element.
public class MinElement {
    public static void main(String [] args) {
        
    }
}
```

---

```java
// Problem 3: Reverse an Array
// Description: Reverse the elements of a given array in-place without using extra space.
// Algorithm:
// 1. Initialize two pointers: left=0, right=length-1.
// 2. Swap elements at left and right.
// 3. Increment left and decrement right.
// 4. Repeat until left >= right.
public class ReverseArray {
    public static void main(String [] args) {
        
    }
}
```

---

```java
// Problem 4: Sum of All Elements
// Description: Calculate the sum of all elements in a given integer array.
// Algorithm:
// 1. Initialize a variable 'sum' to 0.
// 2. Traverse the array and add each element to 'sum'.
// 3. 'sum' will contain the total after traversal.
public class SumArray {
    public static void main(String [] args) {
        
    }
}
```

---

```java
// Problem 5: Count Even and Odd Numbers
// Description: Count the number of even and odd elements in an array.
// Algorithm:
// 1. Initialize counters 'even' and 'odd' to 0.
// 2. Traverse the array.
// 3. If element % 2 == 0, increment 'even'; else increment 'odd'.
// 4. After traversal, counters hold the count of even and odd numbers.
public class EvenOddCount {
    public static void main(String [] args) {
        
    }
}
```

---

```java
// Problem 6: Check if Array is Sorted
// Description: Check whether a given array is sorted in ascending order.
// Algorithm:
// 1. Traverse the array from index 0 to length-2.
// 2. If any element > next element, array is not sorted.
// 3. If loop completes without finding unsorted pair, array is sorted.
public class CheckSorted {
    public static void main(String [] args) {
        
    }
    
}
```

---

```java
// Problem 7: Remove Duplicates from Array
// Description: Remove duplicate elements from an array and return unique elements.
// Algorithm:
// 1. Use a data structure like HashSet to track seen elements.
// 2. Traverse array and add each element to the set.
// 3. Convert set back to array to get unique elements.
public class RemoveDuplicates {
    public static void main(String [] args) {
        
    }
}
```

---

```java
// Problem 8: Find Second Largest Element
// Description: Find the second largest element in an array.
// Algorithm:
// 1. Initialize two variables: largest and secondLargest.
// 2. Traverse the array.
// 3. Update largest and secondLargest appropriately.
// 4. At the end, secondLargest contains the second largest element.
public class SecondLargest {
    public static void main(String [] args) {
        
    }
}
```

---

```java
// Problem 9: Move Zeros to End
// Description: Move all zeros in the array to the end while maintaining order of non-zero elements.
// Algorithm:
// 1. Initialize a position pointer to 0.
// 2. Traverse array and move non-zero elements to position pointer.
// 3. Fill remaining positions with zeros.
public class MoveZeros {
    public static void main(String [] args) {
        
    }
}
```

---

```java
// Problem 10: Rotate Array by K Positions
// Description: Rotate the elements of an array to the right by K positions.
// Algorithm:
// 1. Reduce K modulo array length.
// 2. Reverse entire array.
// 3. Reverse first K elements.
// 4. Reverse remaining elements.
public class RotateArray {
    public static void main(String [] args) {
        
    }
}
```

---

```java
// Problem 11: Find Pair with Given Sum
// Description: Find if there exists a pair of numbers in the array whose sum equals a given target.
// Algorithm:
// 1. Use two nested loops to check each pair (or use HashSet for optimization).
// 2. If a pair sums to target, return true.
// 3. If no pair found after traversal, return false.
public class PairSum {
    public static void main(String [] args) {
        
    }
    
}
```

---

```java
// Problem 12: Find Subarray with Maximum Sum
// Description: Find the contiguous subarray with the maximum sum.
// Algorithm (Kadane's Algorithm):
// 1. Initialize maxSum and currentSum to first element.
// 2. Traverse the array from second element.
// 3. currentSum = max(current element, currentSum + current element)
// 4. maxSum = max(maxSum, currentSum)
// 5. maxSum contains maximum subarray sum.
public class MaxSubarraySum {
    public static void main(String [] args) {
        
    }
    
}
```

---

```java
// Problem 13: Count Frequency of Elements
// Description: Count the frequency of each element in an integer array.
// Algorithm:
// 1. Use a HashMap to store frequency of each element.
// 2. Traverse the array, increment count for each element.
// 3. After traversal, the map contains frequency of all elements.
public class FrequencyCount {
    public static void main(String [] args) {
        
    }
    
}
```

---

```java
// Problem 14: Merge Two Sorted Arrays
// Description: Merge two sorted arrays into a single sorted array.
// Algorithm:
// 1. Initialize three pointers: i, j, k.
// 2. Compare elements of both arrays and insert smaller element into result array.
// 3. Copy remaining elements from both arrays.
// 4. Result array contains merged sorted array.
public class MergeSortedArrays {
    public static void main(String [] args) {
        
    }
}
```

---

```java
// Problem 15: Find Missing Number
// Description: Given an array containing n distinct numbers from 0 to n, find the missing number.
// Algorithm:
// 1. Compute expected sum = n*(n+1)/2
// 2. Compute actual sum by traversing array.
// 3. Missing number = expected sum - actual sum.
public class MissingNumber {
    public static void main(String [] args) {
        
    }
}
```