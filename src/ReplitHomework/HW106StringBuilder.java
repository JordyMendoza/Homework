package ReplitHomework;
/*
Instantiate and StringBuffer class

Append Value "Hello" to it

Append value "World" to it.

Print in UPPERCASE.

**Expected Output:**

```
HELLO WORLD
```
 */

public class HW106StringBuilder {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello ");
        sb.append("World");
        String result = sb.toString().toUpperCase();
        System.out.println(result);
    }
}
