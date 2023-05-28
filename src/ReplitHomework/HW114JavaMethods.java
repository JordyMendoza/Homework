package ReplitHomework;
/*
Step1: Create three methods that will accept 2 in parameters on integer type

Step2: Write the logic in methods to perform actions below:

The first method for multiplication

The second method for addition

The third method for subtraction

Step3: execute all methods

1. for the addition method add two numbers to make 30

2. for multiplication multiply two numbers to make 30

3. for Subtraction subtract two numbers to equal 20

**Expected Output:**

```
Addition 30
```

```
Multiplication 30
```

```
Subtraction 20
```
 */

public class HW114JavaMethods {
    public static void multiplication(int a, int b) {
        System.out.println("Multiplication " + a*b);
    }

    public static void addition(int a, int b) {
        System.out.println("Addition " + (a+b));
    }

    public static void subtraction(int a, int b) {
        System.out.println("Subtraction " + (a-b));
    }

    public static void main(String[] args) {
        addition(10, 20);
        multiplication(5, 6);
        subtraction(30, 10);
    }
}
