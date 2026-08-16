# 💻 Day 05 Practice: Arrays

**Date:** Sunday, 2 Aug  
**Time Allocation:** 4 hrs  
**Topics Covered:** 1D Arrays, Declaration, Initialization, Iteration, Basic Array Algorithms  
**Daily Goal:** Solve 15 array problems to understand how to store and manipulate collections of data in Java.

---

## 🛠️ Part 1: Environment Setup
Inside your `Week_01` directory, create a new folder for today's practice:
`Day_05_Arrays`

Create a separate `.java` class file for each of the following 15 tasks using the `Q01_`, `Q02_` naming convention.

---

## 🧱 Part 2: Array Basics (Creation & Access)

### 1. The First and Last
**Class Name:** `Q01_FirstAndLast.java`
*   **Task:** Create an integer array of size 5 and manually assign numbers to each index. Print only the very first element and the very last element of the array.

### 2. The Array Traversal
**Class Name:** `Q02_PrintArray.java`
*   **Task:** Declare and initialize an array of Strings containing the names of 4 programming languages. Use a standard `for` loop (using `.length`) to print each name on a new line.

### 3. Modifying Elements
**Class Name:** `Q03_UpdateArray.java`
*   **Task:** Create an array of 5 integers initialized with zeros: `{0, 0, 0, 0, 0}`. Update the middle index to be `99`. Print the entire array using a loop to verify the change.

### 4. Sum of Array Elements
**Class Name:** `Q04_ArraySum.java`
*   **Task:** Declare an integer array with values `{10, 20, 30, 40, 50}`. Loop through the array, add each element to a `sum` variable, and print the final total.

### 5. Array Average
**Class Name:** `Q05_ArrayAverage.java`
*   **Task:** Create a `double` array representing 6 test scores. Calculate the sum using a loop, then divide by the array's length to find and print the average score.

---

## 🔍 Part 3: Searching & Algorithms

### 6. Find the Maximum
**Class Name:** `Q06_FindMax.java`
*   **Task:** Declare an integer array with random unordered values (e.g., `{4, 12, 7, 25, 3}`). Write a loop that compares each element to a `max` variable to find and print the largest number in the array.

### 7. Find the Minimum
**Class Name:** `Q07_FindMin.java`
*   **Task:** Using the logic from the previous question, write a program to find and print the *smallest* number in an array.

### 8. Linear Search
**Class Name:** `Q08_LinearSearch.java`
*   **Task:** Create an array of integers and a separate variable `target = 15`. Loop through the array. If the target is found, print its exact index and `break` the loop. If not found, print "Target not in array".

### 9. Count Occurrences
**Class Name:** `Q09_CountOccurrences.java`
*   **Task:** Create an array with repeating numbers, e.g., `{2, 5, 2, 8, 2, 9}`. Write a loop to count exactly how many times the number `2` appears in the array and print the count.

### 10. Reverse the Array (Printing)
**Class Name:** `Q10_ReversePrint.java`
*   **Task:** Declare an array of characters: `{'J', 'A', 'V', 'A'}`. Write a `for` loop that starts at the last index (`array.length - 1`) and decrements down to `0`, printing the array in reverse order.

---

## 🧠 Part 4: Applied Scenarios & Data Processing

### 11. Rail Sathi Weekly Passengers
**Class Name:** `Q11_RailSathiData.java`
*   **Task:** Create an integer array representing daily passenger counts for a week (7 days). Write a loop to calculate both the total passengers for the week and the busiest day (the maximum value). 

### 12. Your Bae Calorie Tracker
**Class Name:** `Q12_YourBaeCalories.java`
*   **Task:** Create a `double` array holding 5 days of burned calorie data. Check if the user met their daily goal of `500.0` calories. Loop through the array and print "Day [i]: Goal Met" or "Day [i]: Goal Missed" for each entry.

### 13. Maitri Rescue Zones
**Class Name:** `Q13_MaitriZones.java`
*   **Task:** Declare a String array containing 4 city zones (e.g., `"North"`, `"South"`, `"East"`, `"West"`). Create a parallel integer array containing the number of animal welfare reports for each zone. Loop through both to print formatted data: "Zone: North - Reports: 12".

### 14. Copying an Array
**Class Name:** `Q14_CopyArray.java`
*   **Task:** Declare an integer array `source` with 5 elements. Create a second empty array `destination` of the same length. Use a `for` loop to copy every element from `source` into `destination`. Print the `destination` array to verify.

### 15. Array Equality
**Class Name:** `Q15_CompareArrays.java`
*   **Task:** Create two integer arrays, `arr1` and `arr2`, with the exact same lengths and values. Write a loop to check if they are identical. If every element matches at every index, print "Arrays are equal". If even one element differs, print "Arrays are different".