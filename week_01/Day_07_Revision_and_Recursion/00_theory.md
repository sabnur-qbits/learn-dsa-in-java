# 📖 Day 07 Theory: Full Week Revision & Recursion

Great job making it to Day 7! Today we'll review all the amazing concepts you've learned so far—from variables and loops to arrays and methods. We are also introducing a magical new concept called Recursion, which is like a loop built using methods. 

---

### 1. Recursion
Recursion is like looking into two mirrors facing each other: the image reflects endlessly. In programming, recursion happens when a method calls itself to solve a smaller piece of the same problem. Every recursive method must have a stopping point, or it will run forever!

To understand recursion, you must understand the **Call Stack**. The Call Stack is how Java remembers where it left off. Every time a method is called, Java places a "sticky note" (a stack frame) on top of a pile. When a method finishes (returns), its sticky note is thrown away. If a recursive method has no base case, the pile of sticky notes gets so high that Java runs out of memory (`StackOverflowError`).

**Categorization / Types of Recursion:**
| Type | What it does | Example |
| :--- | :--- | :--- |
| **Base Case** | The condition that stops the recursion. Without it, you get an infinite loop. | `if (n == 0) { return; }` |
| **Recursive Call** | The part where the method calls itself to move closer to the base case. | `return n + sum(n - 1);` |
| **Direct Recursion** | A method explicitly calls itself within its own body. | `void a() { a(); }` |
| **Indirect Recursion** | Method A calls Method B, and Method B calls Method A. | `void a() { b(); }` <br> `void b() { a(); }` |
| **Tail Recursion** | The recursive call is the very last operation in the method. | `return sum(n-1, acc+n);` |

**Example:**
```java
public class RecursionExample {
    // A recursive method to find the sum of numbers from 1 to n
    public static int sum(int n) {
        // Base case: if n is 1, just return 1
        if (n == 1) {
            return 1;
        }
        // Recursive call: n + sum of numbers up to (n-1)
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int total = sum(4); // 4 + 3 + 2 + 1
        System.out.println("The sum is: " + total);
    }
}
```
Output:
```plaintext
The sum is: 10
```

🤔 Q&A: Recursion

Q: What happens if I forget the base case?
A: Your method will keep calling itself endlessly. In Java, this quickly uses up all available memory, causing your program to crash with a `StackOverflowError`.

Q: Should I use recursion instead of loops all the time?
A: No! While recursion is elegant for certain complex problems (like exploring trees or sorting algorithms you'll learn later), loops are often faster and use less memory for simple tasks.

---

### 2. Week 1 Mega-Revision Cheat Sheet
Since today is a revision day, here is a quick summary of the core concepts you've mastered this week. Keep this handy when solving today's mixed exercises!

**Variables & Data Types:**
*   **Primitive Types:** `int` (whole numbers), `double` (decimals), `boolean` (true/false), `char` (single character).
*   **Reference Types:** `String` (text), Arrays.

**Conditionals (Control Flow):**
*   **`if-else`:** Executes a block of code if a condition is true, otherwise executes the `else` block.
*   **`switch`:** Good for testing a single variable against many specific values.

**Loops:**
*   **`for` loop:** Use when you know exactly how many times to loop. `for(int i = 0; i < 5; i++)`
*   **`while` loop:** Use when you don't know how many times to loop, but you have a condition.
*   **`do-while` loop:** Always executes at least once before checking the condition.

**Arrays:**
*   A container that holds a fixed number of values of a single type.
*   **Creation:** `int[] numbers = new int[5];` or `int[] numbers = {1, 2, 3};`
*   **Indexing:** Starts at 0. The last element is at `numbers.length - 1`.

**Methods:**
*   Reusable blocks of code.
*   **Signature:** `public static returnType methodName(parameters) { ... }`
*   **Overloading:** Having multiple methods with the same name but different parameters.
