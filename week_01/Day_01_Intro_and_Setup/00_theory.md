# 📖 Day 01 Theory: Introduction & First Programs

Welcome to Day 1, Sabnur Samiha! Today marks the beginning of your exciting journey into Java programming. Let's get familiar with the core components that make Java work and write our very first programs.

---

### 1. Java Architecture (JDK, JRE, JVM)
Think of Java like a restaurant. The JDK is the entire restaurant building (including the kitchen and dining area), the JRE is the kitchen where the food is prepared, and the JVM is the chef who actually cooks the meal.

**Categorization / Types:**
| Component | Full Name | Purpose | Example / Analogy |
| :--- | :--- | :--- | :--- |
| **JDK** | Java Development Kit | The full toolkit for developers. Includes everything needed to write, compile, and run Java code. | The entire restaurant (tools + execution). |
| **JRE** | Java Runtime Environment | The environment needed to run Java programs. Includes the JVM and core libraries, but no development tools. | The kitchen and ingredients needed to serve a dish. |
| **JVM** | Java Virtual Machine | The engine that executes the compiled Java bytecode line by line. Makes Java platform-independent. | The chef executing the recipe. |

**Example:**
```java
// There is no direct code for this, but installing the JDK allows us to run Java commands in the terminal.
// java -version
```
Output:
```plaintext
java version "21.0.2" 2024-01-16 LTS
Java(TM) SE Runtime Environment (build 21.0.2+13-LTS-58)
Java HotSpot(TM) 64-Bit Server VM (build 21.0.2+13-LTS-58, mixed mode, sharing)
```

🤔 Q&A: Java Architecture

Q: Do I need to install all three separately?
A: No. When you install the JDK, it automatically includes the JRE and the JVM.

Q: Why is Java called "Write Once, Run Anywhere"?
A: Because the JDK compiles your code into bytecode, and the JVM translates that bytecode to work on any specific operating system (Windows, Mac, Linux).

---

### 2. The Java `main` Method Structure
Think of the `main` method as the front door of your house. When someone visits (or when a computer runs your program), they must enter through the front door. Every Java program needs a `main` method to start executing.

**Categorization / Types:**
| Component | Keyword | Purpose | Example |
| :--- | :--- | :--- | :--- |
| **Class Declaration** | `class` | Defines a blueprint or a container for your code. Must match the filename exactly. | `public class HelloWorld { }` |
| **Access Modifier** | `public` | Makes the class or method accessible from anywhere. | `public static void main...` |
| **Static Keyword** | `static` | Allows the method to run without creating an object of the class first. | `public static void main...` |
| **Return Type** | `void` | Indicates that the method doesn't return any value after finishing. | `void main...` |
| **Method Name** | `main` | The specific name Java looks for to start the program. | `main(String[] args)` |
| **Parameters** | `String[] args` | Allows passing arguments from the command line (you will learn this later). | `main(String[] args)` |

**Example:**
```java
public class GreetingApp {
    // This is the entry point of the Java program
    public static void main(String[] args) {
        System.out.println("Welcome to Java Programming!");
    }
}
```
Output:
```plaintext
Welcome to Java Programming!
```

🤔 Q&A: The Java `main` Method Structure

Q: What happens if I misspell `main` as `Main`?
A: Java is case-sensitive! It will not recognize `Main` as the entry point and will throw a runtime error saying "Main method not found in class".

Q: Does the class name have to match the file name?
A: Yes. If your class is `public class HelloWorld`, your file MUST be named `HelloWorld.java`.

---

### 3. Standard Output (`print` vs `println`)
Think of outputting text like writing on a piece of paper. `print` means writing words right next to each other on the same line, while `println` means writing the words and then pressing the "Enter" key to move the pen to the next line.

**Categorization / Types:**
| Method | Purpose | Example |
| :--- | :--- | :--- |
| `System.out.print()` | Prints text to the console, keeping the cursor on the same line. | `System.out.print("Java ");` |
| `System.out.println()` | Prints text to the console, then moves the cursor to the beginning of the next line. | `System.out.println("Java");` |
| `System.out.printf()` | (Advanced) Prints formatted text. You'll learn this later! | `System.out.printf("Age: %d", 25);` |

**Example:**
```java
public class MovieQuote {
    public static void main(String[] args) {
        System.out.print("May the ");
        System.out.print("Force ");
        System.out.println("be with you.");
        
        System.out.println(" - Star Wars");
    }
}
```
Output:
```plaintext
May the Force be with you.
 - Star Wars
```

🤔 Q&A: Standard Output

Q: Why do I need to type `System.out.` every time?
A: Java is highly organized. `System` is a built-in class, `out` is the output stream (the console), and `println` is the action we want it to perform.

Q: Can I print numbers without quotes?
A: Yes! `System.out.println(5);` works perfectly. Quotes are only for text (Strings).

---

### 4. Escape Sequences
Think of escape sequences like secret codes. Since we can't easily type a "new line" or a "tab space" inside a text string without breaking the code, we use a backslash (`\`) paired with a letter to secretly tell Java to do it.

**Categorization / Types:**
| Sequence | Name | Purpose | Example Output |
| :--- | :--- | :--- | :--- |
| `\n` | New Line | Moves the cursor to the next line, similar to hitting "Enter". | `A\nB` -> A (next line) B |
| `\t` | Tab | Inserts a large horizontal space, useful for aligning text. | `A\tB` -> A    B |
| `\\` | Backslash | Prints a single backslash character. | `A\\B` -> A\B |
| `\"` | Double Quote | Prints a double quote without ending the string. | `\"Hello\"` -> "Hello" |
| `\'` | Single Quote | Prints a single quote. | `\'Hi\'` -> 'Hi' |

**Example:**
```java
public class EscapeDemo {
    public static void main(String[] args) {
        System.out.println("Student\t\tGrade");
        System.out.println("-------\t\t-----");
        System.out.println("Alice\t\tA");
        System.out.println("Bob\t\tB+");
        System.out.println("The teacher said, \"Great job!\"");
    }
}
```
Output:
```plaintext
Student		Grade
-------		-----
Alice		A
Bob		B+
The teacher said, "Great job!"
```

🤔 Q&A: Escape Sequences

Q: What happens if I use a forward slash `/n` instead of `\n`?
A: Java will just print exactly what you typed: `/n`. The backslash `\` is specifically designated as the escape character.

Q: Can I use multiple escape sequences in one string?
A: Absolutely! `System.out.println("Line1\nLine2\n\tIndentedLine3");` is perfectly valid.

---

### 5. Syntax Errors & Debugging
Think of syntax errors like grammatical mistakes in a human language. If you write "I is happy" instead of "I am happy," people might understand you, but Java is a very strict teacher—if you miss a single semicolon, it refuses to read your code!

**Categorization / Types:**
| Error Type | Description | Example Cause |
| :--- | :--- | :--- |
| **Syntax Error** | A mistake in the structure or grammar of the code. Caught before the program even runs (Compile-time). | Missing a semicolon `;` or a curly brace `}`. |
| **Runtime Error** | The code is grammatically correct but crashes while running. | Trying to divide a number by zero. |
| **Logical Error** | The code runs without crashing, but gives the wrong result. | Adding two numbers instead of multiplying them. |

**Example:**
```java
public class DebuggingExample {
    // Error 1 was: public void main (missing static)
    public static void main(String[] args) {
        // Error 2 was: system.out.println (lowercase s)
        System.out.println("Learning to debug!");
        
        // Error 3 was: missing semicolon at the end
        System.out.println("Bugs are normal.");
    }
}
```
Output:
```plaintext
Learning to debug!
Bugs are normal.
```

🤔 Q&A: Syntax Errors & Debugging

Q: Why does Java care so much about semicolons?
A: In Java, a semicolon acts like a period at the end of a sentence. Without it, Java doesn't know where one instruction ends and the next begins.

Q: How do I find syntax errors?
A: Your IDE will usually underline them in red, similar to a spell checker. When you try to run the code, the terminal will also print an error message pointing to the exact line number!
