package Class6Homework;
/* Ask user to enter a number and then define if number is small, medium or large
Small number is value between 1 and 10
Medium number is value between 11 and 100
Large number is value between 101 and 1000 */

import java.util.Scanner;

public class Class6hw2 {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);

        int num= scanner.nextInt();

        if (num>=1 && num<=10){
            System.out.println("Small number");
        } else if (num>=11 && num<=100) {
            System.out.println("Medium number");
        } else if (num>=101 && num<=1000) {
            System.out.println("Large number");
        }
    }
}
