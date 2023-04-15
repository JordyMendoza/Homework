package ReplitHomework;

/*  Create a program that will ask a user to input boolean value "Input the boolean value"

If the input is true or false, then the output should look like below:

**Example Output:**

```
Input the boolean value
```

```
The value is true
```

**Example Output:**

```
Input the boolean value
```

```
The value is false
``` */


import java.util.Scanner;

public class HW23ScannerClass {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the boolean value");

        boolean myBoolean=scanner.nextBoolean();

        System.out.println("The value is "+myBoolean+"");

    }
}
