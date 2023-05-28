package ReplitHomework;
/*
Declare the **instance** variables to hold:

- integer values
- String values
- double values
- boolean values
- float values

Access instance variables and then print them all without assigning any values to them.

Print variables one by one the same sequence that you declare them.

**Expected Output:**

```
0
```

```
null
```

```
0.0
```

```
false
```

```
0.0
```
 */

public class HW123VariablesInJava {
    int num;
    String str;
    double number;
    boolean isfalse;
    float flt;

    public static void main(String[] args) {
        HW123VariablesInJava a=new HW123VariablesInJava();
        System.out.println(a.num);
        System.out.println(a.str);
        System.out.println(a.number);
        System.out.println(a.isfalse);
        System.out.println(a.flt);
    }

}
