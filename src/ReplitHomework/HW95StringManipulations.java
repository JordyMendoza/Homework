package ReplitHomework;
/*
Using Scanner class input string value.

Print out the following: "The first 3 letters of \_\_\_ is ___"

```
For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
```
 */

import java.util.Scanner;

public class HW95StringManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get the first 3 letters of the input string
        String firstThree = input.substring(0, 3);

        // Print out the result
        System.out.println("The first 3 letters of " + input + " is " + firstThree);
    }
}
