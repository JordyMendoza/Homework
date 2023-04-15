package ReplitHomework;
/*Using do while loop print even numbers from 20 to 1

**Expected Output:**

```
20
```

```
18
```

```
16
```

```
14
```

```
12
```

```
10
```

```
8
```

```
6
```

```
4
```

```
2
``` */

public class HW53DoWhileLoops {

    public static void main(String[] args) {

        int num=20;
        do {
            System.out.println(num);
            num=num-2;
        }while (num>=1);
    }
}
