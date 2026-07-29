# 💻 Day 02 Practice: Variables, Data Types, Type Casting & Operators

**Date:** Thursday, 30 Jul  
**Time Allocation:** 3 - 4 hrs  
**Topics Covered:** Variables, Data Types, Type Casting, Operators  
**Daily Goal:** Solve 15 basic problems to understand how Java stores and manipulates data.

---

## 🛠️ Part 1: Environment Setup
Inside your `Week_01` directory, create a new folder for today's practice:
`Day_02_Variables_and_Operators`

Create a separate `.java` class file for each of the following tasks, remembering the `Q01_`, `Q02_` naming convention!

---

## 🚀 Part 2: Variables & Data Types

### 1. The Student Profile
**Class Name:** `Q01_StudentProfile.java`
*   **Task:** Create variables to store a student's major (e.g., "CST"), expected graduation year (e.g., 2027), current GPA (e.g., 8.5), and a boolean indicating if they are currently enrolled. Print them all in a well-formatted sentence.

### 2. Health & Productivity Tracker
**Class Name:** `Q02_HealthTracker.java`
*   **Task:** Declare variables for a user's daily steps (`int`), calories burned (`double`), and goal reached (`boolean`). Assign them realistic values and print a daily summary. 

### 3. Basic Arithmetic
**Class Name:** `Q03_BasicMath.java`
*   **Task:** Declare two integer variables, `a = 15` and `b = 4`. Print the results of their addition, subtraction, multiplication, division, and remainder (modulo).

### 4. Rectangle Area Calculator
**Class Name:** `Q04_RectangleArea.java`
*   **Task:** Declare `length` and `width` as `double`. Calculate the area and perimeter of the rectangle, storing the results in new variables before printing them.

### 5. Swapping Variables
**Class Name:** `Q05_SwapVariables.java`
*   **Task:** Declare two integers, `x = 10` and `y = 20`. Swap their values using a temporary third variable, then print the new values of `x` and `y`.

---

## 🔄 Part 3: Type Casting

### 6. Implicit Casting (Widening)
**Class Name:** `Q06_ImplicitCast.java`
*   **Task:** Declare an `int` with the value `100`. Assign it to a `double` variable without using any cast operator. Print both variables to see what happens to the number formatting.

### 7. Explicit Casting (Narrowing)
**Class Name:** `Q07_ExplicitCast.java`
*   **Task:** Declare a `double` representing a price, e.g., `99.99`. Cast it to an `int` to find the exact whole number value of the price, cutting off the decimal. Print both.

### 8. Character to Integer (ASCII)
**Class Name:** `Q08_CharToInt.java`
*   **Task:** Declare a `char` variable with the value `'A'`. Cast it to an `int` and print it to discover its underlying numerical ASCII value. 

### 9. Average Score Calculation
**Class Name:** `Q09_AverageScore.java`
*   **Task:** Declare three `int` variables representing test scores (e.g., 85, 90, 92). Calculate their average. **Hint:** To get an accurate decimal average, you will need to cast the sum to a `double` before dividing by 3!

---

## 🧮 Part 4: Operators Deep Dive

### 10. Railway Crowd Monitor (Assignment Operators)
**Class Name:** `Q10_RailwayCrowd.java`
*   **Task:** Start with an `int passengers = 500`. At the next station, 150 people board (`+=`), and 80 people alight (`-=`). Use assignment operators to update the `passengers` variable and print the final count.

### 11. Unary Operators (Increment/Decrement)
**Class Name:** `Q11_UnaryPractice.java`
*   **Task:** Declare an integer `counter = 0`. Use the post-increment operator (`counter++`) and pre-increment operator (`++counter`) inside `System.out.println()` statements to observe the exact difference in how they output values.

### 12. Animal Welfare Report (Relational Operators)
**Class Name:** `Q12_WelfareReport.java`
*   **Task:** Create two variables: `reportedCases = 5` and `resolvedCases = 5`. Use relational operators (`==`, `>`, `<`) to print `true` or `false` for statements like "Are reported cases equal to resolved cases?".

### 13. Logical Operators I (AND / OR)
**Class Name:** `Q13_LogicalOps.java`
*   **Task:** A user wants to log in. Create `boolean hasValidUsername = true;` and `boolean hasValidPassword = false;`. Print the result of `hasValidUsername && hasValidPassword` (AND) and `hasValidUsername || hasValidPassword` (OR).

### 14. Modulo Magic (Even or Odd Logic)
**Class Name:** `Q14_ModuloMagic.java`
*   **Task:** Declare an integer `number = 27`. Use the modulo operator (`% 2`) to find the remainder when divided by 2. Print the result. (Remember: A remainder of 1 means it is odd, 0 means even).

### 15. The Grand Calculation
**Class Name:** `Q15_FinalBill.java`
*   **Task:** Combine concepts! Declare a `double basePrice = 250.0`. Add an 18% tax using multiplication and addition. Then, explicitly cast the final total to an `int` for a rounded, no-decimal bill. Print the original price, the exact total with tax, and the final rounded bill.