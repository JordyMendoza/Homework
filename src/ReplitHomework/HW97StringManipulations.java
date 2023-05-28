package ReplitHomework;
/*
Based on the user inputs program should give a correct answer.

If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:

"Proceed with Chrome browser"

If browser is firefox, FIREFOX or FireFOX it should print the:

"Proceed with Firefox browser"

If browser is IE, ie or iE it should print the:

"Proceed with IE browser"

If any other browser it should print the:

"Invalid browser"
 */

import java.util.Scanner;

public class HW97StringManipulations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a browser name: ");
        String browser = scanner.nextLine();

        // Check the value of the input string and print the appropriate message
        if (browser.equalsIgnoreCase("Chrome")) {
            System.out.println("Proceed with Chrome browser");
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.out.println("Proceed with Firefox browser");
        } else if (browser.equalsIgnoreCase("IE")) {
            System.out.println("Proceed with IE browser");
        } else {
            System.out.println("Invalid browser");
        }
    }
}
