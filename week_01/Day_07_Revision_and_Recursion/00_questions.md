# 💻 Day 07 Practice: Full Week Revision & Recursion

**Date:** Tuesday, 4 Aug  
**Time Allocation:** 4 - 5 hrs  
**Topics Covered:** Recursion, Full Week Revision (Variables, Conditionals, Loops, Arrays, Methods)  
**Daily Goal:** Solve 10 mixed problems *without looking at your notes*. Combine everything you've learned to build complete mini-programs. 

---

## 🛠️ Part 1: Environment Setup
Inside your `Week_01` directory, create a new folder for today's practice:
`Day_07_Revision_and_Recursion`

Create a separate `.java` class file for each of the following 10 tasks. Try your hardest to recall the syntax from memory before peeking at previous days!

---

## 🔄 Part 2: Introduction to Recursion

*Recursion is simply a method that calls itself until it reaches a stopping point (a base case).*

### 1. The Recursive Factorial
**Class Name:** `Q01_RecursiveFactorial.java`
* **Task:** Rewrite the factorial logic from yesterday, but this time use recursion instead of a loop. Write a method `public static int factorial(int n)`. If `n == 1`, return 1 (base case). Otherwise, return `n * factorial(n - 1)`. 
* **Example Test Case:**
    * **Arguments passed:** `5`
    * **Expected Output:** `120`

### 2. The Recursive Countdown
**Class Name:** `Q02_RecursiveCountdown.java`
* **Task:** Write a recursive method `void countDown(int n)`. If `n == 0`, print "Blastoff!" and return. Otherwise, print `n`, then call `countDown(n - 1)`. Call it from `main` with 5.
* **Example Test Case:**
    * **Arguments passed:** `5`
    * **Expected Output:** 
        ```text
        5
        4
        3
        2
        1
        Blastoff!
        ```

---

## 🧠 Part 3: The "No Notes" Mixed Revision Challenge

### 3. The FizzBuzz Challenge (Loops & Conditionals)
**Class Name:** `Q03_FizzBuzz.java`
* **Task:** Write a `for` loop from 1 to 20. For multiples of 3, print "Fizz". For multiples of 5, print "Buzz". For multiples of BOTH 3 and 5, print "FizzBuzz". Otherwise, print the number.
* **Example Test Case:**
    * **Expected Output Snippet:** `1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz...`

### 4. Second Largest in Array (Arrays & Logic)
**Class Name:** `Q04_SecondLargest.java`
* **Task:** Declare an array of integers. Loop through it to find not the largest, but the *second largest* number. (Hint: Keep track of a `largest` and `secondLargest` variable as you loop).
* **Example Test Case:**
    * **Array Elements:** `{10, 5, 20, 8, 20, 15}`
    * **Expected Output:** `Second Largest: 15`

### 5. Array Reversal Method (Methods & Arrays)
**Class Name:** `Q05_ReverseArrayMethod.java`
* **Task:** Write a method `public static void printReversed(int[] arr)`. Pass an array into this method from `main`, and inside the method, loop backward to print the reversed array.
* **Example Test Case:**
    * **Arguments passed:** `{1, 2, 3, 4, 5}`
    * **Expected Output:** `5 4 3 2 1`

### 6. The Leap Year Method (Conditionals & Methods)
**Class Name:** `Q06_LeapYearMethod.java`
* **Task:** Write a method `public static boolean isLeapYear(int year)`. Use the nested `if` or logical operator logic from Day 3 to return true or false. Call it from `main` to check a year.
* **Example Test Case:**
    * **Arguments passed:** `2024`
    * **Expected Return:** `true`

### 7. The Diamond Pattern (Nested Loops)
**Class Name:** `Q07_DiamondPattern.java`
* **Task:** Combine a normal pyramid and an inverted pyramid from Day 4 to print a diamond shape.
* **Example Test Case:**
    * **Expected Output:**
        ```text
          *
         ***
        *****
         ***
          *
        ```

### 8. Your Bae Weekly Analyzer (Applied Logic)
**Class Name:** `Q08_YourBaeAnalyzer.java`
* **Task:** Write a method `analyzeSteps(int[] dailySteps)`. Inside, calculate the total steps for the week, the average steps, and count how many days Sabnur met her goal of 10,000 steps. Print the full analysis.
* **Example Test Case:**
    * **Array Elements:** `{8000, 12000, 10500, 9000, 15000, 7000, 11000}`
    * **Expected Output:**
        ```text
        Total Weekly Steps: 72500
        Average Daily Steps: 10357
        Days Goal Met: 4
        ```

### 9. Rail Sathi Fare Calculator (Method Overloading)
**Class Name:** `Q09_RailSathiFares.java`
* **Task:** Create overloaded methods named `calculateFare`. 
    * `calculateFare(double distance)` calculates standard fare (distance * $0.10).
    * `calculateFare(double distance, boolean isSenior)` calculates fare with a 50% discount if `isSenior` is true.
    * Print both results from `main`.
* **Example Test Case:**
    * **Call 1:** `calculateFare(100.0)` $\rightarrow$ **Expected Output:** `10.0`
    * **Call 2:** `calculateFare(100.0, true)` $\rightarrow$ **Expected Output:** `5.0`

### 10. The Final Boss: ATM Simulator (The Kitchen Sink!)
**Class Name:** `Q10_AtmSimulator.java`
* **Task:** Create a full mini-app inside `main`. 
    1. Declare `double balance = 5000.0;`
    2. Set `int choice = 2;` (simulating a user input).
    3. Use a `do-while` loop containing a `switch` statement.
    4. Menu options: 1 for Check Balance, 2 for Deposit (hardcode an addition of 1000), 3 for Withdraw (hardcode a subtraction of 500), 4 for Exit.
    5. Because `choice` is hardcoded to 2, the loop should process the deposit, print the new balance, then manually change `choice = 4` to break the loop on the next check.
* **Example Test Case:**
    * **Expected Output:**
        ```text
        --- ATM Menu ---
        1. Balance  2. Deposit  3. Withdraw  4. Exit
        Processing Deposit of $1000...
        New Balance: $6000.0
        Exiting... Have a nice day, Sabnur!
        ```