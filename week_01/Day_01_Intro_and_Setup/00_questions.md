# 💻 Day 01 Practice: Introduction & First Programs

**Date:** Wednesday, 29 Jul  
**Time Allocation:** 3 - 4 hrs  
**Topics Covered:** Introduction to Java, JDK, JRE, JVM, IDE Setup, First Java Program  
**Daily Goal:** Write 10 simple Java programs to build muscle memory with syntax, compiling, and running code. 

---

## 🛠️ Part 1: Environment Setup Checklist
Before writing any code, ensure your workspace is ready. Check these off as you complete them:
- [ ] Install the latest Java Development Kit (JDK).
- [ ] Verify the installation by opening your terminal/command prompt and typing `java -version`.
- [ ] Install your chosen Integrated Development Environment (IDE) (e.g., IntelliJ IDEA, Eclipse, or VS Code).
- [ ] Create a new Java Project in your IDE named `Day01_Practice`.

---

## 🚀 Part 2: The 10 Program Challenge

Since we have not yet covered variables, data types, or math (scheduled for Day 2), all 10 programs today will focus purely on standard output (`System.out.println` and `System.out.print`), formatting, and getting comfortable with the `main` method structure. 

Create a separate `.java` class file for each of the following tasks:

### 1. The Classic Initialization
**Class Name:** `HelloWorld.java`
*   **Task:** Write the standard "Hello, World!" program. 
*   **Goal:** Ensure your IDE is properly compiling and running Java code.

### 2. Personal Introduction
**Class Name:** `AboutMe.java`
*   **Task:** Print your name, your current goal (e.g., "I am learning Java!"), and your favorite hobby on three separate lines using three separate `System.out.println();` statements.

### 3. Print vs. Println
**Class Name:** `PrintVsPrintln.java`
*   **Task:** Print the words "Java", "is", "awesome!" on the *same line* using only `System.out.print();` (not `println`). Then, add a final `System.out.println();` at the end to move to a new line for the terminal prompt.

### 4. The Block Shape
**Class Name:** `SquarePattern.java`
*   **Task:** Use multiple print statements to output a 4x4 square of asterisks.
*   **Expected Output:**
    ```text
    ****
    ****
    ****
    ****
    ```

### 5. The Triangle Shape
**Class Name:** `TrianglePattern.java`
*   **Task:** Print a right-angled triangle using asterisks.
*   **Expected Output:**
    ```text
    *
    **
    ***
    ****
    *****
    ```

### 6. ASCII Art Face
**Class Name:** `Face.java`
*   **Task:** Use special characters to draw a simple text face. 
*   **Expected Output:**
    ```text
     +"""""+ 
    (| o o |)
     |  ^  | 
     | '-' | 
     +-----+ 
    ```

### 7. Game Menu Simulation
**Class Name:** `GameMenu.java`
*   **Task:** Print a simulated retro game menu screen. Use formatting to make it look clean.
*   **Expected Output:**
    ```text
    ======================
        SUPER JAVA BROS
    ======================
    1. Start New Game
    2. Load Game
    3. Options
    4. Exit
    ======================
    Select an option:
    ```

### 8. Escape Sequences (Tabs & Newlines)
**Class Name:** `EscapeCharacters.java`
*   **Task:** Print the following exactly as it appears below using only **ONE** `System.out.println();` statement. (Hint: Use `\n` for new lines and `\t` for tabs).
*   **Expected Output:**
    ```text
    Item        Price
    ----        -----
    Apple       $1.00
    Banana      $0.50
    ```

### 9. The Architecture Summary
**Class Name:** `JavaArchitecture.java`
*   **Task:** Print a short, 3-line glossary defining JDK, JRE, and JVM based on your lecture notes today.

### 10. The Broken Program (Debugging Practice)
**Class Name:** `FixMe.java`
*   **Task:** Copy the broken code below into your IDE. It contains 3 syntax errors. Find them, fix them, and run the program successfully.
```java
public class FixMe {
    public static void main(String args) {
        System.out.println("This program has errors")
        System.out.Print("Can you fix them?");
    }
}