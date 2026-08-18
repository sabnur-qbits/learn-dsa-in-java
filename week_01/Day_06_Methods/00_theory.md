# 📖 Day 06 Theory: Methods (Functions)

Now that you can store collections of data in Arrays, it's time to organize the logic of your code. Writing all your code inside the `main` method can quickly become messy. Methods let us package our code into reusable, bite-sized blocks!

---

### 1. Introduction to Methods
Think of a method like a recipe or a specific machine in a factory. You give it a name (e.g., "Bake Cake" or "Coffee Maker"), you might feed it some ingredients (parameters), and it performs a specific task. Some machines just do the task (like a fan blowing air), while others give you a final product back (like a blender giving you a smoothie).

**Categorization / Types:**

| Method Component | Description | Example |
| :--- | :--- | :--- |
| **`public static`** | Access modifiers. `public` means anyone can use it. `static` means it belongs to the class itself, so we can call it directly without creating objects (crucial for beginners). | `public static` |
| **Return Type (`void`)** | Means the method just *does* something (like printing to the screen) but doesn't hand any data back to you. | `public static void printStars()` |
| **Return Type (Data Type)** | The method calculates or finds something and *gives it back* to the caller. Must use the `return` keyword. | `public static int getSum()` |
| **Parameters** | Variables declared inside the parentheses of the method definition. These are the "ingredients" the method needs. | `(int age, String name)` |
| **Arguments** | The actual values you pass into the method when you call it. | `printDetails(20, "Alex")` |

**Example:**
```java
public class MethodBasics {
    
    // A simple void method with no parameters
    public static void cheer() {
        System.out.println("Go Team Go!");
    }

    public static void main(String[] args) {
        // Calling the method
        cheer();
        cheer();
    }
}
```

**Output:**
```plaintext
Go Team Go!
Go Team Go!
```

🤔 **Q&A: Introduction to Methods**

**Q: Where do I write my custom methods?**
A: Inside the `class` block, but completely *outside* the `main` method block. Methods cannot be nested inside one another.

**Q: Why do I have to write `static`?**
A: Because your `main` method is `static`. A `static` method can only directly call other `static` methods in the same class.

---

### 2. Passing Data (Parameters)
Sometimes your method needs specific information to do its job. For example, a "send email" method needs to know the email address. We provide this through **parameters**.

**Example:**
```java
public class PassingData {
    
    // Method that takes one String parameter
    public static void greetUser(String username) {
        System.out.println("Welcome back, " + username + "!");
    }

    // Method that takes multiple parameters
    public static void printReceipt(String item, double price) {
        System.out.println("You bought a " + item + " for $" + price);
    }

    public static void main(String[] args) {
        greetUser("CodeNinja"); // "CodeNinja" is the argument
        printReceipt("Coffee", 3.50); // "Coffee" and 3.50 are arguments
    }
}
```

**Output:**
```plaintext
Welcome back, CodeNinja!
You bought a Coffee for $3.50
```

🤔 **Q&A: Parameters**

**Q: Do the parameter names have to match the variable names in `main`?**
A: No! The names inside the method's parentheses are independent. If you pass an `int age` from `main`, the method can receive it as `int x`.

---

### 3. Returning Data
Instead of just printing a result, often we want a method to calculate a value and give it back to the `main` method so we can store it in a variable, use it in math, or pass it to another method.

**Example:**
```java
public class ReturningData {
    
    // This method returns a double. Notice we use 'double' instead of 'void'
    public static double calculateDiscount(double originalPrice, double discountPercentage) {
        double discountAmount = (originalPrice * discountPercentage) / 100.0;
        double finalPrice = originalPrice - discountAmount;
        return finalPrice; // The return keyword hands the data back
    }

    public static void main(String[] args) {
        // We capture the returned value in a variable
        double salePrice = calculateDiscount(50.0, 20.0);
        System.out.println("The price after discount is: $" + salePrice);
        
        // Or we can use it directly
        System.out.println("Cheap item: $" + calculateDiscount(10.0, 50.0));
    }
}
```

**Output:**
```plaintext
The price after discount is: $40.0
Cheap item: $5.0
```

🤔 **Q&A: Returning Data**

**Q: Can a method return multiple values?**
A: No, a method can only return exactly *one* value. (Though later you'll learn that this one value could be an Array or an Object!).

**Q: What happens if I forget the `return` statement in a non-void method?**
A: Your code will not compile. Java guarantees that if you promise to return an `int`, every possible path through the method must hit a `return` statement that gives an `int`.

---

### 4. Method Overloading
Method Overloading is a feature that allows a class to have more than one method with the **same name**, as long as their parameter lists are different (different number of parameters or different types of parameters).

**Example:**
```java
public class MethodOverloading {
    
    // Version 1: Prints a string
    public static void display(String message) {
        System.out.println("Message: " + message);
    }
    
    // Version 2: Prints an integer
    public static void display(int number) {
        System.out.println("Number: " + number);
    }
    
    // Version 3: Prints a string and an integer
    public static void display(String message, int times) {
        for(int i=0; i<times; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        display("Warning!");        // Calls Version 1
        display(404);               // Calls Version 2
        display("Echo", 3);         // Calls Version 3
    }
}
```

**Output:**
```plaintext
Message: Warning!
Number: 404
Echo
Echo
Echo
```

🤔 **Q&A: Method Overloading**

**Q: How does Java know which method to call if they have the same name?**
A: It looks at the arguments you provide. If you pass an `int`, it runs the version that expects an `int`. It matches the method signature.
