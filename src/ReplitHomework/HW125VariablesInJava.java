package ReplitHomework;
/*
Declare a static variable **number** that will hold an integer value:

Access **number** from the main method and assign value to it.

Create an Object of the class, access **number** in a nonstatic way and assigning value of 200.

Print out **number** using class name and using instance

**Expected Output:**
```
200
```
200
```
 */

public class HW125VariablesInJava {
    static int num;

    public static void main(String[] args) {
        num=200;

        System.out.println(num);

        HW125VariablesInJava c=new HW125VariablesInJava();
        c.num=200;
        System.out.println(c.num);
    }
}
