package ReplitHomework;
/*Write a program to find the largest number among three distinct numbers using nested if condition

Please use Scanner class to take input from users

**Expected Output:**

```
Please enter 3 distinct numbers 4 5  and 14
```

```
The largest number is 14
``` */

import java.util.Scanner;

public class HW34NestedIfAndScannerClass {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter 3 distinct numbers");
        int num= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();

        if (num>num2 && num>num3){
            System.out.println("The largest number is "+num+"" );
        } else if (num2>num && num2>num3){
            System.out.println("The largest number is "+num2+"" );
        } else if (num3>num && num3>num2){
            System.out.println("The largest number is "+num3+"" );
        }
    }
}
