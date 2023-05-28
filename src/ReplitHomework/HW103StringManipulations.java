package ReplitHomework;
/*
Given the following inputs:

```
String s;
```

Write a for loop that will print out each letter of the string s, separated by spaces, on the same line.

Sample input/outputs:

```
In: hello
h e l l o
```

```
In: covert
```

```
c o v e r t
```

```
In: blasphemy
```

```
b l a s p h e m y
```
 */

import java.util.Scanner;

public class HW103StringManipulations {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("In: ");
        String s= scanner.next();

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }


}
