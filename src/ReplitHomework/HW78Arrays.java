package ReplitHomework;
/*
Create an int array of integers with a size of 5 and input values with Scanner.

Don't print prompt questions for a user.

Using loop print out each element of the array that should look like the output below

**Example:**

Input:

1

2

3

4

5

```
Output:
```

```
10
```

```
20
```

```
30
```

```
40
```

```
50
```
 */

import java.util.Scanner;

public class HW78Arrays {

    public static void main(String[] args) {

        int [] num=new int[5];
        Scanner scanner=new Scanner(System.in);


        for (int i = 0; i < num.length; i++) {
            num[i]= scanner.nextInt();

        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]*10);

        }
    }
}
