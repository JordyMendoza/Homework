package Class6Homework;
/* Write a program that will read three inputs of scores (quiz, mid term, and final scores)
and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F */

import java.util.Scanner;

public class Class6hw5 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Quiz scores");
        int quiz= scanner.nextInt();
        System.out.println("Mid term scores");
        int mid= scanner.nextInt();
        System.out.println("Final scores");
        int Final= scanner.nextInt();

        int average=((quiz+mid+Final)/3);

        if (average>=90){
            System.out.println("Grade A");
        } else if (average>=70&&average<90) {
            System.out.println("Grade B");
        } else if (average>=50 &&average<70 ) {
            System.out.println("Grade C");
        } else if (average<50) {
            System.out.println("Grade F");
        }


    }


}
