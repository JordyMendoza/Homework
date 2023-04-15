package Class3Homework;
/* Create Java program to store 2 values for expected and actual hours. Your program should check
if expected hours are more than  actual the program should print “You will love the course and you will succeed”,
otherwise “Course will be very hard for you!” */

public class Class3hw3 {

    public static void main(String[] args) {
        int ExpectedHours = 5;
        int ActualHours = 3;
        if (ExpectedHours > ActualHours) {
            System.out.println("You will love the course and you will succeed");
        } else {
            System.out.println("Course will be very hard for you!");
        }
    }
}
