package ReplitHomework;
/*
Write a program that creates a String array with size 7.

Ask the user to input Days of a week beginning with Sunday using Scanner class.

Add these inputs to your array and then print all values from that array

Example:

Please enter day 1 of the week

Sunday

Please enter day 2 of the week

Monday

Please enter day 3 of the week

Tuesday etc

**Example Output:**

```
Please enter day 1 of the week
```

```
Sunday
```

```
Please enter day 2 of the week
```

```
Monday
```

```
Please enter day 3 of the week
```

```
Tuesday
```

```
Please enter day 4 of the week
```

```
Wednesday
```

```
Please enter day 5 of the week
```

```
Thursday
```

```
Please enter day 6 of the week
```

```
Friday
```

```
Please enter day 7 of the week
```

```
Saturday
```

```
Sunday
```

```
Monday
```

```
Tuesday
```

```
Wednesday
```

```
Thursday
```

```
Friday
```

```
Saturday
```
 */

import java.util.Scanner;

public class HW76Arrays {

    public static void main(String[] args) {

        String [] str=new String[7];
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i <= str.length - 1; i++) {
            System.out.println("Please enter day " + (i+1) + " of the week");
            str[i] = scanner.nextLine();
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);

        }

    }
}
