# 💻 Day 04 Practice: Loops & Patterns

**Date:** Saturday, 1 Aug  
**Time Allocation:** 4 hrs  
**Topics Covered:** for, while, do-while, Nested Loops  
**Daily Goal:** Solve 20 loop problems + 10 patterns to build strong iterative logic.

---

## 🛠️ Part 1: Environment Setup
Inside your `Week_01` directory, create a new folder for today's practice:
`Day_04_Loops_and_Patterns`

Since today is a heavy practice day, pace yourself! Create a separate `.java` class file for each task using the `Q01_`, `Q02_` naming convention.

---

## 🔄 Part 2: The `for` Loop Basics

### 1. The Classic Counter
**Class Name:** `Q01_CountToN.java`
*   **Task:** Write a `for` loop to print numbers from 1 to 100 on the same line, separated by spaces.

### 2. Evens Only
**Class Name:** `Q02_PrintEvens.java`
*   **Task:** Use a `for` loop to print all even numbers between 1 and 50. 

### 3. Sum of Natural Numbers
**Class Name:** `Q03_SumOfN.java`
*   **Task:** Declare an integer `n = 20`. Use a `for` loop to calculate and print the sum of the first 20 natural numbers (1 + 2 + 3 ... + 20).

### 4. Multiplication Table
**Class Name:** `Q04_MultiplicationTable.java`
*   **Task:** Declare an integer `num = 7`. Use a `for` loop to print its multiplication table from 1 to 10 (e.g., `7 x 1 = 7`).

### 5. Blast Off! (Reverse Counting)
**Class Name:** `Q05_BlastOff.java`
*   **Task:** Write a `for` loop that starts at 10 and decrements down to 1. After the loop finishes, print "Blast Off!".

---

## 🔁 Part 3: The `while` Loop Basics

### 6. Sum of Digits
**Class Name:** `Q06_SumOfDigits.java`
*   **Task:** Declare an integer `num = 456`. Use a `while` loop with modulo (`%`) and division (`/`) to calculate the sum of its digits (4 + 5 + 6 = 15).

### 7. Reverse the Number
**Class Name:** `Q07_ReverseNumber.java`
*   **Task:** Declare `num = 9876`. Use a `while` loop to reverse the digits and print the new number (`6789`).

### 8. Count the Digits
**Class Name:** `Q08_DigitCounter.java`
*   **Task:** Declare a large integer like `num = 1048576`. Use a `while` loop to count and print exactly how many digits are in the number.

### 9. The Fibonacci Series
**Class Name:** `Q09_Fibonacci.java`
*   **Task:** Print the first 10 terms of the Fibonacci sequence (0, 1, 1, 2, 3, 5, 8...). Use a `while` loop and three variables to track the current and previous numbers.

### 10. Palindrome Checker
**Class Name:** `Q10_PalindromeNumber.java`
*   **Task:** Declare `num = 1221`. Store the original number in a temporary variable, reverse it using a `while` loop, and check if the original matches the reversed version. Print "Palindrome" or "Not a Palindrome".

---

## 🔂 Part 4: The `do-while` Loop

### 11. Run at Least Once
**Class Name:** `Q11_DoWhileBasic.java`
*   **Task:** Write a `do-while` loop that prints "Java is fun!" and increments a counter. Make the loop condition `while (counter < 0)`. Observe how it still prints exactly once.

### 12. Input Validation Simulation
**Class Name:** `Q12_ValidInput.java`
*   **Task:** Simulate asking a user for a positive number. Declare a mock input variable like `int input = -5`. In a real scenario you'd use a Scanner, but here, just increment the input by 2 inside the `do-while` loop until it becomes positive. Print the final positive number.

### 13. Accumulating a Total
**Class Name:** `Q13_SumUntilLimit.java`
*   **Task:** Start with `int sum = 0` and `int current = 1`. Use a `do-while` loop to keep adding `current` to `sum`, incrementing `current` each time, until `sum` exceeds 100. Print the final sum.

### 14. Menu System Simulator
**Class Name:** `Q14_MenuLoop.java`
*   **Task:** Declare `int choice = 3;`. Write a `do-while` loop that prints a simple menu (1. Play, 2. Save, 3. Exit). Since `choice == 3`, ensure the loop condition is `while (choice != 3)` so it exits immediately after the first print.

### 15. The Guessing Game (Hardcoded)
**Class Name:** `Q15_GuessNumber.java`
*   **Task:** Set `int target = 42;` and `int guess = 39;`. Use a `do-while` loop. Inside the loop, print "Wrong guess, trying next..." and increment `guess`. The loop should continue `while (guess != target)`. Print "Correct!" at the end.

---

## 🧠 Part 5: Applied Logic & Nested Loops

### 16. Health Tracker (Weekly Averages)
**Class Name:** `Q16_YourBaeWeekly.java`
*   **Task:** Simulate tracking daily steps for a health app. Write an outer `for` loop for 1 to 4 (representing 4 weeks). Inside it, write an inner `for` loop for 1 to 7 (representing days). Print "Week X, Day Y logged."

### 17. Railway Route Monitor 
**Class Name:** `Q17_RailSathiMonitor.java`
*   **Task:** A train passes through 5 stations. Use a `for` loop from 1 to 5. Inside the loop, simulate boarding by adding `i * 10` passengers to a running total. Print the total passengers after station 5.

### 18. Animal Rescue Log
**Class Name:** `Q18_MaitriRescue.java`
*   **Task:** Simulate a daily animal rescue log. Declare an array-like sequence or just use a `for` loop for 5 days. Add consecutive even numbers (2, 4, 6...) to a `totalRescued` variable. Print the total at the end.

### 19. Anti-Piracy File Scanner
**Class Name:** `Q19_WavesScanner.java`
*   **Task:** Loop through files numbered 1 to 15. If the file number is divisible by 3, print "File [number] - Pirated Content Detected!". Otherwise, print "File [number] - Clean."

### 20. The Prime Number Checker
**Class Name:** `Q20_PrimeCheck.java`
*   **Task:** Declare `num = 29`. Write a `for` loop that checks if `num` is divisible by any number from 2 up to `num / 2`. Use a boolean flag to track if a divisor is found, and print whether the number is Prime or Not Prime.

---

## 🎨 Part 6: The 10 Pattern Challenge (Nested Loops)

*For these 10 tasks, use nested `for` loops (an outer loop for rows, an inner loop for columns) and `System.out.print()` vs `System.out.println()` to control line breaks.*

### 21. Solid Rectangle
**Class Name:** `Q21_SolidRectangle.java`
```text
*****
*****
*****
*****
```

### 22. Hollow Rectangle
**Class Name:** `Q22_HollowRectangle.java`
*(Hint: Print a star only if it's the first row, last row, first column, or last column)*
```text
*****
*   *
*   *
*****
```

### 23. Half Pyramid
**Class Name:** `Q23_HalfPyramid.java`
```text
*
**
***
****
*****
```

### 24. Inverted Half Pyramid
**Class Name:** `Q24_InvertedHalfPyramid.java`
```text
*****
****
***
**
*
```

### 25. Right-Aligned Half Pyramid
**Class Name:** `Q25_RightPyramid.java`
*(Hint: You will need an inner loop for spaces, and an inner loop for stars)*
```text
    *
   **
  ***
 ****
*****
```

### 26. Number Half Pyramid
**Class Name:** `Q26_NumberPyramid.java`
```text
1
12
123
1234
12345
```

### 27. Floyd's Triangle
**Class Name:** `Q27_FloydsTriangle.java`
*(Hint: Maintain a separate counter variable that constantly increments)*
```text
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
```

### 28. Zero-One Triangle
**Class Name:** `Q28_ZeroOneTriangle.java`
*(Hint: If row + column index is even, print 1. Else print 0)*
```text
1
01
101
0101
10101
```

### 29. Character Pyramid
**Class Name:** `Q29_CharPyramid.java`
*(Hint: You can increment a `char` variable just like an integer! e.g., `char ch = 'A'; ch++;`)*
```text
A
BC
DEF
GHIJ
```

### 30. The Full Pyramid
**Class Name:** `Q30_FullPyramid.java`
```text
    *
   ***
  *****
 *******
*********
```