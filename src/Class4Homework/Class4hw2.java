package Class4Homework;
/* You are a loan specialist and you need to ask user what is the amount of loan
is needed. If loan is less or equal to 200,000 then you would lend the money
otherwise you would reject the client. */

import java.util.Scanner;

public class Class4hw2 {

    public static void main(String[] args) {
        System.out.println("Amount of loan needed?");
        Scanner scanner=new Scanner(System.in);

        int neededloan= scanner.nextInt();
        if (neededloan<=200000){
            System.out.println("Approved");
        } else {
            System.out.println("Denied");
        }
    }
}
