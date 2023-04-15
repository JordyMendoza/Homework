package ReplitHomework;

/*Write a program that takes a user's name and prints it.

**Example Output:**

```
Hello, please enter your name
```

```
Your name is Sumair
``` */

import java.util.Scanner;

public class HW24ScannerClass {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello, please enter your name");
        String name=scanner.next();
        System.out.println("Your name is "+name+"");
    }
}
