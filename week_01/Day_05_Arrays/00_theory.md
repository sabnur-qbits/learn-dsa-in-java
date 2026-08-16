# 📖 Day 05 Theory: Arrays (1D)

Great job mastering loops yesterday! Today, we combine loops with a new way to store data. Instead of creating 50 variables for 50 student grades, you can store them all in one organized list: an **Array**.

---

### 1. Introduction to Arrays

Think of an array like a pill organizer box. It has multiple compartments connected together. Each compartment holds a single piece of data (a pill), and all the compartments must hold the same *type* of data (e.g., all `int`, or all `String`).

**Key Characteristics of Java Arrays:**
- **Fixed Size:** Once you create an array of size 5, it cannot shrink or grow.
- **Homogeneous:** An `int` array can only store integers, not strings or doubles.
- **Zero-Indexed:** The first compartment is always at index `0`.

**Array Variations / Initialization Approaches:**

| Type of Initialization | Description | When to Use | Example |
| :--- | :--- | :--- | :--- |
| **Empty Array (Size Only)** | Creates an array with default values (0 for numbers, null for objects). | When you know how many items you need, but not their values yet. | `int[] arr = new int[5];` |
| **Inline Initialization** | Creates an array and immediately fills it with specific values. | When you already know the exact data that belongs in the array. | `int[] arr = {10, 20, 30};` |
| **Anonymous Array** | Creates an array on the fly without a variable name (often passed to methods). | When you need an array briefly and won't reuse it. | `new int[]{1, 2, 3}` |

**Example:**
```java
public class ArrayBasics {
    public static void main(String[] args) {
        // 1. Empty array of size 3 (defaults to {0, 0, 0})
        int[] scores = new int[3]; 
        
        // 2. Modifying elements using their index
        scores[0] = 85;
        scores[1] = 90;
        scores[2] = 95;
        
        // 3. Accessing elements
        System.out.println("First score: " + scores[0]);
        System.out.println("Last score: " + scores[2]);
        
        // 4. Inline initialization
        String[] colors = {"Red", "Green", "Blue"};
        System.out.println("Favorite color: " + colors[0]);
    }
}
```

**Output:**
```plaintext
First score: 85
Last score: 95
Favorite color: Red
```

🤔 **Q&A: Introduction to Arrays**

**Q: What happens if I try to access `scores[3]` in an array of size 3?**
A: Java will throw an `ArrayIndexOutOfBoundsException` and crash your program. Since indexing starts at 0, an array of size 3 only has indices 0, 1, and 2.

**Q: Can I change the size of an array later?**
A: No, standard Java arrays have a fixed length. If you need more space later, you have to create a brand new, larger array and copy the old elements over.

---

### 2. Iterating Through Arrays (Array Traversal)

Arrays and loops are best friends. Instead of printing each index manually, you can use a loop to automatically visit every single compartment in the array. Every array has a built-in `.length` property that tells you its size.

**Example:**
```java
public class ArrayIteration {
    public static void main(String[] args) {
        double[] prices = {19.99, 5.50, 42.00, 8.75};
        
        // Use prices.length to ensure we don't go out of bounds
        // Notice the condition is i < prices.length (not <=)
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Item " + i + " costs: $" + prices[i]);
        }
    }
}
```

**Output:**
```plaintext
Item 0 costs: $19.99
Item 1 costs: $5.50
Item 2 costs: $42.00
Item 3 costs: $8.75
```

🤔 **Q&A: Array Iteration**

**Q: Why is the loop condition `i < arr.length` and not `i <= arr.length`?**
A: Because indices start at 0. If `length` is 4, the valid indices are 0, 1, 2, 3. If you use `<= 4`, it will try to access index 4, which doesn't exist, causing an `ArrayIndexOutOfBoundsException`.

**Q: How do I loop backwards?**
A: Start your loop variable at `arr.length - 1`, use the condition `i >= 0`, and decrement (`i--`).

---

### 3. Basic Array Algorithms

To perform calculations or find specific data in an array, we use algorithms. These are standard patterns of logic.

**Common Algorithms:**

| Algorithm | Concept | Approach |
| :--- | :--- | :--- |
| **Sum / Accumulation** | Adding all elements together. | Create a `sum` variable outside the loop (initially 0). Add each array element to `sum` inside the loop. |
| **Finding Max/Min** | Finding the largest/smallest value. | Assume the first element (`arr[0]`) is the max/min. Loop through the rest; if you find a value that is bigger/smaller, update your max/min variable. |
| **Linear Search** | Looking for a specific value. | Loop through the array. If the current element matches your target, you found it! Use `break` to stop looking. |
| **Counting Occurrences** | Seeing how many times a value appears. | Create a `count` variable. Loop through the array. If the current element matches your target, increase `count` by 1. |
| **Copying Arrays** | Duplicating data. | Create a new empty array of the same size. Loop through, assigning `newArr[i] = oldArr[i]`. |

**Example (Finding the Maximum Value):**
```java
public class FindMaxExample {
    public static void main(String[] args) {
        int[] speeds = {45, 60, 20, 85, 55};
        
        // Start by assuming the first element is the highest
        int highestSpeed = speeds[0]; 
        
        for (int i = 1; i < speeds.length; i++) {
            if (speeds[i] > highestSpeed) {
                highestSpeed = speeds[i]; // Found a new highest speed!
            }
        }
        
        System.out.println("The top speed recorded was: " + highestSpeed);
    }
}
```

**Output:**
```plaintext
The top speed recorded was: 85
```

🤔 **Q&A: Array Algorithms**

**Q: Why initialize the `highestSpeed` variable to `speeds[0]` instead of `0`?**
A: If all numbers in your array are negative (e.g., temperatures like `{-5, -10, -2}`), and you initialize `max = 0`, your program will incorrectly say `0` is the max because it's higher than all the negatives, even though `0` isn't in the array! Starting with `arr[0]` is always safe.

**Q: How do I compare two arrays to see if they are the same?**
A: You cannot just use `arr1 == arr2`. That compares their memory addresses, not their contents. You must first check if their `.length` is the same, and then use a loop to check if `arr1[i] == arr2[i]` for every single index.
