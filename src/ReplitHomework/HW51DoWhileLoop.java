package ReplitHomework;
/*Using do while loop print numbers from 10 to 20

Must not include the number 20 in the output

**Output:**

```
10
```

```
11
```

```
12
```

```
13
```

```
14
```

```
15
```

```
16
```

```
17
```

```
18
```

```
19
``` */

public class HW51DoWhileLoop {

    public static void main(String[] args) {
        int number=10;
        do {
            System.out.println(number);
            number++;
        }while (number<20);
    }
}
