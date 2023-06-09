package ReplitHomework;
/*Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"

and make the comparisons:

- if int1 and int2 are equal **and** word1 and word2 are equal, output "AND"
- if int1 and int2 are equal **or** word1 and word2 are equal, output "OR"
- if int1 and int2 are **not** equal **and** word1 and word2 are **not** equal, output "NONE"

```
**Example input/output:**
word1: banana
word2: banana
int1: 2
int2: 2
Output: AND
```

```
word1: banana
```

```
word2: apple
```

```
int1: 2
```

```
int2: 2
```

```
Output: OR

word1: phone
word2: pie
int1: 2
int2: 3
Output: NONE
``` */

import java.util.Scanner;

public class HW36LogicalOperators {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two strings");
        String wrd1= scanner.next();
        String wrd2= scanner.next();
        System.out.println("Please enter two numbers");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();

        if (num1==num2 && wrd1.equals(wrd2)){
            System.out.println("AND");
        }else if (num1==num2 || wrd1.equals(wrd2)){
            System.out.println("OR");
        }else if (num1!=num2 && !wrd1.equals(wrd2)){
            System.out.println("NONE");}
    }
}
