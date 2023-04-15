package ReplitHomework;

import java.util.Scanner;

public class HW21ScannerClass {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();

        int newage=age+10;

        System.out.println("Your age after 10 years is "+newage+"");


    }
}
