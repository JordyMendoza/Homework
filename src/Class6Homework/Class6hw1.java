package Class6Homework;
/* Write a program that will print whether it is a weekend or weekday.
If any day from 1-5 → output “It is a weekday”,
anyday from 6-7 → output “It is a weekend”,
any other day → output “Invalid day”
 */

import java.util.Scanner;

public class Class6hw1 {

    public static void main(String[] args) {
        System.out.println("What day is it?");
        Scanner scanner=new Scanner(System.in);

        int day= scanner.nextInt();
        switch (day){

            case 1:
                System.out.println("It is a weekday");
                break;
                case 2:
                System.out.println("It is a weekday");
                break;
                case 3:
                System.out.println("It is a weekday");
                break;
                case 4:
                System.out.println("It is a weekday");
                break;
                case 5:
                System.out.println("It is a weekday");
                break;
                case 6:
                System.out.println("It is a weekend");
                break;
                case 7:
                System.out.println("It is a weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
