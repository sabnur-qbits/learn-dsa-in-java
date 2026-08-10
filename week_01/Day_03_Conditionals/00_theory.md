# 📖 Day 03 Theory: Control Flow (Conditionals)

Welcome to Day 3, Sabnur Samiha! Yesterday you learned how to use operators to perform calculations and compare values. Today, we'll use those comparisons to make decisions in our code, allowing our programs to take different paths based on different conditions!

---

### 1. Basic `if` and `else` Statements
Think of an `if-else` statement like a fork in the road. If the path to the right is clear (the condition is true), you take it. If it's blocked (the condition is false), you are forced to take the path to the left.

**Categorization / Types:**
| Statement | Purpose | Example |
| :--- | :--- | :--- |
| `if` | Executes a block of code only if a specific condition evaluates to `true`. | `if (age >= 18) { ... }` |
| `else` | Provides a fallback block of code that executes if the preceding `if` condition is `false`. | `else { ... }` |

**Example:**
```java
public class WeatherCheck {
    public static void main(String[] args) {
        boolean isRaining = true;
        
        if (isRaining) {
            System.out.println("Take an umbrella!");
        } else {
            System.out.println("Enjoy the sunshine!");
        }
    }
}
```
Output:
```plaintext
Take an umbrella!
```
🤔 Q&A: Basic `if` and `else` Statements

Q: Do I always need an `else` block after an `if` block?
A: No, the `else` block is optional. You can have an `if` statement by itself if you only want to execute code when the condition is true and do nothing otherwise.

Q: What happens if I forget the curly braces `{}` around the `if` block?
A: If you omit the curly braces, Java will only execute the very first line of code immediately following the `if` statement conditionally. It's a best practice to always use curly braces to avoid bugs.

---

### 2. The `else if` Ladder
Think of an `else if` ladder like a multi-level filter or a series of toll booths. You stop at the first booth. If you have the right pass (condition is true), you go through. If not, you move to the next booth and check again, continuing until you either find a match or reach the final default `else` exit.

**Categorization / Types:**
| Component | Purpose | Flow Logic |
| :--- | :--- | :--- |
| First Condition | The `if` block at the start of the ladder. | Evaluated first. If true, its block executes and the rest of the ladder is skipped. |
| Subsequent Conditions | The `else if` blocks following the initial `if`. | Evaluated only if all previous conditions were false. |
| Default Case | The final `else` block at the end (optional). | Executes only if absolutely none of the `if` or `else if` conditions were true. |

**Example:**
```java
public class SpeedLimit {
    public static void main(String[] args) {
        int speed = 75;
        
        if (speed > 80) {
            System.out.println("Reckless driving! Huge fine.");
        } else if (speed > 60) {
            System.out.println("Speeding. Standard fine.");
        } else if (speed > 40) {
            System.out.println("Good speed.");
        } else {
            System.out.println("Too slow, you might cause a traffic jam.");
        }
    }
}
```
Output:
```plaintext
Speeding. Standard fine.
```
🤔 Q&A: The `else if` Ladder

Q: Can multiple blocks execute if multiple conditions are true?
A: No! In an `if-else if` ladder, only the **first** condition that evaluates to `true` will have its block executed. The program will then skip the rest of the ladder.

Q: Is there a limit to how many `else if` statements I can chain together?
A: There is no technical limit, but chaining too many can make your code hard to read. If you have many exact matches to check, a `switch` statement might be better!

---

### 3. Nested `if` Statements
Think of a nested `if` statement like a set of Matryoshka (Russian nesting) dolls, or unlocking a safe inside a vault. You must first open the outer vault (the outer `if` condition must be true) before you can even try to unlock the safe inside (the inner `if` condition).

**Categorization / Types:**
| Structure | Description | When to use |
| :--- | :--- | :--- |
| **Outer `if`** | The main, broad condition that acts as the first gatekeeper. | When you have a prerequisite condition that must be met before checking further details. |
| **Inner `if`** | A secondary condition placed completely inside the block of the outer `if`. | When you need to refine a decision based on the success of a previous decision. |

**Example:**
```java
public class ThemeParkRide {
    public static void main(String[] args) {
        int age = 15;
        double height = 155.5; // in cm
        
        // Outer if
        if (age >= 12) {
            // Inner if
            if (height >= 150.0) {
                System.out.println("You are allowed to ride the roller coaster!");
            } else {
                System.out.println("You are old enough, but not tall enough for this ride.");
            }
        } else {
            System.out.println("You are too young for this ride.");
        }
    }
}
```
Output:
```plaintext
You are allowed to ride the roller coaster!
```
🤔 Q&A: Nested `if` Statements

Q: Can I nest an `if-else` inside an `else` block instead of an `if` block?
A: Absolutely! You can nest any control flow statement (`if`, `if-else`, `switch`) inside any other block of code.

Q: My nested `if` statements are getting very deep and hard to read. What should I do?
A: Deep nesting is often called "arrow code" and is considered bad practice. You can sometimes combine conditions using Logical AND (`&&`) to flatten the structure, e.g., `if (age >= 12 && height >= 150.0)`.

---

### 4. The `switch` Statement
Think of a `switch` statement like a vending machine. You input a specific button (a value), and the machine directly drops the corresponding snack (executes the specific case). It's much faster than reading through a long list of `else if` conditions when you know exactly what specific values you are looking for.

**Categorization / Types:**
| Keyword | Purpose | Analogy |
| :--- | :--- | :--- |
| `switch(variable)` | Defines the variable whose value we are evaluating. | The coin slot and selection pad on the vending machine. |
| `case value:` | A specific value to check against the switch variable. | A specific button combination like "A4". |
| `break;` | Exits the switch block immediately after a match is found and executed. | The hatch opening so you can take your snack and leave. |
| `default:` | The fallback code if none of the cases match. | The machine returning your coin if the item is empty or invalid. |

**Example:**
```java
public class CoffeeSize {
    public static void main(String[] args) {
        int sizeChoice = 2;
        
        switch (sizeChoice) {
            case 1:
                System.out.println("Small coffee coming up!");
                break;
            case 2:
                System.out.println("Medium coffee coming up!");
                break;
            case 3:
                System.out.println("Large coffee coming up!");
                break;
            default:
                System.out.println("Invalid selection. Please choose 1, 2, or 3.");
        }
    }
}
```
Output:
```plaintext
Medium coffee coming up!
```
🤔 Q&A: The `switch` Statement

Q: What happens if I forget the `break;` statement?
A: This causes "fall-through". Java will execute the matching case, and then continue executing the code in **every subsequent case** below it until it hits a `break` or the end of the switch, even if those subsequent case values don't match!

Q: Can I use `switch` with any data type?
A: No. In modern Java, `switch` works with `byte`, `short`, `char`, `int`, their wrapper classes, `String`, and `enum` types. It does NOT work with `boolean`, `long`, `float`, or `double`.
