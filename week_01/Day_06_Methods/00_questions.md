# 💻 Day 06 Practice: Methods (Functions)

**Date:** Monday, 3 Aug  
**Time Allocation:** 3 - 4 hrs  
**Topics Covered:** Method Declaration, Parameters, Return Types, Method Overloading  
**Daily Goal:** Solve 15 method-based problems to learn how to write modular, reusable, and clean Java code.

---

## 🛠️ Part 1: Environment Setup
Inside your `Week_01` directory, create a new folder for today's practice:
`Day_06_Methods`

*Important Rule for Today:* In Java, methods are written inside the `class` but **outside** the `main` method. Since we aren't using Objects yet, make sure all your custom methods include the `static` keyword (e.g., `public static void myMethod()`) so they can be called directly from `main`.

---

## 🧱 Part 2: Basic Methods (Void & No Parameters)

### 1. The Simple Greeting
**Class Name:** `Q01_Greeting.java`
* **Task:** Write a method called `sayHello()` that prints "Hello! Welcome to Day 6 of Java!". Call this method exactly 3 times from your `main` method.
* **Example Test Case:**
  * **Input:** None (Method Call)
  * **Expected Output:**
    ```text
    Hello! Welcome to Day 6 of Java!
    Hello! Welcome to Day 6 of Java!
    Hello! Welcome to Day 6 of Java!
    ```

### 2. The Reusable Pattern
**Class Name:** `Q02_PrintPattern.java`
* **Task:** Write a method called `printLine()` that prints 30 dashes (`------------------------------`). In your `main` method, print a title, call `printLine()`, print a subtitle, and call `printLine()` again.
* **Example Test Case:**
  * **Input:** None
  * **Expected Output:**
    ```text
    Main Title
    ------------------------------
    Subtitle Here
    ------------------------------
    ```

### 3. The Menu Display
**Class Name:** `Q03_MenuDisplay.java`
* **Task:** Create a method named `showMenu()` that prints a 4-option game menu (1. Play, 2. Load, 3. Settings, 4. Exit). Call it once from `main`.
* **Example Test Case:**
  * **Input:** None
  * **Expected Output:**
    ```text
    1. Play
    2. Load
    3. Settings
    4. Exit
    ```

---

## 📥 Part 3: Passing Data (Parameters & Arguments)

### 4. The Square Calculator
**Class Name:** `Q04_SquareCalculator.java`
* **Task:** Write a method `calculateSquare(int number)`. Inside the method, calculate the square of the number and print the result.
* **Example Test Case:**
  * **Arguments passed:** `7`
  * **Expected Output:** `49`

### 5. Personalized Profile
**Class Name:** `Q05_PersonalProfile.java`
* **Task:** Write a method `displayProfile(String name, int age, String hobby)`. The method should print a nicely formatted introductory sentence.
* **Example Test Case:**
  * **Arguments passed:** `"Sabnur"`, `19`, `"Coding"`
  * **Expected Output:** `Hi, my name is Sabnur. I am 19 years old and my hobby is Coding.`

### 6. Simple Interest Calculator
**Class Name:** `Q06_SimpleInterest.java`
* **Task:** Create a method `printInterest(double principal, double rate, int time)`. Calculate the simple interest `(P * R * T) / 100` and print the final interest amount inside the method.
* **Example Test Case:**
  * **Arguments passed:** `1000.0`, `5.0`, `2`
  * **Expected Output:** `Simple Interest: 100.0`

---

## 📤 Part 4: Returning Data (Return Types)

### 7. The Addition Method
**Class Name:** `Q07_Addition.java`
* **Task:** Write a method `public static int add(int a, int b)`. It should return the sum of `a` and `b`. In `main`, call the method, store the returned value in a variable, and print it.
* **Example Test Case:**
  * **Arguments passed:** `15`, `25`
  * **Expected Return Value:** `40`

### 8. Even or Odd Logic
**Class Name:** `Q08_IsEven.java`
* **Task:** Write a method `public static boolean checkEven(int number)`. It should return `true` if the number is even, and `false` if odd. Call it in `main` inside an `if` statement to print "The number is even" or "The number is odd".
* **Example Test Case:**
  * **Arguments passed:** `42`
  * **Expected Return Value:** `true` (Main prints: `The number is even`)

### 9. Find the Maximum
**Class Name:** `Q09_FindMax.java`
* **Task:** Write a method `findMaximum(int x, int y, int z)` that returns the largest of the three integers. Test it in `main` by passing three random numbers and printing the result.
* **Example Test Case:**
  * **Arguments passed:** `12`, `45`, `23`
  * **Expected Return Value:** `45`

### 10. The Vowel Counter
**Class Name:** `Q10_VowelCounter.java`
* **Task:** Write a method `countVowels(String text)` that returns an `int`. Inside the method, loop through the string and count how many vowels (a, e, i, o, u) it contains. Return the count and print it from `main`.
* **Example Test Case:**
  * **Arguments passed:** `"java programming"`
  * **Expected Return Value:** `5` (a, a, o, a, i)

---

## 🔀 Part 5: Method Overloading

### 11. The Multiply Overload
**Class Name:** `Q11_Multiply.java`
* **Task:** Write three different methods all named `multiply`. One takes 2 `int` parameters, one takes 3 `int` parameters, and one takes 2 `double` parameters. Have them all return the product. Call all three from `main` and print their results.
* **Example Test Case:**
  * **Call 1:** `multiply(4, 5)` $\rightarrow$ **Expected Return:** `20`
  * **Call 2:** `multiply(2, 3, 4)` $\rightarrow$ **Expected Return:** `24`
  * **Call 3:** `multiply(2.5, 4.0)` $\rightarrow$ **Expected Return:** `10.0`

### 12. Area Calculator Overload
**Class Name:** `Q12_AreaCalculator.java`
* **Task:** Overload a method named `calculateArea`. `calculateArea(double radius)` returns the area of a circle `(3.14 * r * r)`. `calculateArea(double length, double width)` returns the area of a rectangle. Call both from `main` and print the answers.
* **Example Test Case:**
  * **Call 1:** `calculateArea(10.0)` $\rightarrow$ **Expected Return:** `314.0`
  * **Call 2:** `calculateArea(5.0, 4.0)` $\rightarrow$ **Expected Return:** `20.0`

---

## 🧠 Part 6: Applied Scenarios 

### 13. Temperature Converter
**Class Name:** `Q13_TempConverter.java`
* **Task:** Write two returning methods: `celsiusToFahrenheit(double c)` and `fahrenheitToCelsius(double f)`. Call both from `main` with test values and print the converted temperatures.
* **Example Test Case:**
  * **Call 1:** `celsiusToFahrenheit(0.0)` $\rightarrow$ **Expected Return:** `32.0`
  * **Call 2:** `fahrenheitToCelsius(212.0)` $\rightarrow$ **Expected Return:** `100.0`

### 14. The Factorial Method
**Class Name:** `Q14_Factorial.java`
* **Task:** Write a method `getFactorial(int n)` that returns a `long`. Use a loop inside the method to calculate the factorial of `n` (e.g., 5! = 120). Call it from `main` passing `5` and print the result.
* **Example Test Case:**
  * **Arguments passed:** `5`
  * **Expected Return Value:** `120`

### 15. The Prime Checker
**Class Name:** `Q15_PrimeChecker.java`
* **Task:** Write a method `boolean isPrime(int num)`. Move the prime-checking loop logic from Day 4 into this method. Return `true` if prime, `false` if not. In `main`, call this method to check if the number `29` is prime.
* **Example Test Case:**
  * **Arguments passed:** `29`
  * **Expected Return Value:** `true`