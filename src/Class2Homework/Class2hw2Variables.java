package Class2Homework;
/* Create a Java program and name it Variables
In your program create different type of variables to store student’s information
(name, last name, grade, city, state, phone number) and then print value of those variables in the format:
My name is  and my  last name is __
I am A/B student
I live in city and state__
And my phone number is ….. */

public class Class2hw2Variables {

    public static void main(String[] args) {
        String name="Jordy";
        String lastname="Mendoza";
        int grade= 12;
        String city="Woodbridge";
        String state="Virginia";
        String numb="4432519999";

        System.out.println("My name is "+name+" and my last name is "+lastname+"");
        System.out.println("I am A/B student");
        System.out.println("I live in "+city+" and "+state+"");
        System.out.println("And my phone number is "+numb+"");
    /* Change student’s city, state, phone number and grade. And print those updated values:
Example:
My name is  and I moved to new city and new state. My new phone number is */

        city="Laurel";
        state="Maryland";
        grade=13;
        numb="4432510000";

        System.out.println("My name is "+name+" and I moved to "+city+" and "+state+". My new phone number is "+numb+"");


    }


}
