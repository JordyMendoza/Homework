package Class10GroupHomework;
/*  Write a java program to check whether a given
number is prime or not? */

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number greater than 2");
        int number=scanner.nextInt();

        boolean isprime=false;

        for (int i=2; i<=number/2; i++) {
            if (number % i == 0) {
                isprime=true;
                break;
            }
        }
        if (!isprime)
            System.out.println("The given is number " + number + " is prime");
        else
            System.out.println("The given is number " + number + " is not prime");

    }
}
