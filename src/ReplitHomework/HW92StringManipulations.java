package ReplitHomework;
/*
Validate if the string ends with "u" prints the boolean value accordingly.

Validate if the string ends with "world" prints the boolean value accordingly.

Validate if the string ends with "are" prints the boolean value accordingly.

Validate if the string ends with "you" prints the boolean value accordingly.
 */

public class HW92StringManipulations {
    public static void main(String[] args) {
        //starts the code from here
        String s1="hello how are you";
        boolean endsU=s1.endsWith("u");
        boolean endsWorld=s1.endsWith("world");
        boolean endsAre=s1.endsWith("are");
        boolean endsYou=s1.endsWith("you");

        System.out.println(endsU);
        System.out.println(endsWorld);
        System.out.println(endsAre);
        System.out.println(endsYou);

    }
}
