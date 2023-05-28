package ReplitHomework;
/*
Write a program to print out the pattern:

**Expected output:**

```
1 2 3 4 5 6 7
```

```
1 2 3 4 5 6
```

```
1 2 3 4 5
```

```
1 2 3 4
```

```
1 2 3
```

```
1 2
```

```
1
 */

public class HW69NestedLoops {

    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            for (int j = 1; j <= 7-i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
