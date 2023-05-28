package ReplitHomework;
/*
Write code that will take in a String input and check to see if it is a palindrome or not.

A palindrome means that the characters are the same forwards and backwards, **ignoring spaces.**

Examples of palindromes:

- racecar
- was it a car or a cat I saw
- never odd or even
- rats live on no evil star

Your check should be case insensitive too.  For example, "Bob" is a palindrome, despite the first B being capitalized.

Your program will print out "true" if it's a palindrome and "false" if not.
 */

import java.util.Scanner;

public class HW99StringManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase
        input = input.replaceAll("\\s", "").toLowerCase();

        // Check if the input string is a palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        // Print out the result
        System.out.println(isPalindrome);
    }
}
