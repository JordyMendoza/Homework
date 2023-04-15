package ReplitHomework;
/*Prompt user with a question: "Is it weekend?"

If it is not a weekend --> subject="manual testing"

Otherwise --> subject="Java"

**Output**:

```
Today you will be learning ____
``` */

import java.util.Scanner;

public class HW38LogicalOperators {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Is it weekend?");
        boolean answr= scanner.nextBoolean();
        if (!answr){
            System.out.println("Today you will be learning manual testing");
        } else if (answr) {
            System.out.println("Today you will be learning Java");

        }

    }
}
