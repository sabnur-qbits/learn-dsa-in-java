# 📖 Week 2 Day 01 Theory: Intermediate Array Mechanics

Welcome to Week 2! You've mastered the basic syntax of Java, and now it's time to build the mental muscles required for problem-solving. Today, we are moving beyond simply creating arrays and starting to manipulate them—swapping elements, shifting them around, and using loops inside loops to unlock your first advanced algorithms.

---

### 1. Element Swapping (The "Third Cup" Rule)
Imagine you have a cup of coffee and a cup of tea, and you want to swap their contents. You can't just pour one directly into the other! You need a third, empty cup (a temporary variable) to hold the coffee while you pour the tea. This is exactly how we swap elements in an array.

**Categorization / Variable Assignment Types:**
| Operation | What it does | Example |
| :--- | :--- | :--- |
| **Direct Overwrite** | Replaces the value completely (original is lost). | `a = b;` |
| **Swapping** | Safely exchanges two values using a temporary `temp` variable. | `int temp = a; a = b; b = temp;` |

**Example:**
```java
public class SwapExample {
    public static void main(String[] args) {
        String[] colors = {"Red", "Blue", "Green"};
        
        // We want to swap "Red" (index 0) and "Green" (index 2)
        String temp = colors[0];  // 1. Pour Red into empty cup
        colors[0] = colors[2];    // 2. Pour Green into Red's cup
        colors[2] = temp;         // 3. Pour Red (from temp) into Green's cup
        
        System.out.println("Swapped: " + colors[0] + " and " + colors[2]);
    }
}
```
Output:
```plaintext
Swapped: Green and Red
```
*Note: This shows hardcoded swapping. In real algorithms, you'll use index variables like `i` and `j`!*

🤔 Q&A: Element Swapping

Q: Why can't I just write `arr[0] = arr[1]; arr[1] = arr[0];`?
A: Because after the first statement, `arr[0]` is completely overwritten with `arr[1]`'s value. The original value of `arr[0]` is destroyed, so both indices end up holding the exact same value!

---

### 2. Array Shifting
Shifting is the process of moving array elements one or more positions to the left or right. Think of it like a line of people where everyone takes one step forward.

When shifting, you must be careful about the loop direction. If you overwrite an element before moving it, you'll create a chain reaction of duplicate data!

**Example: Shifting Right (Losing the last element)**
```java
public class ShiftRightExample {
    public static void main(String[] args) {
        int[] scores = {10, 20, 30, 40};
        
        // We want to shift everything right: {10, 10, 20, 30}
        // Notice we must loop BACKWARDS to avoid overwriting!
        for (int i = scores.length - 1; i > 0; i--) {
            scores[i] = scores[i - 1]; 
        }
        
        // The first element is untouched, the last element (40) is pushed out and lost.
        System.out.println(java.util.Arrays.toString(scores));
    }
}
```
Output:
```plaintext
[10, 10, 20, 30]
```
*(Hint for today's practice: If you need to shift LEFT, you will loop forwards. If you want the lost element to "wrap around", you'll need to save it in a `temp` variable first!)*

---

### 3. State Tracking (Comparing Past vs Present)
Often, you need to track a value that changes as you loop through an array. This could be a "running total", a "streak", or a "previous state". 

The key here is declaring your tracking variables **outside and above** the loop so their values persist across iterations.

**Example: Counting how many times a temperature dropped from the previous day**
```java
public class StateTrackingExample {
    public static void main(String[] args) {
        int[] dailyTemps = {75, 78, 72, 74, 68};
        int dropCount = 0; // State variable tracked outside loop
        
        // We start at index 1 so we can compare with index 0
        for (int i = 1; i < dailyTemps.length; i++) {
            if (dailyTemps[i] < dailyTemps[i - 1]) { // Compare current to previous
                dropCount++;
            }
        }
        
        System.out.println("The temperature dropped " + dropCount + " times.");
    }
}
```

---

### 4. Nested Loops with Arrays (The Brute Force Foundation)
You've already used nested loops for drawing star patterns. When used with arrays, nested loops allow you to compare *every* element against *every other* element. The outer loop picks a number, and the inner loop checks it against the rest. 

**Categorization / Nested Loop Patterns:**
| Pattern | How it works | When to use it |
| :--- | :--- | :--- |
| **All Combinations** | `i` from `0` to `end`, `j` from `0` to `end`. | When order matters or comparing array A with array B. |
| **Unique Pairs Only** | `i` from `0` to `end`, `j` from `i + 1` to `end`. | When finding pairs inside a *single* array, avoiding self-comparisons and duplicate pairs (like A vs B and B vs A). |

**Example: Counting elements smaller than the current element**
In this completely unrelated example, we check how many numbers in the array are strictly smaller than the current number.
```java
public class NestedArrayExample {
    public static void main(String[] args) {
        int[] ages = {15, 20, 10, 30};
        
        for (int i = 0; i < ages.length; i++) {
            int smallerCount = 0; // Reset for each outer number
            
            // Inner loop compares ages[i] against EVERY other person ages[j]
            for (int j = 0; j < ages.length; j++) {
                if (ages[j] < ages[i]) {
                    smallerCount++;
                }
            }
            
            System.out.println(ages[i] + " is older than " + smallerCount + " people.");
        }
    }
}
```
Output:
```plaintext
15 is older than 1 people.
20 is older than 2 people.
10 is older than 0 people.
30 is older than 3 people.
```

🤔 Q&A: Nested Loops

Q: Are nested loops always the best solution?
A: They are usually the easiest to write (this is called the "brute force" method), but they can be very slow for large arrays. As you progress in DSA, you'll learn much faster ways to solve these problems without nested loops!
