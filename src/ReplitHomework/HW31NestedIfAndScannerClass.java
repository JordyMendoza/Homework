package ReplitHomework;

/*Declare boolean variable isSunny, ask the user "Is it sunny outside?"

Declare int temperature and ask user "What is the temperature outside?"

**Your program should check:**

If the weather is sunny output should be "It is a sunny day, I should go somewhere!"

If it is not sunny output should be "I stay home and practice Java"

If the weather is sunny you want to check the temperature "What is the temperature outside?"

If the temperature is higher than 85 then "I am going to the beach"

otherwise, "I am going to the park"



**Example Output:**

```
Is it sunny outside?
It is a sunny day, I should go somewhere!
What is the temperature outside?
I am going to the beach!
```

**Example Output:**

```
Is it sunny outside?
I stay home and practice Java!
```

**Example Output:**
```
Is it sunny outside?
It is a sunny day, I should go somewhere!
What is the temperature outside?
I am going to the park!
``` */

import java.util.Scanner;

public class HW31NestedIfAndScannerClass {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Is it sunny outside?");
        boolean isSunny= scanner.nextBoolean();
        if (isSunny==true){
            System.out.println("It is a sunny day, I should go somewhere!");
        }else {
            System.out.println("I stay home and practice Java");
            if (isSunny==false);
        }
        System.out.println("What is the temperature outside?");
        int temperature= scanner.nextInt();
        if (temperature>85){
            System.out.println("I am going to the beach");
        }else {
            System.out.println("I am going to the park");
        if (temperature<85);
        }
    }
}
