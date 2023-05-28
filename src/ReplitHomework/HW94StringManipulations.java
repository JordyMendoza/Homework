package ReplitHomework;
/*
- Create a String given="I love Java classes at Syntax"
- Retrieve 2 Strings using substring method from given String and print them

**Expected Output:**

```
classes at Syntax
```

```
I love Java
```
 */

public class HW94StringManipulations {
    public static void main(String[] args) {
        String given = "I love Java classes at Syntax";

        // Retrieve "classes at Syntax" using substring method
        String str1 = given.substring(11);
        System.out.println(str1);

        // Retrieve "I love Java" using substring method
        String str2 = given.substring(0, 11);
        System.out.println(str2);
    }
}
