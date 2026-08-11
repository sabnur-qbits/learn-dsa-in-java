# 📖 Day 04 Theory: Loops & Patterns

Welcome to Day 4, Sabnur Samiha! You've mastered making decisions with conditionals. Today, we're going to learn how to make the computer repeat tasks for us automatically using **loops**. This is where programming starts to feel truly powerful!

---

### 1. The `for` Loop
Think of a `for` loop like running laps around a track. You know exactly where you start, what lap you are on, and exactly how many laps you need to complete before you stop. It is the best loop to use when you know the exact number of iterations in advance.

**Categorization / Types:**
| Component | Purpose | Example |
| :--- | :--- | :--- |
| **Initialization** | Sets the starting point (the counter variable). | `int i = 1;` |
| **Condition** | The rule that keeps the loop running as long as it's `true`. | `i <= 10;` |
| **Update / Increment** | How the counter changes after every single loop iteration. | `i++` (adds 1) |

**Example:**
```java
public class MorningRoutine {
    public static void main(String[] args) {
        // This loop will run exactly 3 times
        for (int i = 1; i <= 3; i++) {
            System.out.println("Jumping jack number: " + i);
        }
        System.out.println("Workout complete!");
    }
}
```
Output:
```plaintext
Jumping jack number: 1
Jumping jack number: 2
Jumping jack number: 3
Workout complete!
```
🤔 Q&A: The `for` Loop

Q: Can I decrement (count downwards) in a `for` loop?
A: Yes! You can initialize `i = 10` and use `i--` as the update to count backward.

Q: What happens if the condition is false from the very beginning?
A: The loop will never execute even once! The program will skip the entire `for` loop block and move to the next line of code.

---

### 2. The `while` Loop
Think of a `while` loop like waiting for a bus. You don't know exactly how many minutes (iterations) it will take, but you keep waiting *while* the condition ("bus has not arrived") remains true. Use this when the number of iterations is unknown.

**Categorization / Types:**
| Component | Purpose | Flow Logic |
| :--- | :--- | :--- |
| **External Initialization** | The variable is set up *before* the loop starts. | `int items = 5;` |
| **Condition Check** | Checked at the very start of each iteration. | `while (items > 0)` |
| **Internal Update** | You MUST manually update the variable inside the loop body! | `items--;` inside the `{}` |

**Example:**
```java
public class EatCandy {
    public static void main(String[] args) {
        int candies = 3;
        
        while (candies > 0) {
            System.out.println("Eating a candy. Remaining: " + (candies - 1));
            candies--; // If we forget this, we get an infinite loop!
        }
    }
}
```
Output:
```plaintext
Eating a candy. Remaining: 2
Eating a candy. Remaining: 1
Eating a candy. Remaining: 0
```
🤔 Q&A: The `while` Loop

Q: What is an infinite loop?
A: An infinite loop happens when the condition of a `while` loop never becomes `false` (usually because you forgot to update the counter inside the loop). The program will run forever until it crashes!

Q: When should I use `while` instead of `for`?
A: Use `while` when you are waiting for a specific event to happen, like a user typing a specific word, or a number reaching a certain threshold, where you can't predict the exact number of steps it will take.

---

### 3. The `do-while` Loop
Think of a `do-while` loop like eating a mysterious new food. You take a bite *first* (the "do" part), and *then* you decide if you want to keep eating it (the "while" condition). It guarantees the code will run **at least once**, regardless of the condition!

**Categorization / Types:**
| Structure | Description | Key Difference |
| :--- | :--- | :--- |
| **`do { ... }` block** | The code that executes first, before any checks. | Always runs at least one time. |
| **`while (condition);`** | The check at the end. Note the semicolon `;` at the end! | Evaluated *after* the block has run. |

**Example:**
```java
public class TryFood {
    public static void main(String[] args) {
        boolean tastesGood = false;
        
        do {
            System.out.println("Taking a bite of the broccoli...");
            // We eat it once, then check if we want more
        } while (tastesGood); 
        
        System.out.println("Okay, no more broccoli.");
    }
}
```
Output:
```plaintext
Taking a bite of the broccoli...
Okay, no more broccoli.
```
🤔 Q&A: The `do-while` Loop

Q: Why is there a semicolon `;` at the end of `while(condition);` here, but not in a normal `while` loop?
A: In a normal `while` loop, the condition is followed by a block of code `{}`. In a `do-while` loop, the `while(condition)` statement acts as the terminator for the entire block, so it requires a semicolon to mark the end of the statement.

Q: What is the most common use case for `do-while`?
A: It is perfect for Menu systems! You always want to display the menu at least once before asking the user if they want to exit.

---

### 4. Nested Loops (and Patterns)
Think of nested loops like the hands on a clock. For every single hour the hour hand moves (outer loop), the minute hand must complete a full 60-minute cycle (inner loop). Nested loops are essential for working with 2D grids, tables, and drawing patterns!

**Categorization / Types:**
| Component | Behavior in Patterns | Analogy |
| :--- | :--- | :--- |
| **Outer Loop** | Controls the number of **Rows** (moving downwards). | The Hour hand (moves slowly). |
| **Inner Loop** | Controls the number of **Columns** (printing horizontally across a single row). | The Minute hand (completes a full cycle rapidly). |

**Example:**
```java
public class SimpleGrid {
    public static void main(String[] args) {
        // Outer loop (Rows)
        for (int row = 1; row <= 3; row++) {
            
            // Inner loop (Columns)
            for (int col = 1; col <= 3; col++) {
                System.out.print("[X] "); // Note: print, not println!
            }
            
            // Move to the next line after finishing the row
            System.out.println(); 
        }
    }
}
```
Output:
```plaintext
[X] [X] [X] 
[X] [X] [X] 
[X] [X] [X] 
```
🤔 Q&A: Nested Loops

Q: Why do we use `System.out.print()` inside the inner loop and `System.out.println()` inside the outer loop?
A: `print()` keeps drawing shapes on the same horizontal line (building the row). Once the inner loop finishes that row, we need `println()` to move the cursor down to start the next row!

Q: How do I draw a triangle instead of a square?
A: To draw a triangle, the number of columns (inner loop limit) usually depends on the current row number! E.g., `for (int col = 1; col <= row; col++)`.
