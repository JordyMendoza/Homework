package Class6Homework;
/* HW:  Using scanner class create calculator.
Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
Please complete this assignment in 2 ways: using if statement and switch case. */


import java.util.Scanner;

public class Class6hw7 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1= scanner.nextInt();
        char ope=scanner.next().charAt(0);
        int num2= scanner.nextInt();

        switch (ope){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
