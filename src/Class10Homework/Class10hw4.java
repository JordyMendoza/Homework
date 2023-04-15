package Class10Homework;
/* Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
Print the sum of all numbers. */

public class Class10hw4 {

    public static void main(String[] args) {

        int[][] num= {
                {8, 7, 93},
                {8, 54, 7},
                {5, 9, 7},
        };
        int sum = 0;

        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num[i].length; j++) {
                sum +=num[i][j];
            }
        }
        System.out.println(sum);
    }

}
