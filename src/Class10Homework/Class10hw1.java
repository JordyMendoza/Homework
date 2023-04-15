package Class10Homework;
/* Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
Then your program should print name of the students that has A and B grade */

public class Class10hw1 {
    public static void main(String[] args) {

        String[][] grades = {
                {"Jordy", "Brenda", "Javier", "Shirley"},
                {"A","B","A","B"}

        };
        for (int i = 0; i < grades.length; i++) {
            if (grades[1][i].equals("A")|| grades[1][i].equals("B")){
                System.out.println(grades[1][i]+" "+grades[0][i]);
            }
        }


    }
}
