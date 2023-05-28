package ReplitHomework;
/*
Create an array of integers that will store 5 elements taken from a user

Don't print any prompt message for the user

Then print out all the elements you have created in the first loop in reverse order.

**Example:**

```
Input:
```

```
1
```

```
2
```

```
3
```

```
4
```

```
5
```

```
Output:
```

```
5
```

```
4
```

```
3
```

```
2
```

```
1
```
 */

import java.util.Scanner;

public class HW77Arrays {

    public static void main(String[] args) {

        int [] num=new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i]= scanner.nextInt();
        }
        for (int i = num.length-1; i >= 0; i--) {
            System.out.println(num[i]);

        }
    }

}
