package Class4Homework;
/* You are DMV representative and you need to ask customer their age.
If they are 18 and older you will issue a driver license to them, otherwise you
will offer them to get a learners permit. */

import java.util.Scanner;

public class Class4hw3 {

    public static void main(String[] args) {
        System.out.println("what is your age?");
        Scanner scanner=new Scanner(System.in);
        int age= scanner.nextInt();
        if (age>=18){
            System.out.println("Driver License");
        } else {
            System.out.println("Learners Permit");
        }
    }
}
