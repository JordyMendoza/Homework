package ReplitHomework;
/*
declare 3 instance variables to hold an integer, double and char values.

Create 2 instances of the class and assign values to variables and the print them

**Expected Output:**

```
10
10.23
a
100
100.23
s
```
 */

public class HW121VariablesInJava {

    int number;
    double num;
    char character;

    public static void main(String[] args) {

        HW121VariablesInJava a=new HW121VariablesInJava();
        a.number=10;
        a.num=23;
        a.character='a';

        System.out.println(a.number);
        System.out.println(a.num);
        System.out.println(a.character);

        HW121VariablesInJava b=new HW121VariablesInJava();
        b.number=100;
        b.num=123;
        b.character='s';

        System.out.println(b.number);
        System.out.println(b.num);
        System.out.println(b.character);

    }
}
