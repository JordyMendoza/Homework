package Class4Homework;
/* Create a Java program that will ask user to input city and temperature.
Your program should convert Fahrenheit into celsius and print “The temperature is
the city  is ” */

import java.util.Scanner;

public class Class4hw4 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter city");
        String city= scanner.next();
        System.out.println("Enter the temperature of city");
        int temp= scanner.nextInt();
        int celcius=(temp-32)*5/9;
        System.out.println("The temperature "+celcius+" the city is "+city+"");
        }

    }
