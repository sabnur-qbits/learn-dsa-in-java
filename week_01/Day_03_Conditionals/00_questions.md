# 💻 Day 03 Practice: Control Flow (Conditionals)

**Date:** Friday, 31 Jul  
**Time Allocation:** 3 - 4 hrs  
**Topics Covered:** if, else, Nested if, switch  
**Daily Goal:** Solve 20 conditional problems to master decision-making logic in Java.

---

## 🛠️ Part 1: Environment Setup
Inside your `Week_01` directory, create a new folder for today's practice:
`Day_03_Conditionals`

Create a separate `.java` class file for each of the following 20 tasks using the `Q01_`, `Q02_` naming convention.

---

## 🚦 Part 2: Basic `if` and `else`

### 1. The Even/Odd Checker
**Class Name:** `Q01_EvenOdd.java`
*   **Task:** Declare an integer `number`. Write an `if-else` statement using the modulo operator (`%`) to print whether the number is Even or Odd.

### 2. Voting Eligibility
**Class Name:** `Q02_VotingAge.java`
*   **Task:** Declare an `int age`. Check if the person is 18 or older. If true, print "Eligible to vote", otherwise print "Not eligible".

### 3. Positive, Negative, or Zero
**Class Name:** `Q03_NumberSign.java`
*   **Task:** Declare an integer `num`. Write a condition to check and print if the number is positive, negative, or exactly zero.

### 4. Maximum of Two
**Class Name:** `Q04_MaxOfTwo.java`
*   **Task:** Declare two integers `a` and `b`. Use an `if-else` statement to compare them and print the larger of the two numbers.

### 5. Pass or Fail
**Class Name:** `Q05_PassFail.java`
*   **Task:** A student passes if they score 40 or above. Declare an `int score = 35` and print "Pass" or "Fail" based on the condition.

---

## 🪜 Part 3: The `else if` Ladder

### 6. The Grading System
**Class Name:** `Q06_Grades.java`
*   **Task:** Convert a numeric `score` (0-100) into a letter grade. (e.g., 90+ is A, 80-89 is B, 70-79 is C, below 70 is F). Print the resulting grade.

### 7. Temperature Alert
**Class Name:** `Q07_TempAlert.java`
*   **Task:** Declare `int tempInCelsius`. Print "Freezing" if below 0, "Cold" if 0-15, "Warm" if 16-30, and "Hot" if above 30.

### 8. Railway Ticket Pricing
**Class Name:** `Q08_RailwayTicket.java`
*   **Task:** Set up a base fare of $50. Check a passenger's age: if under 5 (free - $0), if 60 or older (senior discount - 50% off), otherwise pay full fare. Print the final ticket price.

### 9. Health Tracker: BMI Category
**Class Name:** `Q09_BMICategory.java`
*   **Task:** Declare a `double bmi`. Print the category: Underweight (< 18.5), Normal (18.5 - 24.9), Overweight (25 - 29.9), or Obese (30+).

### 10. Traffic Light System
**Class Name:** `Q10_TrafficLight.java`
*   **Task:** Declare a String `lightColor` (e.g., "Red", "Yellow", "Green"). Use `.equals()` to check the string and print "Stop", "Slow down", or "Go".

---

## 🪆 Part 4: Nested `if` Statements

### 11. Largest of Three
**Class Name:** `Q11_LargestOfThree.java`
*   **Task:** Declare three numbers `x`, `y`, and `z`. Use nested `if` statements (an `if` inside an `if`) to find and print the largest number.

### 12. Blood Donation Eligibility
**Class Name:** `Q12_BloodDonation.java`
*   **Task:** A person can donate blood if they are 18 or older AND weigh 50kg or more. First, check the age. If valid, check the weight inside the first block. Print appropriate success or failure messages.

### 13. Secure Login Portal
**Class Name:** `Q13_SecureLogin.java`
*   **Task:** Check a `storedUsername` and `storedPassword` against a user's `inputUsername` and `inputPassword`. First verify the username; if it matches, check the password. Print "Login successful", "Incorrect password", or "User not found".

### 14. E-commerce Discount
**Class Name:** `Q14_DiscountCalc.java`
*   **Task:** If a user is a "Premium Member", check their cart total. If the total is > $100, apply a 20% discount. If <= $100, apply a 10% discount. If they are not a member, no discount is applied. Print the final total.

### 15. The Leap Year Logic
**Class Name:** `Q15_LeapYear.java`
*   **Task:** A year is a leap year if divisible by 4. However, if it's a century year (divisible by 100), it must ALSO be divisible by 400. Write the nested logic to test an `int year = 2024` and print if it is a leap year.

---

## 🔀 Part 5: The `switch` Statement

### 16. Day of the Week
**Class Name:** `Q16_Weekday.java`
*   **Task:** Declare an `int day = 3;`. Use a `switch` statement to print the corresponding day (1 = Monday, 2 = Tuesday, etc.). Include a `default` case for invalid numbers.

### 17. Simple Calculator
**Class Name:** `Q17_Calculator.java`
*   **Task:** Declare two numbers and a `char operator = '+'`. Use a switch on the `operator` to perform addition, subtraction, multiplication, or division on the two numbers and print the result.

### 18. Vowel or Consonant
**Class Name:** `Q18_VowelChecker.java`
*   **Task:** Declare a `char letter`. Use a `switch` statement with stacked cases (e.g., `case 'a': case 'e': ...`) to print if the letter is a vowel or a consonant.

### 19. Days in a Month
**Class Name:** `Q19_MonthDays.java`
*   **Task:** Declare an `int month = 2`. Switch on the month to print how many days it has (Assume 28 for February). E.g., Case 1, 3, 5, 7, 8, 10, 12 should print "31 Days".

### 20. Animal Rescue Alert System
**Class Name:** `Q20_RescueAlert.java`
*   **Task:** Declare an `int alertLevel` (1 to 4). Use a switch block to print the action: 
    *   1: "Low priority - Log location."
    *   2: "Medium priority - Dispatch volunteer."
    *   3: "High priority - Send medical team."
    *   4: "Critical - Alert local veterinary hospital."