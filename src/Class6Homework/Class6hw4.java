package Class6Homework;
/* Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”. */

import java.util.Scanner;

public class Class6hw4 {

    public static void main(String[] args) {
        System.out.println("Enter your birth month");
        Scanner scanner=new Scanner(System.in);
        String month= scanner.next();

        switch (month){
            case "March":
                System.out.println("Spring");
                case "April":
                System.out.println("Spring");
                 break;
                case "May":
                System.out.println("Spring");
                 break;
                case "June":
                System.out.println("Summer");
                 break;
                case "July":
                System.out.println("Summer");
                 break;
                case "August":
                System.out.println("Summer");
                 break;
                case "September":
                System.out.println("Autumn");
                 break;
                case "October":
                System.out.println("Autumn");
                 break;
                case "November":
                System.out.println("Autumn");
                 break;
                case "December":
                System.out.println("Winter");
                 break;
                case "January":
                System.out.println("Winter");
                 break;
                case "February":
                System.out.println("Winter");
                 break;
            default:
                System.out.println("Invalid");

        }
    }
}
