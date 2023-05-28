package ReplitHomework;
/*
Declare static variable in class level as below and assign its value:

String ss="Welcome To Syntax Technologies"

Access variable in the main method and print it using three ways you learned so far

Hint:

first way: By calling directly

Second way: By using the className

Third way: By creating the object of the class

**Expected Output:**
```
Welcome To Syntax Technologies
```
Welcome To Syntax Technologies
```
Welcome To Syntax Technologies
```
 */

public class HW124VariablesInJava {

   static String ss="Welcome To Syntax Technologies";

    public static void main(String[] args) {
HW124VariablesInJava a=new HW124VariablesInJava();
        // call directly
        System.out.println(ss);
        // call by using className
        System.out.println(HW124VariablesInJava.ss);
        // call by creating the object of the class
        System.out.println(a.ss);
    }
}
