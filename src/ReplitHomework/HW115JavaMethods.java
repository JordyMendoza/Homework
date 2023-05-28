package ReplitHomework;
/*
Create a method that will accept a String as a parameter and return new String all in upper case

Call method

**Expected Output:**

```
TEST
```
 */

public class HW115JavaMethods {
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String str = "test";
        System.out.println(toUpperCase(str));
    }
}
