# 💻 W2 Day 01 Practice: Intermediate Array Mechanics

**Time Allocation:** 3 - 4 hrs  
**Topics Covered:** Element Swapping, Array Shifting, Nested Loop Comparisons  
**Daily Goal:** Solve 8 intermediate array problems to build the mental models required for advanced algorithms. 

## 🛠️ Environment Setup
Inside your `Day_01_Array_Mechanics` folder, create a `.java` class for each task using our standard naming convention. 

*Golden Rule for Today:* Draw the arrays on paper first! Trace how the variables change step-by-step before typing a single line of Java.

---

## 🧱 Part 1: Swapping and Shifting (The Basics of Pointers)

### 1. The Index Swapper
**Class Name:** `Q01_SwapElements.java`
* **Task:** Create a method `swap(int[] arr, int index1, int index2)`. Inside the method, use a temporary variable to swap the values at the two given indices, then print the modified array.
* **Example Test Case:**
    * **Input Array:** `{10, 20, 30, 40, 50}`
    * **Indices to Swap:** `1` and `3`
    * **Expected Output:** `10 40 30 20 50`

### 2. Shift Left by One
**Class Name:** `Q02_ShiftLeft.java`
* **Task:** Write a program that shifts every element in an array one position to the left. The very first element should wrap around and become the very last element.
* **Example Test Case:**
    * **Input Array:** `{1, 2, 3, 4, 5}`
    * **Expected Output:** `2 3 4 5 1`

### 3. Separate Evens and Odds
**Class Name:** `Q03_SeparateEvensOdds.java`
* **Task:** Given an array, create a new array of the same size. Write a loop to place all the even numbers on the left side of the new array, and all the odd numbers on the right side.
* **Example Test Case:**
    * **Input Array:** `{3, 1, 2, 4, 7, 6}`
    * **Expected Output:** `{2, 4, 6, 3, 1, 7}` *(Note: The exact order of the evens/odds doesn't matter, as long as evens are grouped left and odds are grouped right)*

---

## 🔍 Part 2: Nested Loops (The "Brute Force" Foundation)

### 4. Brute Force Two Sum
**Class Name:** `Q04_BruteTwoSum.java`
* **Task:** Given an array and a `target` sum, use an outer `for` loop and an inner `for` loop to check every possible pair of numbers. Print the two numbers that add up exactly to the target. 
* **Example Test Case:**
    * **Input Array:** `{4, 1, 9, 3, 5}`
    * **Target:** `12`
    * **Expected Output:** `Pair found: 9 and 3`

### 5. Find the Duplicates
**Class Name:** `Q05_FindDuplicates.java`
* **Task:** Write a program with nested loops to find and print any numbers that appear more than once in an array.
* **Example Test Case:**
    * **Input Array:** `{4, 2, 7, 2, 8, 4, 9}`
    * **Expected Output:** 
        ```text
        Duplicate found: 4
        Duplicate found: 2
        ```

### 6. Maitri Zone Intersection
**Class Name:** `Q06_MaitriIntersection.java`
* **Task:** You have two integer arrays representing animal rescue ID codes from two different Maitri application zones. Use nested loops to find the IDs that exist in *both* zones and print them.
* **Example Test Case:**
    * **Zone 1 IDs:** `{101, 105, 108, 112}`
    * **Zone 2 IDs:** `{102, 108, 110, 101}`
    * **Expected Output:** 
        ```text
        Common ID: 101
        Common ID: 108
        ```

---

## 📈 Part 3: State Tracking 

### 7. Rail Sathi Running Load
**Class Name:** `Q07_RailSathiLoad.java`
* **Task:** Given an array representing the number of passengers boarding at consecutive stations, create a new `runningSum` array. Loop through the original array and keep a cumulative total, storing it in the new array.
* **Example Test Case:**
    * **Boarding Array:** `{10, 20, 30, 40}`
    * **Expected Output:** `10 30 60 100`

### 8. Your Bae Progress Jump
**Class Name:** `Q08_YourBaeProgress.java`
* **Task:** Given an array of daily calories burned for Your Bae, find the biggest single-day jump (increase) in calories compared to the *previous* day.
* **Example Test Case:**
    * **Calorie Array:** `{400, 350, 500, 480, 600}`
    * **Expected Output:** `Biggest jump: 150` *(From 350 to 500)*