package ReplitHomework;
/*
There is a code that takes input as a String.

Write a program that will print out only vowels of that string

Sample input/outputs:

```
In: howdyho
oo
```

```
In: huehuehuehue
ueueueue
```

```
In: poopoo what idk what im doing
ooooaiaioi
```
 */

import java.util.Scanner;

public class HW105StringManipulations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        String vowels = "aeiou";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.indexOf(c) != -1) {
                System.out.print(c);
            }
        }
    }
}
