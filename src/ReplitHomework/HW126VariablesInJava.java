package ReplitHomework;
/*
Create a variable that will hold the count of all instances of the Main class

Create 3 Object of the class and print value of the count variable;

**Expected Output:**

```
3
```
 */

public class HW126VariablesInJava {
    static int count;

    public static void main(String[] args) {

        HW126VariablesInJava a=new HW126VariablesInJava();
        count++;
        HW126VariablesInJava b=new HW126VariablesInJava();
        count++;
        HW126VariablesInJava c=new HW126VariablesInJava();
        count++;
        System.out.println(count);
    }

}
