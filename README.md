
# Character ASCII Value Checker (Greater than 65)

This Java program allows users to input a character and checks whether the ASCII value of the entered character is greater than 65. It's a simple example of how character input and ASCII value comparisons can be implemented using conditional statements in Java.

## 📌 Features

- Takes character input from the user
- Converts the character to its ASCII value
- Compares the value to 65
- Displays whether the ASCII value is greater than 65 or not

## 🧾 Code Explanation

```java
package character_programming;

import java.util.Scanner;

public class Char_Greaterthan_65 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in); // Create Scanner object for user input
        System.out.println("Enter the Character"); // Prompt user to enter a character

        char ch = s.next().charAt(0); // Read the first character of the user's input

        if(ch > 65) // Compare the ASCII value of the character with 65
            System.out.println("Char " + ch + " Ascii value is Greater than 65");
        else
            System.out.println("Char " + ch + " Ascii value is Not Greater than 65");

        s.close(); // Close the Scanner object to prevent memory leaks
    }
}
```

### ✅ Breakdown of Key Concepts

- **Scanner Class**: Used to read input from the user.
- **`next().charAt(0)`**: Reads the first character from the user input string.
- **ASCII Value Comparison**: In Java, characters are internally stored using ASCII values. When `char` is compared to a number, Java automatically converts the character to its ASCII code.
- **Conditional Statement**: Checks whether the character's ASCII value is greater than 65 using an `if-else` statement.

## 💡 Example

### Input:
```
Enter the Character
B
```

### Output:
```
Char B Ascii value is Greater than 65
```

Since ASCII value of 'B' is 66, the condition is true.

## 📘 ASCII Reference

- 'A' = 65
- 'B' = 66
- 'a' = 97
- '0' = 48

Use this reference to understand the output better.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Char_Greaterthan_65.git
```
