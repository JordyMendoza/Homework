package ReplitHomework;
/*
Declare 3 instance variables to hold:

year, school name and batch #

Access variables from the main method and assign specific values to them

Print values of your variables in the following format:

**Expected Output:**

```
I am a student of batch 9 studying at Syntax in the year of 2021
```
 */

public class HW120VariablesInJava {
    public static class Student {
        int year;
        String schoolName;
        int batchNumber;
    }

        public static void main(String[] args) {
            Student student = new Student();
            student.year = 2021;
            student.schoolName = "Syntax";
            student.batchNumber = 9;

            System.out.printf(new StringBuilder().append("I am a student of batch ").append(student.batchNumber).append(" studying at ").append(student.schoolName).append(" in the year of ").append(student.year).toString());
        }
}