package Class6Homework;
/* Ask user to enter their country and capture it. Once values are captured print which language user speaks.
Allow user to enter grade (A, B, or C etc...)
and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
At the end your program should print which grade was entered by a user with explanation. */

import java.util.Scanner;

public class Class6hw6 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your country");
        String country= scanner.next();
        System.out.println("Language?");
        String lan= scanner.next();
        System.out.println("Enter grade (A-Excellent, B-Good, C-Average, D-Bad, any other grade Not Acceptable)");
        String grade= scanner.next();

        switch (grade){
            case "A":
                System.out.println("A-Excellent");
                break;
                case "B":
                System.out.println("B-Good");
                break;
                case "C":
                System.out.println("C-Average");
                break;
                case "D":
                System.out.println("D-Bad");
                break;
            default:
                System.out.println("Not Acceptable");

        }

    }
}
