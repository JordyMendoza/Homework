package ReplitHomework;
/*
Create a String given="Hello Syntax friends".

Using String methods from given String create new String "Welcome Syntax family"

**Expected Output:**

```
Welcome Syntax family
```
 */

public class HW98StringManipulations {
    public static void main(String[] args) {
        String given = "Hello Syntax friends";
        String newString = given.replace("friends", "family").replace("Hello", "Welcome");

        System.out.println(newString);
    }

}
