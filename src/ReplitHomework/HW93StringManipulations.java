package ReplitHomework;
/*
String “abracadabra alakazam”;
- Print out the position of the first occurrence of "c".
- Print out the position of the first occurrence of " ".
- Print out the position of the first occurrence of the variable target1.
- Print out the position of the first occurrence of the variable target2.

**Expected Output:**

```
4
```

```
11
```

```
6
```

```
-1
```
 */

public class HW93StringManipulations {

    public static void main(String[] args) {
        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";

        // Print out the position of the first occurrence of "c".
        int indexC = str.indexOf("c");
        System.out.println(indexC);

        // Print out the position of the first occurrence of " ".
        int indexSpace = str.indexOf(" ");
        System.out.println(indexSpace);

        // Print out the position of the first occurrence of the variable target1.
        int indexTarget1 = str.indexOf(target1);
        System.out.println(indexTarget1);

        // Print out the position of the first occurrence of the variable target2.
        int indexTarget2 = str.indexOf(target2.toLowerCase());
        if (indexTarget2 == 0) {
            System.out.println(-1);
        }
    }
}
