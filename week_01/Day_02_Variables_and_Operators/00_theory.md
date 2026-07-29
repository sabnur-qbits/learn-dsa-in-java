# 📖 Day 02 Theory: Variables, Data Types, Type Casting & Operators

Welcome to Day 02! Yesterday, you successfully wrote your first programs and understood the basic structure of Java. Today, we're giving your programs a memory by learning how to store, change, and manipulate data like a true programmer.

---

### 1. Variables and Data Types
Think of a variable as a labeled container or a box where you can store a specific piece of information. Just like a shoe box is meant for shoes and a jewelry box for jewelry, variables in Java have "Data Types" that dictate exactly what kind of data they can hold.

**Categorization / Types:**

| Data Type | What it stores | Size / Range | Example |
| :--- | :--- | :--- | :--- |
| `byte` | Tiny whole numbers | 1 byte (-128 to 127) | `byte age = 22;` |
| `short` | Small whole numbers | 2 bytes (-32,768 to 32,767) | `short year = 2024;` |
| `int` | Standard whole numbers | 4 bytes (around -2 billion to 2 billion) | `int population = 100000;` |
| `long` | Huge whole numbers | 8 bytes (needs an 'L' at the end) | `long distance = 9876543210L;` |
| `float` | Small decimals | 4 bytes (needs an 'f' at the end) | `float price = 19.99f;` |
| `double` | Large/Precise decimals | 8 bytes (standard for decimals) | `double pi = 3.1415926535;` |
| `boolean` | True or False only | 1 bit | `boolean isCoding = true;` |
| `char` | Single characters | 2 bytes (surrounded by single quotes) | `char grade = 'A';` |
| `String` | Text (Reference Type, not primitive) | Varies (surrounded by double quotes) | `String name = "Alice";` |

**Example:**
```java
public class VariableExample {
    public static void main(String[] args) {
        String movieName = "Inception";
        int releaseYear = 2010;
        double rating = 8.8;
        boolean isAwesome = true;

        System.out.println("Movie: " + movieName);
        System.out.println("Year: " + releaseYear);
        System.out.println("Rating: " + rating);
        System.out.println("Awesome? " + isAwesome);
    }
}
```
Output:
```plaintext
Movie: Inception
Year: 2010
Rating: 8.8
Awesome? true
```
🤔 Q&A: Variables and Data Types

Q: What happens if I try to put a decimal into an `int` variable?
A: Java will throw a compilation error! An `int` can only hold whole numbers. You must use `float` or `double` for decimals.

Q: Why do we need so many number types (`byte`, `short`, `int`, `long`)?
A: It's all about saving memory. In modern computers, we mostly just use `int`, but if you were programming for a device with tiny memory (like a microwave), using `byte` instead of `int` would be crucial to save space.

---

### 2. Type Casting
Type casting is the process of converting a variable from one data type to another. Imagine pouring water from a small cup into a large bucket (safe), versus trying to pour water from a large bucket into a small cup (some water might spill).

**Categorization / Types:**

| Type of Casting | Direction | How it works | Example |
| :--- | :--- | :--- | :--- |
| **Implicit (Widening)** | Small to Large | Happens automatically. No data is lost. (e.g., `int` to `double`) | `int a = 5; double b = a;` (b becomes 5.0) |
| **Explicit (Narrowing)** | Large to Small | Must be done manually using parentheses. Data might be lost (decimals chopped off). | `double x = 9.9; int y = (int) x;` (y becomes 9) |
| **Char to Int (ASCII)** | `char` to `int` | Implicit. Every character has an underlying numeric value based on the ASCII table. | `char letter = 'A'; int val = letter;` (val becomes 65) |

**Example:**
```java
public class CastingExample {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int wholeNumber = 42;
        double decimalNumber = wholeNumber; 
        System.out.println("Implicit: " + decimalNumber);

        // Explicit Casting (Narrowing)
        double exactWeight = 75.8;
        int roundedWeight = (int) exactWeight;
        System.out.println("Explicit: " + roundedWeight);
    }
}
```
Output:
```plaintext
Implicit: 42.0
Explicit: 75
```
🤔 Q&A: Type Casting

Q: When I narrow a `double` to an `int`, does it round to the nearest whole number?
A: No! Explicit casting merely chops off (truncates) the decimal part completely. `9.9` becomes `9`, not `10`.

Q: Why would I ever want to lose data with explicit casting?
A: Sometimes you only care about the whole number. For instance, if you're dividing people into groups, you can't have 2.5 people; you'd cast to `int` to drop the decimal.

---

### 3. Operators
Operators are special symbols in Java that perform operations on variables and values. They are the tools we use to do math, make comparisons, and build logic.

**Categorization / Types:**

| Operator Category | Operators | What they do | Example |
| :--- | :--- | :--- | :--- |
| **Arithmetic** | `+`, `-`, `*`, `/`, `%` | Basic math. `%` (Modulo) gives the remainder of division. | `10 % 3` (Result: 1) |
| **Assignment** | `=`, `+=`, `-=`, `*=`, `/=` | Assigns or updates a variable's value. | `x += 5;` (Same as `x = x + 5;`) |
| **Unary** | `++`, `--`, `!` | Operates on a single value. Increments/decrements by 1, or negates. | `count++;` (Adds 1) |
| **Relational** | `==`, `!=`, `>`, `<`, `>=`, `<=` | Compares two values and returns a `boolean` (true/false). | `5 == 5` (Result: true) |
| **Logical** | `&&` (AND), `||` (OR), `!` (NOT) | Combines multiple conditions. | `true && false` (Result: false) |

**Example:**
```java
public class OperatorExample {
    public static void main(String[] args) {
        int startingApples = 10;
        
        // Arithmetic & Assignment
        startingApples += 5; // Got 5 more
        
        // Modulo (Remainder)
        int leftover = startingApples % 4; // Divide by 4, what's left?
        
        // Unary
        startingApples++; // Found one more apple
        
        // Relational & Logical
        boolean hasEnough = (startingApples > 12) && (leftover == 3);

        System.out.println("Total apples: " + startingApples);
        System.out.println("Leftover if divided by 4: " + leftover);
        System.out.println("Do we have enough based on conditions? " + hasEnough);
    }
}
```
Output:
```plaintext
Total apples: 16
Leftover if divided by 4: 3
Do we have enough based on conditions? true
```
🤔 Q&A: Operators

Q: What's the difference between `counter++` (post-increment) and `++counter` (pre-increment)?
A: `counter++` uses the current value of the variable in the expression, *then* adds 1. `++counter` adds 1 *first*, then uses the new value in the expression.

Q: Why use `==` instead of `=` for comparing?
A: A single `=` is the assignment operator; it's used to put a value into a variable (`age = 20`). The double `==` is a relational operator used exclusively to ask a question: "Are these two things equal?"
