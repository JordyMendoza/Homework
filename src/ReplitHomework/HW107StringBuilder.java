package ReplitHomework;
/*
# How would you reverse a String using StringBuffer Class

Given String = "Hello Friends"

**Expected Output:**

```
sdneirF olleH
```
 */

public class HW107StringBuilder {

    public static void main(String[] args) {
        String original = "Hello Friends";
        StringBuffer sb = new StringBuffer(original);
        String reversed = sb.reverse().toString();
        System.out.println(reversed);

    }
}
